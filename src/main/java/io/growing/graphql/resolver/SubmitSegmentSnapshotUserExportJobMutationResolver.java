package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface SubmitSegmentSnapshotUserExportJobMutationResolver {

    @javax.validation.constraints.NotNull
    SegmentUserExportJobDto submitSegmentSnapshotUserExportJob(String projectId, String id, java.util.List<String> tags, java.util.List<String> properties, String charset) throws Exception;

}