package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogQueryOptionDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<AuditLogQueryOptionItemDto> businessTypeOptions;
    @javax.validation.constraints.NotNull
    private java.util.List<AuditLogQueryOptionItemDto> operationTypeOptions;

    public AuditLogQueryOptionDto() {
    }

    public AuditLogQueryOptionDto(java.util.List<AuditLogQueryOptionItemDto> businessTypeOptions, java.util.List<AuditLogQueryOptionItemDto> operationTypeOptions) {
        this.businessTypeOptions = businessTypeOptions;
        this.operationTypeOptions = operationTypeOptions;
    }

    public java.util.List<AuditLogQueryOptionItemDto> getBusinessTypeOptions() {
        return businessTypeOptions;
    }
    public void setBusinessTypeOptions(java.util.List<AuditLogQueryOptionItemDto> businessTypeOptions) {
        this.businessTypeOptions = businessTypeOptions;
    }

    public java.util.List<AuditLogQueryOptionItemDto> getOperationTypeOptions() {
        return operationTypeOptions;
    }
    public void setOperationTypeOptions(java.util.List<AuditLogQueryOptionItemDto> operationTypeOptions) {
        this.operationTypeOptions = operationTypeOptions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (businessTypeOptions != null) {
            joiner.add("businessTypeOptions: " + GraphQLRequestSerializer.getEntry(businessTypeOptions));
        }
        if (operationTypeOptions != null) {
            joiner.add("operationTypeOptions: " + GraphQLRequestSerializer.getEntry(operationTypeOptions));
        }
        return joiner.toString();
    }

    public static AuditLogQueryOptionDto.Builder builder() {
        return new AuditLogQueryOptionDto.Builder();
    }

    public static class Builder {

        private java.util.List<AuditLogQueryOptionItemDto> businessTypeOptions;
        private java.util.List<AuditLogQueryOptionItemDto> operationTypeOptions;

        public Builder() {
        }

        public Builder setBusinessTypeOptions(java.util.List<AuditLogQueryOptionItemDto> businessTypeOptions) {
            this.businessTypeOptions = businessTypeOptions;
            return this;
        }

        public Builder setOperationTypeOptions(java.util.List<AuditLogQueryOptionItemDto> operationTypeOptions) {
            this.operationTypeOptions = operationTypeOptions;
            return this;
        }


        public AuditLogQueryOptionDto build() {
            return new AuditLogQueryOptionDto(businessTypeOptions, operationTypeOptions);
        }

    }
}
