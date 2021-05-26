package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field members in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryMembersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String scopeId;
    @javax.validation.constraints.NotNull
    private MemberScopeTypeInputDto scopeType;
    @javax.validation.constraints.NotNull
    private Integer offset;
    @javax.validation.constraints.NotNull
    private Integer limit;

    public QueryMembersParametrizedInput() {
    }

    public QueryMembersParametrizedInput(String scopeId, MemberScopeTypeInputDto scopeType, Integer offset, Integer limit) {
        this.scopeId = scopeId;
        this.scopeType = scopeType;
        this.offset = offset;
        this.limit = limit;
    }

    public QueryMembersParametrizedInput scopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    public QueryMembersParametrizedInput scopeType(MemberScopeTypeInputDto scopeType) {
        this.scopeType = scopeType;
        return this;
    }

    public QueryMembersParametrizedInput offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public QueryMembersParametrizedInput limit(Integer limit) {
        this.limit = limit;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (scopeId != null) {
            joiner.add("scopeId: " + GraphQLRequestSerializer.getEntry(scopeId));
        }
        if (scopeType != null) {
            joiner.add("scopeType: " + GraphQLRequestSerializer.getEntry(scopeType));
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
