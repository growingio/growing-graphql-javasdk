package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class AccessEntryDto implements java.io.Serializable {

    private Boolean isPublic;
    @javax.validation.constraints.NotNull
    private java.util.List<String> members;
    @javax.validation.constraints.NotNull
    private java.util.List<GroupDto> groups;
    @javax.validation.constraints.NotNull
    private java.util.List<String> actions;

    public AccessEntryDto() {
    }

    public AccessEntryDto(Boolean isPublic, java.util.List<String> members, java.util.List<GroupDto> groups, java.util.List<String> actions) {
        this.isPublic = isPublic;
        this.members = members;
        this.groups = groups;
        this.actions = actions;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public java.util.List<String> getMembers() {
        return members;
    }
    public void setMembers(java.util.List<String> members) {
        this.members = members;
    }

    public java.util.List<GroupDto> getGroups() {
        return groups;
    }
    public void setGroups(java.util.List<GroupDto> groups) {
        this.groups = groups;
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
        if (isPublic != null) {
            joiner.add("isPublic: " + GraphQLRequestSerializer.getEntry(isPublic));
        }
        if (members != null) {
            joiner.add("members: " + GraphQLRequestSerializer.getEntry(members));
        }
        if (groups != null) {
            joiner.add("groups: " + GraphQLRequestSerializer.getEntry(groups));
        }
        if (actions != null) {
            joiner.add("actions: " + GraphQLRequestSerializer.getEntry(actions));
        }
        return joiner.toString();
    }

    public static AccessEntryDto.Builder builder() {
        return new AccessEntryDto.Builder();
    }

    public static class Builder {

        private Boolean isPublic;
        private java.util.List<String> members;
        private java.util.List<GroupDto> groups;
        private java.util.List<String> actions;

        public Builder() {
        }

        public Builder setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }

        public Builder setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }

        public Builder setGroups(java.util.List<GroupDto> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }


        public AccessEntryDto build() {
            return new AccessEntryDto(isPublic, members, groups, actions);
        }

    }
}
