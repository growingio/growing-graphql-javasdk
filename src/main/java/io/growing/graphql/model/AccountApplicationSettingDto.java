package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationSettingDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Boolean enabled;
    @javax.validation.constraints.NotNull
    private java.util.List<AccountApplicationFormFieldDto> accountApplicationFormFields;

    public AccountApplicationSettingDto() {
    }

    public AccountApplicationSettingDto(Boolean enabled, java.util.List<AccountApplicationFormFieldDto> accountApplicationFormFields) {
        this.enabled = enabled;
        this.accountApplicationFormFields = accountApplicationFormFields;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public java.util.List<AccountApplicationFormFieldDto> getAccountApplicationFormFields() {
        return accountApplicationFormFields;
    }
    public void setAccountApplicationFormFields(java.util.List<AccountApplicationFormFieldDto> accountApplicationFormFields) {
        this.accountApplicationFormFields = accountApplicationFormFields;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (enabled != null) {
            joiner.add("enabled: " + GraphQLRequestSerializer.getEntry(enabled));
        }
        if (accountApplicationFormFields != null) {
            joiner.add("accountApplicationFormFields: " + GraphQLRequestSerializer.getEntry(accountApplicationFormFields));
        }
        return joiner.toString();
    }

    public static AccountApplicationSettingDto.Builder builder() {
        return new AccountApplicationSettingDto.Builder();
    }

    public static class Builder {

        private Boolean enabled;
        private java.util.List<AccountApplicationFormFieldDto> accountApplicationFormFields;

        public Builder() {
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setAccountApplicationFormFields(java.util.List<AccountApplicationFormFieldDto> accountApplicationFormFields) {
            this.accountApplicationFormFields = accountApplicationFormFields;
            return this;
        }


        public AccountApplicationSettingDto build() {
            return new AccountApplicationSettingDto(enabled, accountApplicationFormFields);
        }

    }
}
