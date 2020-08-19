package io.growing.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public interface JobEntityDto {

    @javax.validation.constraints.NotNull
    String getId();

    @javax.validation.constraints.NotNull
    JobStageDto getStage();

    ErrorDto getError();

}