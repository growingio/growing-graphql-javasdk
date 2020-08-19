package io.growing.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public interface NamedEntityDto {

    @javax.validation.constraints.NotNull
    String getId();

    @javax.validation.constraints.NotNull
    String getName();

    @javax.validation.constraints.NotNull
    String getCreatorId();

    @javax.validation.constraints.NotNull
    java.time.ZonedDateTime getCreatedAt();

    String getUpdaterId();

    java.time.ZonedDateTime getUpdatedAt();

    String getCreator();

    String getUpdater();

}