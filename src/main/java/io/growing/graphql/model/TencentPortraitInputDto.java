package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private String segmentId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tencentTags;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tencentTagNames;
    @javax.validation.constraints.NotNull
    private String mode;

    public TencentPortraitInputDto() {
    }

    public TencentPortraitInputDto(String name, String description, String segmentId, java.util.List<String> tencentTags, java.util.List<String> tencentTagNames, String mode) {
        this.name = name;
        this.description = description;
        this.segmentId = segmentId;
        this.tencentTags = tencentTags;
        this.tencentTagNames = tencentTagNames;
        this.mode = mode;
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

    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (segmentId != null) {
            joiner.add("segmentId: " + GraphQLRequestSerializer.getEntry(segmentId));
        }
        if (tencentTags != null) {
            joiner.add("tencentTags: " + GraphQLRequestSerializer.getEntry(tencentTags));
        }
        if (tencentTagNames != null) {
            joiner.add("tencentTagNames: " + GraphQLRequestSerializer.getEntry(tencentTagNames));
        }
        if (mode != null) {
            joiner.add("mode: " + GraphQLRequestSerializer.getEntry(mode));
        }
        return joiner.toString();
    }

    public static TencentPortraitInputDto.Builder builder() {
        return new TencentPortraitInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String segmentId;
        private java.util.List<String> tencentTags;
        private java.util.List<String> tencentTagNames;
        private String mode;

        public Builder() {
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

        public Builder setTencentTags(java.util.List<String> tencentTags) {
            this.tencentTags = tencentTags;
            return this;
        }

        public Builder setTencentTagNames(java.util.List<String> tencentTagNames) {
            this.tencentTagNames = tencentTagNames;
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = mode;
            return this;
        }


        public TencentPortraitInputDto build() {
            return new TencentPortraitInputDto(name, description, segmentId, tencentTags, tencentTagNames, mode);
        }

    }
}
