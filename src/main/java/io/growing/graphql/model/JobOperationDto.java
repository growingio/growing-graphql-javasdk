package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
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