package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private String segmentId;
    @javax.validation.constraints.NotNull
    private String segmentName;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tencentTags;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tencentTagNames;
    @javax.validation.constraints.NotNull
    private String jobId;
    private DetectorDto detector;
    @javax.validation.constraints.NotNull
    private String mode;
    @javax.validation.constraints.NotNull
    private String creatorId;
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;

    public TencentPortraitDto() {
    }

    public TencentPortraitDto(String id, String name, String description, String segmentId, String segmentName, java.util.List<String> tencentTags, java.util.List<String> tencentTagNames, String jobId, DetectorDto detector, String mode, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.segmentId = segmentId;
        this.segmentName = segmentName;
        this.tencentTags = tencentTags;
        this.tencentTagNames = tencentTagNames;
        this.jobId = jobId;
        this.detector = detector;
        this.mode = mode;
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

    public String getSegmentId() {
        return segmentId;
    }
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public String getSegmentName() {
        return segmentName;
    }
    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public java.util.List<String> getTencentTags() {
        return tencentTags;
    }
    public void setTencentTags(java.util.List<String> tencentTags) {
        this.tencentTags = tencentTags;
    }

    public java.util.List<String> getTencentTagNames() {
        return tencentTagNames;
    }
    public void setTencentTagNames(java.util.List<String> tencentTagNames) {
        this.tencentTagNames = tencentTagNames;
    }

    public String getJobId() {
        return jobId;
    }
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * 分群状态
     */
    public DetectorDto getDetector() {
        return detector;
    }
    /**
     * 分群状态
     */
    public void setDetector(DetectorDto detector) {
        this.detector = detector;
    }

    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (segmentId != null) {
            joiner.add("segmentId: " + GraphQLRequestSerializer.getEntry(segmentId));
        }
        if (segmentName != null) {
            joiner.add("segmentName: " + GraphQLRequestSerializer.getEntry(segmentName));
        }
        if (tencentTags != null) {
            joiner.add("tencentTags: " + GraphQLRequestSerializer.getEntry(tencentTags));
        }
        if (tencentTagNames != null) {
            joiner.add("tencentTagNames: " + GraphQLRequestSerializer.getEntry(tencentTagNames));
        }
        if (jobId != null) {
            joiner.add("jobId: " + GraphQLRequestSerializer.getEntry(jobId));
        }
        if (detector != null) {
            joiner.add("detector: " + GraphQLRequestSerializer.getEntry(detector));
        }
        if (mode != null) {
            joiner.add("mode: " + GraphQLRequestSerializer.getEntry(mode));
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

    public static TencentPortraitDto.Builder builder() {
        return new TencentPortraitDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String segmentId;
        private String segmentName;
        private java.util.List<String> tencentTags;
        private java.util.List<String> tencentTagNames;
        private String jobId;
        private DetectorDto detector;
        private String mode;
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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }

        public Builder setSegmentName(String segmentName) {
            this.segmentName = segmentName;
            return this;
        }

        public Builder setTencentTags(java.util.List<String> tencentTags) {
            this.tencentTags = tencentTags;
            return this;
        }

        public Builder setTencentTagNames(java.util.List<String> tencentTagNames) {
            this.tencentTagNames = tencentTagNames;
            return this;
        }

        public Builder setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * 分群状态
         */
        public Builder setDetector(DetectorDto detector) {
            this.detector = detector;
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = mode;
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


        public TencentPortraitDto build() {
            return new TencentPortraitDto(id, name, description, segmentId, segmentName, tencentTags, tencentTagNames, jobId, detector, mode, creatorId, createdAt, updaterId, updatedAt, creator, updater);
        }

    }
}
