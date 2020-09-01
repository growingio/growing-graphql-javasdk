package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class UpdateMemberMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "updateMember";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UpdateMemberMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setInput(MemberInputDto input) {
        this.input.put("input", input);
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

        private String id;
        private MemberInputDto input;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setInput(MemberInputDto input) {
            this.input = input;
            return this;
        }


        public UpdateMemberMutationRequest build() {
            UpdateMemberMutationRequest obj = new UpdateMemberMutationRequest();
            obj.setId(id);
            obj.setInput(input);
            return obj;
        }

    }
}
