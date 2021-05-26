package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * 资源情况
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitQuotasInfoDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.lang.Long totalQuotas;
    @javax.validation.constraints.NotNull
    private java.lang.Long remainingQuotas;

    public TencentPortraitQuotasInfoDto() {
    }

    public TencentPortraitQuotasInfoDto(java.lang.Long totalQuotas, java.lang.Long remainingQuotas) {
        this.totalQuotas = totalQuotas;
        this.remainingQuotas = remainingQuotas;
    }

    /**
     * 资源总大小
     */
    public java.lang.Long getTotalQuotas() {
        return totalQuotas;
    }
    /**
     * 资源总大小
     */
    public void setTotalQuotas(java.lang.Long totalQuotas) {
        this.totalQuotas = totalQuotas;
    }

    /**
     * 剩余资源大小
     */
    public java.lang.Long getRemainingQuotas() {
        return remainingQuotas;
    }
    /**
     * 剩余资源大小
     */
    public void setRemainingQuotas(java.lang.Long remainingQuotas) {
        this.remainingQuotas = remainingQuotas;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (totalQuotas != null) {
            joiner.add("totalQuotas: " + GraphQLRequestSerializer.getEntry(totalQuotas));
        }
        if (remainingQuotas != null) {
            joiner.add("remainingQuotas: " + GraphQLRequestSerializer.getEntry(remainingQuotas));
        }
        return joiner.toString();
    }

    public static TencentPortraitQuotasInfoDto.Builder builder() {
        return new TencentPortraitQuotasInfoDto.Builder();
    }

    public static class Builder {

        private java.lang.Long totalQuotas;
        private java.lang.Long remainingQuotas;

        public Builder() {
        }

        /**
         * 资源总大小
         */
        public Builder setTotalQuotas(java.lang.Long totalQuotas) {
            this.totalQuotas = totalQuotas;
            return this;
        }

        /**
         * 剩余资源大小
         */
        public Builder setRemainingQuotas(java.lang.Long remainingQuotas) {
            this.remainingQuotas = remainingQuotas;
            return this;
        }


        public TencentPortraitQuotasInfoDto build() {
            return new TencentPortraitQuotasInfoDto(totalQuotas, remainingQuotas);
        }

    }
}
