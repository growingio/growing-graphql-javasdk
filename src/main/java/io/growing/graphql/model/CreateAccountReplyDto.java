package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class CreateAccountReplyDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private MemberDto account;
    @javax.validation.constraints.NotNull
    private String passwordResetUri;

    public CreateAccountReplyDto() {
    }

    public CreateAccountReplyDto(MemberDto account, String passwordResetUri) {
        this.account = account;
        this.passwordResetUri = passwordResetUri;
    }

    public MemberDto getAccount() {
        return account;
    }
    public void setAccount(MemberDto account) {
        this.account = account;
    }

    public String getPasswordResetUri() {
        return passwordResetUri;
    }
    public void setPasswordResetUri(String passwordResetUri) {
        this.passwordResetUri = passwordResetUri;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (account != null) {
            joiner.add("account: " + GraphQLRequestSerializer.getEntry(account));
        }
        if (passwordResetUri != null) {
            joiner.add("passwordResetUri: " + GraphQLRequestSerializer.getEntry(passwordResetUri));
        }
        return joiner.toString();
    }

    public static CreateAccountReplyDto.Builder builder() {
        return new CreateAccountReplyDto.Builder();
    }

    public static class Builder {

        private MemberDto account;
        private String passwordResetUri;

        public Builder() {
        }

        public Builder setAccount(MemberDto account) {
            this.account = account;
            return this;
        }

        public Builder setPasswordResetUri(String passwordResetUri) {
            this.passwordResetUri = passwordResetUri;
            return this;
        }


        public CreateAccountReplyDto build() {
            return new CreateAccountReplyDto(account, passwordResetUri);
        }

    }
}
