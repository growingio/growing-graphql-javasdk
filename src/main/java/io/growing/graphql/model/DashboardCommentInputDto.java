package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:36+0800"
)
public class DashboardCommentInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String title;
    private String detail;

    public DashboardCommentInputDto() {
    }

    public DashboardCommentInputDto(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (detail != null) {
            joiner.add("detail: " + GraphQLRequestSerializer.getEntry(detail));
        }
        return joiner.toString();
    }

    public static DashboardCommentInputDto.Builder builder() {
        return new DashboardCommentInputDto.Builder();
    }

    public static class Builder {

        private String title;
        private String detail;

        public Builder() {
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDetail(String detail) {
            this.detail = detail;
            return this;
        }


        public DashboardCommentInputDto build() {
            return new DashboardCommentInputDto(title, detail);
        }

    }
}
