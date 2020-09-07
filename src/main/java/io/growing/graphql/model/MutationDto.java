package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MutationDto implements java.io.Serializable {


    public MutationDto() {
    }



    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        return joiner.toString();
    }

    public static MutationDto.Builder builder() {
        return new MutationDto.Builder();
    }

    public static class Builder {


        public Builder() {
        }


        public MutationDto build() {
            return new MutationDto();
        }

    }
}
