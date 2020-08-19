package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public enum DetectedStageDto {

    NONE("NONE"),
    READY("READY"),
    RUNNING("RUNNING"),
    FINISH("FINISH"),
    ERROR("ERROR");

    private final String graphqlName;

    private DetectedStageDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}