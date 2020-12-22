package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CustomEventDto implements java.io.Serializable, ProjectDataCtrlItemDto, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String key;
    private String description;
    @javax.validation.constraints.NotNull
    private Boolean isSystem;
    @javax.validation.constraints.NotNull
    private String valueType;
    @javax.validation.constraints.NotNull
    private java.util.List<EventVariableDto> variables;
    @javax.validation.constraints.NotNull
    private java.util.List<CustomEventChildDto> attributes;
    @javax.validation.constraints.NotNull
    private java.util.List<CustomEventChildDto> itemModels;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    @javax.validation.constraints.NotNull
    private String ownerId;

    public CustomEventDto() {
    }

    public CustomEventDto(String id, String name, String key, String description, Boolean isSystem, String valueType, java.util.List<EventVariableDto> variables, java.util.List<CustomEventChildDto> attributes, java.util.List<CustomEventChildDto> itemModels, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String ownerId) {
        this.id = id;
        this.name = name;
        this.key = key;
        this.description = description;
        this.isSystem = isSystem;
        this.valueType = valueType;
        this.variables = variables;
        this.attributes = attributes;
        this.itemModels = itemModels;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.ownerId = ownerId;
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

    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public java.util.List<EventVariableDto> getVariables() {
        return variables;
    }
    public void setVariables(java.util.List<EventVariableDto> variables) {
        this.variables = variables;
    }

    public java.util.List<CustomEventChildDto> getAttributes() {
        return attributes;
    }
    public void setAttributes(java.util.List<CustomEventChildDto> attributes) {
        this.attributes = attributes;
    }

    public java.util.List<CustomEventChildDto> getItemModels() {
        return itemModels;
    }
    public void setItemModels(java.util.List<CustomEventChildDto> itemModels) {
        this.itemModels = itemModels;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (isSystem != null) {
            joiner.add("isSystem: " + GraphQLRequestSerializer.getEntry(isSystem));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (variables != null) {
            joiner.add("variables: " + GraphQLRequestSerializer.getEntry(variables));
        }
        if (attributes != null) {
            joiner.add("attributes: " + GraphQLRequestSerializer.getEntry(attributes));
        }
        if (itemModels != null) {
            joiner.add("itemModels: " + GraphQLRequestSerializer.getEntry(itemModels));
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
        return joiner.toString();
    }

    public static CustomEventDto.Builder builder() {
        return new CustomEventDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String key;
        private String description;
        private Boolean isSystem;
        private String valueType;
        private java.util.List<EventVariableDto> variables;
        private java.util.List<CustomEventChildDto> attributes;
        private java.util.List<CustomEventChildDto> itemModels;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private String ownerId;

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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setVariables(java.util.List<EventVariableDto> variables) {
            this.variables = variables;
            return this;
        }

        public Builder setAttributes(java.util.List<CustomEventChildDto> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setItemModels(java.util.List<CustomEventChildDto> itemModels) {
            this.itemModels = itemModels;
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


        public CustomEventDto build() {
            return new CustomEventDto(id, name, key, description, isSystem, valueType, variables, attributes, itemModels, creatorId, createdAt, updaterId, updatedAt, creator, updater, ownerId);
        }

    }
}
