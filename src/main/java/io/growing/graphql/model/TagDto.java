package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TagDto implements java.io.Serializable, EntityDto, ProjectDataCtrlItemDto, NamedEntityDto {

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
    private java.util.List<ComputeDefinitionDto> computes;
    private String businessType;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private ValueTypeDto valueType;
    private DetectorDto detector;
    private String ownerId;

    public TagDto() {
    }

    public TagDto(String id, String name, String key, String type, String description, java.util.List<ComputeDefinitionDto> computes, String businessType, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, ValueTypeDto valueType, DetectorDto detector, String ownerId) {
        this.id = id;
        this.name = name;
        this.key = key;
        this.type = type;
        this.description = description;
        this.computes = computes;
        this.businessType = businessType;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.valueType = valueType;
        this.detector = detector;
        this.ownerId = ownerId;
    }

    /**
     * tag id
     */
    public String getId() {
        return id;
    }
    /**
     * tag id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * tag名称
     */
    public String getName() {
        return name;
    }
    /**
     * tag名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 标签关键字
     */
    public String getKey() {
        return key;
    }
    /**
     * 标签关键字
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 标签类型
     */
    public String getType() {
        return type;
    }
    /**
     * 标签类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * tag描述信息
     */
    public String getDescription() {
        return description;
    }
    /**
     * tag描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 标签规则
     */
    public java.util.List<ComputeDefinitionDto> getComputes() {
        return computes;
    }
    /**
     * 标签规则
     */
    public void setComputes(java.util.List<ComputeDefinitionDto> computes) {
        this.computes = computes;
    }

    /**
     * 业务类型
     */
    public String getBusinessType() {
        return businessType;
    }
    /**
     * 业务类型
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * 创建者id
     */
    public String getCreatorId() {
        return creatorId;
    }
    /**
     * 创建者id
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 创建时间
     */
    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    /**
     * 创建时间
     */
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 更新者id
     */
    public String getUpdaterId() {
        return updaterId;
    }
    /**
     * 更新者id
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    /**
     * 更新时间
     */
    public java.time.ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
    /**
     * 更新时间
     */
    public void setUpdatedAt(java.time.ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 创建者
     */
    public String getCreator() {
        return creator;
    }
    /**
     * 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 更新者
     */
    public String getUpdater() {
        return updater;
    }
    /**
     * 更新者
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * 值类型
     */
    public ValueTypeDto getValueType() {
        return valueType;
    }
    /**
     * 值类型
     */
    public void setValueType(ValueTypeDto valueType) {
        this.valueType = valueType;
    }

    public DetectorDto getDetector() {
        return detector;
    }
    public void setDetector(DetectorDto detector) {
        this.detector = detector;
    }

    /**
     * 拥有者id
     */
    public String getOwnerId() {
        return ownerId;
    }
    /**
     * 拥有者id
     */
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
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (computes != null) {
            joiner.add("computes: " + GraphQLRequestSerializer.getEntry(computes));
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
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (detector != null) {
            joiner.add("detector: " + GraphQLRequestSerializer.getEntry(detector));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        return joiner.toString();
    }

    public static TagDto.Builder builder() {
        return new TagDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String key;
        private String type;
        private String description;
        private java.util.List<ComputeDefinitionDto> computes;
        private String businessType;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private ValueTypeDto valueType;
        private DetectorDto detector;
        private String ownerId;

        public Builder() {
        }

        /**
         * tag id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * tag名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 标签关键字
         */
        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        /**
         * 标签类型
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * tag描述信息
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * 标签规则
         */
        public Builder setComputes(java.util.List<ComputeDefinitionDto> computes) {
            this.computes = computes;
            return this;
        }

        /**
         * 业务类型
         */
        public Builder setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * 创建者id
         */
        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * 更新者id
         */
        public Builder setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
            return this;
        }

        /**
         * 更新时间
         */
        public Builder setUpdatedAt(java.time.ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * 创建者
         */
        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * 更新者
         */
        public Builder setUpdater(String updater) {
            this.updater = updater;
            return this;
        }

        /**
         * 值类型
         */
        public Builder setValueType(ValueTypeDto valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setDetector(DetectorDto detector) {
            this.detector = detector;
            return this;
        }

        /**
         * 拥有者id
         */
        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        public TagDto build() {
            return new TagDto(id, name, key, type, description, computes, businessType, creatorId, createdAt, updaterId, updatedAt, creator, updater, valueType, detector, ownerId);
        }

    }
}
