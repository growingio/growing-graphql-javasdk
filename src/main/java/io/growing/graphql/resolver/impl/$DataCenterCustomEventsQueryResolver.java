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
 * 数据中心 打点事件列表
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $DataCenterCustomEventsQueryResolver implements DataCenterCustomEventsQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $DataCenterCustomEventsQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $DataCenterCustomEventsQueryResolver() {}

    /**
     * 数据中心 打点事件列表
     */
    @Override
    public java.util.List<CustomEventDto> dataCenterCustomEvents() throws Exception {
        DataCenterCustomEventsQueryRequest request = new DataCenterCustomEventsQueryRequest();
        CustomEventResponseProjection projection = new CustomEventResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        DataCenterCustomEventsQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, DataCenterCustomEventsQueryResponse.class);
        return result.dataCenterCustomEvents();
    }

}