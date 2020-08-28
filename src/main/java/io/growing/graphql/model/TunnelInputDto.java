package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class TunnelInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private TunnelTypeDto type;
    private String description;
    private java.lang.Object config;

    public TunnelInputDto() {
    }

    public TunnelInputDto(String name, TunnelTypeDto type, String description, java.lang.Object config) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.config = config;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public TunnelTypeDto getType() {
        return type;
    }
    public void setType(TunnelTypeDto type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.lang.Object getConfig() {
        return config;
    }
    public void setConfig(java.lang.Object config) {
        this.config = config;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (config != null) {
            joiner.add("config: " + GraphQLRequestSerializer.getEntry(config));
        }
        return joiner.toString();
    }

    public static TunnelInputDto.Builder builder() {
        return new TunnelInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private TunnelTypeDto type;
        private String description;
        private java.lang.Object config;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(TunnelTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setConfig(java.lang.Object config) {
            this.config = config;
            return this;
        }


        public TunnelInputDto build() {
            return new TunnelInputDto(name, type, description, config);
        }

    }
}
