package io.growing.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:19+0800"
)
public interface JobEntityDto {

    @javax.validation.constraints.NotNull
    String getId();

    @javax.validation.constraints.NotNull
    JobStageDto getStage();

    ErrorDto getError();

}