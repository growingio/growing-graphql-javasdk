package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public enum UserQueryTypeDto {

    TAG("TAG"),
    SEGMENT("SEGMENT"),
    SNAPSHOT_SEGMENT("SNAPSHOT_SEGMENT"),
    PREPARED_SEGMENT("PREPARED_SEGMENT");

    private final String graphqlName;

    private UserQueryTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}