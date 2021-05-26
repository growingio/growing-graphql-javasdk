package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
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