package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationProfileDto implements java.io.Serializable {

    private String email;
    private String phone;
    private String department;
    private String explain;

    public AccountApplicationProfileDto() {
    }

    public AccountApplicationProfileDto(String email, String phone, String department, String explain) {
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.explain = explain;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExplain() {
        return explain;
    }
    public void setExplain(String explain) {
        this.explain = explain;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (phone != null) {
            joiner.add("phone: " + GraphQLRequestSerializer.getEntry(phone));
        }
        if (department != null) {
            joiner.add("department: " + GraphQLRequestSerializer.getEntry(department));
        }
        if (explain != null) {
            joiner.add("explain: " + GraphQLRequestSerializer.getEntry(explain));
        }
        return joiner.toString();
    }

    public static AccountApplicationProfileDto.Builder builder() {
        return new AccountApplicationProfileDto.Builder();
    }

    public static class Builder {

        private String email;
        private String phone;
        private String department;
        private String explain;

        public Builder() {
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setExplain(String explain) {
            this.explain = explain;
            return this;
        }


        public AccountApplicationProfileDto build() {
            return new AccountApplicationProfileDto(email, phone, department, explain);
        }

    }
}
