package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class ComponentInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String resourceType;
    @javax.validation.constraints.NotNull
    private String resourceId;
    private LayoutInputDto layout;

    public ComponentInputDto() {
    }

    public ComponentInputDto(String resourceType, String resourceId, LayoutInputDto layout) {
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.layout = layout;
    }

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return resourceId;
    }
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public LayoutInputDto getLayout() {
        return layout;
    }
    public void setLayout(LayoutInputDto layout) {
        this.layout = layout;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (resourceType != null) {
            joiner.add("resourceType: " + GraphQLRequestSerializer.getEntry(resourceType));
        }
        if (resourceId != null) {
            joiner.add("resourceId: " + GraphQLRequestSerializer.getEntry(resourceId));
        }
        if (layout != null) {
            joiner.add("layout: " + GraphQLRequestSerializer.getEntry(layout));
        }
        return joiner.toString();
    }

    public static ComponentInputDto.Builder builder() {
        return new ComponentInputDto.Builder();
    }

    public static class Builder {

        private String resourceType;
        private String resourceId;
        private LayoutInputDto layout;

        public Builder() {
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setLayout(LayoutInputDto layout) {
            this.layout = layout;
            return this;
        }


        public ComponentInputDto build() {
            return new ComponentInputDto(resourceType, resourceId, layout);
        }

    }
}
