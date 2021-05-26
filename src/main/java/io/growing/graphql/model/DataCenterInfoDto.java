package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class DataCenterInfoDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String logo;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    @javax.validation.constraints.NotNull
    private java.util.List<MemberDto> members;
    private Integer tunnelCount;
    private Integer projectCount;
    private String deployVersion;
    @javax.validation.constraints.NotNull
    private String accountGrantType;
    @javax.validation.constraints.NotNull
    private Boolean enableWatermark;
    private Integer memberCount;
    @javax.validation.constraints.NotNull
    private MemberDto owner;
    private Integer departmentCount;
    private Integer pendingApplicationCount;

    public DataCenterInfoDto() {
    }

    public DataCenterInfoDto(String id, String name, String logo, java.time.ZonedDateTime createdAt, java.util.List<MemberDto> members, Integer tunnelCount, Integer projectCount, String deployVersion, String accountGrantType, Boolean enableWatermark, Integer memberCount, MemberDto owner, Integer departmentCount, Integer pendingApplicationCount) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.createdAt = createdAt;
        this.members = members;
        this.tunnelCount = tunnelCount;
        this.projectCount = projectCount;
        this.deployVersion = deployVersion;
        this.accountGrantType = accountGrantType;
        this.enableWatermark = enableWatermark;
        this.memberCount = memberCount;
        this.owner = owner;
        this.departmentCount = departmentCount;
        this.pendingApplicationCount = pendingApplicationCount;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.List<MemberDto> getMembers() {
        return members;
    }
    public void setMembers(java.util.List<MemberDto> members) {
        this.members = members;
    }

    public Integer getTunnelCount() {
        return tunnelCount;
    }
    public void setTunnelCount(Integer tunnelCount) {
        this.tunnelCount = tunnelCount;
    }

    public Integer getProjectCount() {
        return projectCount;
    }
    public void setProjectCount(Integer projectCount) {
        this.projectCount = projectCount;
    }

    public String getDeployVersion() {
        return deployVersion;
    }
    public void setDeployVersion(String deployVersion) {
        this.deployVersion = deployVersion;
    }

    public String getAccountGrantType() {
        return accountGrantType;
    }
    public void setAccountGrantType(String accountGrantType) {
        this.accountGrantType = accountGrantType;
    }

    /**
     * 是否启用全局水印
     */
    public Boolean getEnableWatermark() {
        return enableWatermark;
    }
    /**
     * 是否启用全局水印
     */
    public void setEnableWatermark(Boolean enableWatermark) {
        this.enableWatermark = enableWatermark;
    }

    public Integer getMemberCount() {
        return memberCount;
    }
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public MemberDto getOwner() {
        return owner;
    }
    public void setOwner(MemberDto owner) {
        this.owner = owner;
    }

    public Integer getDepartmentCount() {
        return departmentCount;
    }
    public void setDepartmentCount(Integer departmentCount) {
        this.departmentCount = departmentCount;
    }

    public Integer getPendingApplicationCount() {
        return pendingApplicationCount;
    }
    public void setPendingApplicationCount(Integer pendingApplicationCount) {
        this.pendingApplicationCount = pendingApplicationCount;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (logo != null) {
            joiner.add("logo: " + GraphQLRequestSerializer.getEntry(logo));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (members != null) {
            joiner.add("members: " + GraphQLRequestSerializer.getEntry(members));
        }
        if (tunnelCount != null) {
            joiner.add("tunnelCount: " + GraphQLRequestSerializer.getEntry(tunnelCount));
        }
        if (projectCount != null) {
            joiner.add("projectCount: " + GraphQLRequestSerializer.getEntry(projectCount));
        }
        if (deployVersion != null) {
            joiner.add("deployVersion: " + GraphQLRequestSerializer.getEntry(deployVersion));
        }
        if (accountGrantType != null) {
            joiner.add("accountGrantType: " + GraphQLRequestSerializer.getEntry(accountGrantType));
        }
        if (enableWatermark != null) {
            joiner.add("enableWatermark: " + GraphQLRequestSerializer.getEntry(enableWatermark));
        }
        if (memberCount != null) {
            joiner.add("memberCount: " + GraphQLRequestSerializer.getEntry(memberCount));
        }
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner));
        }
        if (departmentCount != null) {
            joiner.add("departmentCount: " + GraphQLRequestSerializer.getEntry(departmentCount));
        }
        if (pendingApplicationCount != null) {
            joiner.add("pendingApplicationCount: " + GraphQLRequestSerializer.getEntry(pendingApplicationCount));
        }
        return joiner.toString();
    }

    public static DataCenterInfoDto.Builder builder() {
        return new DataCenterInfoDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String logo;
        private java.time.ZonedDateTime createdAt;
        private java.util.List<MemberDto> members;
        private Integer tunnelCount;
        private Integer projectCount;
        private String deployVersion;
        private String accountGrantType;
        private Boolean enableWatermark;
        private Integer memberCount;
        private MemberDto owner;
        private Integer departmentCount;
        private Integer pendingApplicationCount;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLogo(String logo) {
            this.logo = logo;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setMembers(java.util.List<MemberDto> members) {
            this.members = members;
            return this;
        }

        public Builder setTunnelCount(Integer tunnelCount) {
            this.tunnelCount = tunnelCount;
            return this;
        }

        public Builder setProjectCount(Integer projectCount) {
            this.projectCount = projectCount;
            return this;
        }

        public Builder setDeployVersion(String deployVersion) {
            this.deployVersion = deployVersion;
            return this;
        }

        public Builder setAccountGrantType(String accountGrantType) {
            this.accountGrantType = accountGrantType;
            return this;
        }

        /**
         * 是否启用全局水印
         */
        public Builder setEnableWatermark(Boolean enableWatermark) {
            this.enableWatermark = enableWatermark;
            return this;
        }

        public Builder setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }

        public Builder setOwner(MemberDto owner) {
            this.owner = owner;
            return this;
        }

        public Builder setDepartmentCount(Integer departmentCount) {
            this.departmentCount = departmentCount;
            return this;
        }

        public Builder setPendingApplicationCount(Integer pendingApplicationCount) {
            this.pendingApplicationCount = pendingApplicationCount;
            return this;
        }


        public DataCenterInfoDto build() {
            return new DataCenterInfoDto(id, name, logo, createdAt, members, tunnelCount, projectCount, deployVersion, accountGrantType, enableWatermark, memberCount, owner, departmentCount, pendingApplicationCount);
        }

    }
}
