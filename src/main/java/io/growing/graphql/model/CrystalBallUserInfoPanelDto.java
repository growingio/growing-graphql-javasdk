package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class CrystalBallUserInfoPanelDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private java.util.List<CrystalBallPropertyCategoryDto> categories;

    public CrystalBallUserInfoPanelDto() {
    }

    public CrystalBallUserInfoPanelDto(String name, java.util.List<CrystalBallPropertyCategoryDto> categories) {
        this.name = name;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<CrystalBallPropertyCategoryDto> getCategories() {
        return categories;
    }
    public void setCategories(java.util.List<CrystalBallPropertyCategoryDto> categories) {
        this.categories = categories;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (categories != null) {
            joiner.add("categories: " + GraphQLRequestSerializer.getEntry(categories));
        }
        return joiner.toString();
    }

    public static CrystalBallUserInfoPanelDto.Builder builder() {
        return new CrystalBallUserInfoPanelDto.Builder();
    }

    public static class Builder {

        private String name;
        private java.util.List<CrystalBallPropertyCategoryDto> categories;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCategories(java.util.List<CrystalBallPropertyCategoryDto> categories) {
            this.categories = categories;
            return this;
        }


        public CrystalBallUserInfoPanelDto build() {
            return new CrystalBallUserInfoPanelDto(name, categories);
        }

    }
}
