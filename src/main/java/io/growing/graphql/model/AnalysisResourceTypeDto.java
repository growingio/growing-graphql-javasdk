package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
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