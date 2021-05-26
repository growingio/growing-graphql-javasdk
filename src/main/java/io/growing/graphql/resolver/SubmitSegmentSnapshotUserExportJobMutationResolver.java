package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface SubmitSegmentSnapshotUserExportJobMutationResolver {

    @javax.validation.constraints.NotNull
    SegmentUserExportJobDto submitSegmentSnapshotUserExportJob(String projectId, String id, java.util.List<String> tags, java.util.List<String> properties, String charset) throws Exception;

}