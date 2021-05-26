package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AuditLogEntryDto implements java.io.Serializable, EntityDto {

    private String projectId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime operatedAt;
    private String operator;
    @javax.validation.constraints.NotNull
    private String operatorId;
    private String ip;
    private String businessType;
    private String operationType;
    private String operand;
    private String description;

    public AuditLogEntryDto() {
    }

    public AuditLogEntryDto(String projectId, java.time.ZonedDateTime operatedAt, String operator, String operatorId, String ip, String businessType, String operationType, String operand, String description) {
        this.projectId = projectId;
        this.operatedAt = operatedAt;
        this.operator = operator;
        this.operatorId = operatorId;
        this.ip = ip;
        this.businessType = businessType;
        this.operationType = operationType;
        this.operand = operand;
        this.description = description;
    }

    /**
     * 项目
     */
    public String getProjectId() {
        return projectId;
    }
    /**
     * 项目
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 操作时间
     */
    public java.time.ZonedDateTime getOperatedAt() {
        return operatedAt;
    }
    /**
     * 操作时间
     */
    public void setOperatedAt(java.time.ZonedDateTime operatedAt) {
        this.operatedAt = operatedAt;
    }

    /**
     * 操作者
     */
    public String getOperator() {
        return operator;
    }
    /**
     * 操作者
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 操作者 ID
     */
    public String getOperatorId() {
        return operatorId;
    }
    /**
     * 操作者 ID
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * IP
     */
    public String getIp() {
        return ip;
    }
    /**
     * IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 业务分类，同资源类型：如看板、事件分析
     */
    public String getBusinessType() {
        return businessType;
    }
    /**
     * 业务分类，同资源类型：如看板、事件分析
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * 操作类型：创建、删除、编辑、添加、移除、移交
     */
    public String getOperationType() {
        return operationType;
    }
    /**
     * 操作类型：创建、删除、编辑、添加、移除、移交
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * 操作对象：如成员名称、角色名称
     */
    public String getOperand() {
        return operand;
    }
    /**
     * 操作对象：如成员名称、角色名称
     */
    public void setOperand(String operand) {
        this.operand = operand;
    }

    /**
     * 操作描述
     */
    public String getDescription() {
        return description;
    }
    /**
     * 操作描述
     */
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (operatedAt != null) {
            joiner.add("operatedAt: " + GraphQLRequestSerializer.getEntry(operatedAt));
        }
        if (operator != null) {
            joiner.add("operator: " + GraphQLRequestSerializer.getEntry(operator));
        }
        if (operatorId != null) {
            joiner.add("operatorId: " + GraphQLRequestSerializer.getEntry(operatorId));
        }
        if (ip != null) {
            joiner.add("ip: " + GraphQLRequestSerializer.getEntry(ip));
        }
        if (businessType != null) {
            joiner.add("businessType: " + GraphQLRequestSerializer.getEntry(businessType));
        }
        if (operationType != null) {
            joiner.add("operationType: " + GraphQLRequestSerializer.getEntry(operationType));
        }
        if (operand != null) {
            joiner.add("operand: " + GraphQLRequestSerializer.getEntry(operand));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        return joiner.toString();
    }

    public static AuditLogEntryDto.Builder builder() {
        return new AuditLogEntryDto.Builder();
    }

    public static class Builder {

        private String projectId;
        private java.time.ZonedDateTime operatedAt;
        private String operator;
        private String operatorId;
        private String ip;
        private String businessType;
        private String operationType;
        private String operand;
        private String description;

        public Builder() {
        }

        /**
         * 项目
         */
        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * 操作时间
         */
        public Builder setOperatedAt(java.time.ZonedDateTime operatedAt) {
            this.operatedAt = operatedAt;
            return this;
        }

        /**
         * 操作者
         */
        public Builder setOperator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * 操作者 ID
         */
        public Builder setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        /**
         * IP
         */
        public Builder setIp(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * 业务分类，同资源类型：如看板、事件分析
         */
        public Builder setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * 操作类型：创建、删除、编辑、添加、移除、移交
         */
        public Builder setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * 操作对象：如成员名称、角色名称
         */
        public Builder setOperand(String operand) {
            this.operand = operand;
            return this;
        }

        /**
         * 操作描述
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public AuditLogEntryDto build() {
            return new AuditLogEntryDto(projectId, operatedAt, operator, operatorId, ip, businessType, operationType, operand, description);
        }

    }
}
