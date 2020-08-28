package io.growing.graphql.example.insight

import java.util.Collections

import io.growing.graphql.model._
import io.growing.graphql.proxy.GrowingIOGraphQLClient
import io.growing.graphql.proxy.GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder
import io.growing.graphql.resolver._

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/18
 */
object InsightServiceScalaExample extends App {

  protected val insightHelper: GrowingIOGraphQLClientBuilder = GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder.newBuilder()

  val tagId = "V0G5BZDA"
  val segId = "WlGk6bpa"

  //需要注意的是，查询一个和查询多个，它们的projection是相同的，但前者返回单个projection实体，后者返回一个集合（元素是projection）
  println("=====tag=====")
  val tag = insightHelper.setProjection(new TagResponseProjection().all$(1)).setRequest(new TagQueryRequest).build(classOf[TagQueryResolver]).tag(tagId)
  println(tag)

  println("=====tags=====")
  val tags = insightHelper.setProjection(new TagResponseProjection().all$(1)).setRequest(new TagsQueryRequest).build(classOf[TagsQueryResolver]).tags
  println(tags)

  println("=====countTags=====")
  val countTags = insightHelper.setRequest(new CountTagsQueryRequest).build(classOf[CountTagsQueryResolver]).countTags()
  println(countTags)

  println("=====deleteTag=====")
  val deleteTag = insightHelper.setRequest(new DeleteTagMutationRequest).build(classOf[DeleteTagMutationResolver]).deleteTag(tagId)
  println(deleteTag)

  println("=====segments=====")
  val segments = insightHelper.setProjection(new SegmentResponseProjection().all$(1)).setRequest(new SegmentsQueryRequest).build(classOf[SegmentsQueryResolver]).segments()
  println(segments)

  println("=====users=====")
  val users = insightHelper.setProjection(new SlicePaginationResponseProjection().all$(1)).
    setRequest(new UsersQueryRequest).build(classOf[UsersQueryResolver]).users(UserQueryTypeDto.SEGMENT, segId, 0, 3)
  println(users)


  println("=====createTag=====")
  val tagDto = TagInputDto.builder().setName("come from java sdk").setDescription("hello world").
    setType(TagTypeDto.HORIZONTAL).setComputes(Collections.singletonList(ComputeDefinitionInputDto.builder().
    setName("comefromjavasdk").setExpression("A").setDirectives(Collections.singletonList(ComputeDirectiveInputDto.builder().
    setAggregator("sum").setAlias("A").setAttribute("").
    setMeasurement(MeasurementInputDto.builder().setId("usr_test_0420_user_date").setType("attribute").setAttribute("").build()).setOp("=").
    setValues(Collections.singletonList("1587484800000")).setTimeRange("day:31,1").build())).build())).build()
  val createTag = insightHelper.setProjection(new TagResponseProjection().all$(1)).
    setRequest(new CreateTagMutationRequest).build(classOf[CreateTagMutationResolver]).createTag(tagDto)
  println(createTag)


}
