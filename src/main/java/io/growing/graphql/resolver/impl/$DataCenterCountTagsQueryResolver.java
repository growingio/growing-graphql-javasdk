package io.growing.graphql.resolver.impl;

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig;
import com.kobylynskyi.graphql.codegen.extension.utils.JavaCollectionUtils;
import com.kobylynskyi.graphql.codegen.extension.utils.OkHttpUtils;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.growing.graphql.resolver.*;
import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
final public class $DataCenterCountTagsQueryResolver implements DataCenterCountTagsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterCountTagsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterCountTagsQueryResolver() {}

    @Override
    public Integer dataCenterCountTags() throws Exception {
        DataCenterCountTagsQueryRequest request = new DataCenterCountTagsQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        DataCenterCountTagsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterCountTagsQueryResponse.class);
        return result.dataCenterCountTags();
    }

}