package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 用户/项目/项目角色三元组
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserProjectRoleTupleDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private MemberDto user;
    @javax.validation.constraints.NotNull
    private ProjectDto project;
    private ProjectRoleDto projectRole;

    public UserProjectRoleTupleDto() {
    }

    public UserProjectRoleTupleDto(MemberDto user, ProjectDto project, ProjectRoleDto projectRole) {
        this.user = user;
        this.project = project;
        this.projectRole = projectRole;
    }

    public MemberDto getUser() {
        return user;
    }
    public void setUser(MemberDto user) {
        this.user = user;
    }

    public ProjectDto getProject() {
        return project;
    }
    public void setProject(ProjectDto project) {
        this.project = project;
    }

    public ProjectRoleDto getProjectRole() {
        return projectRole;
    }
    public void setProjectRole(ProjectRoleDto projectRole) {
        this.projectRole = projectRole;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        if (projectRole != null) {
            joiner.add("projectRole: " + GraphQLRequestSerializer.getEntry(projectRole));
        }
        return joiner.toString();
    }

    public static UserProjectRoleTupleDto.Builder builder() {
        return new UserProjectRoleTupleDto.Builder();
    }

    public static class Builder {

        private MemberDto user;
        private ProjectDto project;
        private ProjectRoleDto projectRole;

        public Builder() {
        }

        public Builder setUser(MemberDto user) {
            this.user = user;
            return this;
        }

        public Builder setProject(ProjectDto project) {
            this.project = project;
            return this;
        }

        public Builder setProjectRole(ProjectRoleDto projectRole) {
            this.projectRole = projectRole;
            return this;
        }


        public UserProjectRoleTupleDto build() {
            return new UserProjectRoleTupleDto(user, project, projectRole);
        }

    }
}
