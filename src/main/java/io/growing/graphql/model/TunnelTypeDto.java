package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public enum TunnelTypeDto {

    UBA("UBA"),
    FILE("FILE"),
    MOBILE("MOBILE"),
    SERVER("SERVER"),
    MINI_PROGRAM("MINI_PROGRAM"),
    WEB("WEB");

    private final String graphqlName;

    private TunnelTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}