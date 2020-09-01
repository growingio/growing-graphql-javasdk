package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserSummary
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:35+0800"
)
public class UserSummaryResponseProjection extends GraphQLResponseProjection {

    public UserSummaryResponseProjection() {
    }

    @Override
    public UserSummaryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserSummaryResponseProjection all$(int maxDepth) {
        this.id();
        this.userId();
        this.monthlyVisits();
        this.visitedAt();
        this.visitedLocation();
        this.typename();
        return this;
    }

    public UserSummaryResponseProjection id() {
        return id(null);
    }

    public UserSummaryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserSummaryResponseProjection userId() {
        return userId(null);
    }

    public UserSummaryResponseProjection userId(String alias) {
        fields.add(new GraphQLResponseField("userId").alias(alias));
        return this;
    }

    public UserSummaryResponseProjection monthlyVisits() {
        return monthlyVisits(null);
    }

    public UserSummaryResponseProjection monthlyVisits(String alias) {
        fields.add(new GraphQLResponseField("monthlyVisits").alias(alias));
        return this;
    }

    public UserSummaryResponseProjection visitedAt() {
        return visitedAt(null);
    }

    public UserSummaryResponseProjection visitedAt(String alias) {
        fields.add(new GraphQLResponseField("visitedAt").alias(alias));
        return this;
    }

    public UserSummaryResponseProjection visitedLocation() {
        return visitedLocation(null);
    }

    public UserSummaryResponseProjection visitedLocation(String alias) {
        fields.add(new GraphQLResponseField("visitedLocation").alias(alias));
        return this;
    }

    public UserSummaryResponseProjection typename() {
        return typename(null);
    }

    public UserSummaryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
