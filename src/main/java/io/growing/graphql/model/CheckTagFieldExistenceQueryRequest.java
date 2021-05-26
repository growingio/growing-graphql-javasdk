package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @param fieldValue：字段值  fieldType：字段类型（枚举值）
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class CheckTagFieldExistenceQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "checkTagFieldExistence";

    private Map<String, Object> input = new LinkedHashMap<>();

    public CheckTagFieldExistenceQueryRequest() {
    }

    public void setFieldValue(String fieldValue) {
        this.input.put("fieldValue", fieldValue);
    }

    public void setFieldType(TagFieldTypeDto fieldType) {
        this.input.put("fieldType", fieldType);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String fieldValue;
        private TagFieldTypeDto fieldType;

        public Builder() {
        }

        public Builder setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }

        public Builder setFieldType(TagFieldTypeDto fieldType) {
            this.fieldType = fieldType;
            return this;
        }


        public CheckTagFieldExistenceQueryRequest build() {
            CheckTagFieldExistenceQueryRequest obj = new CheckTagFieldExistenceQueryRequest();
            obj.setFieldValue(fieldValue);
            obj.setFieldType(fieldType);
            return obj;
        }

    }
}
