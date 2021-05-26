package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitJobDto implements java.io.Serializable, JobEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private JobStageDto stage;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private ErrorDto error;

    public TencentPortraitJobDto() {
    }

    public TencentPortraitJobDto(String id, String name, String description, JobStageDto stage, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, ErrorDto error) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.stage = stage;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.error = error;
    }

    /**
     * 任务id
     */
    public String getId() {
        return id;
    }
    /**
     * 任务id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 任务名称
     */
    public String getName() {
        return name;
    }
    /**
     * 任务名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 描述信息
     */
    public String getDescription() {
        return description;
    }
    /**
     * 描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 任务状态
     */
    public JobStageDto getStage() {
        return stage;
    }
    /**
     * 任务状态
     */
    public void setStage(JobStageDto stage) {
        this.stage = stage;
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
     * 错误类型
     */
    public ErrorDto getError() {
        return error;
    }
    /**
     * 错误类型
     */
    public void setError(ErrorDto error) {
        this.error = error;
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
        if (stage != null) {
            joiner.add("stage: " + GraphQLRequestSerializer.getEntry(stage));
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
        if (error != null) {
            joiner.add("error: " + GraphQLRequestSerializer.getEntry(error));
        }
        return joiner.toString();
    }

    public static TencentPortraitJobDto.Builder builder() {
        return new TencentPortraitJobDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private JobStageDto stage;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private ErrorDto error;

        public Builder() {
        }

        /**
         * 任务id
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * 任务名称
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 描述信息
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * 任务状态
         */
        public Builder setStage(JobStageDto stage) {
            this.stage = stage;
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
         * 错误类型
         */
        public Builder setError(ErrorDto error) {
            this.error = error;
            return this;
        }


        public TencentPortraitJobDto build() {
            return new TencentPortraitJobDto(id, name, description, stage, creatorId, createdAt, updaterId, updatedAt, creator, updater, error);
        }

    }
}
