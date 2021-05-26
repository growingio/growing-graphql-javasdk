package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AddMembersToDataCenterRoleInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<String> userIds;
    @javax.validation.constraints.NotNull
    private String roleId;

    public AddMembersToDataCenterRoleInputDto() {
    }

    public AddMembersToDataCenterRoleInputDto(java.util.List<String> userIds, String roleId) {
        this.userIds = userIds;
        this.roleId = roleId;
    }

    public java.util.List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
    }

    public String getRoleId() {
        return roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (userIds != null) {
            joiner.add("userIds: " + GraphQLRequestSerializer.getEntry(userIds));
        }
        if (roleId != null) {
            joiner.add("roleId: " + GraphQLRequestSerializer.getEntry(roleId));
        }
        return joiner.toString();
    }

    public static AddMembersToDataCenterRoleInputDto.Builder builder() {
        return new AddMembersToDataCenterRoleInputDto.Builder();
    }

    public static class Builder {

        private java.util.List<String> userIds;
        private String roleId;

        public Builder() {
        }

        public Builder setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }


        public AddMembersToDataCenterRoleInputDto build() {
            return new AddMembersToDataCenterRoleInputDto(userIds, roleId);
        }

    }
}
