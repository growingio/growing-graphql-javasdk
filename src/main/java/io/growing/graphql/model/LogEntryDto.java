package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class LogEntryDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String operation;
    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String operatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime timestamp;
    @javax.validation.constraints.NotNull
    private String operator;

    public LogEntryDto() {
    }

    public LogEntryDto(String operation, String message, String operatorId, java.time.ZonedDateTime timestamp, String operator) {
        this.operation = operation;
        this.message = message;
        this.operatorId = operatorId;
        this.timestamp = timestamp;
        this.operator = operator;
    }

    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getOperatorId() {
        return operatorId;
    }
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public java.time.ZonedDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (operation != null) {
            joiner.add("operation: " + GraphQLRequestSerializer.getEntry(operation));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        if (operatorId != null) {
            joiner.add("operatorId: " + GraphQLRequestSerializer.getEntry(operatorId));
        }
        if (timestamp != null) {
            joiner.add("timestamp: " + GraphQLRequestSerializer.getEntry(timestamp));
        }
        if (operator != null) {
            joiner.add("operator: " + GraphQLRequestSerializer.getEntry(operator));
        }
        return joiner.toString();
    }

    public static LogEntryDto.Builder builder() {
        return new LogEntryDto.Builder();
    }

    public static class Builder {

        private String operation;
        private String message;
        private String operatorId;
        private java.time.ZonedDateTime timestamp;
        private String operator;

        public Builder() {
        }

        public Builder setOperation(String operation) {
            this.operation = operation;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public Builder setTimestamp(java.time.ZonedDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = operator;
            return this;
        }


        public LogEntryDto build() {
            return new LogEntryDto(operation, message, operatorId, timestamp, operator);
        }

    }
}
