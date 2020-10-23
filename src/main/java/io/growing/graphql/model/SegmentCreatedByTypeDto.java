package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public enum SegmentCreatedByTypeDto {

    DIRECT("DIRECT"),
    FROM_FILES("FROM_FILES"),
    FROM_FUNNEL("FROM_FUNNEL"),
    FROM_RETENTION("FROM_RETENTION"),
    FROM_FREQUENCY("FROM_FREQUENCY"),
    FROM_WXAPP("FROM_WXAPP"),
    FROM_SHARE_CHAIN("FROM_SHARE_CHAIN");

    private final String graphqlName;

    private SegmentCreatedByTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}