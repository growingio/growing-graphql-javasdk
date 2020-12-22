package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public enum TagTypeDto {

    HORIZONTAL("HORIZONTAL"),
    AGGREGATED("AGGREGATED"),
    TOP_N_ATTRIBUTE("TOP_N_ATTRIBUTE"),
    DATA_SET_ATTRIBUTE("DATA_SET_ATTRIBUTE"),
    ATTRIBUTION_ATTRIBUTE("ATTRIBUTION_ATTRIBUTE"),
    SQL("SQL");

    private final String graphqlName;

    private TagTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}