package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class EventImportArgumentDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String timeRange;
    @javax.validation.constraints.NotNull
    private String directory;

    public EventImportArgumentDto() {
    }

    public EventImportArgumentDto(String timeRange, String directory) {
        this.timeRange = timeRange;
        this.directory = directory;
    }

    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getDirectory() {
        return directory;
    }
    public void setDirectory(String directory) {
        this.directory = directory;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (timeRange != null) {
            joiner.add("timeRange: " + GraphQLRequestSerializer.getEntry(timeRange));
        }
        if (directory != null) {
            joiner.add("directory: " + GraphQLRequestSerializer.getEntry(directory));
        }
        return joiner.toString();
    }

    public static EventImportArgumentDto.Builder builder() {
        return new EventImportArgumentDto.Builder();
    }

    public static class Builder {

        private String timeRange;
        private String directory;

        public Builder() {
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setDirectory(String directory) {
            this.directory = directory;
            return this;
        }


        public EventImportArgumentDto build() {
            return new EventImportArgumentDto(timeRange, directory);
        }

    }
}
