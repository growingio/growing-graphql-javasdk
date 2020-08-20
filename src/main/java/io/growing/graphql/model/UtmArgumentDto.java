package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class UtmArgumentDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String utmKey;
    @javax.validation.constraints.NotNull
    private String userKey;

    public UtmArgumentDto() {
    }

    public UtmArgumentDto(String id, String utmKey, String userKey) {
        this.id = id;
        this.utmKey = utmKey;
        this.userKey = userKey;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (utmKey != null) {
            joiner.add("utmKey: " + GraphQLRequestSerializer.getEntry(utmKey));
        }
        if (userKey != null) {
            joiner.add("userKey: " + GraphQLRequestSerializer.getEntry(userKey));
        }
        return joiner.toString();
    }

    public static UtmArgumentDto.Builder builder() {
        return new UtmArgumentDto.Builder();
    }

    public static class Builder {

        private String id;
        private String utmKey;
        private String userKey;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setUtmKey(String utmKey) {
            this.utmKey = utmKey;
            return this;
        }

        public Builder setUserKey(String userKey) {
            this.userKey = userKey;
            return this;
        }


        public UtmArgumentDto build() {
            return new UtmArgumentDto(id, utmKey, userKey);
        }

    }
}
