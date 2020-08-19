package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class FileDescriptorDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String owner;
    @javax.validation.constraints.NotNull
    private java.lang.Long size;
    @javax.validation.constraints.NotNull
    private String checksum;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime lastModified;

    public FileDescriptorDto() {
    }

    public FileDescriptorDto(String name, String owner, java.lang.Long size, String checksum, java.time.ZonedDateTime lastModified) {
        this.name = name;
        this.owner = owner;
        this.size = size;
        this.checksum = checksum;
        this.lastModified = lastModified;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public java.lang.Long getSize() {
        return size;
    }
    public void setSize(java.lang.Long size) {
        this.size = size;
    }

    public String getChecksum() {
        return checksum;
    }
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public java.time.ZonedDateTime getLastModified() {
        return lastModified;
    }
    public void setLastModified(java.time.ZonedDateTime lastModified) {
        this.lastModified = lastModified;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner));
        }
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        }
        if (checksum != null) {
            joiner.add("checksum: " + GraphQLRequestSerializer.getEntry(checksum));
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + GraphQLRequestSerializer.getEntry(lastModified));
        }
        return joiner.toString();
    }

    public static FileDescriptorDto.Builder builder() {
        return new FileDescriptorDto.Builder();
    }

    public static class Builder {

        private String name;
        private String owner;
        private java.lang.Long size;
        private String checksum;
        private java.time.ZonedDateTime lastModified;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setSize(java.lang.Long size) {
            this.size = size;
            return this;
        }

        public Builder setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        public Builder setLastModified(java.time.ZonedDateTime lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public FileDescriptorDto build() {
            return new FileDescriptorDto(name, owner, size, checksum, lastModified);
        }

    }
}
