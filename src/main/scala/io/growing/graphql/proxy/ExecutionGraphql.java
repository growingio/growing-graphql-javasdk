package io.growing.graphql.proxy;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import io.growing.graphql.Configs;
import io.growing.graphql.util.OkHttp;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import java.util.concurrent.TimeUnit;

/**
 * @author liguobin@growingio.com
 * @version 1.0, 2020/7/29
 */
public interface ExecutionGraphql {

    default Object execute(String entityClazzName, GraphQLOperationRequest request, GraphQLResponseProjection projection) {
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        Future<Object> retFuture;
        Object ret = null;
        try {
            retFuture = OkHttp.createExecuteRequest(graphQLRequest, entityClazzName);
            ret = Await.result(retFuture, Duration.create(Configs.timeOut(), TimeUnit.SECONDS));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return ret;
    }
}
