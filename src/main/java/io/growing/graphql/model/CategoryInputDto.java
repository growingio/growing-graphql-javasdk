package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CategoryInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String parentId;

    public CategoryInputDto() {
    }

    public CategoryInputDto(String name, String parentId) {
        this.name = name;
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (parentId != null) {
            joiner.add("parentId: " + GraphQLRequestSerializer.getEntry(parentId));
        }
        return joiner.toString();
    }

    public static CategoryInputDto.Builder builder() {
        return new CategoryInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String parentId;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }


        public CategoryInputDto build() {
            return new CategoryInputDto(name, parentId);
        }

    }
}
