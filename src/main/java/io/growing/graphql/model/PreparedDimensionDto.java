package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class PreparedDimensionDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<String> platforms;
    private String description;
    private String example;

    public PreparedDimensionDto() {
    }

    public PreparedDimensionDto(String id, String name, java.util.List<String> platforms, String description, String example) {
        this.id = id;
        this.name = name;
        this.platforms = platforms;
        this.description = description;
        this.example = example;
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

    public java.util.List<String> getPlatforms() {
        return platforms;
    }
    public void setPlatforms(java.util.List<String> platforms) {
        this.platforms = platforms;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getExample() {
        return example;
    }
    public void setExample(String example) {
        this.example = example;
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
        if (platforms != null) {
            joiner.add("platforms: " + GraphQLRequestSerializer.getEntry(platforms));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (example != null) {
            joiner.add("example: " + GraphQLRequestSerializer.getEntry(example));
        }
        return joiner.toString();
    }

    public static PreparedDimensionDto.Builder builder() {
        return new PreparedDimensionDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<String> platforms;
        private String description;
        private String example;

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

        public Builder setPlatforms(java.util.List<String> platforms) {
            this.platforms = platforms;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setExample(String example) {
            this.example = example;
            return this;
        }


        public PreparedDimensionDto build() {
            return new PreparedDimensionDto(id, name, platforms, description, example);
        }

    }
}
