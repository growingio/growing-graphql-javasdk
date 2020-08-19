package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public interface BatchUpdateResourceAclMutationResolver {

    Boolean batchUpdateResourceAcl(String resourceType, java.util.List<String> resourceIds, java.util.List<String> readers, java.util.List<String> editors) throws Exception;

}