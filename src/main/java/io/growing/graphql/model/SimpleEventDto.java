package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SimpleEventDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private String elementId;
    private java.util.List<String> platforms;
    @javax.validation.constraints.NotNull
    private String docType;
    @javax.validation.constraints.NotNull
    private String action;
    @javax.validation.constraints.NotNull
    private Boolean isSystem;
    private String businessType;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private String ownerId;

    public SimpleEventDto() {
    }

    public SimpleEventDto(String id, String name, String description, String elementId, java.util.List<String> platforms, String docType, String action, Boolean isSystem, String businessType, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String ownerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.elementId = elementId;
        this.platforms = platforms;
        this.docType = docType;
        this.action = action;
        this.isSystem = isSystem;
        this.businessType = businessType;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getElementId() {
        return elementId;
    }
    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public java.util.List<String> getPlatforms() {
        return platforms;
    }
    public void setPlatforms(java.util.List<String> platforms) {
        this.platforms = platforms;
    }

    public String getDocType() {
        return docType;
    }
    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getBusinessType() {
        return businessType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (elementId != null) {
            joiner.add("elementId: " + GraphQLRequestSerializer.getEntry(elementId));
        }
        if (platforms != null) {
            joiner.add("platforms: " + GraphQLRequestSerializer.getEntry(platforms));
        }
        if (docType != null) {
            joiner.add("docType: " + GraphQLRequestSerializer.getEntry(docType));
        }
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
        }
        if (isSystem != null) {
            joiner.add("isSystem: " + GraphQLRequestSerializer.getEntry(isSystem));
        }
        if (businessType != null) {
            joiner.add("businessType: " + GraphQLRequestSerializer.getEntry(businessType));
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

    public static SimpleEventDto.Builder builder() {
        return new SimpleEventDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String elementId;
        private java.util.List<String> platforms;
        private String docType;
        private String action;
        private Boolean isSystem;
        private String businessType;
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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setElementId(String elementId) {
            this.elementId = elementId;
            return this;
        }

        public Builder setPlatforms(java.util.List<String> platforms) {
            this.platforms = platforms;
            return this;
        }

        public Builder setDocType(String docType) {
            this.docType = docType;
            return this;
        }

        public Builder setAction(String action) {
            this.action = action;
            return this;
        }

        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        public Builder setBusinessType(String businessType) {
            this.businessType = businessType;
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


        public SimpleEventDto build() {
            return new SimpleEventDto(id, name, description, elementId, platforms, docType, action, isSystem, businessType, creatorId, createdAt, updaterId, updatedAt, creator, updater, ownerId);
        }

    }
}
