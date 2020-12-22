package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public enum SettingSegmentMeasurementPolicyDto {

    APPLY_TO_MEMBER("APPLY_TO_MEMBER"),
    APPLY_TO_SEGMENT("APPLY_TO_SEGMENT");

    private final String graphqlName;

    private SettingSegmentMeasurementPolicyDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}