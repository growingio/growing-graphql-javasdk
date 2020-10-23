package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class DocPropsInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String domain;
    private String path;
    private String query;
    private String xpath;
    private String index;
    private String href;
    private String content;
    private String pg;
    private String contentType;

    public DocPropsInputDto() {
    }

    public DocPropsInputDto(String domain, String path, String query, String xpath, String index, String href, String content, String pg, String contentType) {
        this.domain = domain;
        this.path = path;
        this.query = query;
        this.xpath = xpath;
        this.index = index;
        this.href = href;
        this.content = content;
        this.pg = pg;
        this.contentType = contentType;
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public String getXpath() {
        return xpath;
    }
    public void setXpath(String xpath) {
        this.xpath = xpath;
    }

    public String getIndex() {
        return index;
    }
    public void setIndex(String index) {
        this.index = index;
    }

    public String getHref() {
        return href;
    }
    public void setHref(String href) {
        this.href = href;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getPg() {
        return pg;
    }
    public void setPg(String pg) {
        this.pg = pg;
    }

    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (domain != null) {
            joiner.add("domain: " + GraphQLRequestSerializer.getEntry(domain));
        }
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path));
        }
        if (query != null) {
            joiner.add("query: " + GraphQLRequestSerializer.getEntry(query));
        }
        if (xpath != null) {
            joiner.add("xpath: " + GraphQLRequestSerializer.getEntry(xpath));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }
        if (content != null) {
            joiner.add("content: " + GraphQLRequestSerializer.getEntry(content));
        }
        if (pg != null) {
            joiner.add("pg: " + GraphQLRequestSerializer.getEntry(pg));
        }
        if (contentType != null) {
            joiner.add("contentType: " + GraphQLRequestSerializer.getEntry(contentType));
        }
        return joiner.toString();
    }

    public static DocPropsInputDto.Builder builder() {
        return new DocPropsInputDto.Builder();
    }

    public static class Builder {

        private String domain;
        private String path;
        private String query;
        private String xpath;
        private String index;
        private String href;
        private String content;
        private String pg;
        private String contentType;

        public Builder() {
        }

        public Builder setDomain(String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setXpath(String xpath) {
            this.xpath = xpath;
            return this;
        }

        public Builder setIndex(String index) {
            this.index = index;
            return this;
        }

        public Builder setHref(String href) {
            this.href = href;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setPg(String pg) {
            this.pg = pg;
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }


        public DocPropsInputDto build() {
            return new DocPropsInputDto(domain, path, query, xpath, index, href, content, pg, contentType);
        }

    }
}
