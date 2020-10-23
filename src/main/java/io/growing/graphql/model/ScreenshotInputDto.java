package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:57+0800"
)
public class ScreenshotInputDto implements java.io.Serializable {

    private String target;
    private String viewport;

    public ScreenshotInputDto() {
    }

    public ScreenshotInputDto(String target, String viewport) {
        this.target = target;
        this.viewport = viewport;
    }

    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }

    public String getViewport() {
        return viewport;
    }
    public void setViewport(String viewport) {
        this.viewport = viewport;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (target != null) {
            joiner.add("target: " + GraphQLRequestSerializer.getEntry(target));
        }
        if (viewport != null) {
            joiner.add("viewport: " + GraphQLRequestSerializer.getEntry(viewport));
        }
        return joiner.toString();
    }

    public static ScreenshotInputDto.Builder builder() {
        return new ScreenshotInputDto.Builder();
    }

    public static class Builder {

        private String target;
        private String viewport;

        public Builder() {
        }

        public Builder setTarget(String target) {
            this.target = target;
            return this;
        }

        public Builder setViewport(String viewport) {
            this.viewport = viewport;
            return this;
        }


        public ScreenshotInputDto build() {
            return new ScreenshotInputDto(target, viewport);
        }

    }
}
