package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class ExportSegmentParameterInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private DownloadSegmentTypeDto segmentType;
    private String exportFileName;
    @javax.validation.constraints.NotNull
    private java.util.List<String> tags;
    @javax.validation.constraints.NotNull
    private java.util.List<String> properties;
    private String charset;

    public ExportSegmentParameterInputDto() {
    }

    public ExportSegmentParameterInputDto(String id, DownloadSegmentTypeDto segmentType, String exportFileName, java.util.List<String> tags, java.util.List<String> properties, String charset) {
        this.id = id;
        this.segmentType = segmentType;
        this.exportFileName = exportFileName;
        this.tags = tags;
        this.properties = properties;
        this.charset = charset;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public DownloadSegmentTypeDto getSegmentType() {
        return segmentType;
    }
    public void setSegmentType(DownloadSegmentTypeDto segmentType) {
        this.segmentType = segmentType;
    }

    public String getExportFileName() {
        return exportFileName;
    }
    public void setExportFileName(String exportFileName) {
        this.exportFileName = exportFileName;
    }

    public java.util.List<String> getTags() {
        return tags;
    }
    public void setTags(java.util.List<String> tags) {
        this.tags = tags;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (segmentType != null) {
            joiner.add("segmentType: " + GraphQLRequestSerializer.getEntry(segmentType));
        }
        if (exportFileName != null) {
            joiner.add("exportFileName: " + GraphQLRequestSerializer.getEntry(exportFileName));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (charset != null) {
            joiner.add("charset: " + GraphQLRequestSerializer.getEntry(charset));
        }
        return joiner.toString();
    }

    public static ExportSegmentParameterInputDto.Builder builder() {
        return new ExportSegmentParameterInputDto.Builder();
    }

    public static class Builder {

        private String id;
        private DownloadSegmentTypeDto segmentType;
        private String exportFileName;
        private java.util.List<String> tags;
        private java.util.List<String> properties;
        private String charset;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setSegmentType(DownloadSegmentTypeDto segmentType) {
            this.segmentType = segmentType;
            return this;
        }

        public Builder setExportFileName(String exportFileName) {
            this.exportFileName = exportFileName;
            return this;
        }

        public Builder setTags(java.util.List<String> tags) {
            this.tags = tags;
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


        public ExportSegmentParameterInputDto build() {
            return new ExportSegmentParameterInputDto(id, segmentType, exportFileName, tags, properties, charset);
        }

    }
}
