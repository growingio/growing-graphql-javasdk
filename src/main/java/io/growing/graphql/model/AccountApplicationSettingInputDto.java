package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationSettingInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Boolean enabled;
    @javax.validation.constraints.NotNull
    private java.util.List<AccountApplicationFormFieldInputDto> formFields;

    public AccountApplicationSettingInputDto() {
    }

    public AccountApplicationSettingInputDto(Boolean enabled, java.util.List<AccountApplicationFormFieldInputDto> formFields) {
        this.enabled = enabled;
        this.formFields = formFields;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public java.util.List<AccountApplicationFormFieldInputDto> getFormFields() {
        return formFields;
    }
    public void setFormFields(java.util.List<AccountApplicationFormFieldInputDto> formFields) {
        this.formFields = formFields;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (enabled != null) {
            joiner.add("enabled: " + GraphQLRequestSerializer.getEntry(enabled));
        }
        if (formFields != null) {
            joiner.add("formFields: " + GraphQLRequestSerializer.getEntry(formFields));
        }
        return joiner.toString();
    }

    public static AccountApplicationSettingInputDto.Builder builder() {
        return new AccountApplicationSettingInputDto.Builder();
    }

    public static class Builder {

        private Boolean enabled;
        private java.util.List<AccountApplicationFormFieldInputDto> formFields;

        public Builder() {
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setFormFields(java.util.List<AccountApplicationFormFieldInputDto> formFields) {
            this.formFields = formFields;
            return this;
        }


        public AccountApplicationSettingInputDto build() {
            return new AccountApplicationSettingInputDto(enabled, formFields);
        }

    }
}
