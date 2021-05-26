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
 * @param fieldValue：字段值  fieldType：字段类型（枚举值）
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $CheckTagFieldExistenceQueryResolver implements CheckTagFieldExistenceQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public $CheckTagFieldExistenceQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $CheckTagFieldExistenceQueryResolver() {}

    /**
     * @param fieldValue：字段值  fieldType：字段类型（枚举值）
     */
    @javax.validation.constraints.NotNull
    @Override
    public Boolean checkTagFieldExistence(String fieldValue, TagFieldTypeDto fieldType) throws Exception {
        CheckTagFieldExistenceQueryRequest request = new CheckTagFieldExistenceQueryRequest();
        List<String> keys = Arrays.asList("fieldValue", "fieldType");
        List<?> values = Arrays.asList(fieldValue, fieldType);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, null);
        CheckTagFieldExistenceQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, CheckTagFieldExistenceQueryResponse.class);
        return result.checkTagFieldExistence();
    }

}