package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationStatusReplyDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String status;

    public AccountApplicationStatusReplyDto() {
    }

    public AccountApplicationStatusReplyDto(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        return joiner.toString();
    }

    public static AccountApplicationStatusReplyDto.Builder builder() {
        return new AccountApplicationStatusReplyDto.Builder();
    }

    public static class Builder {

        private String status;

        public Builder() {
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }


        public AccountApplicationStatusReplyDto build() {
            return new AccountApplicationStatusReplyDto(status);
        }

    }
}
