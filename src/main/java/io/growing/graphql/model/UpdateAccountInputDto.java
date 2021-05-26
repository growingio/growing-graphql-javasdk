package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 更新帐号信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class UpdateAccountInputDto implements java.io.Serializable {

    private String name;
    private String phoneNumber;
    private String email;

    public UpdateAccountInputDto() {
    }

    public UpdateAccountInputDto(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (phoneNumber != null) {
            joiner.add("phoneNumber: " + GraphQLRequestSerializer.getEntry(phoneNumber));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        return joiner.toString();
    }

    public static UpdateAccountInputDto.Builder builder() {
        return new UpdateAccountInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String phoneNumber;
        private String email;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }


        public UpdateAccountInputDto build() {
            return new UpdateAccountInputDto(name, phoneNumber, email);
        }

    }
}
