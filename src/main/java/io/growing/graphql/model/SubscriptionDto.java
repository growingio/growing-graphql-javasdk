package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class SubscriptionDto implements java.io.Serializable {

    private String id;
    private String name;
    private String status;
    @javax.validation.constraints.NotNull
    private java.util.List<SubscriptionDto> children;

    public SubscriptionDto() {
    }

    public SubscriptionDto(String id, String name, String status, java.util.List<SubscriptionDto> children) {
        this.id = id;
        this.name = name;
        this.status = status;
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

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public java.util.List<SubscriptionDto> getChildren() {
        return children;
    }
    public void setChildren(java.util.List<SubscriptionDto> children) {
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
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (children != null) {
            joiner.add("children: " + GraphQLRequestSerializer.getEntry(children));
        }
        return joiner.toString();
    }

    public static SubscriptionDto.Builder builder() {
        return new SubscriptionDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String status;
        private java.util.List<SubscriptionDto> children;

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

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setChildren(java.util.List<SubscriptionDto> children) {
            this.children = children;
            return this;
        }


        public SubscriptionDto build() {
            return new SubscriptionDto(id, name, status, children);
        }

    }
}
