package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field tencentPortraitTagInfo in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryTencentPortraitTagInfoParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String groupId;
    @javax.validation.constraints.NotNull
    private String level;

    public QueryTencentPortraitTagInfoParametrizedInput() {
    }

    public QueryTencentPortraitTagInfoParametrizedInput(String groupId, String level) {
        this.groupId = groupId;
        this.level = level;
    }

    public QueryTencentPortraitTagInfoParametrizedInput groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public QueryTencentPortraitTagInfoParametrizedInput level(String level) {
        this.level = level;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (groupId != null) {
            joiner.add("groupId: " + GraphQLRequestSerializer.getEntry(groupId));
        }
        if (level != null) {
            joiner.add("level: " + GraphQLRequestSerializer.getEntry(level));
        }
        return joiner.toString();
    }

}
