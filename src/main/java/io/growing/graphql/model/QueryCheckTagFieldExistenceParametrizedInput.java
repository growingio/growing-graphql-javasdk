package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field checkTagFieldExistence in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryCheckTagFieldExistenceParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String fieldValue;
    @javax.validation.constraints.NotNull
    private TagFieldTypeDto fieldType;

    public QueryCheckTagFieldExistenceParametrizedInput() {
    }

    public QueryCheckTagFieldExistenceParametrizedInput(String fieldValue, TagFieldTypeDto fieldType) {
        this.fieldValue = fieldValue;
        this.fieldType = fieldType;
    }

    public QueryCheckTagFieldExistenceParametrizedInput fieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }

    public QueryCheckTagFieldExistenceParametrizedInput fieldType(TagFieldTypeDto fieldType) {
        this.fieldType = fieldType;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (fieldValue != null) {
            joiner.add("fieldValue: " + GraphQLRequestSerializer.getEntry(fieldValue));
        }
        if (fieldType != null) {
            joiner.add("fieldType: " + GraphQLRequestSerializer.getEntry(fieldType));
        }
        return joiner.toString();
    }

}
