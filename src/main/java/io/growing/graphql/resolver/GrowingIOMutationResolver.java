package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * Resolver for Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public interface GrowingIOMutationResolver {

    @javax.validation.constraints.NotNull
    Boolean settingUtmArguments(java.util.List<UtmArgumentInputDto> utmArguments) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteUtmArgument(String id) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean settingPersonaMeasurements(java.util.List<MeasurementInputDto> measurements) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean settingSegmentMeasurements(SettingSegmentMeasurementPolicyDto policy, java.util.List<MeasurementInputDto> measurements, String id) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateProjectInfo(ProjectInfoInputDto projectInfo) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateOriginDataSetting(java.util.List<OriginDataSettingInputDto> originDatas) throws Exception;

    @javax.validation.constraints.NotNull
    TagDto createTag(TagInputDto tag) throws Exception;

    Boolean deleteTag(String id) throws Exception;

    TagDto updateTag(String id, TagInputDto tag) throws Exception;

    Boolean batchDeleteTags(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    SegmentDto createSegment(SegmentInputDto segment) throws Exception;

    Boolean deleteSegment(String id) throws Exception;

    SegmentDto updateSegment(String id, SegmentInputDto segment) throws Exception;

    Boolean batchDeleteSegments(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    SegmentSnapshotDto createSegmentSnapshot(ComputeDefinitionInputDto compute) throws Exception;

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

    @javax.validation.constraints.NotNull
    TagUserExportJobDto submitTagUserExportJob(String tagId, java.util.List<String> properties, String charset) throws Exception;

    @javax.validation.constraints.NotNull
    SegmentUserExportJobDto submitSegmentUserExportJob(String segmentId, java.util.List<String> tags, java.util.List<String> properties, String charset) throws Exception;

    @javax.validation.constraints.NotNull
    SegmentUserExportJobDto submitSegmentSnapshotUserExportJob(String id, java.util.List<String> properties, String charset) throws Exception;

    @javax.validation.constraints.NotNull
    AnalysisExportJobDto submitAnalysisExportJob(String id, AnalysisExportJobParamDto param, String charset) throws Exception;

    Boolean createSubscription(SubscriptionTypeDto type, String id) throws Exception;

    Boolean deleteSubscription(SubscriptionTypeDto type, String id) throws Exception;

    Boolean batchUpdateSubscriptions(SubscriptionTypeDto type, java.util.List<SubscriptionInputDto> subscriptions) throws Exception;

    Boolean roleAppendUser(String roleName, String userId) throws Exception;

    Boolean updateUserPermissions(String userId, String roleId, java.util.List<String> permissions) throws Exception;

    Boolean updateResourceAcls(String resourceType, String resourceId, AccessEntryInputDto accessEntry) throws Exception;

    Boolean batchUpdateResourceAcl(String resourceType, java.util.List<String> resourceIds, java.util.List<String> readers, java.util.List<String> editors) throws Exception;

    @javax.validation.constraints.NotNull
    RoleDto createRole(RoleInputDto role) throws Exception;

    Boolean deleteRole(String id) throws Exception;

    Boolean updateRole(String id, RoleInputDto role) throws Exception;

    @javax.validation.constraints.NotNull
    DepartmentDto createDepartment(DepartmentInputDto department) throws Exception;

    @javax.validation.constraints.NotNull
    DepartmentDto updateDepartment(String id, DepartmentInputDto department) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteDepartment(String id) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean addMembersToDepartment(java.util.List<String> memberIds, String departmentId) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateMemberRole(String memberId, String roleId) throws Exception;

    CreateAccountReplyDto createAccount(String email, String roleId, java.util.List<String> permissions, String extra) throws Exception;

    Boolean disableAccount(String id) throws Exception;

    @javax.validation.constraints.NotNull
    String resetAccountPassword(String id) throws Exception;

    @javax.validation.constraints.NotNull
    MemberDto createMember(MemberInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean resetPassword(ResetPasswordInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean updateMember(String id, MemberInputDto input) throws Exception;

    @javax.validation.constraints.NotNull
    CustomEventDto createCustomEvent(CustomEventInputDto customEvent) throws Exception;

    @javax.validation.constraints.NotNull
    CustomEventDto updateCustomEvent(String id, CustomEventInputDto customEvent) throws Exception;

    Boolean deleteCustomEvent(String id) throws Exception;

    Boolean batchDeleteCustomEvents(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    ComplexMetricDto createComplexMetric(ComplexMetricInputDto complexMetric) throws Exception;

    @javax.validation.constraints.NotNull
    ComplexMetricDto updateComplexMetric(String id, ComplexMetricInputDto complexMetric) throws Exception;

    Boolean deleteComplexMetric(String id) throws Exception;

    Boolean batchDeleteComplexMetrics(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    EventVariableDto createEventVariable(VariableInputDto eventVariable) throws Exception;

    @javax.validation.constraints.NotNull
    EventVariableDto updateEventVariable(String id, VariableInputDto eventVariable) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteEventVariable(String id) throws Exception;

    Boolean batchDeleteEventVariables(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    ItemVariableDto createItemVariable(VariableInputDto itemVariable) throws Exception;

    @javax.validation.constraints.NotNull
    ItemVariableDto updateItemVariable(String id, VariableInputDto itemVariable) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteItemVariable(String id) throws Exception;

    Boolean batchDeleteItemVariables(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    ItemModelDto createItemModel(ItemModelInputDto itemModel) throws Exception;

    @javax.validation.constraints.NotNull
    ItemModelDto updateItemModel(String id, ItemModelInputDto itemModel) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteItemModel(String id) throws Exception;

    Boolean batchDeleteItemModels(java.util.List<String> ids) throws Exception;

    ItemVariableDto addItemModelAttribute(String id, ItemVariableInputDto attribute) throws Exception;

    @javax.validation.constraints.NotNull
    UserVariableDto createUserVariable(VariableInputDto userVariable) throws Exception;

    @javax.validation.constraints.NotNull
    UserVariableDto updateUserVariable(String id, VariableInputDto userVariable) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteUserVariable(String id) throws Exception;

    Boolean batchDeleteUserVariables(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    KpiAnalysisDto createKpiAnalysis(KpiAnalysisInputDto kpiAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    KpiAnalysisDto updateKpiAnalysis(String id, KpiAnalysisInputDto kpiAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteKpiAnalysis(String id) throws Exception;

    Boolean batchDeleteKpiAnalyses(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    FunnelAnalysisDto createFunnelAnalysis(FunnelAnalysisInputDto funnelAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    FunnelAnalysisDto updateFunnelAnalysis(String id, FunnelAnalysisInputDto funnelAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteFunnelAnalysis(String id) throws Exception;

    Boolean batchDeleteFunnelAnalyses(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    FrequencyAnalysisDto createFrequencyAnalysis(FrequencyAnalysisInputDto frequencyAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    FrequencyAnalysisDto updateFrequencyAnalysis(String id, FrequencyAnalysisInputDto frequencyAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteFrequencyAnalysis(String id) throws Exception;

    Boolean batchDeleteFrequencyAnalyses(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    EventAnalysisDto createEventAnalysis(EventAnalysisInputDto eventAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    EventAnalysisDto updateEventAnalysis(String id, EventAnalysisInputDto eventAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteEventAnalysis(String id) throws Exception;

    Boolean batchDeleteEventAnalyses(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    RetentionAnalysisDto createRetentionAnalysis(RetentionAnalysisInputDto retentionAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    RetentionAnalysisDto updateRetentionAnalysis(String id, RetentionAnalysisInputDto retentionAnalysis) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteRetentionAnalysis(String id) throws Exception;

    Boolean batchDeleteRetentionAnalyses(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    DashboardDto createDashboard(DashboardInputDto dashboard) throws Exception;

    @javax.validation.constraints.NotNull
    DashboardDto updateDashboard(String id, DashboardInputDto dashboard) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteDashboard(String id) throws Exception;

    Boolean batchDeleteDashboards(java.util.List<String> ids) throws Exception;

    @javax.validation.constraints.NotNull
    DashboardCommentDto updateDashboardComment(String id, DashboardCommentInputDto dashboardComment) throws Exception;

    @javax.validation.constraints.NotNull
    Boolean deleteDashboardComment(String id) throws Exception;

    @javax.validation.constraints.NotNull
    DashboardCommentDto createDashboardComment(DashboardCommentInputDto dashboardComment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentReplyDto createFunnelDrillDownSegment(FunnelDrillDownSegmentInputDto funnelDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentReplyDto createRetentionDrillDownSegment(RetentionDrillDownSegmentInputDto retentionDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentReplyDto createFrequencyDrillDownSegment(FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentSnapshotReplyDto createFunnelDrillDownSegmentSnapshot(FunnelDrillDownSegmentInputDto funnelDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentSnapshotReplyDto createRetentionDrillDownSegmentSnapshot(RetentionDrillDownSegmentInputDto retentionDrillDownSegment) throws Exception;

    @javax.validation.constraints.NotNull
    DrillDownSegmentSnapshotReplyDto createFrequencyDrillDownSegmentSnapshot(FrequencyDrillDownSegmentInputDto frequencyDrillDownSegment) throws Exception;

}