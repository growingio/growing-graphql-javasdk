package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserSummary
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
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
        if (projectionDepthOnFields.getOrDefault("UserSummaryResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserSummaryResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("UserSummaryResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserSummaryResponseProjection.PropertyResponseProjection.properties", 0)));
        }
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

    public UserSummaryResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public UserSummaryResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
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
