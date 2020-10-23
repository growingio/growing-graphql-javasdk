package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class UserAccessCtrlDto implements java.io.Serializable {

    private String resourceId;
    private String resourceType;
    private String memberId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> actions;

    public UserAccessCtrlDto() {
    }

    public UserAccessCtrlDto(String resourceId, String resourceType, String memberId, java.util.List<String> actions) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.memberId = memberId;
        this.actions = actions;
    }

    public String getResourceId() {
        return resourceId;
    }
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public java.util.List<String> getActions() {
        return actions;
    }
    public void setActions(java.util.List<String> actions) {
        this.actions = actions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (resourceId != null) {
            joiner.add("resourceId: " + GraphQLRequestSerializer.getEntry(resourceId));
        }
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        if (memberId != null) {
            joiner.add("memberId: " + GraphQLRequestSerializer.getEntry(memberId));
        }
        if (actions != null) {
            joiner.add("actions: " + GraphQLRequestSerializer.getEntry(actions));
        }
        return joiner.toString();
    }

    public static UserAccessCtrlDto.Builder builder() {
        return new UserAccessCtrlDto.Builder();
    }

    public static class Builder {

        private String resourceId;
        private String resourceType;
        private String memberId;
        private java.util.List<String> actions;

        public Builder() {
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }


        public UserAccessCtrlDto build() {
            return new UserAccessCtrlDto(resourceId, resourceType, memberId, actions);
        }

    }
}
