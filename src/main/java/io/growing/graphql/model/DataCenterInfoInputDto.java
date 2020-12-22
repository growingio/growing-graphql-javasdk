package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class DataCenterInfoInputDto implements java.io.Serializable {

    private String name;
    private String logo;

    public DataCenterInfoInputDto() {
    }

    public DataCenterInfoInputDto(String name, String logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (logo != null) {
            joiner.add("logo: " + GraphQLRequestSerializer.getEntry(logo));
        }
        return joiner.toString();
    }

    public static DataCenterInfoInputDto.Builder builder() {
        return new DataCenterInfoInputDto.Builder();
    }

    public static class Builder {

        private String name;
        private String logo;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLogo(String logo) {
            this.logo = logo;
            return this;
        }


        public DataCenterInfoInputDto build() {
            return new DataCenterInfoInputDto(name, logo);
        }

    }
}
