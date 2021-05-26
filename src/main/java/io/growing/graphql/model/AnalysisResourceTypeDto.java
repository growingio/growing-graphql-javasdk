package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public enum AnalysisResourceTypeDto {

    CHARTS("CHARTS"),
    FUNNELS("FUNNELS"),
    RETENTIONS("RETENTIONS"),
    FREQUENCIES("FREQUENCIES");

    private final String graphqlName;

    private AnalysisResourceTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}