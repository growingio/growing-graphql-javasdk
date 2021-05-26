package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 用户ID - 原用户信息中能标识用户的
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserIdentityDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String matchType;
    private String description;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private String ownerId;
    private String example;

    public UserIdentityDto() {
    }

    public UserIdentityDto(String id, String name, String key, String matchType, String description, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String ownerId, String example) {
        this.id = id;
        this.name = name;
        this.key = key;
        this.matchType = matchType;
        this.description = description;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.ownerId = ownerId;
        this.example = example;
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

    /**
     * key前包含$
     */
    public String getKey() {
        return key;
    }
    /**
     * key前包含$
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 识别类型
     */
    public String getMatchType() {
        return matchType;
    }
    /**
     * 识别类型
     */
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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

    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 示例
     */
    public String getExample() {
        return example;
    }
    /**
     * 示例
     */
    public void setExample(String example) {
        this.example = example;
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
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (matchType != null) {
            joiner.add("matchType: " + GraphQLRequestSerializer.getEntry(matchType));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
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
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        if (example != null) {
            joiner.add("example: " + GraphQLRequestSerializer.getEntry(example));
        }
        return joiner.toString();
    }

    public static UserIdentityDto.Builder builder() {
        return new UserIdentityDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String key;
        private String matchType;
        private String description;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private String ownerId;
        private String example;

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

        /**
         * key前包含$
         */
        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        /**
         * 识别类型
         */
        public Builder setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
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

        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * 示例
         */
        public Builder setExample(String example) {
            this.example = example;
            return this;
        }


        public UserIdentityDto build() {
            return new UserIdentityDto(id, name, key, matchType, description, creatorId, createdAt, updaterId, updatedAt, creator, updater, ownerId, example);
        }

    }
}
