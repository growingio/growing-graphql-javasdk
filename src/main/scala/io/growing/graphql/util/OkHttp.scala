package io.growing.graphql.util

import java.io.IOException
import java.util
import java.util.concurrent.TimeUnit

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest
import io.growing.graphql.{ Configs, ResponseDeserializer, ResponseException }
import okhttp3._
import org.json.JSONObject

import scala.concurrent.{ Future, Promise }

trait OkHttp extends ResponseDeserializer {

  private[this] lazy val defaultTimeout: Long = TimeUnit.MINUTES.toMillis(Configs.timeOut)
  private[this] lazy val client: OkHttpClient = buildClient(defaultTimeout, defaultTimeout, defaultTimeout)

  private[this] def buildClient(readTimeout: Long, writeTimeout: Long, connectTimeout: Long): OkHttpClient = {
    new OkHttpClient.Builder()
      .readTimeout(readTimeout, TimeUnit.MILLISECONDS)
      .writeTimeout(writeTimeout, TimeUnit.MILLISECONDS)
      .connectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
      .protocols(util.Arrays.asList(Protocol.HTTP_1_1, Protocol.HTTP_2))
      .build()
  }

  private[this] def buildRequest[T](request: GraphQLRequest) = {
    val httpRequestBody = request.toHttpJsonBody
    println(s"graphQL query:\n$httpRequestBody")
    val rb = new Request.Builder().url(Configs.serverHost).addHeader("Accept", "application/json; charset=utf-8")
    Configs.auth.fold(())(auth => rb.addHeader(auth.headerKey, auth.headerValue))
    rb.post(RequestBody.create(httpRequestBody, MediaType.parse("application/json; charset=utf-8")))
    val promise = Promise[T]
    rb -> promise
  }

  /**
   * for java api
   *
   * @param request
   * @param entityClazzName
   * @return
   */
  def createExecuteRequest(request: GraphQLRequest, entityClazzName: String): Future[Any] = {
    val (rb, promise) = buildRequest[Any](request)
    client.newCall(rb.build()).enqueue(new Callback {

      override def onFailure(call: Call, e: IOException): Unit = {
        promise.failure(e)
      }

      override def onResponse(call: Call, response: Response): Unit = {
        if (response.isSuccessful) {
          val jsonObject = new JSONObject(response.body().string())

          if (jsonObject.isEmpty) {
            throw ResponseException("not found any response data")
          }

          if (!jsonObject.isEmpty && !jsonObject.isNull("errors")) {
            throw ResponseException(jsonObject.getJSONArray("errors").toString)
          }

          if (!jsonObject.isNull("data") && !jsonObject.getJSONObject("data").has(request.getRequest.getOperationName)) {
            throw ResponseException(s"not found response data for OperationName: ${request.getRequest.getOperationName}")
          }

          val data = jsonObject.getJSONObject("data").get(request.getRequest.getOperationName)

          promise.success(deserialize(data, entityClazzName))

        } else {
          import scala.collection.JavaConverters._
          throw ResponseException(new JSONObject(Map("code" -> response.code(), "message" -> response.message()).asJava).toString)

        }

      }
    })
    promise.future
  }

}
