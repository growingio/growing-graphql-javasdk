package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public enum SegmentCreatedByTypeDto {

    SQL("SQL"),
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