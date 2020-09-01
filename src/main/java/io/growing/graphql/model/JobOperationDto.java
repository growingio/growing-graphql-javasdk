package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
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