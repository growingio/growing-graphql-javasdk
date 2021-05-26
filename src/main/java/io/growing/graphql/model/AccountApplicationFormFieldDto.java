package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationFormFieldDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private Boolean enabled;
    @javax.validation.constraints.NotNull
    private Boolean optional;

    public AccountApplicationFormFieldDto() {
    }

    public AccountApplicationFormFieldDto(String name, String key, Boolean enabled, Boolean optional) {
        this.name = name;
        this.key = key;
        this.enabled = enabled;
        this.optional = optional;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getOptional() {
        return optional;
    }
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (enabled != null) {
            joiner.add("enabled: " + GraphQLRequestSerializer.getEntry(enabled));
        }
        if (optional != null) {
            joiner.add("optional: " + GraphQLRequestSerializer.getEntry(optional));
        }
        return joiner.toString();
    }

    public static AccountApplicationFormFieldDto.Builder builder() {
        return new AccountApplicationFormFieldDto.Builder();
    }

    public static class Builder {

        private String name;
        private String key;
        private Boolean enabled;
        private Boolean optional;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setOptional(Boolean optional) {
            this.optional = optional;
            return this;
        }


        public AccountApplicationFormFieldDto build() {
            return new AccountApplicationFormFieldDto(name, key, enabled, optional);
        }

    }
}
