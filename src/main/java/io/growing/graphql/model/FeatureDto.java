package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class FeatureDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String label;
    private String entry;
    private String description;

    public FeatureDto() {
    }

    public FeatureDto(String id, String label, String entry, String description) {
        this.id = id;
        this.label = label;
        this.entry = entry;
        this.description = description;
    }

    /**
     * 目前 id 的值为 [segment, tag, funnle-analysis, retention-analysis, chart-analysis, kpi-analysis]
     */
    public String getId() {
        return id;
    }
    /**
     * 目前 id 的值为 [segment, tag, funnle-analysis, retention-analysis, chart-analysis, kpi-analysis]
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getEntry() {
        return entry;
    }
    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (label != null) {
            joiner.add("label: " + GraphQLRequestSerializer.getEntry(label));
        }
        if (entry != null) {
            joiner.add("entry: " + GraphQLRequestSerializer.getEntry(entry));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        return joiner.toString();
    }

    public static FeatureDto.Builder builder() {
        return new FeatureDto.Builder();
    }

    public static class Builder {

        private String id;
        private String label;
        private String entry;
        private String description;

        public Builder() {
        }

        /**
         * 目前 id 的值为 [segment, tag, funnle-analysis, retention-analysis, chart-analysis, kpi-analysis]
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        public Builder setEntry(String entry) {
            this.entry = entry;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public FeatureDto build() {
            return new FeatureDto(id, label, entry, description);
        }

    }
}
