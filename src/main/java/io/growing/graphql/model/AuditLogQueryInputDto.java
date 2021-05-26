package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogQueryInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<String> projectIds;
    @javax.validation.constraints.NotNull
    private java.util.List<String> operatorIds;
    @javax.validation.constraints.NotNull
    private java.util.List<String> operationTypes;
    @javax.validation.constraints.NotNull
    private java.util.List<String> businessTypes;

    public AuditLogQueryInputDto() {
    }

    public AuditLogQueryInputDto(java.util.List<String> projectIds, java.util.List<String> operatorIds, java.util.List<String> operationTypes, java.util.List<String> businessTypes) {
        this.projectIds = projectIds;
        this.operatorIds = operatorIds;
        this.operationTypes = operationTypes;
        this.businessTypes = businessTypes;
    }

    public java.util.List<String> getProjectIds() {
        return projectIds;
    }
    public void setProjectIds(java.util.List<String> projectIds) {
        this.projectIds = projectIds;
    }

    public java.util.List<String> getOperatorIds() {
        return operatorIds;
    }
    public void setOperatorIds(java.util.List<String> operatorIds) {
        this.operatorIds = operatorIds;
    }

    public java.util.List<String> getOperationTypes() {
        return operationTypes;
    }
    public void setOperationTypes(java.util.List<String> operationTypes) {
        this.operationTypes = operationTypes;
    }

    public java.util.List<String> getBusinessTypes() {
        return businessTypes;
    }
    public void setBusinessTypes(java.util.List<String> businessTypes) {
        this.businessTypes = businessTypes;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (projectIds != null) {
            joiner.add("projectIds: " + GraphQLRequestSerializer.getEntry(projectIds));
        }
        if (operatorIds != null) {
            joiner.add("operatorIds: " + GraphQLRequestSerializer.getEntry(operatorIds));
        }
        if (operationTypes != null) {
            joiner.add("operationTypes: " + GraphQLRequestSerializer.getEntry(operationTypes));
        }
        if (businessTypes != null) {
            joiner.add("businessTypes: " + GraphQLRequestSerializer.getEntry(businessTypes));
        }
        return joiner.toString();
    }

    public static AuditLogQueryInputDto.Builder builder() {
        return new AuditLogQueryInputDto.Builder();
    }

    public static class Builder {

        private java.util.List<String> projectIds;
        private java.util.List<String> operatorIds;
        private java.util.List<String> operationTypes;
        private java.util.List<String> businessTypes;

        public Builder() {
        }

        public Builder setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }

        public Builder setOperatorIds(java.util.List<String> operatorIds) {
            this.operatorIds = operatorIds;
            return this;
        }

        public Builder setOperationTypes(java.util.List<String> operationTypes) {
            this.operationTypes = operationTypes;
            return this;
        }

        public Builder setBusinessTypes(java.util.List<String> businessTypes) {
            this.businessTypes = businessTypes;
            return this;
        }


        public AuditLogQueryInputDto build() {
            return new AuditLogQueryInputDto(projectIds, operatorIds, operationTypes, businessTypes);
        }

    }
}
