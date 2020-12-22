package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class PreparedSegmentDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private DetectorDto detector;

    public PreparedSegmentDto() {
    }

    public PreparedSegmentDto(String id, String name, DetectorDto detector) {
        this.id = id;
        this.name = name;
        this.detector = detector;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public DetectorDto getDetector() {
        return detector;
    }
    public void setDetector(DetectorDto detector) {
        this.detector = detector;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (detector != null) {
            joiner.add("detector: " + GraphQLRequestSerializer.getEntry(detector));
        }
        return joiner.toString();
    }

    public static PreparedSegmentDto.Builder builder() {
        return new PreparedSegmentDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private DetectorDto detector;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDetector(DetectorDto detector) {
            this.detector = detector;
            return this;
        }


        public PreparedSegmentDto build() {
            return new PreparedSegmentDto(id, name, detector);
        }

    }
}
