package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class ElementDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private java.util.List<String> actions;
    private DocPropsDto attrs;
    private DocPropsDto definition;
    private ScreenshotDto screenshot;
    private java.util.List<String> platforms;
    @javax.validation.constraints.NotNull
    private String docType;
    private String description;
    private String businessType;
    @javax.validation.constraints.NotNull
    private Boolean isSystem;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private java.time.ZonedDateTime updatedAt;
    @javax.validation.constraints.NotNull
    private String creatorId;
    private String updaterId;
    private String creator;
    private String updater;
    private Boolean patternMatched;
    private String appVersion;
    private String sdkVersion;
    private String ownerId;

    public ElementDto() {
    }

    public ElementDto(String id, String name, java.util.List<String> actions, DocPropsDto attrs, DocPropsDto definition, ScreenshotDto screenshot, java.util.List<String> platforms, String docType, String description, String businessType, Boolean isSystem, java.time.ZonedDateTime createdAt, java.time.ZonedDateTime updatedAt, String creatorId, String updaterId, String creator, String updater, Boolean patternMatched, String appVersion, String sdkVersion, String ownerId) {
        this.id = id;
        this.name = name;
        this.actions = actions;
        this.attrs = attrs;
        this.definition = definition;
        this.screenshot = screenshot;
        this.platforms = platforms;
        this.docType = docType;
        this.description = description;
        this.businessType = businessType;
        this.isSystem = isSystem;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.creatorId = creatorId;
        this.updaterId = updaterId;
        this.creator = creator;
        this.updater = updater;
        this.patternMatched = patternMatched;
        this.appVersion = appVersion;
        this.sdkVersion = sdkVersion;
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

    public java.util.List<String> getActions() {
        return actions;
    }
    public void setActions(java.util.List<String> actions) {
        this.actions = actions;
    }

    public DocPropsDto getAttrs() {
        return attrs;
    }
    public void setAttrs(DocPropsDto attrs) {
        this.attrs = attrs;
    }

    public DocPropsDto getDefinition() {
        return definition;
    }
    public void setDefinition(DocPropsDto definition) {
        this.definition = definition;
    }

    public ScreenshotDto getScreenshot() {
        return screenshot;
    }
    public void setScreenshot(ScreenshotDto screenshot) {
        this.screenshot = screenshot;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getBusinessType() {
        return businessType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public java.time.ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getUpdaterId() {
        return updaterId;
    }
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
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

    public Boolean getPatternMatched() {
        return patternMatched;
    }
    public void setPatternMatched(Boolean patternMatched) {
        this.patternMatched = patternMatched;
    }

    public String getAppVersion() {
        return appVersion;
    }
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }
    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
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
        if (actions != null) {
            joiner.add("actions: " + GraphQLRequestSerializer.getEntry(actions));
        }
        if (attrs != null) {
            joiner.add("attrs: " + GraphQLRequestSerializer.getEntry(attrs));
        }
        if (definition != null) {
            joiner.add("definition: " + GraphQLRequestSerializer.getEntry(definition));
        }
        if (screenshot != null) {
            joiner.add("screenshot: " + GraphQLRequestSerializer.getEntry(screenshot));
        }
        if (platforms != null) {
            joiner.add("platforms: " + GraphQLRequestSerializer.getEntry(platforms));
        }
        if (docType != null) {
            joiner.add("docType: " + GraphQLRequestSerializer.getEntry(docType));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (businessType != null) {
            joiner.add("businessType: " + GraphQLRequestSerializer.getEntry(businessType));
        }
        if (isSystem != null) {
            joiner.add("isSystem: " + GraphQLRequestSerializer.getEntry(isSystem));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (creatorId != null) {
            joiner.add("creatorId: " + GraphQLRequestSerializer.getEntry(creatorId));
        }
        if (updaterId != null) {
            joiner.add("updaterId: " + GraphQLRequestSerializer.getEntry(updaterId));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (updater != null) {
            joiner.add("updater: " + GraphQLRequestSerializer.getEntry(updater));
        }
        if (patternMatched != null) {
            joiner.add("patternMatched: " + GraphQLRequestSerializer.getEntry(patternMatched));
        }
        if (appVersion != null) {
            joiner.add("appVersion: " + GraphQLRequestSerializer.getEntry(appVersion));
        }
        if (sdkVersion != null) {
            joiner.add("sdkVersion: " + GraphQLRequestSerializer.getEntry(sdkVersion));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        return joiner.toString();
    }

    public static ElementDto.Builder builder() {
        return new ElementDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<String> actions;
        private DocPropsDto attrs;
        private DocPropsDto definition;
        private ScreenshotDto screenshot;
        private java.util.List<String> platforms;
        private String docType;
        private String description;
        private String businessType;
        private Boolean isSystem;
        private java.time.ZonedDateTime createdAt;
        private java.time.ZonedDateTime updatedAt;
        private String creatorId;
        private String updaterId;
        private String creator;
        private String updater;
        private Boolean patternMatched;
        private String appVersion;
        private String sdkVersion;
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

        public Builder setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setAttrs(DocPropsDto attrs) {
            this.attrs = attrs;
            return this;
        }

        public Builder setDefinition(DocPropsDto definition) {
            this.definition = definition;
            return this;
        }

        public Builder setScreenshot(ScreenshotDto screenshot) {
            this.screenshot = screenshot;
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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        public Builder setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(java.time.ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public Builder setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
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

        public Builder setPatternMatched(Boolean patternMatched) {
            this.patternMatched = patternMatched;
            return this;
        }

        public Builder setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        public Builder setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        public ElementDto build() {
            return new ElementDto(id, name, actions, attrs, definition, screenshot, platforms, docType, description, businessType, isSystem, createdAt, updatedAt, creatorId, updaterId, creator, updater, patternMatched, appVersion, sdkVersion, ownerId);
        }

    }
}
