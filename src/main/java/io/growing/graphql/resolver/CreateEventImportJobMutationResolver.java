package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public interface CreateEventImportJobMutationResolver {

    @javax.validation.constraints.NotNull
    EventImportJobDto createEventImportJob(String tunnelId, String timeRange) throws Exception;

}