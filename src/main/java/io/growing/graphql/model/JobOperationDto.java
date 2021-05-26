package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public enum JobOperationDto {

    CREATE("CREATE"),
    FILE_UPLOAD("FILE_UPLOAD"),
    EXECUTE("EXECUTE");

    private final String graphqlName;

    private JobOperationDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}