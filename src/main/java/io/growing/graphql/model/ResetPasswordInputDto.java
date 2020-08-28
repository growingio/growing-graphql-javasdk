package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class ResetPasswordInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String password;

    public ResetPasswordInputDto() {
    }

    public ResetPasswordInputDto(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (password != null) {
            joiner.add("password: " + GraphQLRequestSerializer.getEntry(password));
        }
        return joiner.toString();
    }

    public static ResetPasswordInputDto.Builder builder() {
        return new ResetPasswordInputDto.Builder();
    }

    public static class Builder {

        private String id;
        private String password;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }


        public ResetPasswordInputDto build() {
            return new ResetPasswordInputDto(id, password);
        }

    }
}
