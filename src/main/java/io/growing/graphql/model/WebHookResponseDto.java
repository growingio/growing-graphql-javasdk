package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class WebHookResponseDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Integer code;
    @javax.validation.constraints.NotNull
    private String message;

    public WebHookResponseDto() {
    }

    public WebHookResponseDto(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
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

    public static WebHookResponseDto.Builder builder() {
        return new WebHookResponseDto.Builder();
    }

    public static class Builder {

        private Integer code;
        private String message;

        public Builder() {
        }

        public Builder setCode(Integer code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }


        public WebHookResponseDto build() {
            return new WebHookResponseDto(code, message);
        }

    }
}
