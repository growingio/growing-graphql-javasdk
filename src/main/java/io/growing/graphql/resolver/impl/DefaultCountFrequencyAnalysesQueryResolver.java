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
    date = "2020-10-23T13:11:58+0800"
)
final public class DefaultCountFrequencyAnalysesQueryResolver implements CountFrequencyAnalysesQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultCountFrequencyAnalysesQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultCountFrequencyAnalysesQueryResolver() {}

    @Override
    public Integer countFrequencyAnalyses() throws Exception {
        CountFrequencyAnalysesQueryRequest request = new CountFrequencyAnalysesQueryRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CountFrequencyAnalysesQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CountFrequencyAnalysesQueryResponse.class);
        return result.countFrequencyAnalyses();
    }

}