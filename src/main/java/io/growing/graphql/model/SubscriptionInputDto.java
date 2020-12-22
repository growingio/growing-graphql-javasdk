package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class SubscriptionInputDto implements java.io.Serializable {

    private String id;
    private String name;
    private java.util.List<SubscriptionInputDto> children;

    public SubscriptionInputDto() {
    }

    public SubscriptionInputDto(String id, String name, java.util.List<SubscriptionInputDto> children) {
        this.id = id;
        this.name = name;
        this.children = children;
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

    public java.util.List<SubscriptionInputDto> getChildren() {
        return children;
    }
    public void setChildren(java.util.List<SubscriptionInputDto> children) {
        this.children = children;
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
        if (children != null) {
            joiner.add("children: " + GraphQLRequestSerializer.getEntry(children));
        }
        return joiner.toString();
    }

    public static SubscriptionInputDto.Builder builder() {
        return new SubscriptionInputDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<SubscriptionInputDto> children;

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

        public Builder setChildren(java.util.List<SubscriptionInputDto> children) {
            this.children = children;
            return this;
        }


        public SubscriptionInputDto build() {
            return new SubscriptionInputDto(id, name, children);
        }

    }
}
