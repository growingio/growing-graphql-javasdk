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
final public class DefaultPersonaProfileQueryResolver implements PersonaProfileQueryResolver {

    private GrowingIOConfig growingIOConfig;

    public DefaultPersonaProfileQueryResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private DefaultPersonaProfileQueryResolver() {}

    @Override
    public PersonaProfileDto personaProfile(String id) throws Exception {
        PersonaProfileQueryRequest request = new PersonaProfileQueryRequest();
        List<String> keys = Arrays.asList("id");
        List<?> values = Arrays.asList(id);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        PersonaProfileResponseProjection projection = new PersonaProfileResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        PersonaProfileQueryResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, PersonaProfileQueryResponse.class);
        return result.personaProfile();
    }

}