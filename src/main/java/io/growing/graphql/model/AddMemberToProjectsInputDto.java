package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AddMemberToProjectsInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<AddMemberToProjectInputDto> entries;

    public AddMemberToProjectsInputDto() {
    }

    public AddMemberToProjectsInputDto(java.util.List<AddMemberToProjectInputDto> entries) {
        this.entries = entries;
    }

    public java.util.List<AddMemberToProjectInputDto> getEntries() {
        return entries;
    }
    public void setEntries(java.util.List<AddMemberToProjectInputDto> entries) {
        this.entries = entries;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entries != null) {
            joiner.add("entries: " + GraphQLRequestSerializer.getEntry(entries));
        }
        return joiner.toString();
    }

    public static AddMemberToProjectsInputDto.Builder builder() {
        return new AddMemberToProjectsInputDto.Builder();
    }

    public static class Builder {

        private java.util.List<AddMemberToProjectInputDto> entries;

        public Builder() {
        }

        public Builder setEntries(java.util.List<AddMemberToProjectInputDto> entries) {
            this.entries = entries;
            return this;
        }


        public AddMemberToProjectsInputDto build() {
            return new AddMemberToProjectsInputDto(entries);
        }

    }
}
