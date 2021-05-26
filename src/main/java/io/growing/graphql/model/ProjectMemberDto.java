package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ProjectMemberDto implements java.io.Serializable {

    private MemberDto member;
    private ProjectRoleDto role;
    private java.time.ZonedDateTime joinedAt;
    private java.time.ZonedDateTime lastVisitAt;

    public ProjectMemberDto() {
    }

    public ProjectMemberDto(MemberDto member, ProjectRoleDto role, java.time.ZonedDateTime joinedAt, java.time.ZonedDateTime lastVisitAt) {
        this.member = member;
        this.role = role;
        this.joinedAt = joinedAt;
        this.lastVisitAt = lastVisitAt;
    }

    /**
     * 成员信息
     */
    public MemberDto getMember() {
        return member;
    }
    /**
     * 成员信息
     */
    public void setMember(MemberDto member) {
        this.member = member;
    }

    /**
     * 该成员担任的角色
     */
    public ProjectRoleDto getRole() {
        return role;
    }
    /**
     * 该成员担任的角色
     */
    public void setRole(ProjectRoleDto role) {
        this.role = role;
    }

    /**
     * 加入项目的时间
     */
    public java.time.ZonedDateTime getJoinedAt() {
        return joinedAt;
    }
    /**
     * 加入项目的时间
     */
    public void setJoinedAt(java.time.ZonedDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    /**
     * 上次访问的时间
     */
    public java.time.ZonedDateTime getLastVisitAt() {
        return lastVisitAt;
    }
    /**
     * 上次访问的时间
     */
    public void setLastVisitAt(java.time.ZonedDateTime lastVisitAt) {
        this.lastVisitAt = lastVisitAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (member != null) {
            joiner.add("member: " + GraphQLRequestSerializer.getEntry(member));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (joinedAt != null) {
            joiner.add("joinedAt: " + GraphQLRequestSerializer.getEntry(joinedAt));
        }
        if (lastVisitAt != null) {
            joiner.add("lastVisitAt: " + GraphQLRequestSerializer.getEntry(lastVisitAt));
        }
        return joiner.toString();
    }

    public static ProjectMemberDto.Builder builder() {
        return new ProjectMemberDto.Builder();
    }

    public static class Builder {

        private MemberDto member;
        private ProjectRoleDto role;
        private java.time.ZonedDateTime joinedAt;
        private java.time.ZonedDateTime lastVisitAt;

        public Builder() {
        }

        /**
         * 成员信息
         */
        public Builder setMember(MemberDto member) {
            this.member = member;
            return this;
        }

        /**
         * 该成员担任的角色
         */
        public Builder setRole(ProjectRoleDto role) {
            this.role = role;
            return this;
        }

        /**
         * 加入项目的时间
         */
        public Builder setJoinedAt(java.time.ZonedDateTime joinedAt) {
            this.joinedAt = joinedAt;
            return this;
        }

        /**
         * 上次访问的时间
         */
        public Builder setLastVisitAt(java.time.ZonedDateTime lastVisitAt) {
            this.lastVisitAt = lastVisitAt;
            return this;
        }


        public ProjectMemberDto build() {
            return new ProjectMemberDto(member, role, joinedAt, lastVisitAt);
        }

    }
}
