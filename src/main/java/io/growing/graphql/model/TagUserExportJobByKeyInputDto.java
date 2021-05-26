package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TagUserExportJobByKeyInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String tagKey;
    private String exportFileName;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;
    private String charset;
    private Boolean detailExport;

    public TagUserExportJobByKeyInputDto() {
    }

    public TagUserExportJobByKeyInputDto(String tagKey, String exportFileName, java.util.List<String> properties, String charset, Boolean detailExport) {
        this.tagKey = tagKey;
        this.exportFileName = exportFileName;
        this.properties = properties;
        this.charset = charset;
        this.detailExport = detailExport;
    }

    public String getTagKey() {
        return tagKey;
    }
    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public String getExportFileName() {
        return exportFileName;
    }
    public void setExportFileName(String exportFileName) {
        this.exportFileName = exportFileName;
    }

    public java.util.List<String> getProperties() {
        return properties;
    }
    public void setProperties(java.util.List<String> properties) {
        this.properties = properties;
    }

    public String getCharset() {
        return charset;
    }
    public void setCharset(String charset) {
        this.charset = charset;
    }

    public Boolean getDetailExport() {
        return detailExport;
    }
    public void setDetailExport(Boolean detailExport) {
        this.detailExport = detailExport;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (tagKey != null) {
            joiner.add("tagKey: " + GraphQLRequestSerializer.getEntry(tagKey));
        }
        if (exportFileName != null) {
            joiner.add("exportFileName: " + GraphQLRequestSerializer.getEntry(exportFileName));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (charset != null) {
            joiner.add("charset: " + GraphQLRequestSerializer.getEntry(charset));
        }
        if (detailExport != null) {
            joiner.add("detailExport: " + GraphQLRequestSerializer.getEntry(detailExport));
        }
        return joiner.toString();
    }

    public static TagUserExportJobByKeyInputDto.Builder builder() {
        return new TagUserExportJobByKeyInputDto.Builder();
    }

    public static class Builder {

        private String tagKey;
        private String exportFileName;
        private java.util.List<String> properties;
        private String charset;
        private Boolean detailExport;

        public Builder() {
        }

        public Builder setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        public Builder setExportFileName(String exportFileName) {
            this.exportFileName = exportFileName;
            return this;
        }

        public Builder setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setCharset(String charset) {
            this.charset = charset;
            return this;
        }

        public Builder setDetailExport(Boolean detailExport) {
            this.detailExport = detailExport;
            return this;
        }


        public TagUserExportJobByKeyInputDto build() {
            return new TagUserExportJobByKeyInputDto(tagKey, exportFileName, properties, charset, detailExport);
        }

    }
}
