package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * Resolver for Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface GrowingIOMutationResolver {

    @javax.validation.constraints.NotNull
    Boolean settingUtmArguments(java.util.List<UtmArgumentInputDto> utmArguments) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteUtmArgument(String id) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean settingPersonaMeasurements(String projectId, java.util.List<MeasurementInputDto> measurements) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean settingSegmentMeasurements(String projectId, SettingSegmentMeasurementPolicyDto policy, java.util.List<MeasurementInputDto> measurements, String id) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateDataCenterInfo(DataCenterInfoInputDto dataCenterInfo) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateOriginDataSetting(java.util.List<OriginDataSettingInputDto> originDatas) throws Exception;

    /**
     * 更新水印配置
     */
    @javax.validation.constraints.NotNull
    Boolean updateWaterMarkSetting(UpdateWaterMarkSettingInputDto input) throws Exception;

    /**
     * 创建分析预警
     */
    @javax.validation.constraints.NotNull
    AnalysisAlertsDto createAnalysisAlert(String projectId, AnalysisAlertsInputDto analysisAlert) throws Exception;

    /**
     * 更新分析预警
     */
    @javax.validation.constraints.NotNull
    AnalysisAlertsDto updateAnalysisAlert(String projectId, String id, AnalysisAlertsInputDto analysisAlert) throws Exception;

    /**
     * 单条删除分析预警
     */
    @javax.validation.constraints.NotNull
    Boolean deleteAnalysisAlert(String projectId, String id) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteAnalysisAlerts(String projectId, java.util.List<String> ids) throws Exception;

    Boolean forceComputeTag(String id) throws Exception;

    Boolean forceComputeSegment(String projectId, String id) throws Exception;

    @javax.validation.constraints.NotNull
    TagDto createDataCenterTag(TagInputDto tag) throws Exception;

    Boolean deleteDataCenterTag(String id) throws Exception;

    TagDto updateDataCenterTag(String id, TagInputDto tag) throws Exception;

    Boolean batchDeleteDataCenterTags(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    SegmentDto createSegment(String projectId, SegmentInputDto segment) throws Exception;

    Boolean deleteSegment(String projectId, String id) throws Exception;

    SegmentDto updateSegment(String projectId, String id, SegmentInputDto segment) throws Exception;

    Boolean batchDeleteSegments(String projectId, java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    SegmentSnapshotDto createSegmentSnapshot(String projectId, ComputeDefinitionInputDto compute) throws Exception;

    @javax.validation.constraints.NotNull
    TencentPortraitDto createTencentPortrait(String projectId, TencentPortraitInputDto tencentPortrait) throws Exception;

    @javax.validation.constraints.NotNull
    TencentPortraitDto updateTencentPortrait(String projectId, String id, TencentPortraitInputDto tencentPortrait) throws Exception;

    Boolean deleteTencentPortrait(String projectId, String id) throws Exception;

    Boolean batchDeleteTencentPortrait(String projectId, java.util.List<String> ids) throws Exception;

    Boolean deleteTunnel(String id) throws Exception;

    @javax.validation.constraints.NotNull
    TunnelDto createTunnel(TunnelInputDto tunnel) throws Exception;

    TunnelDto updateTunnel(String id, TunnelInputDto tunnel) throws Exception;

    Boolean batchDeleteTunnels(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<CustomEventDto> syncUbaCustomEvent(String tunnelId, java.util.List<UbaCustomEventInputDto> ubaCustomEvents) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<UserVariableDto> syncUbaUserVariable(String tunnelId, java.util.List<UbaUserVariableInputDto> ubaUserVariables) throws Exception;

    JobResultDto executeJob(String id) throws Exception;

    @javax.validation.constraints.NotNull
    EventImportJobDto createEventImportJob(String tunnelId, String timeRange) throws Exception;

    /**
     * 提交用户标签导出任务  exportFileName: 导出的文件名称，不带后缀
     */
    @javax.validation.constraints.NotNull
    TagUserExportJobDto submitTagUserExportJob(String tagId, String exportFileName, java.util.List<String> properties, String charset, Boolean detailExport) throws Exception;

    @javax.validation.constraints.NotNull
    TagUserExportJobDto submitTagUserExportJobByKey(TagUserExportJobByKeyInputDto parameter) throws Exception;

    @javax.validation.constraints.NotNull
    SegmentUserExportJobDto submitSegmentUserExportJob(String projectId, String segmentId, java.util.List<String> tags, java.util.List<String> properties, String charset) throws Exception;

    @javax.validation.constraints.NotNull
    SegmentUserExportJobDto submitSegmentSnapshotUserExportJob(String projectId, String id, java.util.List<String> tags, java.util.List<String> properties, String charset) throws Exception;

    @javax.validation.constraints.NotNull
    SegmentUserExportJobDto submitSegmentUserExportJobV2(String projectId, ExportSegmentParameterInputDto parameter) throws Exception;

    @javax.validation.constraints.NotNull
    AnalysisExportJobDto submitAnalysisExportJob(String projectId, String id, AnalysisExportJobParamDto param, String charset) throws Exception;

    @javax.validation.constraints.NotNull
    CreateTableJobDto submitCreateTableJob(String projectId, CreateTableJobParameterInputDto parameter) throws Exception;

    /**
     * 请求日志导出
     */
    @javax.validation.constraints.NotNull
    AuditLogExportJobDto submitLogExportJob(AuditLogQueryInputDto q, String timeRange) throws Exception;

    Boolean createSubscription(String projectId, SubscriptionTypeDto type, String id) throws Exception;

    Boolean deleteSubscription(String projectId, SubscriptionTypeDto type, String id) throws Exception;

    Boolean batchUpdateSubscriptions(String projectId, SubscriptionTypeDto type, java.util.List<SubscriptionInputDto> subscriptions) throws Exception;

    /**
     * 创建分类
     */
    CategoryDto createCategory(CategoryInputDto category) throws Exception;

    /**
     * 更新分类
     */
    CategoryDto updateCategory(String id, CategoryInputDto category) throws Exception;

    /**
     * 删除分类
     */
    Boolean deleteCategory(String id) throws Exception;

    /**
     * 向分类添加资源
     */
    CategoryResourceDto addCategoryResource(CategoryResourceInputDto categoryResource) throws Exception;

    /**
     * 删除分类内资源
     */
    Boolean removeCategoryResources(java.util.List<CategoryResourceInputDto> categoryResources) throws Exception;

    /**
     * 向指定分类移动资源
     */
    java.util.List<CategoryResourceDto> moveCategoryResources(String categoryId, java.util.List<CategoryResourceInputDto> categoryResources) throws Exception;

    /**
     * @deprecated
     */
    Boolean dataCenterRoleAppendUser(String roleName, String userId) throws Exception;

    Boolean updateUserDataCenterPermissions(String userId, String roleId, java.util.List<String> permissions) throws Exception;

    Boolean updateDataCenterResourceAcls(String resourceType, String resourceId, AccessEntryInputDto accessEntry) throws Exception;

    Boolean batchUpdateDataCenterResourceAcl(String resourceType, java.util.List<String> resourceIds, java.util.List<String> readers, java.util.List<String> editors, String projectId) throws Exception;

    @javax.validation.constraints.NotNull
    DataCenterRoleDto createDataCenterRole(RoleInputDto role) throws Exception;

    Boolean deleteDataCenterRole(String id) throws Exception;

    Boolean updateDataCenterRole(String id, RoleInputDto role) throws Exception;

    @javax.validation.constraints.NotNull
    DepartmentDto createDepartment(DepartmentInputDto department) throws Exception;

    @javax.validation.constraints.NotNull
    DepartmentDto updateDepartment(String id, DepartmentInputDto department) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteDepartment(String id) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean addMembersToDepartment(java.util.List<String> memberIds, String departmentId) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateMemberDataCenterRole(String memberId, String roleId) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectDto createProject(ProjectInputDto project) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectDto updateProject(String id, ProjectInputDto project) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteProject(String id) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean addProjectMembers(AddProjectMembersInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean removeProjectMembers(String projectId, RemoveProjectMembersInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectRoleDto createProjectRole(String projectId, RoleInputDto role) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteProjectRole(DeleteProjectRoleInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateProjectRole(String projectId, String id, RoleInputDto role) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean assignUserProjectRole(String projectId, AssignUserProjectRoleInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean transferProjectOwner(String projectId, TransferProjectOwnerInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean toggleProject(ToggleProjectInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectDataCtrlDto updateProjectDataCtrl(UpdateProjectDataCtrlInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean transferProjectResources(TransferProjectResourcesInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean addMembersToProjectRole(String projectId, AddMembersToProjectRoleInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean transferDataCenterOwner(String transfereeId) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean addMembersToDataCenterRole(java.util.List<String> memberIds, String roleId) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean addMemberToProjects(java.util.List<AddMemberToProjectInputDto> input) throws Exception;

    WebHookDto createWebHook(WebHookInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateWebHook(String id, WebHookInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateWebHookStatus(String id, String status) throws Exception;

    NotificationTaskDto createNotificationTask(NotificationTaskInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateNotificationTask(String id, NotificationTaskInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteNotificationTask(String id) throws Exception;

    CreateAccountReplyDto createAccount(String email, String roleId, java.util.List<String> permissions, String extra) throws Exception;

    Boolean deleteAccount(String id) throws Exception;

    @javax.validation.constraints.NotNull
    String resetAccountPassword(String id) throws Exception;

    @javax.validation.constraints.NotNull
    MemberDto createMember(MemberInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean resetPassword(ResetPasswordInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateMember(String id, MemberInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean createAccountApplication(AccountApplicationInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean acceptAccountApplication(String id, AccountApplicationInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateAccountApplicationSetting(AccountApplicationSettingInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updatePasswordRecoverySetting(PasswordRecoverySettingInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean rejectAccountApplication(String id) throws Exception;

    /**
     * 更新帐号信息
     */
    @javax.validation.constraints.NotNull
    Boolean updateAccount(String id, UpdateAccountInputDto input) throws Exception;

    /**
     * 无埋点 创建元素
     */
    @javax.validation.constraints.NotNull
    ElementDto createElement(String projectId, ElementInputDto element) throws Exception;

    /**
     * 无埋点 更新元素
     */
    @javax.validation.constraints.NotNull
    ElementDto updateElement(String projectId, String id, ElementUpdateInputDto element) throws Exception;

    /**
     * 无埋点 删除元素
     */
    Boolean deleteElement(String projectId, String id) throws Exception;

    /**
     * 无埋点 批量删除元素
     */
    Boolean batchDeleteElements(String projectId, java.util.List<String> ids) throws Exception;

    /**
     * 数据中心 创建打点事件
     */
    @javax.validation.constraints.NotNull
    CustomEventDto createDataCenterCustomEvent(CustomEventInputDto customEvent) throws Exception;

    /**
     * 数据中心 更新打点事件
     */
    @javax.validation.constraints.NotNull
    CustomEventDto updateDataCenterCustomEvent(String id, CustomEventInputDto customEvent) throws Exception;

    /**
     * 数据中心 删除打点事件
     */
    Boolean deleteDataCenterCustomEvent(String id) throws Exception;

    /**
     * 数据中心 批量删除打点事件
     */
    Boolean batchDeleteDataCenterCustomEvents(java.util.List<String> ids) throws Exception;

    /**
     * 创建计算指标
     */
    @javax.validation.constraints.NotNull
    ComplexMetricDto createComplexMetric(String projectId, ComplexMetricInputDto complexMetric) throws Exception;

    /**
     * 更新计算指标
     */
    @javax.validation.constraints.NotNull
    ComplexMetricDto updateComplexMetric(String projectId, String id, ComplexMetricInputDto complexMetric) throws Exception;

    /**
     * 删除计算指标
     */
    Boolean deleteComplexMetric(String projectId, String id) throws Exception;

    /**
     * 批量删除计算指标
     */
    Boolean batchDeleteComplexMetrics(String projectId, java.util.List<String> ids) throws Exception;

    /**
     * 数据中心 创建事件变量
     */
    @javax.validation.constraints.NotNull
    EventVariableDto createDataCenterEventVariable(VariableInputDto eventVariable) throws Exception;

    /**
     * 数据中心 更新事件变量
     */
    @javax.validation.constraints.NotNull
    EventVariableDto updateDataCenterEventVariable(String id, VariableInputDto eventVariable) throws Exception;

    /**
     * 数据中心 删除事件变量
     */
    @javax.validation.constraints.NotNull
    Boolean deleteDataCenterEventVariable(String id) throws Exception;

    /**
     * 数据中心 批量删除事件变量
     */
    Boolean batchDeleteDataCenterEventVariables(java.util.List<String> ids) throws Exception;

    /**
     * 数据中心 更新物品变量
     */
    @javax.validation.constraints.NotNull
    ItemVariableDto updateDataCenterItemVariable(String id, VariableInputDto itemVariable) throws Exception;

    /**
     * 数据中心 删除物品变量
     */
    @javax.validation.constraints.NotNull
    Boolean deleteDataCenterItemVariable(String id) throws Exception;

    /**
     * 数据中心 批量删除物品变量
     */
    Boolean batchDeleteDataCenterItemVariables(java.util.List<String> ids) throws Exception;

    /**
     * 数据中心 创建物品模型
     */
    @javax.validation.constraints.NotNull
    ItemModelDto createDataCenterItemModel(ItemModelInputDto itemModel) throws Exception;

    /**
     * 数据中心 更新物品模型
     */
    @javax.validation.constraints.NotNull
    ItemModelDto updateDataCenterItemModel(String id, ItemModelInputDto itemModel) throws Exception;

    /**
     * 数据中心 删除物品模型
     */
    @javax.validation.constraints.NotNull
    Boolean deleteDataCenterItemModel(String id) throws Exception;

    /**
     * 数据中心 批量删除物品模型
     */
    Boolean batchDeleteDataCenterItemModels(java.util.List<String> ids) throws Exception;

    /**
     * 数据中心 物品模型添加属性
     */
    ItemVariableDto dataCenterAddItemModelAttribute(String id, ItemVariableInputDto attribute) throws Exception;

    /**
     * 数据中心 创建用户属性
     */
    @javax.validation.constraints.NotNull
    UserVariableDto createDataCenterUserVariable(VariableInputDto userVariable) throws Exception;

    /**
     * 数据中心 更新用户属性
     */
    @javax.validation.constraints.NotNull
    UserVariableDto updateDataCenterUserVariable(String id, VariableInputDto userVariable) throws Exception;

    /**
     * 数据中心 删除用户属性
     */
    @javax.validation.constraints.NotNull
    Boolean deleteDataCenterUserVariable(String id) throws Exception;

    /**
     * 数据中心 更批量删除用户属性
     */
    Boolean batchDeleteDataCenterUserVariables(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    KpiAnalysisDto createKpiAnalysis(String projectId, KpiAnalysisInputDto kpiAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    KpiAnalysisDto updateKpiAnalysis(String projectId, String id, KpiAnalysisInputDto kpiAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteKpiAnalysis(String projectId, String id) throws Exception;

    Boolean batchDeleteKpiAnalyses(String projectId, java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    FunnelAnalysisDto createFunnelAnalysis(String projectId, FunnelAnalysisInputDto funnelAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    FunnelAnalysisDto updateFunnelAnalysis(String projectId, String id, FunnelAnalysisInputDto funnelAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteFunnelAnalysis(String projectId, String id) throws Exception;

    Boolean batchDeleteFunnelAnalyses(String projectId, java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    FrequencyAnalysisDto createFrequencyAnalysis(String projectId, FrequencyAnalysisInputDto frequencyAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    FrequencyAnalysisDto updateFrequencyAnalysis(String projectId, String id, FrequencyAnalysisInputDto frequencyAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteFrequencyAnalysis(String projectId, String id) throws Exception;

    Boolean batchDeleteFrequencyAnalyses(String projectId, java.util.List<String> ids) throws Exception;

    /**
     * 创建新事件分析图
     */
    @javax.validation.constraints.NotNull
    EventAnalysisDto createOlapEventAnalysis(String projectId, OlapEventAnalysisInputDto olapEventAnalysis) throws Exception;

    /**
     * 更新新事件分析图
     */
    @javax.validation.constraints.NotNull
    EventAnalysisDto updateOlapEventAnalysis(String projectId, String id, OlapEventAnalysisInputDto olapEventAnalysis) throws Exception;

    /**
     * 删除新事件分析图
     */
    @javax.validation.constraints.NotNull
    Boolean deleteOlapEventAnalysis(String projectId, String id) throws Exception;

    /**
     * 批量删除新事件分析图
     */
    Boolean batchDeleteOlapEventAnalyses(String projectId, java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    EventAnalysisDto createEventAnalysis(String projectId, EventAnalysisInputDto eventAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    EventAnalysisDto updateEventAnalysis(String projectId, String id, EventAnalysisInputDto eventAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteEventAnalysis(String projectId, String id) throws Exception;

    Boolean batchDeleteEventAnalyses(String projectId, java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    RetentionAnalysisDto createRetentionAnalysis(String projectId, RetentionAnalysisInputDto retentionAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    RetentionAnalysisDto updateRetentionAnalysis(String projectId, String id, RetentionAnalysisInputDto retentionAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteRetentionAnalysis(String projectId, String id) throws Exception;

    Boolean batchDeleteRetentionAnalyses(String projectId, java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    DashboardDto createDashboard(String projectId, DashboardInputDto dashboard) throws Exception;

    @javax.validation.constraints.NotNull
    DashboardDto updateDashboard(String projectId, String id, DashboardInputDto dashboard) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteDashboard(String projectId, String id) throws Exception;

    Boolean batchDeleteDashboards(String projectId, java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    DashboardCommentDto updateDashboardComment(String projectId, String id, DashboardCommentInputDto dashboardComment) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteDashboardComment(String projectId, String id) throws Exception;

    @javax.validation.constraints.NotNull
    DashboardCommentDto createDashboardComment(String projectId, DashboardCommentInputDto dashboardComment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentReplyDto createFunnelDrillDownSegment(String projectId, FunnelDrillDownSegmentInputDto funnelDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentReplyDto createRetentionDrillDownSegment(String projectId, RetentionDrillDownSegmentInputDto retentionDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentReplyDto createFrequencyDrillDownSegment(String projectId, FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentSnapshotReplyDto createFunnelDrillDownSegmentSnapshot(String projectId, FunnelDrillDownSegmentInputDto funnelDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentSnapshotReplyDto createRetentionDrillDownSegmentSnapshot(String projectId, RetentionDrillDownSegmentInputDto retentionDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentSnapshotReplyDto createFrequencyDrillDownSegmentSnapshot(String projectId, FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) throws Exception;

}