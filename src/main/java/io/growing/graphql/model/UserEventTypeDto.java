package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public enum UserEventTypeDto {

    ALL("ALL"),
    VISIT("VISIT"),
    CUSTOM_EVENT("CUSTOM_EVENT"),
    PAGE("PAGE"),
    VIEW_CLICK("VIEW_CLICK"),
    VIEW_CHANGE("VIEW_CHANGE"),
    FORM_SUBMIT("FORM_SUBMIT"),
    UNKNOWN("UNKNOWN");

    private final String graphqlName;

    private UserEventTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}