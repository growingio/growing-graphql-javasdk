package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 用户属性，以及新增的用户信息非ID部分
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserVariableDto implements java.io.Serializable, EntityDto, ProjectDataCtrlItemDto, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String type;
    private String description;
    @javax.validation.constraints.NotNull
    private Boolean isSystem;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    @javax.validation.constraints.NotNull
    private String valueType;
    private String ownerId;
    private String example;
    private Boolean disabled;
    @javax.validation.constraints.NotNull
    private Boolean isHighCardinality;

    public UserVariableDto() {
    }

    public UserVariableDto(String id, String name, String key, String type, String description, Boolean isSystem, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String valueType, String ownerId, String example, Boolean disabled, Boolean isHighCardinality) {
        this.id = id;
        this.name = name;
        this.key = key;
        this.type = type;
        this.description = description;
        this.isSystem = isSystem;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.valueType = valueType;
        this.ownerId = ownerId;
        this.example = example;
        this.disabled = disabled;
        this.isHighCardinality = isHighCardinality;
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

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
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

    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
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

    /**
     * 是否关闭，暂不用
     */
    public Boolean getDisabled() {
        return disabled;
    }
    /**
     * 是否关闭，暂不用
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean getIsHighCardinality() {
        return isHighCardinality;
    }
    public void setIsHighCardinality(Boolean isHighCardinality) {
        this.isHighCardinality = isHighCardinality;
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
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (isSystem != null) {
            joiner.add("isSystem: " + GraphQLRequestSerializer.getEntry(isSystem));
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
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        if (example != null) {
            joiner.add("example: " + GraphQLRequestSerializer.getEntry(example));
        }
        if (disabled != null) {
            joiner.add("disabled: " + GraphQLRequestSerializer.getEntry(disabled));
        }
        if (isHighCardinality != null) {
            joiner.add("isHighCardinality: " + GraphQLRequestSerializer.getEntry(isHighCardinality));
        }
        return joiner.toString();
    }

    public static UserVariableDto.Builder builder() {
        return new UserVariableDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String key;
        private String type;
        private String description;
        private Boolean isSystem;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private String valueType;
        private String ownerId;
        private String example;
        private Boolean disabled;
        private Boolean isHighCardinality;

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

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
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

        public Builder setValueType(String valueType) {
            this.valueType = valueType;
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

        /**
         * 是否关闭，暂不用
         */
        public Builder setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setIsHighCardinality(Boolean isHighCardinality) {
            this.isHighCardinality = isHighCardinality;
            return this;
        }


        public UserVariableDto build() {
            return new UserVariableDto(id, name, key, type, description, isSystem, creatorId, createdAt, updaterId, updatedAt, creator, updater, valueType, ownerId, example, disabled, isHighCardinality);
        }

    }
}
