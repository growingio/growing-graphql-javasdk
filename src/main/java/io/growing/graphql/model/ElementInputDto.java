package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class ElementInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String docType;
    @javax.validation.constraints.NotNull
    private java.util.List<String> actions;
    @javax.validation.constraints.NotNull
    private java.util.List<String> platforms;
    private DocPropsInputDto attrs;
    private DocPropsInputDto definition;
    private ScreenshotInputDto screenshot;
    private String description;

    public ElementInputDto() {
    }

    public ElementInputDto(String name, String docType, java.util.List<String> actions, java.util.List<String> platforms, DocPropsInputDto attrs, DocPropsInputDto definition, ScreenshotInputDto screenshot, String description) {
        this.name = name;
        this.docType = docType;
        this.actions = actions;
        this.platforms = platforms;
        this.attrs = attrs;
        this.definition = definition;
        this.screenshot = screenshot;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDocType() {
        return docType;
    }
    public void setDocType(String docType) {
        this.docType = docType;
    }

    public java.util.List<String> getActions() {
        return actions;
    }
    public void setActions(java.util.List<String> actions) {
        this.actions = actions;
    }

    public java.util.List<String> getPlatforms() {
        return platforms;
    }
    public void setPlatforms(java.util.List<String> platforms) {
        this.platforms = platforms;
    }

    public DocPropsInputDto getAttrs() {
        return attrs;
    }
    public void setAttrs(DocPropsInputDto attrs) {
        this.attrs = attrs;
    }

    public DocPropsInputDto getDefinition() {
        return definition;
    }
    public void setDefinition(DocPropsInputDto definition) {
        this.definition = definition;
    }

    public ScreenshotInputDto getScreenshot() {
        return screenshot;
    }
    public void setScreenshot(ScreenshotInputDto screenshot) {
        this.screenshot = screenshot;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (docType != null) {
            joiner.add("docType: " + GraphQLRequestSerializer.getEntry(docType));
        }
        if (actions != null) {
            joiner.add("actions: " + GraphQLRequestSerializer.getEntry(actions));
        }
        if (platforms != null) {
            joiner.add("platforms: " + GraphQLRequestSerializer.getEntry(platforms));
        }
        if (attrs != null) {
            joiner.add("attrs: " + GraphQLRequestSerializer.getEntry(attrs));
        }
        if (definition != null) {
            joiner.add("definition: " + GraphQLRequestSerializer.getEntry(definition));
        }
        if (screenshot != null) {
            joiner.add("screenshot: " + GraphQLRequestSerializer.getEntry(screenshot));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        return joiner.toString();
    }

    public static ElementInputDto.Builder builder() {
        return new ElementInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String docType;
        private java.util.List<String> actions;
        private java.util.List<String> platforms;
        private DocPropsInputDto attrs;
        private DocPropsInputDto definition;
        private ScreenshotInputDto screenshot;
        private String description;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDocType(String docType) {
            this.docType = docType;
            return this;
        }

        public Builder setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setPlatforms(java.util.List<String> platforms) {
            this.platforms = platforms;
            return this;
        }

        public Builder setAttrs(DocPropsInputDto attrs) {
            this.attrs = attrs;
            return this;
        }

        public Builder setDefinition(DocPropsInputDto definition) {
            this.definition = definition;
            return this;
        }

        public Builder setScreenshot(ScreenshotInputDto screenshot) {
            this.screenshot = screenshot;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public ElementInputDto build() {
            return new ElementInputDto(name, docType, actions, platforms, attrs, definition, screenshot, description);
        }

    }
}
