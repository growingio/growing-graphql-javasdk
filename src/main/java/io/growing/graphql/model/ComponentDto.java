package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ComponentDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String dashboardId;
    @javax.validation.constraints.NotNull
    private String resourceType;
    @javax.validation.constraints.NotNull
    private String resourceId;
    private LayoutDto layout;

    public ComponentDto() {
    }

    public ComponentDto(String dashboardId, String resourceType, String resourceId, LayoutDto layout) {
        this.dashboardId = dashboardId;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.layout = layout;
    }

    public String getDashboardId() {
        return dashboardId;
    }
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
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

    public LayoutDto getLayout() {
        return layout;
    }
    public void setLayout(LayoutDto layout) {
        this.layout = layout;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (dashboardId != null) {
            joiner.add("dashboardId: " + GraphQLRequestSerializer.getEntry(dashboardId));
        }
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

    public static ComponentDto.Builder builder() {
        return new ComponentDto.Builder();
    }

    public static class Builder {

        private String dashboardId;
        private String resourceType;
        private String resourceId;
        private LayoutDto layout;

        public Builder() {
        }

        public Builder setDashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setLayout(LayoutDto layout) {
            this.layout = layout;
            return this;
        }


        public ComponentDto build() {
            return new ComponentDto(dashboardId, resourceType, resourceId, layout);
        }

    }
}
