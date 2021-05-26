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
 * 获取所有表字段信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
final public class $TableDataDescriptionQueryResolver implements TableDataDescriptionQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $TableDataDescriptionQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $TableDataDescriptionQueryResolver() {}

    /**
     * 获取所有表字段信息
     */
    @javax.validation.constraints.NotNull
    @Override
    public java.util.List<TableInfoDto> tableDataDescription() throws Exception {
        TableDataDescriptionQueryRequest request = new TableDataDescriptionQueryRequest();
        TableInfoResponseProjection projection = new TableInfoResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        TableDataDescriptionQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, TableDataDescriptionQueryResponse.class);
        return result.tableDataDescription();
    }

}