package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public class QueryResponseProjection extends GraphQLResponseProjection {

    public QueryResponseProjection() {
    }

    public QueryResponseProjection personaMeasurements(MeasurementResponseProjection subProjection) {
        return personaMeasurements(null, subProjection);
    }

    public QueryResponseProjection personaMeasurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("personaMeasurements").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection segmentMeasurements(MeasurementResponseProjection subProjection) {
        return segmentMeasurements((String)null, subProjection);
    }

    public QueryResponseProjection segmentMeasurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("segmentMeasurements").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection segmentMeasurements(QuerySegmentMeasurementsParametrizedInput input, MeasurementResponseProjection subProjection) {
        return segmentMeasurements(null, input, subProjection);
    }

    public QueryResponseProjection segmentMeasurements(String alias, QuerySegmentMeasurementsParametrizedInput input, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("segmentMeasurements").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection utmArguments(UtmArgumentResponseProjection subProjection) {
        return utmArguments(null, subProjection);
    }

    public QueryResponseProjection utmArguments(String alias, UtmArgumentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("utmArguments").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection projectInfo(ProjectInfoResponseProjection subProjection) {
        return projectInfo(null, subProjection);
    }

    public QueryResponseProjection projectInfo(String alias, ProjectInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectInfo").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection originDataSettings(OriginDataSettingResponseProjection subProjection) {
        return originDataSettings(null, subProjection);
    }

    public QueryResponseProjection originDataSettings(String alias, OriginDataSettingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("originDataSettings").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection tags(TagResponseProjection subProjection) {
        return tags(null, subProjection);
    }

    public QueryResponseProjection tags(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection tag(TagResponseProjection subProjection) {
        return tag((String)null, subProjection);
    }

    public QueryResponseProjection tag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tag").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection tag(QueryTagParametrizedInput input, TagResponseProjection subProjection) {
        return tag(null, input, subProjection);
    }

    public QueryResponseProjection tag(String alias, QueryTagParametrizedInput input, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tag").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countTags() {
        return countTags(null);
    }

    public QueryResponseProjection countTags(String alias) {
        fields.add(new GraphQLResponseField("countTags").alias(alias));
        return this;
    }

    public QueryResponseProjection segments(SegmentResponseProjection subProjection) {
        return segments(null, subProjection);
    }

    public QueryResponseProjection segments(String alias, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("segments").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection segment(SegmentResponseProjection subProjection) {
        return segment((String)null, subProjection);
    }

    public QueryResponseProjection segment(String alias, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("segment").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection segment(QuerySegmentParametrizedInput input, SegmentResponseProjection subProjection) {
        return segment(null, input, subProjection);
    }

    public QueryResponseProjection segment(String alias, QuerySegmentParametrizedInput input, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("segment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countSegments() {
        return countSegments(null);
    }

    public QueryResponseProjection countSegments(String alias) {
        fields.add(new GraphQLResponseField("countSegments").alias(alias));
        return this;
    }

    public QueryResponseProjection basicProfile(BasicProfileResponseProjection subProjection) {
        return basicProfile((String)null, subProjection);
    }

    public QueryResponseProjection basicProfile(String alias, BasicProfileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("basicProfile").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection basicProfile(QueryBasicProfileParametrizedInput input, BasicProfileResponseProjection subProjection) {
        return basicProfile(null, input, subProjection);
    }

    public QueryResponseProjection basicProfile(String alias, QueryBasicProfileParametrizedInput input, BasicProfileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("basicProfile").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection personaProfile(PersonaProfileResponseProjection subProjection) {
        return personaProfile((String)null, subProjection);
    }

    public QueryResponseProjection personaProfile(String alias, PersonaProfileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("personaProfile").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection personaProfile(QueryPersonaProfileParametrizedInput input, PersonaProfileResponseProjection subProjection) {
        return personaProfile(null, input, subProjection);
    }

    public QueryResponseProjection personaProfile(String alias, QueryPersonaProfileParametrizedInput input, PersonaProfileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("personaProfile").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userProfile(UserProfileResponseProjection subProjection) {
        return userProfile((String)null, subProjection);
    }

    public QueryResponseProjection userProfile(String alias, UserProfileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userProfile").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userProfile(QueryUserProfileParametrizedInput input, UserProfileResponseProjection subProjection) {
        return userProfile(null, input, subProjection);
    }

    public QueryResponseProjection userProfile(String alias, QueryUserProfileParametrizedInput input, UserProfileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userProfile").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userEventsTrend(EventTrendResponseProjection subProjection) {
        return userEventsTrend((String)null, subProjection);
    }

    public QueryResponseProjection userEventsTrend(String alias, EventTrendResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userEventsTrend").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userEventsTrend(QueryUserEventsTrendParametrizedInput input, EventTrendResponseProjection subProjection) {
        return userEventsTrend(null, input, subProjection);
    }

    public QueryResponseProjection userEventsTrend(String alias, QueryUserEventsTrendParametrizedInput input, EventTrendResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userEventsTrend").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection searchUsers(UserSearchResponseProjection subProjection) {
        return searchUsers((String)null, subProjection);
    }

    public QueryResponseProjection searchUsers(String alias, UserSearchResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("searchUsers").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection searchUsers(QuerySearchUsersParametrizedInput input, UserSearchResponseProjection subProjection) {
        return searchUsers(null, input, subProjection);
    }

    public QueryResponseProjection searchUsers(String alias, QuerySearchUsersParametrizedInput input, UserSearchResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("searchUsers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection users(SlicePaginationResponseProjection subProjection) {
        return users((String)null, subProjection);
    }

    public QueryResponseProjection users(String alias, SlicePaginationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("users").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection users(QueryUsersParametrizedInput input, SlicePaginationResponseProjection subProjection) {
        return users(null, input, subProjection);
    }

    public QueryResponseProjection users(String alias, QueryUsersParametrizedInput input, SlicePaginationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("users").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection activeUsers(SlicePaginationResponseProjection subProjection) {
        return activeUsers((String)null, subProjection);
    }

    public QueryResponseProjection activeUsers(String alias, SlicePaginationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("activeUsers").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection activeUsers(QueryActiveUsersParametrizedInput input, SlicePaginationResponseProjection subProjection) {
        return activeUsers(null, input, subProjection);
    }

    public QueryResponseProjection activeUsers(String alias, QueryActiveUsersParametrizedInput input, SlicePaginationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("activeUsers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userEvents(CursorPaginationResponseProjection subProjection) {
        return userEvents((String)null, subProjection);
    }

    public QueryResponseProjection userEvents(String alias, CursorPaginationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userEvents").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userEvents(QueryUserEventsParametrizedInput input, CursorPaginationResponseProjection subProjection) {
        return userEvents(null, input, subProjection);
    }

    public QueryResponseProjection userEvents(String alias, QueryUserEventsParametrizedInput input, CursorPaginationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userEvents").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection searchUserEvents() {
        return searchUserEvents((String)null);
    }

    public QueryResponseProjection searchUserEvents(String alias) {
        fields.add(new GraphQLResponseField("searchUserEvents").alias(alias));
        return this;
    }

    public QueryResponseProjection searchUserEvents(QuerySearchUserEventsParametrizedInput input) {
        return searchUserEvents(null, input);
    }

    public QueryResponseProjection searchUserEvents(String alias, QuerySearchUserEventsParametrizedInput input) {
        fields.add(new GraphQLResponseField("searchUserEvents").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection preparedSegment(PreparedSegmentResponseProjection subProjection) {
        return preparedSegment((String)null, subProjection);
    }

    public QueryResponseProjection preparedSegment(String alias, PreparedSegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("preparedSegment").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection preparedSegment(QueryPreparedSegmentParametrizedInput input, PreparedSegmentResponseProjection subProjection) {
        return preparedSegment(null, input, subProjection);
    }

    public QueryResponseProjection preparedSegment(String alias, QueryPreparedSegmentParametrizedInput input, PreparedSegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("preparedSegment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection segmentDocument(SegmentDocumentResponseProjection subProjection) {
        return segmentDocument((String)null, subProjection);
    }

    public QueryResponseProjection segmentDocument(String alias, SegmentDocumentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("segmentDocument").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection segmentDocument(QuerySegmentDocumentParametrizedInput input, SegmentDocumentResponseProjection subProjection) {
        return segmentDocument(null, input, subProjection);
    }

    public QueryResponseProjection segmentDocument(String alias, QuerySegmentDocumentParametrizedInput input, SegmentDocumentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("segmentDocument").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection tunnels(TunnelResponseProjection subProjection) {
        return tunnels(null, subProjection);
    }

    public QueryResponseProjection tunnels(String alias, TunnelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tunnels").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection tunnel(TunnelResponseProjection subProjection) {
        return tunnel((String)null, subProjection);
    }

    public QueryResponseProjection tunnel(String alias, TunnelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tunnel").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection tunnel(QueryTunnelParametrizedInput input, TunnelResponseProjection subProjection) {
        return tunnel(null, input, subProjection);
    }

    public QueryResponseProjection tunnel(String alias, QueryTunnelParametrizedInput input, TunnelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tunnel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countTunnels() {
        return countTunnels(null);
    }

    public QueryResponseProjection countTunnels(String alias) {
        fields.add(new GraphQLResponseField("countTunnels").alias(alias));
        return this;
    }

    public QueryResponseProjection ubaCustomEvents(CustomEventResponseProjection subProjection) {
        return ubaCustomEvents((String)null, subProjection);
    }

    public QueryResponseProjection ubaCustomEvents(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ubaCustomEvents").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection ubaCustomEvents(QueryUbaCustomEventsParametrizedInput input, CustomEventResponseProjection subProjection) {
        return ubaCustomEvents(null, input, subProjection);
    }

    public QueryResponseProjection ubaCustomEvents(String alias, QueryUbaCustomEventsParametrizedInput input, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ubaCustomEvents").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection ubaUserVariables(UserVariableResponseProjection subProjection) {
        return ubaUserVariables((String)null, subProjection);
    }

    public QueryResponseProjection ubaUserVariables(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ubaUserVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection ubaUserVariables(QueryUbaUserVariablesParametrizedInput input, UserVariableResponseProjection subProjection) {
        return ubaUserVariables(null, input, subProjection);
    }

    public QueryResponseProjection ubaUserVariables(String alias, QueryUbaUserVariablesParametrizedInput input, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ubaUserVariables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection tunnelActivated() {
        return tunnelActivated((String)null);
    }

    public QueryResponseProjection tunnelActivated(String alias) {
        fields.add(new GraphQLResponseField("tunnelActivated").alias(alias));
        return this;
    }

    public QueryResponseProjection tunnelActivated(QueryTunnelActivatedParametrizedInput input) {
        return tunnelActivated(null, input);
    }

    public QueryResponseProjection tunnelActivated(String alias, QueryTunnelActivatedParametrizedInput input) {
        fields.add(new GraphQLResponseField("tunnelActivated").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection getTunnelEventsTrend(TunnelEventsTrendResponseProjection subProjection) {
        return getTunnelEventsTrend((String)null, subProjection);
    }

    public QueryResponseProjection getTunnelEventsTrend(String alias, TunnelEventsTrendResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("getTunnelEventsTrend").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection getTunnelEventsTrend(QueryGetTunnelEventsTrendParametrizedInput input, TunnelEventsTrendResponseProjection subProjection) {
        return getTunnelEventsTrend(null, input, subProjection);
    }

    public QueryResponseProjection getTunnelEventsTrend(String alias, QueryGetTunnelEventsTrendParametrizedInput input, TunnelEventsTrendResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("getTunnelEventsTrend").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection jobResult(JobResultResponseProjection subProjection) {
        return jobResult((String)null, subProjection);
    }

    public QueryResponseProjection jobResult(String alias, JobResultResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("jobResult").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection jobResult(QueryJobResultParametrizedInput input, JobResultResponseProjection subProjection) {
        return jobResult(null, input, subProjection);
    }

    public QueryResponseProjection jobResult(String alias, QueryJobResultParametrizedInput input, JobResultResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("jobResult").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection eventImportJobs(EventImportJobResponseProjection subProjection) {
        return eventImportJobs(null, subProjection);
    }

    public QueryResponseProjection eventImportJobs(String alias, EventImportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventImportJobs").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection jobLogs(LogEntryResponseProjection subProjection) {
        return jobLogs((String)null, subProjection);
    }

    public QueryResponseProjection jobLogs(String alias, LogEntryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("jobLogs").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection jobLogs(QueryJobLogsParametrizedInput input, LogEntryResponseProjection subProjection) {
        return jobLogs(null, input, subProjection);
    }

    public QueryResponseProjection jobLogs(String alias, QueryJobLogsParametrizedInput input, LogEntryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("jobLogs").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection jobFiles(FileDescriptorResponseProjection subProjection) {
        return jobFiles((String)null, subProjection);
    }

    public QueryResponseProjection jobFiles(String alias, FileDescriptorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("jobFiles").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection jobFiles(QueryJobFilesParametrizedInput input, FileDescriptorResponseProjection subProjection) {
        return jobFiles(null, input, subProjection);
    }

    public QueryResponseProjection jobFiles(String alias, QueryJobFilesParametrizedInput input, FileDescriptorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("jobFiles").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection subscriptions(SubscriptionResponseProjection subProjection) {
        return subscriptions((String)null, subProjection);
    }

    public QueryResponseProjection subscriptions(String alias, SubscriptionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subscriptions").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection subscriptions(QuerySubscriptionsParametrizedInput input, SubscriptionResponseProjection subProjection) {
        return subscriptions(null, input, subProjection);
    }

    public QueryResponseProjection subscriptions(String alias, QuerySubscriptionsParametrizedInput input, SubscriptionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subscriptions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection features(FeatureResponseProjection subProjection) {
        return features(null, subProjection);
    }

    public QueryResponseProjection features(String alias, FeatureResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("features").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection version() {
        return version(null);
    }

    public QueryResponseProjection version(String alias) {
        fields.add(new GraphQLResponseField("version").alias(alias));
        return this;
    }

    public QueryResponseProjection userPermissionModules(ModuleResponseProjection subProjection) {
        return userPermissionModules((String)null, subProjection);
    }

    public QueryResponseProjection userPermissionModules(String alias, ModuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userPermissionModules").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userPermissionModules(QueryUserPermissionModulesParametrizedInput input, ModuleResponseProjection subProjection) {
        return userPermissionModules(null, input, subProjection);
    }

    public QueryResponseProjection userPermissionModules(String alias, QueryUserPermissionModulesParametrizedInput input, ModuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userPermissionModules").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection permissionModules(ModuleResponseProjection subProjection) {
        return permissionModules(null, subProjection);
    }

    public QueryResponseProjection permissionModules(String alias, ModuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissionModules").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection role(RoleResponseProjection subProjection) {
        return role((String)null, subProjection);
    }

    public QueryResponseProjection role(String alias, RoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("role").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection role(QueryRoleParametrizedInput input, RoleResponseProjection subProjection) {
        return role(null, input, subProjection);
    }

    public QueryResponseProjection role(String alias, QueryRoleParametrizedInput input, RoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("role").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection roles(RoleResponseProjection subProjection) {
        return roles(null, subProjection);
    }

    public QueryResponseProjection roles(String alias, RoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("roles").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection acls(UserAccessCtrlResponseProjection subProjection) {
        return acls((String)null, subProjection);
    }

    public QueryResponseProjection acls(String alias, UserAccessCtrlResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("acls").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection acls(QueryAclsParametrizedInput input, UserAccessCtrlResponseProjection subProjection) {
        return acls(null, input, subProjection);
    }

    public QueryResponseProjection acls(String alias, QueryAclsParametrizedInput input, UserAccessCtrlResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("acls").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection resourceActions() {
        return resourceActions((String)null);
    }

    public QueryResponseProjection resourceActions(String alias) {
        fields.add(new GraphQLResponseField("resourceActions").alias(alias));
        return this;
    }

    public QueryResponseProjection resourceActions(QueryResourceActionsParametrizedInput input) {
        return resourceActions(null, input);
    }

    public QueryResponseProjection resourceActions(String alias, QueryResourceActionsParametrizedInput input) {
        fields.add(new GraphQLResponseField("resourceActions").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection userGrants(AccessEntryResponseProjection subProjection) {
        return userGrants((String)null, subProjection);
    }

    public QueryResponseProjection userGrants(String alias, AccessEntryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userGrants").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userGrants(QueryUserGrantsParametrizedInput input, AccessEntryResponseProjection subProjection) {
        return userGrants(null, input, subProjection);
    }

    public QueryResponseProjection userGrants(String alias, QueryUserGrantsParametrizedInput input, AccessEntryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userGrants").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection departments(DepartmentResponseProjection subProjection) {
        return departments((String)null, subProjection);
    }

    public QueryResponseProjection departments(String alias, DepartmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("departments").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection departments(QueryDepartmentsParametrizedInput input, DepartmentResponseProjection subProjection) {
        return departments(null, input, subProjection);
    }

    public QueryResponseProjection departments(String alias, QueryDepartmentsParametrizedInput input, DepartmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("departments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection allDepartments(DepartmentResponseProjection subProjection) {
        return allDepartments(null, subProjection);
    }

    public QueryResponseProjection allDepartments(String alias, DepartmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("allDepartments").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection customEvents(CustomEventResponseProjection subProjection) {
        return customEvents(null, subProjection);
    }

    public QueryResponseProjection customEvents(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("customEvents").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection customEvent(CustomEventResponseProjection subProjection) {
        return customEvent((String)null, subProjection);
    }

    public QueryResponseProjection customEvent(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("customEvent").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection customEvent(QueryCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        return customEvent(null, input, subProjection);
    }

    public QueryResponseProjection customEvent(String alias, QueryCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("customEvent").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countCustomEvents() {
        return countCustomEvents(null);
    }

    public QueryResponseProjection countCustomEvents(String alias) {
        fields.add(new GraphQLResponseField("countCustomEvents").alias(alias));
        return this;
    }

    public QueryResponseProjection complexMetrics(ComplexMetricResponseProjection subProjection) {
        return complexMetrics(null, subProjection);
    }

    public QueryResponseProjection complexMetrics(String alias, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("complexMetrics").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection complexMetric(ComplexMetricResponseProjection subProjection) {
        return complexMetric((String)null, subProjection);
    }

    public QueryResponseProjection complexMetric(String alias, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("complexMetric").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection complexMetric(QueryComplexMetricParametrizedInput input, ComplexMetricResponseProjection subProjection) {
        return complexMetric(null, input, subProjection);
    }

    public QueryResponseProjection complexMetric(String alias, QueryComplexMetricParametrizedInput input, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("complexMetric").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection preparedMetrics(PreparedMetricResponseProjection subProjection) {
        return preparedMetrics(null, subProjection);
    }

    public QueryResponseProjection preparedMetrics(String alias, PreparedMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("preparedMetrics").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countComplexMetrics() {
        return countComplexMetrics(null);
    }

    public QueryResponseProjection countComplexMetrics(String alias) {
        fields.add(new GraphQLResponseField("countComplexMetrics").alias(alias));
        return this;
    }

    public QueryResponseProjection eventVariables(EventVariableResponseProjection subProjection) {
        return eventVariables(null, subProjection);
    }

    public QueryResponseProjection eventVariables(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection eventVariable(EventVariableResponseProjection subProjection) {
        return eventVariable((String)null, subProjection);
    }

    public QueryResponseProjection eventVariable(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventVariable").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection eventVariable(QueryEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        return eventVariable(null, input, subProjection);
    }

    public QueryResponseProjection eventVariable(String alias, QueryEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countEventVariables() {
        return countEventVariables(null);
    }

    public QueryResponseProjection countEventVariables(String alias) {
        fields.add(new GraphQLResponseField("countEventVariables").alias(alias));
        return this;
    }

    public QueryResponseProjection itemModels(ItemModelResponseProjection subProjection) {
        return itemModels(null, subProjection);
    }

    public QueryResponseProjection itemModels(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemModels").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection itemModel(ItemModelResponseProjection subProjection) {
        return itemModel((String)null, subProjection);
    }

    public QueryResponseProjection itemModel(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemModel").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection itemModel(QueryItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        return itemModel(null, input, subProjection);
    }

    public QueryResponseProjection itemModel(String alias, QueryItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemModel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection itemVariables(ItemVariableResponseProjection subProjection) {
        return itemVariables(null, subProjection);
    }

    public QueryResponseProjection itemVariables(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection itemVariable(ItemVariableResponseProjection subProjection) {
        return itemVariable((String)null, subProjection);
    }

    public QueryResponseProjection itemVariable(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemVariable").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection itemVariable(QueryItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        return itemVariable(null, input, subProjection);
    }

    public QueryResponseProjection itemVariable(String alias, QueryItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countItemVariables() {
        return countItemVariables(null);
    }

    public QueryResponseProjection countItemVariables(String alias) {
        fields.add(new GraphQLResponseField("countItemVariables").alias(alias));
        return this;
    }

    public QueryResponseProjection userVariables(UserVariableResponseProjection subProjection) {
        return userVariables(null, subProjection);
    }

    public QueryResponseProjection userVariables(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userVariable(UserVariableResponseProjection subProjection) {
        return userVariable((String)null, subProjection);
    }

    public QueryResponseProjection userVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userVariable").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userVariable(QueryUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        return userVariable(null, input, subProjection);
    }

    public QueryResponseProjection userVariable(String alias, QueryUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countUserVariables() {
        return countUserVariables(null);
    }

    public QueryResponseProjection countUserVariables(String alias) {
        fields.add(new GraphQLResponseField("countUserVariables").alias(alias));
        return this;
    }

    public QueryResponseProjection userProperties(UserPropertyResponseProjection subProjection) {
        return userProperties(null, subProjection);
    }

    public QueryResponseProjection userProperties(String alias, UserPropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userProperties").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection preparedDimensions(PreparedDimensionResponseProjection subProjection) {
        return preparedDimensions(null, subProjection);
    }

    public QueryResponseProjection preparedDimensions(String alias, PreparedDimensionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("preparedDimensions").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection measurements(MeasurableResponseProjection subProjection) {
        return measurements((String)null, subProjection);
    }

    public QueryResponseProjection measurements(String alias, MeasurableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurements").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection measurements(QueryMeasurementsParametrizedInput input, MeasurableResponseProjection subProjection) {
        return measurements(null, input, subProjection);
    }

    public QueryResponseProjection measurements(String alias, QueryMeasurementsParametrizedInput input, MeasurableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("measurements").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection insightDimensions(DimensionResponseProjection subProjection) {
        return insightDimensions((String)null, subProjection);
    }

    public QueryResponseProjection insightDimensions(String alias, DimensionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("insightDimensions").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection insightDimensions(QueryInsightDimensionsParametrizedInput input, DimensionResponseProjection subProjection) {
        return insightDimensions(null, input, subProjection);
    }

    public QueryResponseProjection insightDimensions(String alias, QueryInsightDimensionsParametrizedInput input, DimensionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("insightDimensions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection kpiAnalysis(KpiAnalysisResponseProjection subProjection) {
        return kpiAnalysis((String)null, subProjection);
    }

    public QueryResponseProjection kpiAnalysis(String alias, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kpiAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection kpiAnalysis(QueryKpiAnalysisParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        return kpiAnalysis(null, input, subProjection);
    }

    public QueryResponseProjection kpiAnalysis(String alias, QueryKpiAnalysisParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kpiAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection kpiAnalyses(KpiAnalysisResponseProjection subProjection) {
        return kpiAnalyses(null, subProjection);
    }

    public QueryResponseProjection kpiAnalyses(String alias, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kpiAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countKpiAnalyses() {
        return countKpiAnalyses(null);
    }

    public QueryResponseProjection countKpiAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countKpiAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection funnelAnalysis(FunnelAnalysisResponseProjection subProjection) {
        return funnelAnalysis((String)null, subProjection);
    }

    public QueryResponseProjection funnelAnalysis(String alias, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("funnelAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection funnelAnalysis(QueryFunnelAnalysisParametrizedInput input, FunnelAnalysisResponseProjection subProjection) {
        return funnelAnalysis(null, input, subProjection);
    }

    public QueryResponseProjection funnelAnalysis(String alias, QueryFunnelAnalysisParametrizedInput input, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("funnelAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection funnelAnalyses(FunnelAnalysisResponseProjection subProjection) {
        return funnelAnalyses(null, subProjection);
    }

    public QueryResponseProjection funnelAnalyses(String alias, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("funnelAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countFunnelAnalyses() {
        return countFunnelAnalyses(null);
    }

    public QueryResponseProjection countFunnelAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countFunnelAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection frequencyAnalysis(FrequencyAnalysisResponseProjection subProjection) {
        return frequencyAnalysis((String)null, subProjection);
    }

    public QueryResponseProjection frequencyAnalysis(String alias, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("frequencyAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection frequencyAnalysis(QueryFrequencyAnalysisParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        return frequencyAnalysis(null, input, subProjection);
    }

    public QueryResponseProjection frequencyAnalysis(String alias, QueryFrequencyAnalysisParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("frequencyAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection frequencyAnalyses(FrequencyAnalysisResponseProjection subProjection) {
        return frequencyAnalyses(null, subProjection);
    }

    public QueryResponseProjection frequencyAnalyses(String alias, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("frequencyAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countFrequencyAnalyses() {
        return countFrequencyAnalyses(null);
    }

    public QueryResponseProjection countFrequencyAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countFrequencyAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection eventAnalysis(EventAnalysisResponseProjection subProjection) {
        return eventAnalysis((String)null, subProjection);
    }

    public QueryResponseProjection eventAnalysis(String alias, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection eventAnalysis(QueryEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        return eventAnalysis(null, input, subProjection);
    }

    public QueryResponseProjection eventAnalysis(String alias, QueryEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection eventAnalyses(EventAnalysisResponseProjection subProjection) {
        return eventAnalyses(null, subProjection);
    }

    public QueryResponseProjection eventAnalyses(String alias, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countEventAnalyses() {
        return countEventAnalyses(null);
    }

    public QueryResponseProjection countEventAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countEventAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection retentionAnalysis(RetentionAnalysisResponseProjection subProjection) {
        return retentionAnalysis((String)null, subProjection);
    }

    public QueryResponseProjection retentionAnalysis(String alias, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("retentionAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection retentionAnalysis(QueryRetentionAnalysisParametrizedInput input, RetentionAnalysisResponseProjection subProjection) {
        return retentionAnalysis(null, input, subProjection);
    }

    public QueryResponseProjection retentionAnalysis(String alias, QueryRetentionAnalysisParametrizedInput input, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("retentionAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection retentionAnalyses(RetentionAnalysisResponseProjection subProjection) {
        return retentionAnalyses(null, subProjection);
    }

    public QueryResponseProjection retentionAnalyses(String alias, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("retentionAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countRetentionAnalyses() {
        return countRetentionAnalyses(null);
    }

    public QueryResponseProjection countRetentionAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countRetentionAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection dashboard(DashboardResponseProjection subProjection) {
        return dashboard((String)null, subProjection);
    }

    public QueryResponseProjection dashboard(String alias, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dashboard").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dashboard(QueryDashboardParametrizedInput input, DashboardResponseProjection subProjection) {
        return dashboard(null, input, subProjection);
    }

    public QueryResponseProjection dashboard(String alias, QueryDashboardParametrizedInput input, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dashboard").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dashboards(DashboardResponseProjection subProjection) {
        return dashboards(null, subProjection);
    }

    public QueryResponseProjection dashboards(String alias, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dashboards").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countDashboards() {
        return countDashboards(null);
    }

    public QueryResponseProjection countDashboards(String alias) {
        fields.add(new GraphQLResponseField("countDashboards").alias(alias));
        return this;
    }

    public QueryResponseProjection analysisDashboardReferers(DashboardReferenceResponseProjection subProjection) {
        return analysisDashboardReferers((String)null, subProjection);
    }

    public QueryResponseProjection analysisDashboardReferers(String alias, DashboardReferenceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("analysisDashboardReferers").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection analysisDashboardReferers(QueryAnalysisDashboardReferersParametrizedInput input, DashboardReferenceResponseProjection subProjection) {
        return analysisDashboardReferers(null, input, subProjection);
    }

    public QueryResponseProjection analysisDashboardReferers(String alias, QueryAnalysisDashboardReferersParametrizedInput input, DashboardReferenceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("analysisDashboardReferers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dashboardComment(DashboardCommentResponseProjection subProjection) {
        return dashboardComment((String)null, subProjection);
    }

    public QueryResponseProjection dashboardComment(String alias, DashboardCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dashboardComment").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dashboardComment(QueryDashboardCommentParametrizedInput input, DashboardCommentResponseProjection subProjection) {
        return dashboardComment(null, input, subProjection);
    }

    public QueryResponseProjection dashboardComment(String alias, QueryDashboardCommentParametrizedInput input, DashboardCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dashboardComment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection typename() {
        return typename(null);
    }

    public QueryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
