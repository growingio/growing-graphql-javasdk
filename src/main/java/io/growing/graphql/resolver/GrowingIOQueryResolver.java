package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * Resolver for Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public interface GrowingIOQueryResolver {

    java.util.List<MeasurementDto> segmentMeasurements(SettingSegmentMeasurementPolicyDto policy, String id) throws Exception;

    TagDto tag(String id) throws Exception;

    SegmentDto segment(String id) throws Exception;

    BasicProfileDto basicProfile(String id) throws Exception;

    PersonaProfileDto personaProfile(String id) throws Exception;

    UserProfileDto userProfile(String userId, java.util.List<String> tags, java.util.List<String> properties) throws Exception;

    EventTrendDto userEventsTrend(String id) throws Exception;

    java.util.List<UserSearchDto> searchUsers(String q) throws Exception;

    @javax.validation.constraints.NotNull
    SlicePaginationDto users(UserQueryTypeDto type, String id, Integer offset, Integer limit) throws Exception;

    @javax.validation.constraints.NotNull
    SlicePaginationDto activeUsers(String timeRange, Integer offset, Integer limit) throws Exception;

    @javax.validation.constraints.NotNull
    CursorPaginationDto userEvents(String id, UserEventTypeDto type, String timeRange, Integer first, String after, Integer last, String before) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<String> searchUserEvents(String id, String q, String timeRange) throws Exception;

    /**
     * activeToday: 今日活跃用户
     * activeInThreeWeeks: 近 3 周活跃用户
     * activeNotInTwoWeeks: 近 2 周不活跃用户
     */
    PreparedSegmentDto preparedSegment(String id) throws Exception;

    SegmentDocumentDto segmentDocument(String id) throws Exception;

    TunnelDto tunnel(String id) throws Exception;

    java.util.List<CustomEventDto> ubaCustomEvents(String tunnelId) throws Exception;

    java.util.List<UserVariableDto> ubaUserVariables(String tunnelId) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean tunnelActivated(String id) throws Exception;

    TunnelEventsTrendDto getTunnelEventsTrend(String id) throws Exception;

    JobResultDto jobResult(String id) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<LogEntryDto> jobLogs(String id) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<FileDescriptorDto> jobFiles(String id) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<SubscriptionDto> subscriptions(SubscriptionTypeDto type) throws Exception;

    java.util.List<ModuleDto> userPermissionModules(String userId) throws Exception;

    RoleDto role(String id) throws Exception;

    java.util.List<UserAccessCtrlDto> acls(String resourceType) throws Exception;

    java.util.List<String> resourceActions(String resourceType, java.lang.Long resourceId) throws Exception;

    AccessEntryDto userGrants(String resourceType, java.lang.Long resourceId) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<DepartmentDto> departments(String parentId) throws Exception;

    CustomEventDto customEvent(String id) throws Exception;

    ComplexMetricDto complexMetric(String id) throws Exception;

    EventVariableDto eventVariable(String id) throws Exception;

    ItemModelDto itemModel(String id) throws Exception;

    ItemVariableDto itemVariable(String id) throws Exception;

    UserVariableDto userVariable(String id) throws Exception;

    java.util.List<MeasurableDto> measurements(java.util.List<String> t, String q, String c) throws Exception;

    java.util.List<DimensionDto> insightDimensions(java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) throws Exception;

    KpiAnalysisDto kpiAnalysis(String id, String dashboardId) throws Exception;

    FunnelAnalysisDto funnelAnalysis(String id, String dashboardId) throws Exception;

    FrequencyAnalysisDto frequencyAnalysis(String id, String dashboardId) throws Exception;

    EventAnalysisDto eventAnalysis(String id, String dashboardId) throws Exception;

    RetentionAnalysisDto retentionAnalysis(String id, String dashboardId) throws Exception;

    DashboardDto dashboard(String id) throws Exception;

    java.util.List<DashboardReferenceDto> analysisDashboardReferers(String resourceType, String resourceId) throws Exception;

    DashboardCommentDto dashboardComment(String id) throws Exception;

}