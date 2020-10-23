package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class SegmentDocumentDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String fileName;
    @javax.validation.constraints.NotNull
    private String sourceType;

    public SegmentDocumentDto() {
    }

    public SegmentDocumentDto(String id, String fileName, String sourceType) {
        this.id = id;
        this.fileName = fileName;
        this.sourceType = sourceType;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSourceType() {
        return sourceType;
    }
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (fileName != null) {
            joiner.add("fileName: " + GraphQLRequestSerializer.getEntry(fileName));
        }
        if (sourceType != null) {
            joiner.add("sourceType: " + GraphQLRequestSerializer.getEntry(sourceType));
        }
        return joiner.toString();
    }

    public static SegmentDocumentDto.Builder builder() {
        return new SegmentDocumentDto.Builder();
    }

    public static class Builder {

        private String id;
        private String fileName;
        private String sourceType;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }


        public SegmentDocumentDto build() {
            return new SegmentDocumentDto(id, fileName, sourceType);
        }

    }
}
