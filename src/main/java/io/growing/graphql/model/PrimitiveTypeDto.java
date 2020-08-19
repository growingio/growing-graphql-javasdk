package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public enum PrimitiveTypeDto {

    INT("INT"),
    STRING("STRING"),
    DOUBLE("DOUBLE"),
    DATE("DATE");

    private final String graphqlName;

    private PrimitiveTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}