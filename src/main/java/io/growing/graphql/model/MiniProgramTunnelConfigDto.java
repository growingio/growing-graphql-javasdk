package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class MiniProgramTunnelConfigDto implements java.io.Serializable, TunnelConfigDto {

    @javax.validation.constraints.NotNull
    private MiniProgramTypeDto programType;
    @javax.validation.constraints.NotNull
    private String urlScheme;

    public MiniProgramTunnelConfigDto() {
    }

    public MiniProgramTunnelConfigDto(MiniProgramTypeDto programType, String urlScheme) {
        this.programType = programType;
        this.urlScheme = urlScheme;
    }

    /**
     * 如果命名 type 会与 FilesTunnelConfig 中的 type 冲突，在 mutation create 时候，grapqhl validate 会报错: Validation error of type FieldsConflict
     * 所以命名加了前缀 programType
     */
    public MiniProgramTypeDto getProgramType() {
        return programType;
    }
    /**
     * 如果命名 type 会与 FilesTunnelConfig 中的 type 冲突，在 mutation create 时候，grapqhl validate 会报错: Validation error of type FieldsConflict
     * 所以命名加了前缀 programType
     */
    public void setProgramType(MiniProgramTypeDto programType) {
        this.programType = programType;
    }

    public String getUrlScheme() {
        return urlScheme;
    }
    public void setUrlScheme(String urlScheme) {
        this.urlScheme = urlScheme;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (programType != null) {
            joiner.add("programType: " + GraphQLRequestSerializer.getEntry(programType));
        }
        if (urlScheme != null) {
            joiner.add("urlScheme: " + GraphQLRequestSerializer.getEntry(urlScheme));
        }
        return joiner.toString();
    }

    public static MiniProgramTunnelConfigDto.Builder builder() {
        return new MiniProgramTunnelConfigDto.Builder();
    }

    public static class Builder {

        private MiniProgramTypeDto programType;
        private String urlScheme;

        public Builder() {
        }

        /**
         * 如果命名 type 会与 FilesTunnelConfig 中的 type 冲突，在 mutation create 时候，grapqhl validate 会报错: Validation error of type FieldsConflict
         * 所以命名加了前缀 programType
         */
        public Builder setProgramType(MiniProgramTypeDto programType) {
            this.programType = programType;
            return this;
        }

        public Builder setUrlScheme(String urlScheme) {
            this.urlScheme = urlScheme;
            return this;
        }


        public MiniProgramTunnelConfigDto build() {
            return new MiniProgramTunnelConfigDto(programType, urlScheme);
        }

    }
}
