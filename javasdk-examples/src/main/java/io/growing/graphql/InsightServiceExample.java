package io.growing.graphql;

import io.growing.graphql.model.*;
import io.growing.graphql.proxy.GrowingIOGraphQLClient;
import io.growing.graphql.resolver.CreateTagMutationResolver;
import io.growing.graphql.resolver.TagQueryResolver;
import io.growing.graphql.resolver.TagsQueryResolver;

import java.util.Collections;
import java.util.List;

/**
 * @author liguobin@growingio.com
 * @version 1.0, 2020/8/19
 */
public class InsightServiceExample {

    public static void main(String[] args) throws Exception {

        //这是第二种方法，使用代理直接调用，没有封装。如有需要，使用者可以自己封装，可以选择全部（使用`GrowingIOQueryResolver`和`GrowingIOMutationResolver`）或部分封装
        GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder insightHelper = GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder.newBuilder();
        String tagId = "V0G5BZDA";

        //需要注意的是，查询一个和查询多个，它们的projection是相同的，但前者返回单个projection实体，后者返回一个集合（元素是projection）
        System.out.println("=====tag=====");
        TagDto tag = insightHelper.setProjection(new TagResponseProjection().all$()).setRequest(new TagQueryRequest()).build(TagQueryResolver.class).tag(tagId);
        System.out.println(tag);


        System.out.println("=====tags=====");
        List<TagDto> tags = insightHelper.setProjection(new TagResponseProjection().all$()).setRequest(new TagsQueryRequest()).build(TagsQueryResolver.class).tags();
        System.out.println(tags);


        System.out.println("=====createTag=====");
        TagInputDto tagDto = TagInputDto.builder().setName("come from java sdk").setDescription("hello world").
                setType(TagTypeDto.HORIZONTAL).setComputes(Collections.singletonList(ComputeDefinitionInputDto.builder().
                setName("comefromjavasdk").setExpression("A").setDirectives(Collections.singletonList(ComputeDirectiveInputDto.builder().
                setAggregator("sum").setAlias("A").setAttribute("").
                setMeasurement(MeasurementInputDto.builder().setId("usr_test_0420_user_date").setType("attribute").setAttribute("").build()).setOp("=").
                setValues(Collections.singletonList("1587484800000")).setTimeRange("day:31,1").build())).build())).build();
        TagDto createTag = insightHelper.setProjection(new TagResponseProjection().all$()).
                setRequest(new CreateTagMutationRequest()).build(CreateTagMutationResolver.class).createTag(tagDto);
        System.out.println(createTag);
    }
}
