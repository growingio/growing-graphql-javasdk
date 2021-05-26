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

/**
 * 更新 event_view 和 user_view
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $UpdateClickhouseViewMutationResolver implements UpdateClickhouseViewMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $UpdateClickhouseViewMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $UpdateClickhouseViewMutationResolver() {}

    /**
     * 更新 event_view 和 user_view
     */
    @Override
    public Boolean updateClickhouseView() throws Exception {
        UpdateClickhouseViewMutationRequest request = new UpdateClickhouseViewMutationRequest();
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        UpdateClickhouseViewMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, UpdateClickhouseViewMutationResponse.class);
        return result.updateClickhouseView();
    }

}