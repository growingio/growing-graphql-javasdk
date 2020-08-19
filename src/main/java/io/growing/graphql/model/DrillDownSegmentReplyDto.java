package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class DrillDownSegmentReplyDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;

    public DrillDownSegmentReplyDto() {
    }

    public DrillDownSegmentReplyDto(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

    public static DrillDownSegmentReplyDto.Builder builder() {
        return new DrillDownSegmentReplyDto.Builder();
    }

    public static class Builder {

        private String id;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public DrillDownSegmentReplyDto build() {
            return new DrillDownSegmentReplyDto(id);
        }

    }
}
