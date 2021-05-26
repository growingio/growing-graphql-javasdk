package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public enum TagTypeDto {

    HORIZONTAL("HORIZONTAL"),
    AGGREGATED("AGGREGATED"),
    TOP_N_ATTRIBUTE("TOP_N_ATTRIBUTE"),
    DATA_SET_ATTRIBUTE("DATA_SET_ATTRIBUTE"),
    ATTRIBUTION_ATTRIBUTE("ATTRIBUTION_ATTRIBUTE"),
    SQL("SQL"),
    PREDICTIVE("PREDICTIVE");

    private final String graphqlName;

    private TagTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}