package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private AccountApplicationSettingDto toggleAccountApplicationSetting;
    @javax.validation.constraints.NotNull
    private PasswordRecoverySettingDto togglePasswordRecoverySetting;
    private Boolean updateClickhouseView;

    public MutationDto() {
    }

    public MutationDto(AccountApplicationSettingDto toggleAccountApplicationSetting, PasswordRecoverySettingDto togglePasswordRecoverySetting, Boolean updateClickhouseView) {
        this.toggleAccountApplicationSetting = toggleAccountApplicationSetting;
        this.togglePasswordRecoverySetting = togglePasswordRecoverySetting;
        this.updateClickhouseView = updateClickhouseView;
    }

    public AccountApplicationSettingDto getToggleAccountApplicationSetting() {
        return toggleAccountApplicationSetting;
    }
    public void setToggleAccountApplicationSetting(AccountApplicationSettingDto toggleAccountApplicationSetting) {
        this.toggleAccountApplicationSetting = toggleAccountApplicationSetting;
    }

    public PasswordRecoverySettingDto getTogglePasswordRecoverySetting() {
        return togglePasswordRecoverySetting;
    }
    public void setTogglePasswordRecoverySetting(PasswordRecoverySettingDto togglePasswordRecoverySetting) {
        this.togglePasswordRecoverySetting = togglePasswordRecoverySetting;
    }

    /**
     * 更新 event_view 和 user_view
     */
    public Boolean getUpdateClickhouseView() {
        return updateClickhouseView;
    }
    /**
     * 更新 event_view 和 user_view
     */
    public void setUpdateClickhouseView(Boolean updateClickhouseView) {
        this.updateClickhouseView = updateClickhouseView;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (toggleAccountApplicationSetting != null) {
            joiner.add("toggleAccountApplicationSetting: " + GraphQLRequestSerializer.getEntry(toggleAccountApplicationSetting));
        }
        if (togglePasswordRecoverySetting != null) {
            joiner.add("togglePasswordRecoverySetting: " + GraphQLRequestSerializer.getEntry(togglePasswordRecoverySetting));
        }
        if (updateClickhouseView != null) {
            joiner.add("updateClickhouseView: " + GraphQLRequestSerializer.getEntry(updateClickhouseView));
        }
        return joiner.toString();
    }

    public static MutationDto.Builder builder() {
        return new MutationDto.Builder();
    }

    public static class Builder {

        private AccountApplicationSettingDto toggleAccountApplicationSetting;
        private PasswordRecoverySettingDto togglePasswordRecoverySetting;
        private Boolean updateClickhouseView;

        public Builder() {
        }

        public Builder setToggleAccountApplicationSetting(AccountApplicationSettingDto toggleAccountApplicationSetting) {
            this.toggleAccountApplicationSetting = toggleAccountApplicationSetting;
            return this;
        }

        public Builder setTogglePasswordRecoverySetting(PasswordRecoverySettingDto togglePasswordRecoverySetting) {
            this.togglePasswordRecoverySetting = togglePasswordRecoverySetting;
            return this;
        }

        /**
         * 更新 event_view 和 user_view
         */
        public Builder setUpdateClickhouseView(Boolean updateClickhouseView) {
            this.updateClickhouseView = updateClickhouseView;
            return this;
        }


        public MutationDto build() {
            return new MutationDto(toggleAccountApplicationSetting, togglePasswordRecoverySetting, updateClickhouseView);
        }

    }
}
