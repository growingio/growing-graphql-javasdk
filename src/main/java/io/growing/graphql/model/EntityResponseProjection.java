package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Entity
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class EntityResponseProjection extends GraphQLResponseProjection {

    public EntityResponseProjection() {
    }

    @Override
    public EntityResponseProjection all$() {
        return all$(3);
    }

    @Override
    public EntityResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public EntityResponseProjection onTunnel(TunnelResponseProjection subProjection) {
        return onTunnel(null, subProjection);
    }

    public EntityResponseProjection onTunnel(String alias, TunnelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tunnel").alias(alias).projection(subProjection));
        return this;
    }

    public EntityResponseProjection onAuditLogEntry(AuditLogEntryResponseProjection subProjection) {
        return onAuditLogEntry(null, subProjection);
    }

    public EntityResponseProjection onAuditLogEntry(String alias, AuditLogEntryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AuditLogEntry").alias(alias).projection(subProjection));
        return this;
    }

    public EntityResponseProjection onUserSummary(UserSummaryResponseProjection subProjection) {
        return onUserSummary(null, subProjection);
    }

    public EntityResponseProjection onUserSummary(String alias, UserSummaryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserSummary").alias(alias).projection(subProjection));
        return this;
    }

    public EntityResponseProjection onTag(TagResponseProjection subProjection) {
        return onTag(null, subProjection);
    }

    public EntityResponseProjection onTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tag").alias(alias).projection(subProjection));
        return this;
    }

    public EntityResponseProjection onUserVariable(UserVariableResponseProjection subProjection) {
        return onUserVariable(null, subProjection);
    }

    public EntityResponseProjection onUserVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserVariable").alias(alias).projection(subProjection));
        return this;
    }

    public EntityResponseProjection onMember(MemberResponseProjection subProjection) {
        return onMember(null, subProjection);
    }

    public EntityResponseProjection onMember(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Member").alias(alias).projection(subProjection));
        return this;
    }

    public EntityResponseProjection onSegment(SegmentResponseProjection subProjection) {
        return onSegment(null, subProjection);
    }

    public EntityResponseProjection onSegment(String alias, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Segment").alias(alias).projection(subProjection));
        return this;
    }

    public EntityResponseProjection onUserEvent(UserEventResponseProjection subProjection) {
        return onUserEvent(null, subProjection);
    }

    public EntityResponseProjection onUserEvent(String alias, UserEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UserEvent").alias(alias).projection(subProjection));
        return this;
    }

    public EntityResponseProjection typename() {
        return typename(null);
    }

    public EntityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
