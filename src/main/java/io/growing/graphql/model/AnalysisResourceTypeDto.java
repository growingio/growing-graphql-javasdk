package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
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