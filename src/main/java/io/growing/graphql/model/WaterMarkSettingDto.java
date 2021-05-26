package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class WaterMarkSettingDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Boolean enabled;

    public WaterMarkSettingDto() {
    }

    public WaterMarkSettingDto(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (enabled != null) {
            joiner.add("enabled: " + GraphQLRequestSerializer.getEntry(enabled));
        }
        return joiner.toString();
    }

    public static WaterMarkSettingDto.Builder builder() {
        return new WaterMarkSettingDto.Builder();
    }

    public static class Builder {

        private Boolean enabled;

        public Builder() {
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public WaterMarkSettingDto build() {
            return new WaterMarkSettingDto(enabled);
        }

    }
}
