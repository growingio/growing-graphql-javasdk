package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TGIStatisticDataDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String infoType;
    @javax.validation.constraints.NotNull
    private java.lang.Long totalNum;
    @javax.validation.constraints.NotNull
    private java.lang.Long validNum;
    @javax.validation.constraints.NotNull
    private Double ratio;
    @javax.validation.constraints.NotNull
    private java.lang.Long distinctNum;

    public TGIStatisticDataDto() {
    }

    public TGIStatisticDataDto(String infoType, java.lang.Long totalNum, java.lang.Long validNum, Double ratio, java.lang.Long distinctNum) {
        this.infoType = infoType;
        this.totalNum = totalNum;
        this.validNum = validNum;
        this.ratio = ratio;
        this.distinctNum = distinctNum;
    }

    /**
     * 信息类型
     */
    public String getInfoType() {
        return infoType;
    }
    /**
     * 信息类型
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    /**
     * 分群人数
     */
    public java.lang.Long getTotalNum() {
        return totalNum;
    }
    /**
     * 分群人数
     */
    public void setTotalNum(java.lang.Long totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * 有效人数
     */
    public java.lang.Long getValidNum() {
        return validNum;
    }
    /**
     * 有效人数
     */
    public void setValidNum(java.lang.Long validNum) {
        this.validNum = validNum;
    }

    /**
     * 覆盖率，四位小数
     */
    public Double getRatio() {
        return ratio;
    }
    /**
     * 覆盖率，四位小数
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    /**
     * 去重属性数
     */
    public java.lang.Long getDistinctNum() {
        return distinctNum;
    }
    /**
     * 去重属性数
     */
    public void setDistinctNum(java.lang.Long distinctNum) {
        this.distinctNum = distinctNum;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (infoType != null) {
            joiner.add("infoType: " + GraphQLRequestSerializer.getEntry(infoType));
        }
        if (totalNum != null) {
            joiner.add("totalNum: " + GraphQLRequestSerializer.getEntry(totalNum));
        }
        if (validNum != null) {
            joiner.add("validNum: " + GraphQLRequestSerializer.getEntry(validNum));
        }
        if (ratio != null) {
            joiner.add("ratio: " + GraphQLRequestSerializer.getEntry(ratio));
        }
        if (distinctNum != null) {
            joiner.add("distinctNum: " + GraphQLRequestSerializer.getEntry(distinctNum));
        }
        return joiner.toString();
    }

    public static TGIStatisticDataDto.Builder builder() {
        return new TGIStatisticDataDto.Builder();
    }

    public static class Builder {

        private String infoType;
        private java.lang.Long totalNum;
        private java.lang.Long validNum;
        private Double ratio;
        private java.lang.Long distinctNum;

        public Builder() {
        }

        /**
         * 信息类型
         */
        public Builder setInfoType(String infoType) {
            this.infoType = infoType;
            return this;
        }

        /**
         * 分群人数
         */
        public Builder setTotalNum(java.lang.Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * 有效人数
         */
        public Builder setValidNum(java.lang.Long validNum) {
            this.validNum = validNum;
            return this;
        }

        /**
         * 覆盖率，四位小数
         */
        public Builder setRatio(Double ratio) {
            this.ratio = ratio;
            return this;
        }

        /**
         * 去重属性数
         */
        public Builder setDistinctNum(java.lang.Long distinctNum) {
            this.distinctNum = distinctNum;
            return this;
        }


        public TGIStatisticDataDto build() {
            return new TGIStatisticDataDto(infoType, totalNum, validNum, ratio, distinctNum);
        }

    }
}
