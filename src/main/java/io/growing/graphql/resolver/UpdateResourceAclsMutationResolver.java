package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public interface UpdateResourceAclsMutationResolver {

    Boolean updateResourceAcls(String resourceType, String resourceId, AccessEntryInputDto accessEntry) throws Exception;

}