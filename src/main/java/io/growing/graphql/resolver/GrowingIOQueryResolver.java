package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * Resolver for Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public interface GrowingIOQueryResolver {

    java.util.List<MeasurementDto> personaMeasurements(String projectId) throws Exception;

    java.util.List<MeasurementDto> segmentMeasurements(String projectId, SettingSegmentMeasurementPolicyDto policy, String id) throws Exception;

    java.util.List<CrystalBallUserInfoPanelDto> crystalBallUserInfoPanels(String projectId) throws Exception;

    /**
     * 通过 id 获取数据中心标签
     */
    TagDto dataCenterTag(String id) throws Exception;

    java.util.List<TagDto> tags(String projectId) throws Exception;

    TagDto tag(String projectId, String id) throws Exception;

    Integer countTags(String projectId) throws Exception;

    java.util.List<SegmentDto> segments(String projectId) throws Exception;

    SegmentDto segment(String projectId, String id) throws Exception;

    Integer countSegments(String projectId) throws Exception;

    BasicProfileDto basicProfile(String projectId, String id) throws Exception;

    PersonaProfileDto personaProfile(String projectId, String id) throws Exception;

    UserProfileDto userProfile(String projectId, String userId, java.util.List<String> tags, java.util.List<String> properties) throws Exception;

    java.util.List<TimeUserProfileDto> userProfileWithTime(String projectId, String userId, java.util.List<String> tags, java.util.List<String> properties) throws Exception;

    EventTrendDto userEventsTrend(String projectId, String id, UserEventTypeDto type, String timeRange, java.lang.Long interval, java.util.List<String> eventKeys) throws Exception;

    /**
     * 查询用户，properties为返回哪些用户信息/属性，filter为需要的过滤字段，之前的q现在使用filter传
     */
    java.util.List<UserSearchDto> searchUsers(String projectId, java.util.List<String> properties, FilterInputDto filter) throws Exception;

    @javax.validation.constraints.NotNull
    SlicePaginationDto users(String projectId, UserQueryTypeDto type, String id, Integer offset, Integer limit, java.util.List<String> tags, java.util.List<String> properties) throws Exception;

    @javax.validation.constraints.NotNull
    SlicePaginationDto activeUsers(String projectId, String timeRange, Integer offset, Integer limit) throws Exception;

    /**
     * 用户事件查询，新增filter为过滤条件，小程序无埋点filter中含有appid
     */
    @javax.validation.constraints.NotNull
    CursorPaginationDto userEvents(String projectId, String id, java.util.List<UserEventTypeDto> types, String timeRange, Integer first, String after, Integer last, String before, Integer limit, FilterInputDto filter) throws Exception;

    UserEventCountDto userEventCount(String projectId, String id, String timeRange, java.util.List<String> eventKeys) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<String> searchUserEvents(String projectId, String id, String q, String timeRange) throws Exception;

    /**
     * activeToday: 今日活跃用户
     * activeInThreeWeeks: 近 3 周活跃用户
     * activeNotInTwoWeeks: 近 2 周不活跃用户
     */
    PreparedSegmentDto preparedSegment(String projectId, String id) throws Exception;

    SegmentDocumentDto segmentDocument(String projectId, String id) throws Exception;

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
    CircleQrcodeDto circleQrcode(String productId) throws Exception;

    /**
     * 获取IP，返回productId关联的，最多5个
     */
    @javax.validation.constraints.NotNull
    java.util.List<String> minpActiveUserIps(String productId) throws Exception;

    /**
     * 获取二维码长链
     */
    @javax.validation.constraints.NotNull
    String minpCircleQrcode(String productId) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<SubscriptionDto> subscriptions(String projectId, SubscriptionTypeDto type) throws Exception;

    CategoryDto category(String id) throws Exception;

    CategoryDto defaultCategory(String projectId) throws Exception;

    java.util.List<CategoryDto> searchCategories(String projectId, String q) throws Exception;

    java.util.List<CategoryDto> treeLikeCategoriesWithResource(String projectId) throws Exception;

    java.util.List<CategoryDto> dataCenterSearchCategories(String q) throws Exception;

    CategoryDto dataCenterTreeLikeCategoryWithResource(String id) throws Exception;

    java.util.List<ModuleDto> userDataCenterPermissionModules(String userId) throws Exception;

    DataCenterRoleDto dataCenterRole(String id) throws Exception;

    java.util.List<UserAccessCtrlDto> dataCenterAcls(String resourceType) throws Exception;

    java.util.List<String> dataCenterResourceActions(String resourceType, java.lang.Long resourceId) throws Exception;

    AccessEntryDto dataCenterUserGrants(String resourceType, java.lang.Long resourceId) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<DepartmentDto> departments(String parentId) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectDto project(String id) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectRoleDto projectRole(String projectId, String id) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<ProjectRoleDto> projectRoles(String projectId) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<ModuleDto> userProjectPermissionModules(String projectId, String userId) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<ProjectDataCtrlDto> projectDataCtrl(String projectId) throws Exception;

    java.util.List<TreeNodeDto> resourceTrees(String projectId) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean verifyProjectAi(String ai) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean passwordValidation(String identity, String password) throws Exception;

    CustomEventDto dataCenterCustomEvent(String id) throws Exception;

    java.util.List<CustomEventDto> customEvents(String projectId) throws Exception;

    CustomEventDto customEvent(String projectId, String id) throws Exception;

    Integer countCustomEvents(String projectId) throws Exception;

    java.util.List<ElementDto> elements(String projectId) throws Exception;

    ElementDto element(String projectId, String id) throws Exception;

    java.util.List<SimpleEventDto> simpleEvents(String projectId, String elementId) throws Exception;

    java.util.List<ComplexMetricDto> complexMetrics(String projectId) throws Exception;

    ComplexMetricDto complexMetric(String projectId, String id) throws Exception;

    Integer countComplexMetrics(String projectId) throws Exception;

    java.util.List<EventVariableDto> eventVariables(String projectId) throws Exception;

    EventVariableDto eventVariable(String projectId, String id) throws Exception;

    Integer countEventVariables(String projectId) throws Exception;

    java.util.List<ItemModelDto> itemModels(String projectId) throws Exception;

    ItemModelDto itemModel(String projectId, String id) throws Exception;

    java.util.List<ItemVariableDto> itemVariables(String projectId) throws Exception;

    ItemVariableDto itemVariable(String projectId, String id) throws Exception;

    Integer countItemVariables(String projectId) throws Exception;

    java.util.List<UserVariableDto> userVariables(String projectId) throws Exception;

    UserVariableDto userVariable(String projectId, String id) throws Exception;

    Integer countUserVariables(String projectId) throws Exception;

    java.util.List<PreparedDimensionDto> preparedDimensions(String projectId) throws Exception;

    java.util.List<MeasurableDto> measurements(String projectId, java.util.List<String> t, String q, String c) throws Exception;

    /**
     * 数据中心的 insightDimensions
     */
    java.util.List<DimensionDto> insightDimensions(String projectId, java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) throws Exception;

    /**
     * 通过 id 获取数据中心的事件变量
     */
    EventVariableDto dataCenterEventVariable(String id) throws Exception;

    /**
     * 通过 id 获取数据中心的物品模型
     */
    ItemModelDto dataCenterItemModel(String id) throws Exception;

    /**
     * 通过 id 获取数据中心的物品模型变量
     */
    ItemVariableDto dataCenterItemVariable(String id) throws Exception;

    /**
     * 通过 id 获取数据中心的用户变量
     */
    UserVariableDto dataCenterUserVariable(String id) throws Exception;

    /**
     * 数据中心的 InsightDimensions
     */
    java.util.List<DimensionDto> dataCenterInsightDimensions(java.util.List<MeasurementInputDto> measurements, java.util.List<String> targetUsers) throws Exception;

    KpiAnalysisDto kpiAnalysis(String projectId, String id, String dashboardId) throws Exception;

    java.util.List<KpiAnalysisDto> kpiAnalyses(String projectId) throws Exception;

    Integer countKpiAnalyses(String projectId) throws Exception;

    FunnelAnalysisDto funnelAnalysis(String projectId, String id, String dashboardId) throws Exception;

    java.util.List<FunnelAnalysisDto> funnelAnalyses(String projectId) throws Exception;

    Integer countFunnelAnalyses(String projectId) throws Exception;

    FrequencyAnalysisDto frequencyAnalysis(String projectId, String id, String dashboardId) throws Exception;

    java.util.List<FrequencyAnalysisDto> frequencyAnalyses(String projectId) throws Exception;

    Integer countFrequencyAnalyses(String projectId) throws Exception;

    EventAnalysisDto eventAnalysis(String projectId, String id, String dashboardId) throws Exception;

    java.util.List<EventAnalysisDto> eventAnalyses(String projectId) throws Exception;

    Integer countEventAnalyses(String projectId) throws Exception;

    RetentionAnalysisDto retentionAnalysis(String projectId, String id, String dashboardId) throws Exception;

    java.util.List<RetentionAnalysisDto> retentionAnalyses(String projectId) throws Exception;

    Integer countRetentionAnalyses(String projectId) throws Exception;

    DashboardDto dashboard(String projectId, String id) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<DashboardDto> dashboards(String projectId) throws Exception;

    Integer countDashboards(String projectId) throws Exception;

    java.util.List<DashboardReferenceDto> analysisDashboardReferers(String projectId, String resourceType, String resourceId) throws Exception;

    DashboardCommentDto dashboardComment(String projectId, String id) throws Exception;

    DashboardDto crystalBallDashboard(String projectId, String id) throws Exception;

    java.util.List<DashboardDto> crystalBallDashboards(String projectId) throws Exception;

    KpiAnalysisDto crystalBallKpiAnalysis(String projectId, String id) throws Exception;

    EventAnalysisDto crystalBallEventAnalysis(String projectId, String id) throws Exception;

    TrackOverviewAnalysisDto crystalBallTrackOverviewAnalysis(String projectId, String id) throws Exception;

    FrequencyAnalysisDto crystalBallFrequencyAnalysis(String projectId, String id) throws Exception;

    DashboardCommentDto crystalBallDashboardComment(String projectId, String id) throws Exception;

}