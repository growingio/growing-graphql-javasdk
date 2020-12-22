package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface BatchUpdateDataCenterResourceAclMutationResolver {

    Boolean batchUpdateDataCenterResourceAcl(String resourceType, java.util.List<String> resourceIds, java.util.List<String> readers, java.util.List<String> editors, String projectId) throws Exception;

}