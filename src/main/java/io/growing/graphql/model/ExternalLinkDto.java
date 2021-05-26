package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ExternalLinkDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String ref;
    @javax.validation.constraints.NotNull
    private String position;

    public ExternalLinkDto() {
    }

    public ExternalLinkDto(String name, String ref, String position) {
        this.name = name;
        this.ref = ref;
        this.position = position;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref));
        }
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position));
        }
        return joiner.toString();
    }

    public static ExternalLinkDto.Builder builder() {
        return new ExternalLinkDto.Builder();
    }

    public static class Builder {

        private String name;
        private String ref;
        private String position;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRef(String ref) {
            this.ref = ref;
            return this;
        }

        public Builder setPosition(String position) {
            this.position = position;
            return this;
        }


        public ExternalLinkDto build() {
            return new ExternalLinkDto(name, ref, position);
        }

    }
}
