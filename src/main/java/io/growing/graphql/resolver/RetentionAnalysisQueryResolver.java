package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface RetentionAnalysisQueryResolver {

    RetentionAnalysisDto retentionAnalysis(String projectId, String id, String dashboardId) throws Exception;

}