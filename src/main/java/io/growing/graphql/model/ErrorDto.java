package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class ErrorDto implements java.io.Serializable {

    private String code;
    private String message;

    public ErrorDto() {
    }

    public ErrorDto(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (code != null) {
            joiner.add("code: " + GraphQLRequestSerializer.getEntry(code));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        return joiner.toString();
    }

    public static ErrorDto.Builder builder() {
        return new ErrorDto.Builder();
    }

    public static class Builder {

        private String code;
        private String message;

        public Builder() {
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }


        public ErrorDto build() {
            return new ErrorDto(code, message);
        }

    }
}
