package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field searchMembers in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QuerySearchMembersParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String scopeId;
    @javax.validation.constraints.NotNull
    private MemberScopeTypeInputDto scopeType;
    private String nameOrIdentity;
    @javax.validation.constraints.NotNull
    private Integer offset;
    @javax.validation.constraints.NotNull
    private Integer limit;

    public QuerySearchMembersParametrizedInput() {
    }

    public QuerySearchMembersParametrizedInput(String scopeId, MemberScopeTypeInputDto scopeType, String nameOrIdentity, Integer offset, Integer limit) {
        this.scopeId = scopeId;
        this.scopeType = scopeType;
        this.nameOrIdentity = nameOrIdentity;
        this.offset = offset;
        this.limit = limit;
    }

    public QuerySearchMembersParametrizedInput scopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    public QuerySearchMembersParametrizedInput scopeType(MemberScopeTypeInputDto scopeType) {
        this.scopeType = scopeType;
        return this;
    }

    public QuerySearchMembersParametrizedInput nameOrIdentity(String nameOrIdentity) {
        this.nameOrIdentity = nameOrIdentity;
        return this;
    }

    public QuerySearchMembersParametrizedInput offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public QuerySearchMembersParametrizedInput limit(Integer limit) {
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
        if (nameOrIdentity != null) {
            joiner.add("nameOrIdentity: " + GraphQLRequestSerializer.getEntry(nameOrIdentity));
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
