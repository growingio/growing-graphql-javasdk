package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public enum PlatformTypeDto {

    ANDROID("ANDROID"),
    IOS("IOS"),
    WEB("WEB"),
    MINP("MINP");

    private final String graphqlName;

    private PlatformTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}