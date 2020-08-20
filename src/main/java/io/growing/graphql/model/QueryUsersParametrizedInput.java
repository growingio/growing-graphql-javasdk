package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field users in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class QueryUsersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private UserQueryTypeDto type;
    @javax.validation.constraints.NotNull
    private String id;
    private Integer offset;
    private Integer limit;

    public QueryUsersParametrizedInput() {
    }

    public QueryUsersParametrizedInput(UserQueryTypeDto type, String id, Integer offset, Integer limit) {
        this.type = type;
        this.id = id;
        this.offset = offset;
        this.limit = limit;
    }

    public QueryUsersParametrizedInput type(UserQueryTypeDto type) {
        this.type = type;
        return this;
    }

    public QueryUsersParametrizedInput id(String id) {
        this.id = id;
        return this;
    }

    public QueryUsersParametrizedInput offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public QueryUsersParametrizedInput limit(Integer limit) {
        this.limit = limit;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (offset != null) {
            joiner.add("offset: " + GraphQLRequestSerializer.getEntry(offset));
        }
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        return joiner.toString();
    }

}
