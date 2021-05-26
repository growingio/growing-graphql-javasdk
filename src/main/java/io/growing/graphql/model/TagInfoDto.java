package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Group内的tag信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TagInfoDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String tagId;
    @javax.validation.constraints.NotNull
    private String tagValue;

    public TagInfoDto() {
    }

    public TagInfoDto(String tagId, String tagValue) {
        this.tagId = tagId;
        this.tagValue = tagValue;
    }

    public String getTagId() {
        return tagId;
    }
    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTagValue() {
        return tagValue;
    }
    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
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
        return joiner.toString();
    }

    public static TagInfoDto.Builder builder() {
        return new TagInfoDto.Builder();
    }

    public static class Builder {

        private String tagId;
        private String tagValue;

        public Builder() {
        }

        public Builder setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }

        public Builder setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }


        public TagInfoDto build() {
            return new TagInfoDto(tagId, tagValue);
        }

    }
}
