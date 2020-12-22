package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class UserPropertyDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String platform;
    private String description;
    private String example;

    public UserPropertyDto() {
    }

    public UserPropertyDto(String id, String key, String name, String platform, String description, String example) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.platform = platform;
        this.description = description;
        this.example = example;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
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
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (platform != null) {
            joiner.add("platform: " + GraphQLRequestSerializer.getEntry(platform));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (example != null) {
            joiner.add("example: " + GraphQLRequestSerializer.getEntry(example));
        }
        return joiner.toString();
    }

    public static UserPropertyDto.Builder builder() {
        return new UserPropertyDto.Builder();
    }

    public static class Builder {

        private String id;
        private String key;
        private String name;
        private String platform;
        private String description;
        private String example;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPlatform(String platform) {
            this.platform = platform;
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


        public UserPropertyDto build() {
            return new UserPropertyDto(id, key, name, platform, description, example);
        }

    }
}
