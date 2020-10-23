package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public interface UpdateRetentionAnalysisMutationResolver {

    @javax.validation.constraints.NotNull
    RetentionAnalysisDto updateRetentionAnalysis(String id, RetentionAnalysisInputDto retentionAnalysis) throws Exception;

}