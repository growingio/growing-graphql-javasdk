package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class DashboardInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    private java.util.List<ComponentInputDto> components;
    private FilterInputDto filter;

    public DashboardInputDto() {
    }

    public DashboardInputDto(String name, String description, java.util.List<ComponentInputDto> components, FilterInputDto filter) {
        this.name = name;
        this.description = description;
        this.components = components;
        this.filter = filter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<ComponentInputDto> getComponents() {
        return components;
    }
    public void setComponents(java.util.List<ComponentInputDto> components) {
        this.components = components;
    }

    public FilterInputDto getFilter() {
        return filter;
    }
    public void setFilter(FilterInputDto filter) {
        this.filter = filter;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (components != null) {
            joiner.add("components: " + GraphQLRequestSerializer.getEntry(components));
        }
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        return joiner.toString();
    }

    public static DashboardInputDto.Builder builder() {
        return new DashboardInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<ComponentInputDto> components;
        private FilterInputDto filter;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setComponents(java.util.List<ComponentInputDto> components) {
            this.components = components;
            return this;
        }

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
            return this;
        }


        public DashboardInputDto build() {
            return new DashboardInputDto(name, description, components, filter);
        }

    }
}
