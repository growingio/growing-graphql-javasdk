package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CrystalBallPropertyCategoryDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tags;

    public CrystalBallPropertyCategoryDto() {
    }

    public CrystalBallPropertyCategoryDto(String title, java.util.List<String> properties, java.util.List<String> tags) {
        this.title = title;
        this.properties = properties;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public java.util.List<String> getProperties() {
        return properties;
    }
    public void setProperties(java.util.List<String> properties) {
        this.properties = properties;
    }

    public java.util.List<String> getTags() {
        return tags;
    }
    public void setTags(java.util.List<String> tags) {
        this.tags = tags;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        return joiner.toString();
    }

    public static CrystalBallPropertyCategoryDto.Builder builder() {
        return new CrystalBallPropertyCategoryDto.Builder();
    }

    public static class Builder {

        private String title;
        private java.util.List<String> properties;
        private java.util.List<String> tags;

        public Builder() {
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }


        public CrystalBallPropertyCategoryDto build() {
            return new CrystalBallPropertyCategoryDto(title, properties, tags);
        }

    }
}
