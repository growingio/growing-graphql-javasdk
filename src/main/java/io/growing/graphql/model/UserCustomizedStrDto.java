package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 自定义分组信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UserCustomizedStrDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String tagId;
    @javax.validation.constraints.NotNull
    private String tagValue;
    @javax.validation.constraints.NotNull
    private String compareType;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tagIds;

    public UserCustomizedStrDto() {
    }

    public UserCustomizedStrDto(String tagId, String tagValue, String compareType, java.util.List<String> tagIds) {
        this.tagId = tagId;
        this.tagValue = tagValue;
        this.compareType = compareType;
        this.tagIds = tagIds;
    }

    /**
     * 自定义分组id
     */
    public String getTagId() {
        return tagId;
    }
    /**
     * 自定义分组id
     */
    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    /**
     * 自定义分组名称
     */
    public String getTagValue() {
        return tagValue;
    }
    /**
     * 自定义分组名称
     */
    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    /**
     * 自定义分组标签间关系，bw|包含， nbw|不包含
     */
    public String getCompareType() {
        return compareType;
    }
    /**
     * 自定义分组标签间关系，bw|包含， nbw|不包含
     */
    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    /**
     * 选取标签
     */
    public java.util.List<String> getTagIds() {
        return tagIds;
    }
    /**
     * 选取标签
     */
    public void setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (tagId != null) {
            joiner.add("tagId: " + GraphQLRequestSerializer.getEntry(tagId));
        }
        if (tagValue != null) {
            joiner.add("tagValue: " + GraphQLRequestSerializer.getEntry(tagValue));
        }
        if (compareType != null) {
            joiner.add("compareType: " + GraphQLRequestSerializer.getEntry(compareType));
        }
        if (tagIds != null) {
            joiner.add("tagIds: " + GraphQLRequestSerializer.getEntry(tagIds));
        }
        return joiner.toString();
    }

    public static UserCustomizedStrDto.Builder builder() {
        return new UserCustomizedStrDto.Builder();
    }

    public static class Builder {

        private String tagId;
        private String tagValue;
        private String compareType;
        private java.util.List<String> tagIds;

        public Builder() {
        }

        /**
         * 自定义分组id
         */
        public Builder setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }

        /**
         * 自定义分组名称
         */
        public Builder setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        /**
         * 自定义分组标签间关系，bw|包含， nbw|不包含
         */
        public Builder setCompareType(String compareType) {
            this.compareType = compareType;
            return this;
        }

        /**
         * 选取标签
         */
        public Builder setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }


        public UserCustomizedStrDto build() {
            return new UserCustomizedStrDto(tagId, tagValue, compareType, tagIds);
        }

    }
}
