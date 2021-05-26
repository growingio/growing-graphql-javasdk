package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogQueryOptionItemDto implements java.io.Serializable {

    private String label;
    private String value;
    private String category;

    public AuditLogQueryOptionItemDto() {
    }

    public AuditLogQueryOptionItemDto(String label, String value, String category) {
        this.label = label;
        this.value = value;
        this.category = category;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (label != null) {
            joiner.add("label: " + GraphQLRequestSerializer.getEntry(label));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
        }
        return joiner.toString();
    }

    public static AuditLogQueryOptionItemDto.Builder builder() {
        return new AuditLogQueryOptionItemDto.Builder();
    }

    public static class Builder {

        private String label;
        private String value;
        private String category;

        public Builder() {
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }


        public AuditLogQueryOptionItemDto build() {
            return new AuditLogQueryOptionItemDto(label, value, category);
        }

    }
}
