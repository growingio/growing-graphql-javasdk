package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class UtmArgumentInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String utmKey;
    @javax.validation.constraints.NotNull
    private String userKey;

    public UtmArgumentInputDto() {
    }

    public UtmArgumentInputDto(String utmKey, String userKey) {
        this.utmKey = utmKey;
        this.userKey = userKey;
    }

    public String getUtmKey() {
        return utmKey;
    }
    public void setUtmKey(String utmKey) {
        this.utmKey = utmKey;
    }

    public String getUserKey() {
        return userKey;
    }
    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (utmKey != null) {
            joiner.add("utmKey: " + GraphQLRequestSerializer.getEntry(utmKey));
        }
        if (userKey != null) {
            joiner.add("userKey: " + GraphQLRequestSerializer.getEntry(userKey));
        }
        return joiner.toString();
    }

    public static UtmArgumentInputDto.Builder builder() {
        return new UtmArgumentInputDto.Builder();
    }

    public static class Builder {

        private String utmKey;
        private String userKey;

        public Builder() {
        }

        public Builder setUtmKey(String utmKey) {
            this.utmKey = utmKey;
            return this;
        }

        public Builder setUserKey(String userKey) {
            this.userKey = userKey;
            return this;
        }


        public UtmArgumentInputDto build() {
            return new UtmArgumentInputDto(utmKey, userKey);
        }

    }
}
