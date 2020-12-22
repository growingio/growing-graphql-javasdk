package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
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

    public MemberDto getMember() {
        return member;
    }
    public void setMember(MemberDto member) {
        this.member = member;
    }

    public ProjectRoleDto getRole() {
        return role;
    }
    public void setRole(ProjectRoleDto role) {
        this.role = role;
    }

    public java.time.ZonedDateTime getJoinedAt() {
        return joinedAt;
    }
    public void setJoinedAt(java.time.ZonedDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    public java.time.ZonedDateTime getLastVisitAt() {
        return lastVisitAt;
    }
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

        public Builder setMember(MemberDto member) {
            this.member = member;
            return this;
        }

        public Builder setRole(ProjectRoleDto role) {
            this.role = role;
            return this;
        }

        public Builder setJoinedAt(java.time.ZonedDateTime joinedAt) {
            this.joinedAt = joinedAt;
            return this;
        }

        public Builder setLastVisitAt(java.time.ZonedDateTime lastVisitAt) {
            this.lastVisitAt = lastVisitAt;
            return this;
        }


        public ProjectMemberDto build() {
            return new ProjectMemberDto(member, role, joinedAt, lastVisitAt);
        }

    }
}
