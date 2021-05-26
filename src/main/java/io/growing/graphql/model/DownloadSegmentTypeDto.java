package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public enum DownloadSegmentTypeDto {

    NORMAL("NORMAL"),
    SNAPSHOT("SNAPSHOT"),
    PREPARED("PREPARED");

    private final String graphqlName;

    private DownloadSegmentTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}