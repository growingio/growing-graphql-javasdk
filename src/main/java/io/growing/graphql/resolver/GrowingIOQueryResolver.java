package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * Resolver for Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface GrowingIOQueryResolver {

    java.util.List<MeasurementDto> personaMeasurements(String projectId) throws Exception;

    java.util.List<MeasurementDto> segmentMeasurements(String projectId, SettingSegmentMeasurementPolicyDto policy, String id) throws Exception;

    java.util.List<CrystalBallUserInfoPanelDto> crystalBallUserInfoPanels(String projectId) throws Exception;

    java.util.List<AnalysisAlertsDto> analysisAlerts(String projectId) throws Exception;

    AnalysisAlertsDto analysisAlert(String projectId, String id) throws Exception;

    java.util.List<AnalysisAlertsDto> getAlertsByChartId(String projectId, String chartId) throws Exception;

    /**
     * 通过 id 获取数据中心标签
     */
    TagDto dataCenterTag(String id) throws Exception;

    java.util.List<TagDto> tags(String projectId) throws Exception;

    TagDto tag(String projectId, String id) throws Exception;

    java.util.List<SegmentDto> segments(String projectId) throws Exception;

    SegmentDto segment(String projectId, String id) throws Exception;

    Integer countSegments(String projectId) throws Exception;

    BasicProfileDto basicProfile(String projectId, String id) throws Exception;

    PersonaProfileDto personaProfile(String projectId, String id) throws Exception;

    /**
     * 如果userId在数据端为无效或不存在，则返回空
     */
    UserProfileDto userProfile(String projectId, String userId, java.util.List<String> tags, java.util.List<String> properties) throws Exception;

    /**
     * 如果userId在数据端为无效或不存在，则返回空
     */
    UserProfileDto dataCenterUserProfile(String userId, java.util.List<String> tags, java.util.List<String> properties) throws Exception;

    /**
     * 如果userId在数据端为无效或不存在，则返回空
     */
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

    TencentPortraitDto tencentPortrait(String projectId, String id) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<TencentPortraitDto> tencentPortraits(String projectId) throws Exception;

    /**
     * 获取腾讯分群画像用户信息统计数据, 返回两组数据，第一组为手机号覆盖率，第二组为设备覆盖率
     */
    @javax.validation.constraints.NotNull
    java.util.List<TGIStatisticDataDto> getTGIStatisticData(String projectId, String segmentId) throws Exception;

    /**
     * * 返回标签分组信息
* @param groupId 非必填,为空 | 查询所有非叶子分组(即⻚面侧边分组),有值 | 查询这个分组的下一级分组及分组下标签信息(即⻚面中部分组及标签)
* @param level   非必填,目前该参数为保留参数,暂时不提供功能
* @return  标签分组信息
     */
    @javax.validation.constraints.NotNull
    java.util.List<TagGroupInfoDto> tencentPortraitTagInfo(String groupId, String level) throws Exception;

    /**
     * * 通过id查询分组信息
* @param ids id列表
* @return 对应id的标签分组信息
     */
    @javax.validation.constraints.NotNull
    java.util.List<TagGroupInfoDto> queryGroupByIds(java.util.List<String> ids) throws Exception;

    /**
     * @param fieldValue：字段值  fieldType：字段类型（枚举值）
     */
    @javax.validation.constraints.NotNull
    Boolean checkTagFieldExistence(String fieldValue, TagFieldTypeDto fieldType) throws Exception;

    java.util.List<TunnelDto> projectTunnels(String projectId) throws Exception;

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

    /**
     * 查询日志
     */
    @javax.validation.constraints.NotNull
    SlicePaginationDto logs(AuditLogQueryInputDto q, String timeRange, Integer offset, Integer limit) throws Exception;

    /**
     * 查询日志导出状态
     */
    @javax.validation.constraints.NotNull
    AuditLogExportJobResultDto logExportJobResult(String id) throws Exception;

    @javax.validation.constraints.NotNull
    CircleQrcodeDto circleQrcode(String projectId, String productId) throws Exception;

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
    DebuggerQrcodeDto debuggerQrcode(String productId) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<SubscriptionDto> subscriptions(String projectId, SubscriptionTypeDto type) throws Exception;

    /**
     * 获取分类列表, resourceType: userVariable | tag, 也可以不填，不填时返回所有两种类型的结果
     */
    java.util.List<CategoryDto> categories(String resourceType) throws Exception;

    /**
     * 根据分类ID获取分类信息
     */
    CategoryDto category(String id) throws Exception;

    /**
     * 根据资源类型查询未分类的资源列表
     */
    CategoryDto defaultCategory(String resourceType, String projectId) throws Exception;

    /**
     * 根据关键字查询分类, resourceType: tag | userVariable
     */
    java.util.List<CategoryDto> searchCategories(String projectId, String q, String resourceType) throws Exception;

    /**
     * 根据资源类型与项目id返回树状结构分类信息
     */
    java.util.List<CategoryDto> treeLikeCategoriesWithResource(String projectId, String resourceType) throws Exception;

    /**
     * 返回dataCenter级别未分类资源
     */
    CategoryDto dataCenterDefaultCategory(String resourceType) throws Exception;

    /**
     * 根据关键字查询在dataCenter级别下分类信息, resourceType: tag | userVariable
     */
    java.util.List<CategoryDto> dataCenterSearchCategories(String q, String resourceType) throws Exception;

    /**
     * 根据资源类型返回dataCenter级别下树状结构分类信息
     */
    java.util.List<CategoryDto> dataCenterTreeLikeCategories(String resourceType) throws Exception;

    /**
     * 根据资源id返回dataCenter级别下树状结构分类信息
     */
    CategoryDto dataCenterTreeLikeCategoryWithResource(String id) throws Exception;

    /**
     * 根据资源返回其所属分类
     */
    CategoryDto dataCenterGetCategoryByResource(CategoryResourceInputDto categoryResource) throws Exception;

    java.util.List<ModuleDto> userDataCenterPermissionModules(String userId) throws Exception;

    DataCenterRoleDto dataCenterRole(String id) throws Exception;

    java.util.List<UserAccessCtrlDto> dataCenterAcls(String resourceType) throws Exception;

    java.util.List<String> dataCenterResourceActions(String resourceType, java.lang.Long resourceId) throws Exception;

    AccessEntryDto dataCenterUserGrants(String resourceType, java.lang.Long resourceId) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<DepartmentDto> departments(String parentId) throws Exception;

    ProjectDto project(String id) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectRoleDto projectRole(String projectId, String id) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<ProjectRoleDto> projectRoles(String projectId) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<ModuleDto> userProjectPermissionModules(String projectId, String userId) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<ProjectDataCtrlDto> projectDataCtrl(String projectId) throws Exception;

    ProjectRoleDto currentUserProjectRole(String projectId) throws Exception;

    WebHookDto webHook(String id) throws Exception;

    NotificationTaskDto notificationTask(String id) throws Exception;

    @javax.validation.constraints.NotNull
    WebHookResponseDto testWebHook(WebHookInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    WebHookResponseDto testNotificationTask(String id) throws Exception;

    @javax.validation.constraints.NotNull
    WebHookResponseDto testWebHookById(String id) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean verifyProjectAi(String ai) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean passwordValidation(String identity, String password) throws Exception;

    AccountApplicationDto accountApplication(String id) throws Exception;

    @javax.validation.constraints.NotNull
    String accountApplicationStatus(String identity) throws Exception;

    @javax.validation.constraints.NotNull
    SlicePaginationDto members(String scopeId, MemberScopeTypeInputDto scopeType, Integer offset, Integer limit) throws Exception;

    @javax.validation.constraints.NotNull
    SlicePaginationDto searchMembers(String scopeId, MemberScopeTypeInputDto scopeType, String nameOrIdentity, Integer offset, Integer limit) throws Exception;

    /**
     * 数据中心 单个打点事件详情
     */
    CustomEventDto dataCenterCustomEvent(String id) throws Exception;

    /**
     * 打点事件列表
     */
    java.util.List<CustomEventDto> customEvents(String projectId) throws Exception;

    /**
     * 单个打点事件详情
     */
    CustomEventDto customEvent(String projectId, String id) throws Exception;

    /**
     * 无埋点 元素列表
     */
    java.util.List<ElementDto> elements(String projectId) throws Exception;

    /**
     * 无埋点 单个元素详情
     */
    ElementDto element(String projectId, String id) throws Exception;

    /**
     * 无埋点事件 即圈选事件
     */
    java.util.List<SimpleEventDto> simpleEvents(String projectId, String elementId) throws Exception;

    /**
     * 计算指标列表
     */
    java.util.List<ComplexMetricDto> complexMetrics(String projectId) throws Exception;

    /**
     * 单个计算指标详情
     */
    ComplexMetricDto complexMetric(String projectId, String id) throws Exception;

    /**
     * 大洋分析计算指标查询列表页接口(由ID查询仍走旧接口)
     */
    java.util.List<ComplexMetricDto> complexMetricsV2(String projectId) throws Exception;

    /**
     * 统计计算指标的个数
     */
    Integer countComplexMetrics(String projectId) throws Exception;

    /**
     * 事件变量列表
     */
    java.util.List<EventVariableDto> eventVariables(String projectId) throws Exception;

    /**
     * 单个事件变量详情
     */
    EventVariableDto eventVariable(String projectId, String id) throws Exception;

    /**
     * 用户变量列表
     */
    java.util.List<UserVariableDto> userVariables(String projectId) throws Exception;

    /**
     * 单个用户变量详情
     */
    UserVariableDto userVariable(String projectId, String id) throws Exception;

    /**
     * 预定义维度列表
     */
    java.util.List<PreparedDimensionDto> preparedDimensions(String projectId) throws Exception;

    /**
     * 聚合的指标列表
     */
    java.util.List<MeasurableDto> measurements(String projectId, java.util.List<String> t, String q, String c, String f) throws Exception;

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