package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class TunnelDto implements java.io.Serializable, EntityDto, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String type;
    @com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,property = "__typename")
    @com.fasterxml.jackson.annotation.JsonSubTypes(value = {
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = JDBCTunnelConfigDto.class, name = "JDBCTunnelConfig"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = GIOApiTunnelConfigDto.class, name = "GIOApiTunnelConfig"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = FileTunnelConfigDto.class, name = "FileTunnelConfig"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = MobileTunnelConfigDto.class, name = "MobileTunnelConfig"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = MiniProgramTunnelConfigDto.class, name = "MiniProgramTunnelConfig")
        })
    private TunnelConfigDto config;
    private String description;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String projectKey;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;

    public TunnelDto() {
    }

    public TunnelDto(String id, String projectId, String name, String type, TunnelConfigDto config, String description, String key, String projectKey, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.type = type;
        this.config = config;
        this.description = description;
        this.key = key;
        this.projectKey = projectKey;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public TunnelConfigDto getConfig() {
        return config;
    }
    public void setConfig(TunnelConfigDto config) {
        this.config = config;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getProjectKey() {
        return projectKey;
    }
    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdaterId() {
        return updaterId;
    }
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public java.time.ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }
    public void setUpdater(String updater) {
        this.updater = updater;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (config != null) {
            joiner.add("config: " + GraphQLRequestSerializer.getEntry(config));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (projectKey != null) {
            joiner.add("projectKey: " + GraphQLRequestSerializer.getEntry(projectKey));
        }
        if (creatorId != null) {
            joiner.add("creatorId: " + GraphQLRequestSerializer.getEntry(creatorId));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (updaterId != null) {
            joiner.add("updaterId: " + GraphQLRequestSerializer.getEntry(updaterId));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (updater != null) {
            joiner.add("updater: " + GraphQLRequestSerializer.getEntry(updater));
        }
        return joiner.toString();
    }

    public static TunnelDto.Builder builder() {
        return new TunnelDto.Builder();
    }

    public static class Builder {

        private String id;
        private String projectId;
        private String name;
        private String type;
        private TunnelConfigDto config;
        private String description;
        private String key;
        private String projectKey;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setConfig(TunnelConfigDto config) {
            this.config = config;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setProjectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
            return this;
        }

        public Builder setUpdatedAt(java.time.ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        public Builder setUpdater(String updater) {
            this.updater = updater;
            return this;
        }


        public TunnelDto build() {
            return new TunnelDto(id, projectId, name, type, config, description, key, projectKey, creatorId, createdAt, updaterId, updatedAt, creator, updater);
        }

    }
}
