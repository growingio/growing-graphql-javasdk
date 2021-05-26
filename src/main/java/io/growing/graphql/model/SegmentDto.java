package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SegmentDto implements java.io.Serializable, EntityDto, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private ComputeDefinitionDto compute;
    @javax.validation.constraints.NotNull
    private String scheduler;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private String createdBy;
    private DetectorDto detector;
    @javax.validation.constraints.NotNull
    private String ownerId;

    public SegmentDto() {
    }

    public SegmentDto(String id, String name, String description, ComputeDefinitionDto compute, String scheduler, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, String createdBy, DetectorDto detector, String ownerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.compute = compute;
        this.scheduler = scheduler;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.createdBy = createdBy;
        this.detector = detector;
        this.ownerId = ownerId;
    }

    /**
     * 分群id
     */
    public String getId() {
        return id;
    }
    /**
     * 分群id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 分群名称
     */
    public String getName() {
        return name;
    }
    /**
     * 分群名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 分群描述信息
     */
    public String getDescription() {
        return description;
    }
    /**
     * 分群描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 规则定义
     */
    public ComputeDefinitionDto getCompute() {
        return compute;
    }
    /**
     * 规则定义
     */
    public void setCompute(ComputeDefinitionDto compute) {
        this.compute = compute;
    }

    /**
     * 计算频率，可分为每周计算一次/每天计算一次等
     */
    public String getScheduler() {
        return scheduler;
    }
    /**
     * 计算频率，可分为每周计算一次/每天计算一次等
     */
    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
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
     * 创建来源
     */
    public String getCreatedBy() {
        return createdBy;
    }
    /**
     * 创建来源
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (compute != null) {
            joiner.add("compute: " + GraphQLRequestSerializer.getEntry(compute));
        }
        if (scheduler != null) {
            joiner.add("scheduler: " + GraphQLRequestSerializer.getEntry(scheduler));
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
        if (createdBy != null) {
            joiner.add("createdBy: " + GraphQLRequestSerializer.getEntry(createdBy));
        }
        if (detector != null) {
            joiner.add("detector: " + GraphQLRequestSerializer.getEntry(detector));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        return joiner.toString();
    }

    public static SegmentDto.Builder builder() {
        return new SegmentDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private ComputeDefinitionDto compute;
        private String scheduler;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private String createdBy;
        private DetectorDto detector;
        private String ownerId;

        public Builder() {
        }

        /**
         * 分群id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 分群名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 分群描述信息
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * 规则定义
         */
        public Builder setCompute(ComputeDefinitionDto compute) {
            this.compute = compute;
            return this;
        }

        /**
         * 计算频率，可分为每周计算一次/每天计算一次等
         */
        public Builder setScheduler(String scheduler) {
            this.scheduler = scheduler;
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
         * 创建来源
         */
        public Builder setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
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


        public SegmentDto build() {
            return new SegmentDto(id, name, description, compute, scheduler, creatorId, createdAt, updaterId, updatedAt, creator, updater, createdBy, detector, ownerId);
        }

    }
}
