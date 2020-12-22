package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class PermissionInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String action;

    public PermissionInputDto() {
    }

    public PermissionInputDto(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
        }
        return joiner.toString();
    }

    public static PermissionInputDto.Builder builder() {
        return new PermissionInputDto.Builder();
    }

    public static class Builder {

        private String action;

        public Builder() {
        }

        public Builder setAction(String action) {
            this.action = action;
            return this;
        }


        public PermissionInputDto build() {
            return new PermissionInputDto(action);
        }

    }
}
