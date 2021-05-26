package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class MutationResponseProjection extends GraphQLResponseProjection {

    public MutationResponseProjection() {
    }

    @Override
    public MutationResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MutationResponseProjection all$(int maxDepth) {
        this.settingUtmArguments();
        this.deleteUtmArgument();
        this.settingPersonaMeasurements();
        this.settingSegmentMeasurements();
        this.updateDataCenterInfo();
        this.updateOriginDataSetting();
        this.updateWaterMarkSetting();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisAlertsResponseProjection.createAnalysisAlert", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AnalysisAlertsResponseProjection.createAnalysisAlert", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisAlertsResponseProjection.createAnalysisAlert", 0) + 1);
            this.createAnalysisAlert(new AnalysisAlertsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisAlertsResponseProjection.createAnalysisAlert", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisAlertsResponseProjection.updateAnalysisAlert", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AnalysisAlertsResponseProjection.updateAnalysisAlert", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisAlertsResponseProjection.updateAnalysisAlert", 0) + 1);
            this.updateAnalysisAlert(new AnalysisAlertsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisAlertsResponseProjection.updateAnalysisAlert", 0)));
        }
        this.deleteAnalysisAlert();
        this.deleteAnalysisAlerts();
        this.forceComputeTag();
        this.forceComputeSegment();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.createDataCenterTag", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TagResponseProjection.createDataCenterTag", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.createDataCenterTag", 0) + 1);
            this.createDataCenterTag(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.createDataCenterTag", 0)));
        }
        this.deleteDataCenterTag();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.updateDataCenterTag", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TagResponseProjection.updateDataCenterTag", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.updateDataCenterTag", 0) + 1);
            this.updateDataCenterTag(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.updateDataCenterTag", 0)));
        }
        this.batchDeleteDataCenterTags();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentResponseProjection.createSegment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SegmentResponseProjection.createSegment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentResponseProjection.createSegment", 0) + 1);
            this.createSegment(new SegmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentResponseProjection.createSegment", 0)));
        }
        this.deleteSegment();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentResponseProjection.updateSegment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SegmentResponseProjection.updateSegment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentResponseProjection.updateSegment", 0) + 1);
            this.updateSegment(new SegmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentResponseProjection.updateSegment", 0)));
        }
        this.batchDeleteSegments();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentSnapshotResponseProjection.createSegmentSnapshot", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SegmentSnapshotResponseProjection.createSegmentSnapshot", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentSnapshotResponseProjection.createSegmentSnapshot", 0) + 1);
            this.createSegmentSnapshot(new SegmentSnapshotResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentSnapshotResponseProjection.createSegmentSnapshot", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TencentPortraitResponseProjection.createTencentPortrait", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TencentPortraitResponseProjection.createTencentPortrait", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TencentPortraitResponseProjection.createTencentPortrait", 0) + 1);
            this.createTencentPortrait(new TencentPortraitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TencentPortraitResponseProjection.createTencentPortrait", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TencentPortraitResponseProjection.updateTencentPortrait", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TencentPortraitResponseProjection.updateTencentPortrait", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TencentPortraitResponseProjection.updateTencentPortrait", 0) + 1);
            this.updateTencentPortrait(new TencentPortraitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TencentPortraitResponseProjection.updateTencentPortrait", 0)));
        }
        this.deleteTencentPortrait();
        this.batchDeleteTencentPortrait();
        this.deleteTunnel();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TunnelResponseProjection.createTunnel", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TunnelResponseProjection.createTunnel", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TunnelResponseProjection.createTunnel", 0) + 1);
            this.createTunnel(new TunnelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TunnelResponseProjection.createTunnel", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TunnelResponseProjection.updateTunnel", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TunnelResponseProjection.updateTunnel", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TunnelResponseProjection.updateTunnel", 0) + 1);
            this.updateTunnel(new TunnelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TunnelResponseProjection.updateTunnel", 0)));
        }
        this.batchDeleteTunnels();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.syncUbaCustomEvent", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CustomEventResponseProjection.syncUbaCustomEvent", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.syncUbaCustomEvent", 0) + 1);
            this.syncUbaCustomEvent(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.syncUbaCustomEvent", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.syncUbaUserVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UserVariableResponseProjection.syncUbaUserVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.syncUbaUserVariable", 0) + 1);
            this.syncUbaUserVariable(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.syncUbaUserVariable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.JobResultResponseProjection.executeJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.JobResultResponseProjection.executeJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.JobResultResponseProjection.executeJob", 0) + 1);
            this.executeJob(new JobResultResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.JobResultResponseProjection.executeJob", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventImportJobResponseProjection.createEventImportJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.EventImportJobResponseProjection.createEventImportJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventImportJobResponseProjection.createEventImportJob", 0) + 1);
            this.createEventImportJob(new EventImportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventImportJobResponseProjection.createEventImportJob", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagUserExportJobResponseProjection.submitTagUserExportJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TagUserExportJobResponseProjection.submitTagUserExportJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagUserExportJobResponseProjection.submitTagUserExportJob", 0) + 1);
            this.submitTagUserExportJob(new TagUserExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagUserExportJobResponseProjection.submitTagUserExportJob", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagUserExportJobResponseProjection.submitTagUserExportJobByKey", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TagUserExportJobResponseProjection.submitTagUserExportJobByKey", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagUserExportJobResponseProjection.submitTagUserExportJobByKey", 0) + 1);
            this.submitTagUserExportJobByKey(new TagUserExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagUserExportJobResponseProjection.submitTagUserExportJobByKey", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJob", 0) + 1);
            this.submitSegmentUserExportJob(new SegmentUserExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJob", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentSnapshotUserExportJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentSnapshotUserExportJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentSnapshotUserExportJob", 0) + 1);
            this.submitSegmentSnapshotUserExportJob(new SegmentUserExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentSnapshotUserExportJob", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJobV2", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJobV2", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJobV2", 0) + 1);
            this.submitSegmentUserExportJobV2(new SegmentUserExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJobV2", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisExportJobResponseProjection.submitAnalysisExportJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AnalysisExportJobResponseProjection.submitAnalysisExportJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisExportJobResponseProjection.submitAnalysisExportJob", 0) + 1);
            this.submitAnalysisExportJob(new AnalysisExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisExportJobResponseProjection.submitAnalysisExportJob", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateTableJobResponseProjection.submitCreateTableJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateTableJobResponseProjection.submitCreateTableJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateTableJobResponseProjection.submitCreateTableJob", 0) + 1);
            this.submitCreateTableJob(new CreateTableJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateTableJobResponseProjection.submitCreateTableJob", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AuditLogExportJobResponseProjection.submitLogExportJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AuditLogExportJobResponseProjection.submitLogExportJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AuditLogExportJobResponseProjection.submitLogExportJob", 0) + 1);
            this.submitLogExportJob(new AuditLogExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AuditLogExportJobResponseProjection.submitLogExportJob", 0)));
        }
        this.createSubscription();
        this.deleteSubscription();
        this.batchUpdateSubscriptions();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResponseProjection.createCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CategoryResponseProjection.createCategory", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResponseProjection.createCategory", 0) + 1);
            this.createCategory(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResponseProjection.createCategory", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResponseProjection.updateCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CategoryResponseProjection.updateCategory", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResponseProjection.updateCategory", 0) + 1);
            this.updateCategory(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResponseProjection.updateCategory", 0)));
        }
        this.deleteCategory();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResourceResponseProjection.addCategoryResource", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CategoryResourceResponseProjection.addCategoryResource", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResourceResponseProjection.addCategoryResource", 0) + 1);
            this.addCategoryResource(new CategoryResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResourceResponseProjection.addCategoryResource", 0)));
        }
        this.removeCategoryResources();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResourceResponseProjection.moveCategoryResources", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CategoryResourceResponseProjection.moveCategoryResources", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResourceResponseProjection.moveCategoryResources", 0) + 1);
            this.moveCategoryResources(new CategoryResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CategoryResourceResponseProjection.moveCategoryResources", 0)));
        }
        this.dataCenterRoleAppendUser();
        this.updateUserDataCenterPermissions();
        this.updateDataCenterResourceAcls();
        this.batchUpdateDataCenterResourceAcl();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DataCenterRoleResponseProjection.createDataCenterRole", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DataCenterRoleResponseProjection.createDataCenterRole", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DataCenterRoleResponseProjection.createDataCenterRole", 0) + 1);
            this.createDataCenterRole(new DataCenterRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DataCenterRoleResponseProjection.createDataCenterRole", 0)));
        }
        this.deleteDataCenterRole();
        this.updateDataCenterRole();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DepartmentResponseProjection.createDepartment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DepartmentResponseProjection.createDepartment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DepartmentResponseProjection.createDepartment", 0) + 1);
            this.createDepartment(new DepartmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DepartmentResponseProjection.createDepartment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DepartmentResponseProjection.updateDepartment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DepartmentResponseProjection.updateDepartment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DepartmentResponseProjection.updateDepartment", 0) + 1);
            this.updateDepartment(new DepartmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DepartmentResponseProjection.updateDepartment", 0)));
        }
        this.deleteDepartment();
        this.addMembersToDepartment();
        this.updateMemberDataCenterRole();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectResponseProjection.createProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ProjectResponseProjection.createProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectResponseProjection.createProject", 0) + 1);
            this.createProject(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectResponseProjection.createProject", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectResponseProjection.updateProject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ProjectResponseProjection.updateProject", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectResponseProjection.updateProject", 0) + 1);
            this.updateProject(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectResponseProjection.updateProject", 0)));
        }
        this.deleteProject();
        this.addProjectMembers();
        this.removeProjectMembers();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectRoleResponseProjection.createProjectRole", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ProjectRoleResponseProjection.createProjectRole", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectRoleResponseProjection.createProjectRole", 0) + 1);
            this.createProjectRole(new ProjectRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectRoleResponseProjection.createProjectRole", 0)));
        }
        this.deleteProjectRole();
        this.updateProjectRole();
        this.assignUserProjectRole();
        this.transferProjectOwner();
        this.toggleProject();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectDataCtrlResponseProjection.updateProjectDataCtrl", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ProjectDataCtrlResponseProjection.updateProjectDataCtrl", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectDataCtrlResponseProjection.updateProjectDataCtrl", 0) + 1);
            this.updateProjectDataCtrl(new ProjectDataCtrlResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ProjectDataCtrlResponseProjection.updateProjectDataCtrl", 0)));
        }
        this.transferProjectResources();
        this.addMembersToProjectRole();
        this.transferDataCenterOwner();
        this.addMembersToDataCenterRole();
        this.addMemberToProjects();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.WebHookResponseProjection.createWebHook", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.WebHookResponseProjection.createWebHook", projectionDepthOnFields.getOrDefault("MutationResponseProjection.WebHookResponseProjection.createWebHook", 0) + 1);
            this.createWebHook(new WebHookResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.WebHookResponseProjection.createWebHook", 0)));
        }
        this.updateWebHook();
        this.updateWebHookStatus();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.NotificationTaskResponseProjection.createNotificationTask", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.NotificationTaskResponseProjection.createNotificationTask", projectionDepthOnFields.getOrDefault("MutationResponseProjection.NotificationTaskResponseProjection.createNotificationTask", 0) + 1);
            this.createNotificationTask(new NotificationTaskResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.NotificationTaskResponseProjection.createNotificationTask", 0)));
        }
        this.updateNotificationTask();
        this.deleteNotificationTask();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateAccountReplyResponseProjection.createAccount", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateAccountReplyResponseProjection.createAccount", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateAccountReplyResponseProjection.createAccount", 0) + 1);
            this.createAccount(new CreateAccountReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateAccountReplyResponseProjection.createAccount", 0)));
        }
        this.deleteAccount();
        this.resetAccountPassword();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MemberResponseProjection.createMember", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MemberResponseProjection.createMember", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MemberResponseProjection.createMember", 0) + 1);
            this.createMember(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MemberResponseProjection.createMember", 0)));
        }
        this.resetPassword();
        this.updateMember();
        this.createAccountApplication();
        this.acceptAccountApplication();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AccountApplicationSettingResponseProjection.toggleAccountApplicationSetting", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AccountApplicationSettingResponseProjection.toggleAccountApplicationSetting", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AccountApplicationSettingResponseProjection.toggleAccountApplicationSetting", 0) + 1);
            this.toggleAccountApplicationSetting(new AccountApplicationSettingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AccountApplicationSettingResponseProjection.toggleAccountApplicationSetting", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.PasswordRecoverySettingResponseProjection.togglePasswordRecoverySetting", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.PasswordRecoverySettingResponseProjection.togglePasswordRecoverySetting", projectionDepthOnFields.getOrDefault("MutationResponseProjection.PasswordRecoverySettingResponseProjection.togglePasswordRecoverySetting", 0) + 1);
            this.togglePasswordRecoverySetting(new PasswordRecoverySettingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.PasswordRecoverySettingResponseProjection.togglePasswordRecoverySetting", 0)));
        }
        this.updateAccountApplicationSetting();
        this.updatePasswordRecoverySetting();
        this.rejectAccountApplication();
        this.updateAccount();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ElementResponseProjection.createElement", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ElementResponseProjection.createElement", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ElementResponseProjection.createElement", 0) + 1);
            this.createElement(new ElementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ElementResponseProjection.createElement", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ElementResponseProjection.updateElement", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ElementResponseProjection.updateElement", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ElementResponseProjection.updateElement", 0) + 1);
            this.updateElement(new ElementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ElementResponseProjection.updateElement", 0)));
        }
        this.deleteElement();
        this.batchDeleteElements();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.createDataCenterCustomEvent", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CustomEventResponseProjection.createDataCenterCustomEvent", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.createDataCenterCustomEvent", 0) + 1);
            this.createDataCenterCustomEvent(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.createDataCenterCustomEvent", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.updateDataCenterCustomEvent", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CustomEventResponseProjection.updateDataCenterCustomEvent", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.updateDataCenterCustomEvent", 0) + 1);
            this.updateDataCenterCustomEvent(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.updateDataCenterCustomEvent", 0)));
        }
        this.deleteDataCenterCustomEvent();
        this.batchDeleteDataCenterCustomEvents();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ComplexMetricResponseProjection.createComplexMetric", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ComplexMetricResponseProjection.createComplexMetric", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ComplexMetricResponseProjection.createComplexMetric", 0) + 1);
            this.createComplexMetric(new ComplexMetricResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ComplexMetricResponseProjection.createComplexMetric", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ComplexMetricResponseProjection.updateComplexMetric", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ComplexMetricResponseProjection.updateComplexMetric", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ComplexMetricResponseProjection.updateComplexMetric", 0) + 1);
            this.updateComplexMetric(new ComplexMetricResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ComplexMetricResponseProjection.updateComplexMetric", 0)));
        }
        this.deleteComplexMetric();
        this.batchDeleteComplexMetrics();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.createDataCenterEventVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.EventVariableResponseProjection.createDataCenterEventVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.createDataCenterEventVariable", 0) + 1);
            this.createDataCenterEventVariable(new EventVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.createDataCenterEventVariable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.updateDataCenterEventVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.EventVariableResponseProjection.updateDataCenterEventVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.updateDataCenterEventVariable", 0) + 1);
            this.updateDataCenterEventVariable(new EventVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.updateDataCenterEventVariable", 0)));
        }
        this.deleteDataCenterEventVariable();
        this.batchDeleteDataCenterEventVariables();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.updateDataCenterItemVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ItemVariableResponseProjection.updateDataCenterItemVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.updateDataCenterItemVariable", 0) + 1);
            this.updateDataCenterItemVariable(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.updateDataCenterItemVariable", 0)));
        }
        this.deleteDataCenterItemVariable();
        this.batchDeleteDataCenterItemVariables();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.createDataCenterItemModel", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ItemModelResponseProjection.createDataCenterItemModel", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.createDataCenterItemModel", 0) + 1);
            this.createDataCenterItemModel(new ItemModelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.createDataCenterItemModel", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.updateDataCenterItemModel", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ItemModelResponseProjection.updateDataCenterItemModel", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.updateDataCenterItemModel", 0) + 1);
            this.updateDataCenterItemModel(new ItemModelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.updateDataCenterItemModel", 0)));
        }
        this.deleteDataCenterItemModel();
        this.batchDeleteDataCenterItemModels();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.dataCenterAddItemModelAttribute", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ItemVariableResponseProjection.dataCenterAddItemModelAttribute", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.dataCenterAddItemModelAttribute", 0) + 1);
            this.dataCenterAddItemModelAttribute(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.dataCenterAddItemModelAttribute", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.createDataCenterUserVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UserVariableResponseProjection.createDataCenterUserVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.createDataCenterUserVariable", 0) + 1);
            this.createDataCenterUserVariable(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.createDataCenterUserVariable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.updateDataCenterUserVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UserVariableResponseProjection.updateDataCenterUserVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.updateDataCenterUserVariable", 0) + 1);
            this.updateDataCenterUserVariable(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.updateDataCenterUserVariable", 0)));
        }
        this.deleteDataCenterUserVariable();
        this.batchDeleteDataCenterUserVariables();
        this.updateClickhouseView();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.KpiAnalysisResponseProjection.createKpiAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.KpiAnalysisResponseProjection.createKpiAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.KpiAnalysisResponseProjection.createKpiAnalysis", 0) + 1);
            this.createKpiAnalysis(new KpiAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.KpiAnalysisResponseProjection.createKpiAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.KpiAnalysisResponseProjection.updateKpiAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.KpiAnalysisResponseProjection.updateKpiAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.KpiAnalysisResponseProjection.updateKpiAnalysis", 0) + 1);
            this.updateKpiAnalysis(new KpiAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.KpiAnalysisResponseProjection.updateKpiAnalysis", 0)));
        }
        this.deleteKpiAnalysis();
        this.batchDeleteKpiAnalyses();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.FunnelAnalysisResponseProjection.createFunnelAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.FunnelAnalysisResponseProjection.createFunnelAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.FunnelAnalysisResponseProjection.createFunnelAnalysis", 0) + 1);
            this.createFunnelAnalysis(new FunnelAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.FunnelAnalysisResponseProjection.createFunnelAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.FunnelAnalysisResponseProjection.updateFunnelAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.FunnelAnalysisResponseProjection.updateFunnelAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.FunnelAnalysisResponseProjection.updateFunnelAnalysis", 0) + 1);
            this.updateFunnelAnalysis(new FunnelAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.FunnelAnalysisResponseProjection.updateFunnelAnalysis", 0)));
        }
        this.deleteFunnelAnalysis();
        this.batchDeleteFunnelAnalyses();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.FrequencyAnalysisResponseProjection.createFrequencyAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.FrequencyAnalysisResponseProjection.createFrequencyAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.FrequencyAnalysisResponseProjection.createFrequencyAnalysis", 0) + 1);
            this.createFrequencyAnalysis(new FrequencyAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.FrequencyAnalysisResponseProjection.createFrequencyAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.FrequencyAnalysisResponseProjection.updateFrequencyAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.FrequencyAnalysisResponseProjection.updateFrequencyAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.FrequencyAnalysisResponseProjection.updateFrequencyAnalysis", 0) + 1);
            this.updateFrequencyAnalysis(new FrequencyAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.FrequencyAnalysisResponseProjection.updateFrequencyAnalysis", 0)));
        }
        this.deleteFrequencyAnalysis();
        this.batchDeleteFrequencyAnalyses();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.createOlapEventAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.EventAnalysisResponseProjection.createOlapEventAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.createOlapEventAnalysis", 0) + 1);
            this.createOlapEventAnalysis(new EventAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.createOlapEventAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.updateOlapEventAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.EventAnalysisResponseProjection.updateOlapEventAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.updateOlapEventAnalysis", 0) + 1);
            this.updateOlapEventAnalysis(new EventAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.updateOlapEventAnalysis", 0)));
        }
        this.deleteOlapEventAnalysis();
        this.batchDeleteOlapEventAnalyses();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.createEventAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.EventAnalysisResponseProjection.createEventAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.createEventAnalysis", 0) + 1);
            this.createEventAnalysis(new EventAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.createEventAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.updateEventAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.EventAnalysisResponseProjection.updateEventAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.updateEventAnalysis", 0) + 1);
            this.updateEventAnalysis(new EventAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventAnalysisResponseProjection.updateEventAnalysis", 0)));
        }
        this.deleteEventAnalysis();
        this.batchDeleteEventAnalyses();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RetentionAnalysisResponseProjection.createRetentionAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RetentionAnalysisResponseProjection.createRetentionAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RetentionAnalysisResponseProjection.createRetentionAnalysis", 0) + 1);
            this.createRetentionAnalysis(new RetentionAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RetentionAnalysisResponseProjection.createRetentionAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RetentionAnalysisResponseProjection.updateRetentionAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RetentionAnalysisResponseProjection.updateRetentionAnalysis", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RetentionAnalysisResponseProjection.updateRetentionAnalysis", 0) + 1);
            this.updateRetentionAnalysis(new RetentionAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RetentionAnalysisResponseProjection.updateRetentionAnalysis", 0)));
        }
        this.deleteRetentionAnalysis();
        this.batchDeleteRetentionAnalyses();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardResponseProjection.createDashboard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DashboardResponseProjection.createDashboard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardResponseProjection.createDashboard", 0) + 1);
            this.createDashboard(new DashboardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardResponseProjection.createDashboard", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardResponseProjection.updateDashboard", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DashboardResponseProjection.updateDashboard", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardResponseProjection.updateDashboard", 0) + 1);
            this.updateDashboard(new DashboardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardResponseProjection.updateDashboard", 0)));
        }
        this.deleteDashboard();
        this.batchDeleteDashboards();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardCommentResponseProjection.updateDashboardComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DashboardCommentResponseProjection.updateDashboardComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardCommentResponseProjection.updateDashboardComment", 0) + 1);
            this.updateDashboardComment(new DashboardCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardCommentResponseProjection.updateDashboardComment", 0)));
        }
        this.deleteDashboardComment();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardCommentResponseProjection.createDashboardComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DashboardCommentResponseProjection.createDashboardComment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardCommentResponseProjection.createDashboardComment", 0) + 1);
            this.createDashboardComment(new DashboardCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DashboardCommentResponseProjection.createDashboardComment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createFunnelDrillDownSegment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createFunnelDrillDownSegment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createFunnelDrillDownSegment", 0) + 1);
            this.createFunnelDrillDownSegment(new DrillDownSegmentReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createFunnelDrillDownSegment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createRetentionDrillDownSegment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createRetentionDrillDownSegment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createRetentionDrillDownSegment", 0) + 1);
            this.createRetentionDrillDownSegment(new DrillDownSegmentReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createRetentionDrillDownSegment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createFrequencyDrillDownSegment", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createFrequencyDrillDownSegment", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createFrequencyDrillDownSegment", 0) + 1);
            this.createFrequencyDrillDownSegment(new DrillDownSegmentReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentReplyResponseProjection.createFrequencyDrillDownSegment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createFunnelDrillDownSegmentSnapshot", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createFunnelDrillDownSegmentSnapshot", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createFunnelDrillDownSegmentSnapshot", 0) + 1);
            this.createFunnelDrillDownSegmentSnapshot(new DrillDownSegmentSnapshotReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createFunnelDrillDownSegmentSnapshot", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createRetentionDrillDownSegmentSnapshot", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createRetentionDrillDownSegmentSnapshot", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createRetentionDrillDownSegmentSnapshot", 0) + 1);
            this.createRetentionDrillDownSegmentSnapshot(new DrillDownSegmentSnapshotReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createRetentionDrillDownSegmentSnapshot", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createFrequencyDrillDownSegmentSnapshot", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createFrequencyDrillDownSegmentSnapshot", projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createFrequencyDrillDownSegmentSnapshot", 0) + 1);
            this.createFrequencyDrillDownSegmentSnapshot(new DrillDownSegmentSnapshotReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.DrillDownSegmentSnapshotReplyResponseProjection.createFrequencyDrillDownSegmentSnapshot", 0)));
        }
        this.typename();
        return this;
    }

    public MutationResponseProjection settingUtmArguments() {
        return settingUtmArguments((String)null);
    }

    public MutationResponseProjection settingUtmArguments(String alias) {
        fields.add(new GraphQLResponseField("settingUtmArguments").alias(alias));
        return this;
    }

    public MutationResponseProjection settingUtmArguments(MutationSettingUtmArgumentsParametrizedInput input) {
        return settingUtmArguments(null, input);
    }

    public MutationResponseProjection settingUtmArguments(String alias, MutationSettingUtmArgumentsParametrizedInput input) {
        fields.add(new GraphQLResponseField("settingUtmArguments").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection deleteUtmArgument() {
        return deleteUtmArgument((String)null);
    }

    public MutationResponseProjection deleteUtmArgument(String alias) {
        fields.add(new GraphQLResponseField("deleteUtmArgument").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteUtmArgument(MutationDeleteUtmArgumentParametrizedInput input) {
        return deleteUtmArgument(null, input);
    }

    public MutationResponseProjection deleteUtmArgument(String alias, MutationDeleteUtmArgumentParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteUtmArgument").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection settingPersonaMeasurements() {
        return settingPersonaMeasurements((String)null);
    }

    public MutationResponseProjection settingPersonaMeasurements(String alias) {
        fields.add(new GraphQLResponseField("settingPersonaMeasurements").alias(alias));
        return this;
    }

    public MutationResponseProjection settingPersonaMeasurements(MutationSettingPersonaMeasurementsParametrizedInput input) {
        return settingPersonaMeasurements(null, input);
    }

    public MutationResponseProjection settingPersonaMeasurements(String alias, MutationSettingPersonaMeasurementsParametrizedInput input) {
        fields.add(new GraphQLResponseField("settingPersonaMeasurements").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection settingSegmentMeasurements() {
        return settingSegmentMeasurements((String)null);
    }

    public MutationResponseProjection settingSegmentMeasurements(String alias) {
        fields.add(new GraphQLResponseField("settingSegmentMeasurements").alias(alias));
        return this;
    }

    public MutationResponseProjection settingSegmentMeasurements(MutationSettingSegmentMeasurementsParametrizedInput input) {
        return settingSegmentMeasurements(null, input);
    }

    public MutationResponseProjection settingSegmentMeasurements(String alias, MutationSettingSegmentMeasurementsParametrizedInput input) {
        fields.add(new GraphQLResponseField("settingSegmentMeasurements").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateDataCenterInfo() {
        return updateDataCenterInfo((String)null);
    }

    public MutationResponseProjection updateDataCenterInfo(String alias) {
        fields.add(new GraphQLResponseField("updateDataCenterInfo").alias(alias));
        return this;
    }

    public MutationResponseProjection updateDataCenterInfo(MutationUpdateDataCenterInfoParametrizedInput input) {
        return updateDataCenterInfo(null, input);
    }

    public MutationResponseProjection updateDataCenterInfo(String alias, MutationUpdateDataCenterInfoParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateDataCenterInfo").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateOriginDataSetting() {
        return updateOriginDataSetting((String)null);
    }

    public MutationResponseProjection updateOriginDataSetting(String alias) {
        fields.add(new GraphQLResponseField("updateOriginDataSetting").alias(alias));
        return this;
    }

    public MutationResponseProjection updateOriginDataSetting(MutationUpdateOriginDataSettingParametrizedInput input) {
        return updateOriginDataSetting(null, input);
    }

    public MutationResponseProjection updateOriginDataSetting(String alias, MutationUpdateOriginDataSettingParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateOriginDataSetting").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateWaterMarkSetting() {
        return updateWaterMarkSetting((String)null);
    }

    public MutationResponseProjection updateWaterMarkSetting(String alias) {
        fields.add(new GraphQLResponseField("updateWaterMarkSetting").alias(alias));
        return this;
    }

    public MutationResponseProjection updateWaterMarkSetting(MutationUpdateWaterMarkSettingParametrizedInput input) {
        return updateWaterMarkSetting(null, input);
    }

    public MutationResponseProjection updateWaterMarkSetting(String alias, MutationUpdateWaterMarkSettingParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateWaterMarkSetting").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createAnalysisAlert(AnalysisAlertsResponseProjection subProjection) {
        return createAnalysisAlert((String)null, subProjection);
    }

    public MutationResponseProjection createAnalysisAlert(String alias, AnalysisAlertsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createAnalysisAlert").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createAnalysisAlert(MutationCreateAnalysisAlertParametrizedInput input, AnalysisAlertsResponseProjection subProjection) {
        return createAnalysisAlert(null, input, subProjection);
    }

    public MutationResponseProjection createAnalysisAlert(String alias, MutationCreateAnalysisAlertParametrizedInput input, AnalysisAlertsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createAnalysisAlert").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateAnalysisAlert(AnalysisAlertsResponseProjection subProjection) {
        return updateAnalysisAlert((String)null, subProjection);
    }

    public MutationResponseProjection updateAnalysisAlert(String alias, AnalysisAlertsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateAnalysisAlert").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateAnalysisAlert(MutationUpdateAnalysisAlertParametrizedInput input, AnalysisAlertsResponseProjection subProjection) {
        return updateAnalysisAlert(null, input, subProjection);
    }

    public MutationResponseProjection updateAnalysisAlert(String alias, MutationUpdateAnalysisAlertParametrizedInput input, AnalysisAlertsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateAnalysisAlert").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteAnalysisAlert() {
        return deleteAnalysisAlert((String)null);
    }

    public MutationResponseProjection deleteAnalysisAlert(String alias) {
        fields.add(new GraphQLResponseField("deleteAnalysisAlert").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteAnalysisAlert(MutationDeleteAnalysisAlertParametrizedInput input) {
        return deleteAnalysisAlert(null, input);
    }

    public MutationResponseProjection deleteAnalysisAlert(String alias, MutationDeleteAnalysisAlertParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteAnalysisAlert").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection deleteAnalysisAlerts() {
        return deleteAnalysisAlerts((String)null);
    }

    public MutationResponseProjection deleteAnalysisAlerts(String alias) {
        fields.add(new GraphQLResponseField("deleteAnalysisAlerts").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteAnalysisAlerts(MutationDeleteAnalysisAlertsParametrizedInput input) {
        return deleteAnalysisAlerts(null, input);
    }

    public MutationResponseProjection deleteAnalysisAlerts(String alias, MutationDeleteAnalysisAlertsParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteAnalysisAlerts").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection forceComputeTag() {
        return forceComputeTag((String)null);
    }

    public MutationResponseProjection forceComputeTag(String alias) {
        fields.add(new GraphQLResponseField("forceComputeTag").alias(alias));
        return this;
    }

    public MutationResponseProjection forceComputeTag(MutationForceComputeTagParametrizedInput input) {
        return forceComputeTag(null, input);
    }

    public MutationResponseProjection forceComputeTag(String alias, MutationForceComputeTagParametrizedInput input) {
        fields.add(new GraphQLResponseField("forceComputeTag").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection forceComputeSegment() {
        return forceComputeSegment((String)null);
    }

    public MutationResponseProjection forceComputeSegment(String alias) {
        fields.add(new GraphQLResponseField("forceComputeSegment").alias(alias));
        return this;
    }

    public MutationResponseProjection forceComputeSegment(MutationForceComputeSegmentParametrizedInput input) {
        return forceComputeSegment(null, input);
    }

    public MutationResponseProjection forceComputeSegment(String alias, MutationForceComputeSegmentParametrizedInput input) {
        fields.add(new GraphQLResponseField("forceComputeSegment").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createDataCenterTag(TagResponseProjection subProjection) {
        return createDataCenterTag((String)null, subProjection);
    }

    public MutationResponseProjection createDataCenterTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterTag").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDataCenterTag(MutationCreateDataCenterTagParametrizedInput input, TagResponseProjection subProjection) {
        return createDataCenterTag(null, input, subProjection);
    }

    public MutationResponseProjection createDataCenterTag(String alias, MutationCreateDataCenterTagParametrizedInput input, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterTag").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDataCenterTag() {
        return deleteDataCenterTag((String)null);
    }

    public MutationResponseProjection deleteDataCenterTag(String alias) {
        fields.add(new GraphQLResponseField("deleteDataCenterTag").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDataCenterTag(MutationDeleteDataCenterTagParametrizedInput input) {
        return deleteDataCenterTag(null, input);
    }

    public MutationResponseProjection deleteDataCenterTag(String alias, MutationDeleteDataCenterTagParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDataCenterTag").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateDataCenterTag(TagResponseProjection subProjection) {
        return updateDataCenterTag((String)null, subProjection);
    }

    public MutationResponseProjection updateDataCenterTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterTag").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterTag(MutationUpdateDataCenterTagParametrizedInput input, TagResponseProjection subProjection) {
        return updateDataCenterTag(null, input, subProjection);
    }

    public MutationResponseProjection updateDataCenterTag(String alias, MutationUpdateDataCenterTagParametrizedInput input, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterTag").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterTags() {
        return batchDeleteDataCenterTags((String)null);
    }

    public MutationResponseProjection batchDeleteDataCenterTags(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterTags").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterTags(MutationBatchDeleteDataCenterTagsParametrizedInput input) {
        return batchDeleteDataCenterTags(null, input);
    }

    public MutationResponseProjection batchDeleteDataCenterTags(String alias, MutationBatchDeleteDataCenterTagsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterTags").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createSegment(SegmentResponseProjection subProjection) {
        return createSegment((String)null, subProjection);
    }

    public MutationResponseProjection createSegment(String alias, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createSegment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createSegment(MutationCreateSegmentParametrizedInput input, SegmentResponseProjection subProjection) {
        return createSegment(null, input, subProjection);
    }

    public MutationResponseProjection createSegment(String alias, MutationCreateSegmentParametrizedInput input, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createSegment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteSegment() {
        return deleteSegment((String)null);
    }

    public MutationResponseProjection deleteSegment(String alias) {
        fields.add(new GraphQLResponseField("deleteSegment").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteSegment(MutationDeleteSegmentParametrizedInput input) {
        return deleteSegment(null, input);
    }

    public MutationResponseProjection deleteSegment(String alias, MutationDeleteSegmentParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteSegment").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateSegment(SegmentResponseProjection subProjection) {
        return updateSegment((String)null, subProjection);
    }

    public MutationResponseProjection updateSegment(String alias, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateSegment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateSegment(MutationUpdateSegmentParametrizedInput input, SegmentResponseProjection subProjection) {
        return updateSegment(null, input, subProjection);
    }

    public MutationResponseProjection updateSegment(String alias, MutationUpdateSegmentParametrizedInput input, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateSegment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection batchDeleteSegments() {
        return batchDeleteSegments((String)null);
    }

    public MutationResponseProjection batchDeleteSegments(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteSegments").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteSegments(MutationBatchDeleteSegmentsParametrizedInput input) {
        return batchDeleteSegments(null, input);
    }

    public MutationResponseProjection batchDeleteSegments(String alias, MutationBatchDeleteSegmentsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteSegments").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createSegmentSnapshot(SegmentSnapshotResponseProjection subProjection) {
        return createSegmentSnapshot((String)null, subProjection);
    }

    public MutationResponseProjection createSegmentSnapshot(String alias, SegmentSnapshotResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createSegmentSnapshot").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createSegmentSnapshot(MutationCreateSegmentSnapshotParametrizedInput input, SegmentSnapshotResponseProjection subProjection) {
        return createSegmentSnapshot(null, input, subProjection);
    }

    public MutationResponseProjection createSegmentSnapshot(String alias, MutationCreateSegmentSnapshotParametrizedInput input, SegmentSnapshotResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createSegmentSnapshot").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createTencentPortrait(TencentPortraitResponseProjection subProjection) {
        return createTencentPortrait((String)null, subProjection);
    }

    public MutationResponseProjection createTencentPortrait(String alias, TencentPortraitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createTencentPortrait").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createTencentPortrait(MutationCreateTencentPortraitParametrizedInput input, TencentPortraitResponseProjection subProjection) {
        return createTencentPortrait(null, input, subProjection);
    }

    public MutationResponseProjection createTencentPortrait(String alias, MutationCreateTencentPortraitParametrizedInput input, TencentPortraitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createTencentPortrait").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateTencentPortrait(TencentPortraitResponseProjection subProjection) {
        return updateTencentPortrait((String)null, subProjection);
    }

    public MutationResponseProjection updateTencentPortrait(String alias, TencentPortraitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateTencentPortrait").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateTencentPortrait(MutationUpdateTencentPortraitParametrizedInput input, TencentPortraitResponseProjection subProjection) {
        return updateTencentPortrait(null, input, subProjection);
    }

    public MutationResponseProjection updateTencentPortrait(String alias, MutationUpdateTencentPortraitParametrizedInput input, TencentPortraitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateTencentPortrait").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteTencentPortrait() {
        return deleteTencentPortrait((String)null);
    }

    public MutationResponseProjection deleteTencentPortrait(String alias) {
        fields.add(new GraphQLResponseField("deleteTencentPortrait").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteTencentPortrait(MutationDeleteTencentPortraitParametrizedInput input) {
        return deleteTencentPortrait(null, input);
    }

    public MutationResponseProjection deleteTencentPortrait(String alias, MutationDeleteTencentPortraitParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteTencentPortrait").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteTencentPortrait() {
        return batchDeleteTencentPortrait((String)null);
    }

    public MutationResponseProjection batchDeleteTencentPortrait(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteTencentPortrait").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteTencentPortrait(MutationBatchDeleteTencentPortraitParametrizedInput input) {
        return batchDeleteTencentPortrait(null, input);
    }

    public MutationResponseProjection batchDeleteTencentPortrait(String alias, MutationBatchDeleteTencentPortraitParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteTencentPortrait").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection deleteTunnel() {
        return deleteTunnel((String)null);
    }

    public MutationResponseProjection deleteTunnel(String alias) {
        fields.add(new GraphQLResponseField("deleteTunnel").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteTunnel(MutationDeleteTunnelParametrizedInput input) {
        return deleteTunnel(null, input);
    }

    public MutationResponseProjection deleteTunnel(String alias, MutationDeleteTunnelParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteTunnel").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createTunnel(TunnelResponseProjection subProjection) {
        return createTunnel((String)null, subProjection);
    }

    public MutationResponseProjection createTunnel(String alias, TunnelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createTunnel").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createTunnel(MutationCreateTunnelParametrizedInput input, TunnelResponseProjection subProjection) {
        return createTunnel(null, input, subProjection);
    }

    public MutationResponseProjection createTunnel(String alias, MutationCreateTunnelParametrizedInput input, TunnelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createTunnel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateTunnel(TunnelResponseProjection subProjection) {
        return updateTunnel((String)null, subProjection);
    }

    public MutationResponseProjection updateTunnel(String alias, TunnelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateTunnel").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateTunnel(MutationUpdateTunnelParametrizedInput input, TunnelResponseProjection subProjection) {
        return updateTunnel(null, input, subProjection);
    }

    public MutationResponseProjection updateTunnel(String alias, MutationUpdateTunnelParametrizedInput input, TunnelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateTunnel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection batchDeleteTunnels() {
        return batchDeleteTunnels((String)null);
    }

    public MutationResponseProjection batchDeleteTunnels(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteTunnels").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteTunnels(MutationBatchDeleteTunnelsParametrizedInput input) {
        return batchDeleteTunnels(null, input);
    }

    public MutationResponseProjection batchDeleteTunnels(String alias, MutationBatchDeleteTunnelsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteTunnels").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection syncUbaCustomEvent(CustomEventResponseProjection subProjection) {
        return syncUbaCustomEvent((String)null, subProjection);
    }

    public MutationResponseProjection syncUbaCustomEvent(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("syncUbaCustomEvent").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection syncUbaCustomEvent(MutationSyncUbaCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        return syncUbaCustomEvent(null, input, subProjection);
    }

    public MutationResponseProjection syncUbaCustomEvent(String alias, MutationSyncUbaCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("syncUbaCustomEvent").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection syncUbaUserVariable(UserVariableResponseProjection subProjection) {
        return syncUbaUserVariable((String)null, subProjection);
    }

    public MutationResponseProjection syncUbaUserVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("syncUbaUserVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection syncUbaUserVariable(MutationSyncUbaUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        return syncUbaUserVariable(null, input, subProjection);
    }

    public MutationResponseProjection syncUbaUserVariable(String alias, MutationSyncUbaUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("syncUbaUserVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection executeJob(JobResultResponseProjection subProjection) {
        return executeJob((String)null, subProjection);
    }

    public MutationResponseProjection executeJob(String alias, JobResultResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("executeJob").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection executeJob(MutationExecuteJobParametrizedInput input, JobResultResponseProjection subProjection) {
        return executeJob(null, input, subProjection);
    }

    public MutationResponseProjection executeJob(String alias, MutationExecuteJobParametrizedInput input, JobResultResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("executeJob").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createEventImportJob(EventImportJobResponseProjection subProjection) {
        return createEventImportJob((String)null, subProjection);
    }

    public MutationResponseProjection createEventImportJob(String alias, EventImportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createEventImportJob").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createEventImportJob(MutationCreateEventImportJobParametrizedInput input, EventImportJobResponseProjection subProjection) {
        return createEventImportJob(null, input, subProjection);
    }

    public MutationResponseProjection createEventImportJob(String alias, MutationCreateEventImportJobParametrizedInput input, EventImportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createEventImportJob").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitTagUserExportJob(TagUserExportJobResponseProjection subProjection) {
        return submitTagUserExportJob((String)null, subProjection);
    }

    public MutationResponseProjection submitTagUserExportJob(String alias, TagUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitTagUserExportJob").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitTagUserExportJob(MutationSubmitTagUserExportJobParametrizedInput input, TagUserExportJobResponseProjection subProjection) {
        return submitTagUserExportJob(null, input, subProjection);
    }

    public MutationResponseProjection submitTagUserExportJob(String alias, MutationSubmitTagUserExportJobParametrizedInput input, TagUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitTagUserExportJob").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitTagUserExportJobByKey(TagUserExportJobResponseProjection subProjection) {
        return submitTagUserExportJobByKey((String)null, subProjection);
    }

    public MutationResponseProjection submitTagUserExportJobByKey(String alias, TagUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitTagUserExportJobByKey").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitTagUserExportJobByKey(MutationSubmitTagUserExportJobByKeyParametrizedInput input, TagUserExportJobResponseProjection subProjection) {
        return submitTagUserExportJobByKey(null, input, subProjection);
    }

    public MutationResponseProjection submitTagUserExportJobByKey(String alias, MutationSubmitTagUserExportJobByKeyParametrizedInput input, TagUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitTagUserExportJobByKey").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitSegmentUserExportJob(SegmentUserExportJobResponseProjection subProjection) {
        return submitSegmentUserExportJob((String)null, subProjection);
    }

    public MutationResponseProjection submitSegmentUserExportJob(String alias, SegmentUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitSegmentUserExportJob").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitSegmentUserExportJob(MutationSubmitSegmentUserExportJobParametrizedInput input, SegmentUserExportJobResponseProjection subProjection) {
        return submitSegmentUserExportJob(null, input, subProjection);
    }

    public MutationResponseProjection submitSegmentUserExportJob(String alias, MutationSubmitSegmentUserExportJobParametrizedInput input, SegmentUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitSegmentUserExportJob").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitSegmentSnapshotUserExportJob(SegmentUserExportJobResponseProjection subProjection) {
        return submitSegmentSnapshotUserExportJob((String)null, subProjection);
    }

    public MutationResponseProjection submitSegmentSnapshotUserExportJob(String alias, SegmentUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitSegmentSnapshotUserExportJob").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitSegmentSnapshotUserExportJob(MutationSubmitSegmentSnapshotUserExportJobParametrizedInput input, SegmentUserExportJobResponseProjection subProjection) {
        return submitSegmentSnapshotUserExportJob(null, input, subProjection);
    }

    public MutationResponseProjection submitSegmentSnapshotUserExportJob(String alias, MutationSubmitSegmentSnapshotUserExportJobParametrizedInput input, SegmentUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitSegmentSnapshotUserExportJob").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitSegmentUserExportJobV2(SegmentUserExportJobResponseProjection subProjection) {
        return submitSegmentUserExportJobV2((String)null, subProjection);
    }

    public MutationResponseProjection submitSegmentUserExportJobV2(String alias, SegmentUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitSegmentUserExportJobV2").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitSegmentUserExportJobV2(MutationSubmitSegmentUserExportJobV2ParametrizedInput input, SegmentUserExportJobResponseProjection subProjection) {
        return submitSegmentUserExportJobV2(null, input, subProjection);
    }

    public MutationResponseProjection submitSegmentUserExportJobV2(String alias, MutationSubmitSegmentUserExportJobV2ParametrizedInput input, SegmentUserExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitSegmentUserExportJobV2").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitAnalysisExportJob(AnalysisExportJobResponseProjection subProjection) {
        return submitAnalysisExportJob((String)null, subProjection);
    }

    public MutationResponseProjection submitAnalysisExportJob(String alias, AnalysisExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitAnalysisExportJob").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitAnalysisExportJob(MutationSubmitAnalysisExportJobParametrizedInput input, AnalysisExportJobResponseProjection subProjection) {
        return submitAnalysisExportJob(null, input, subProjection);
    }

    public MutationResponseProjection submitAnalysisExportJob(String alias, MutationSubmitAnalysisExportJobParametrizedInput input, AnalysisExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitAnalysisExportJob").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitCreateTableJob(CreateTableJobResponseProjection subProjection) {
        return submitCreateTableJob((String)null, subProjection);
    }

    public MutationResponseProjection submitCreateTableJob(String alias, CreateTableJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitCreateTableJob").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitCreateTableJob(MutationSubmitCreateTableJobParametrizedInput input, CreateTableJobResponseProjection subProjection) {
        return submitCreateTableJob(null, input, subProjection);
    }

    public MutationResponseProjection submitCreateTableJob(String alias, MutationSubmitCreateTableJobParametrizedInput input, CreateTableJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitCreateTableJob").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitLogExportJob(AuditLogExportJobResponseProjection subProjection) {
        return submitLogExportJob((String)null, subProjection);
    }

    public MutationResponseProjection submitLogExportJob(String alias, AuditLogExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitLogExportJob").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection submitLogExportJob(MutationSubmitLogExportJobParametrizedInput input, AuditLogExportJobResponseProjection subProjection) {
        return submitLogExportJob(null, input, subProjection);
    }

    public MutationResponseProjection submitLogExportJob(String alias, MutationSubmitLogExportJobParametrizedInput input, AuditLogExportJobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("submitLogExportJob").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createSubscription() {
        return createSubscription((String)null);
    }

    public MutationResponseProjection createSubscription(String alias) {
        fields.add(new GraphQLResponseField("createSubscription").alias(alias));
        return this;
    }

    public MutationResponseProjection createSubscription(MutationCreateSubscriptionParametrizedInput input) {
        return createSubscription(null, input);
    }

    public MutationResponseProjection createSubscription(String alias, MutationCreateSubscriptionParametrizedInput input) {
        fields.add(new GraphQLResponseField("createSubscription").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection deleteSubscription() {
        return deleteSubscription((String)null);
    }

    public MutationResponseProjection deleteSubscription(String alias) {
        fields.add(new GraphQLResponseField("deleteSubscription").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteSubscription(MutationDeleteSubscriptionParametrizedInput input) {
        return deleteSubscription(null, input);
    }

    public MutationResponseProjection deleteSubscription(String alias, MutationDeleteSubscriptionParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteSubscription").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchUpdateSubscriptions() {
        return batchUpdateSubscriptions((String)null);
    }

    public MutationResponseProjection batchUpdateSubscriptions(String alias) {
        fields.add(new GraphQLResponseField("batchUpdateSubscriptions").alias(alias));
        return this;
    }

    public MutationResponseProjection batchUpdateSubscriptions(MutationBatchUpdateSubscriptionsParametrizedInput input) {
        return batchUpdateSubscriptions(null, input);
    }

    public MutationResponseProjection batchUpdateSubscriptions(String alias, MutationBatchUpdateSubscriptionsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchUpdateSubscriptions").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createCategory(CategoryResponseProjection subProjection) {
        return createCategory((String)null, subProjection);
    }

    public MutationResponseProjection createCategory(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createCategory").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createCategory(MutationCreateCategoryParametrizedInput input, CategoryResponseProjection subProjection) {
        return createCategory(null, input, subProjection);
    }

    public MutationResponseProjection createCategory(String alias, MutationCreateCategoryParametrizedInput input, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createCategory").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateCategory(CategoryResponseProjection subProjection) {
        return updateCategory((String)null, subProjection);
    }

    public MutationResponseProjection updateCategory(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateCategory").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateCategory(MutationUpdateCategoryParametrizedInput input, CategoryResponseProjection subProjection) {
        return updateCategory(null, input, subProjection);
    }

    public MutationResponseProjection updateCategory(String alias, MutationUpdateCategoryParametrizedInput input, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateCategory").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteCategory() {
        return deleteCategory((String)null);
    }

    public MutationResponseProjection deleteCategory(String alias) {
        fields.add(new GraphQLResponseField("deleteCategory").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteCategory(MutationDeleteCategoryParametrizedInput input) {
        return deleteCategory(null, input);
    }

    public MutationResponseProjection deleteCategory(String alias, MutationDeleteCategoryParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteCategory").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection addCategoryResource(CategoryResourceResponseProjection subProjection) {
        return addCategoryResource((String)null, subProjection);
    }

    public MutationResponseProjection addCategoryResource(String alias, CategoryResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addCategoryResource").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addCategoryResource(MutationAddCategoryResourceParametrizedInput input, CategoryResourceResponseProjection subProjection) {
        return addCategoryResource(null, input, subProjection);
    }

    public MutationResponseProjection addCategoryResource(String alias, MutationAddCategoryResourceParametrizedInput input, CategoryResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addCategoryResource").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection removeCategoryResources() {
        return removeCategoryResources((String)null);
    }

    public MutationResponseProjection removeCategoryResources(String alias) {
        fields.add(new GraphQLResponseField("removeCategoryResources").alias(alias));
        return this;
    }

    public MutationResponseProjection removeCategoryResources(MutationRemoveCategoryResourcesParametrizedInput input) {
        return removeCategoryResources(null, input);
    }

    public MutationResponseProjection removeCategoryResources(String alias, MutationRemoveCategoryResourcesParametrizedInput input) {
        fields.add(new GraphQLResponseField("removeCategoryResources").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection moveCategoryResources(CategoryResourceResponseProjection subProjection) {
        return moveCategoryResources((String)null, subProjection);
    }

    public MutationResponseProjection moveCategoryResources(String alias, CategoryResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("moveCategoryResources").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection moveCategoryResources(MutationMoveCategoryResourcesParametrizedInput input, CategoryResourceResponseProjection subProjection) {
        return moveCategoryResources(null, input, subProjection);
    }

    public MutationResponseProjection moveCategoryResources(String alias, MutationMoveCategoryResourcesParametrizedInput input, CategoryResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("moveCategoryResources").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection dataCenterRoleAppendUser() {
        return dataCenterRoleAppendUser((String)null);
    }

    public MutationResponseProjection dataCenterRoleAppendUser(String alias) {
        fields.add(new GraphQLResponseField("dataCenterRoleAppendUser").alias(alias));
        return this;
    }

    public MutationResponseProjection dataCenterRoleAppendUser(MutationDataCenterRoleAppendUserParametrizedInput input) {
        return dataCenterRoleAppendUser(null, input);
    }

    public MutationResponseProjection dataCenterRoleAppendUser(String alias, MutationDataCenterRoleAppendUserParametrizedInput input) {
        fields.add(new GraphQLResponseField("dataCenterRoleAppendUser").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateUserDataCenterPermissions() {
        return updateUserDataCenterPermissions((String)null);
    }

    public MutationResponseProjection updateUserDataCenterPermissions(String alias) {
        fields.add(new GraphQLResponseField("updateUserDataCenterPermissions").alias(alias));
        return this;
    }

    public MutationResponseProjection updateUserDataCenterPermissions(MutationUpdateUserDataCenterPermissionsParametrizedInput input) {
        return updateUserDataCenterPermissions(null, input);
    }

    public MutationResponseProjection updateUserDataCenterPermissions(String alias, MutationUpdateUserDataCenterPermissionsParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateUserDataCenterPermissions").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateDataCenterResourceAcls() {
        return updateDataCenterResourceAcls((String)null);
    }

    public MutationResponseProjection updateDataCenterResourceAcls(String alias) {
        fields.add(new GraphQLResponseField("updateDataCenterResourceAcls").alias(alias));
        return this;
    }

    public MutationResponseProjection updateDataCenterResourceAcls(MutationUpdateDataCenterResourceAclsParametrizedInput input) {
        return updateDataCenterResourceAcls(null, input);
    }

    public MutationResponseProjection updateDataCenterResourceAcls(String alias, MutationUpdateDataCenterResourceAclsParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateDataCenterResourceAcls").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchUpdateDataCenterResourceAcl() {
        return batchUpdateDataCenterResourceAcl((String)null);
    }

    public MutationResponseProjection batchUpdateDataCenterResourceAcl(String alias) {
        fields.add(new GraphQLResponseField("batchUpdateDataCenterResourceAcl").alias(alias));
        return this;
    }

    public MutationResponseProjection batchUpdateDataCenterResourceAcl(MutationBatchUpdateDataCenterResourceAclParametrizedInput input) {
        return batchUpdateDataCenterResourceAcl(null, input);
    }

    public MutationResponseProjection batchUpdateDataCenterResourceAcl(String alias, MutationBatchUpdateDataCenterResourceAclParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchUpdateDataCenterResourceAcl").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createDataCenterRole(DataCenterRoleResponseProjection subProjection) {
        return createDataCenterRole((String)null, subProjection);
    }

    public MutationResponseProjection createDataCenterRole(String alias, DataCenterRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterRole").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDataCenterRole(MutationCreateDataCenterRoleParametrizedInput input, DataCenterRoleResponseProjection subProjection) {
        return createDataCenterRole(null, input, subProjection);
    }

    public MutationResponseProjection createDataCenterRole(String alias, MutationCreateDataCenterRoleParametrizedInput input, DataCenterRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterRole").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDataCenterRole() {
        return deleteDataCenterRole((String)null);
    }

    public MutationResponseProjection deleteDataCenterRole(String alias) {
        fields.add(new GraphQLResponseField("deleteDataCenterRole").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDataCenterRole(MutationDeleteDataCenterRoleParametrizedInput input) {
        return deleteDataCenterRole(null, input);
    }

    public MutationResponseProjection deleteDataCenterRole(String alias, MutationDeleteDataCenterRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDataCenterRole").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateDataCenterRole() {
        return updateDataCenterRole((String)null);
    }

    public MutationResponseProjection updateDataCenterRole(String alias) {
        fields.add(new GraphQLResponseField("updateDataCenterRole").alias(alias));
        return this;
    }

    public MutationResponseProjection updateDataCenterRole(MutationUpdateDataCenterRoleParametrizedInput input) {
        return updateDataCenterRole(null, input);
    }

    public MutationResponseProjection updateDataCenterRole(String alias, MutationUpdateDataCenterRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateDataCenterRole").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createDepartment(DepartmentResponseProjection subProjection) {
        return createDepartment((String)null, subProjection);
    }

    public MutationResponseProjection createDepartment(String alias, DepartmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDepartment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDepartment(MutationCreateDepartmentParametrizedInput input, DepartmentResponseProjection subProjection) {
        return createDepartment(null, input, subProjection);
    }

    public MutationResponseProjection createDepartment(String alias, MutationCreateDepartmentParametrizedInput input, DepartmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDepartment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDepartment(DepartmentResponseProjection subProjection) {
        return updateDepartment((String)null, subProjection);
    }

    public MutationResponseProjection updateDepartment(String alias, DepartmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDepartment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDepartment(MutationUpdateDepartmentParametrizedInput input, DepartmentResponseProjection subProjection) {
        return updateDepartment(null, input, subProjection);
    }

    public MutationResponseProjection updateDepartment(String alias, MutationUpdateDepartmentParametrizedInput input, DepartmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDepartment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDepartment() {
        return deleteDepartment((String)null);
    }

    public MutationResponseProjection deleteDepartment(String alias) {
        fields.add(new GraphQLResponseField("deleteDepartment").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDepartment(MutationDeleteDepartmentParametrizedInput input) {
        return deleteDepartment(null, input);
    }

    public MutationResponseProjection deleteDepartment(String alias, MutationDeleteDepartmentParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDepartment").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection addMembersToDepartment() {
        return addMembersToDepartment((String)null);
    }

    public MutationResponseProjection addMembersToDepartment(String alias) {
        fields.add(new GraphQLResponseField("addMembersToDepartment").alias(alias));
        return this;
    }

    public MutationResponseProjection addMembersToDepartment(MutationAddMembersToDepartmentParametrizedInput input) {
        return addMembersToDepartment(null, input);
    }

    public MutationResponseProjection addMembersToDepartment(String alias, MutationAddMembersToDepartmentParametrizedInput input) {
        fields.add(new GraphQLResponseField("addMembersToDepartment").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateMemberDataCenterRole() {
        return updateMemberDataCenterRole((String)null);
    }

    public MutationResponseProjection updateMemberDataCenterRole(String alias) {
        fields.add(new GraphQLResponseField("updateMemberDataCenterRole").alias(alias));
        return this;
    }

    public MutationResponseProjection updateMemberDataCenterRole(MutationUpdateMemberDataCenterRoleParametrizedInput input) {
        return updateMemberDataCenterRole(null, input);
    }

    public MutationResponseProjection updateMemberDataCenterRole(String alias, MutationUpdateMemberDataCenterRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateMemberDataCenterRole").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createProject(ProjectResponseProjection subProjection) {
        return createProject((String)null, subProjection);
    }

    public MutationResponseProjection createProject(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createProject").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createProject(MutationCreateProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        return createProject(null, input, subProjection);
    }

    public MutationResponseProjection createProject(String alias, MutationCreateProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createProject").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateProject(ProjectResponseProjection subProjection) {
        return updateProject((String)null, subProjection);
    }

    public MutationResponseProjection updateProject(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProject").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateProject(MutationUpdateProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        return updateProject(null, input, subProjection);
    }

    public MutationResponseProjection updateProject(String alias, MutationUpdateProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProject").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteProject() {
        return deleteProject((String)null);
    }

    public MutationResponseProjection deleteProject(String alias) {
        fields.add(new GraphQLResponseField("deleteProject").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteProject(MutationDeleteProjectParametrizedInput input) {
        return deleteProject(null, input);
    }

    public MutationResponseProjection deleteProject(String alias, MutationDeleteProjectParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteProject").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection addProjectMembers() {
        return addProjectMembers((String)null);
    }

    public MutationResponseProjection addProjectMembers(String alias) {
        fields.add(new GraphQLResponseField("addProjectMembers").alias(alias));
        return this;
    }

    public MutationResponseProjection addProjectMembers(MutationAddProjectMembersParametrizedInput input) {
        return addProjectMembers(null, input);
    }

    public MutationResponseProjection addProjectMembers(String alias, MutationAddProjectMembersParametrizedInput input) {
        fields.add(new GraphQLResponseField("addProjectMembers").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection removeProjectMembers() {
        return removeProjectMembers((String)null);
    }

    public MutationResponseProjection removeProjectMembers(String alias) {
        fields.add(new GraphQLResponseField("removeProjectMembers").alias(alias));
        return this;
    }

    public MutationResponseProjection removeProjectMembers(MutationRemoveProjectMembersParametrizedInput input) {
        return removeProjectMembers(null, input);
    }

    public MutationResponseProjection removeProjectMembers(String alias, MutationRemoveProjectMembersParametrizedInput input) {
        fields.add(new GraphQLResponseField("removeProjectMembers").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createProjectRole(ProjectRoleResponseProjection subProjection) {
        return createProjectRole((String)null, subProjection);
    }

    public MutationResponseProjection createProjectRole(String alias, ProjectRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createProjectRole").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createProjectRole(MutationCreateProjectRoleParametrizedInput input, ProjectRoleResponseProjection subProjection) {
        return createProjectRole(null, input, subProjection);
    }

    public MutationResponseProjection createProjectRole(String alias, MutationCreateProjectRoleParametrizedInput input, ProjectRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createProjectRole").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteProjectRole() {
        return deleteProjectRole((String)null);
    }

    public MutationResponseProjection deleteProjectRole(String alias) {
        fields.add(new GraphQLResponseField("deleteProjectRole").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteProjectRole(MutationDeleteProjectRoleParametrizedInput input) {
        return deleteProjectRole(null, input);
    }

    public MutationResponseProjection deleteProjectRole(String alias, MutationDeleteProjectRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteProjectRole").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateProjectRole() {
        return updateProjectRole((String)null);
    }

    public MutationResponseProjection updateProjectRole(String alias) {
        fields.add(new GraphQLResponseField("updateProjectRole").alias(alias));
        return this;
    }

    public MutationResponseProjection updateProjectRole(MutationUpdateProjectRoleParametrizedInput input) {
        return updateProjectRole(null, input);
    }

    public MutationResponseProjection updateProjectRole(String alias, MutationUpdateProjectRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateProjectRole").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection assignUserProjectRole() {
        return assignUserProjectRole((String)null);
    }

    public MutationResponseProjection assignUserProjectRole(String alias) {
        fields.add(new GraphQLResponseField("assignUserProjectRole").alias(alias));
        return this;
    }

    public MutationResponseProjection assignUserProjectRole(MutationAssignUserProjectRoleParametrizedInput input) {
        return assignUserProjectRole(null, input);
    }

    public MutationResponseProjection assignUserProjectRole(String alias, MutationAssignUserProjectRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("assignUserProjectRole").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection transferProjectOwner() {
        return transferProjectOwner((String)null);
    }

    public MutationResponseProjection transferProjectOwner(String alias) {
        fields.add(new GraphQLResponseField("transferProjectOwner").alias(alias));
        return this;
    }

    public MutationResponseProjection transferProjectOwner(MutationTransferProjectOwnerParametrizedInput input) {
        return transferProjectOwner(null, input);
    }

    public MutationResponseProjection transferProjectOwner(String alias, MutationTransferProjectOwnerParametrizedInput input) {
        fields.add(new GraphQLResponseField("transferProjectOwner").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection toggleProject() {
        return toggleProject((String)null);
    }

    public MutationResponseProjection toggleProject(String alias) {
        fields.add(new GraphQLResponseField("toggleProject").alias(alias));
        return this;
    }

    public MutationResponseProjection toggleProject(MutationToggleProjectParametrizedInput input) {
        return toggleProject(null, input);
    }

    public MutationResponseProjection toggleProject(String alias, MutationToggleProjectParametrizedInput input) {
        fields.add(new GraphQLResponseField("toggleProject").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateProjectDataCtrl(ProjectDataCtrlResponseProjection subProjection) {
        return updateProjectDataCtrl((String)null, subProjection);
    }

    public MutationResponseProjection updateProjectDataCtrl(String alias, ProjectDataCtrlResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProjectDataCtrl").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateProjectDataCtrl(MutationUpdateProjectDataCtrlParametrizedInput input, ProjectDataCtrlResponseProjection subProjection) {
        return updateProjectDataCtrl(null, input, subProjection);
    }

    public MutationResponseProjection updateProjectDataCtrl(String alias, MutationUpdateProjectDataCtrlParametrizedInput input, ProjectDataCtrlResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateProjectDataCtrl").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection transferProjectResources() {
        return transferProjectResources((String)null);
    }

    public MutationResponseProjection transferProjectResources(String alias) {
        fields.add(new GraphQLResponseField("transferProjectResources").alias(alias));
        return this;
    }

    public MutationResponseProjection transferProjectResources(MutationTransferProjectResourcesParametrizedInput input) {
        return transferProjectResources(null, input);
    }

    public MutationResponseProjection transferProjectResources(String alias, MutationTransferProjectResourcesParametrizedInput input) {
        fields.add(new GraphQLResponseField("transferProjectResources").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection addMembersToProjectRole() {
        return addMembersToProjectRole((String)null);
    }

    public MutationResponseProjection addMembersToProjectRole(String alias) {
        fields.add(new GraphQLResponseField("addMembersToProjectRole").alias(alias));
        return this;
    }

    public MutationResponseProjection addMembersToProjectRole(MutationAddMembersToProjectRoleParametrizedInput input) {
        return addMembersToProjectRole(null, input);
    }

    public MutationResponseProjection addMembersToProjectRole(String alias, MutationAddMembersToProjectRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("addMembersToProjectRole").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection transferDataCenterOwner() {
        return transferDataCenterOwner((String)null);
    }

    public MutationResponseProjection transferDataCenterOwner(String alias) {
        fields.add(new GraphQLResponseField("transferDataCenterOwner").alias(alias));
        return this;
    }

    public MutationResponseProjection transferDataCenterOwner(MutationTransferDataCenterOwnerParametrizedInput input) {
        return transferDataCenterOwner(null, input);
    }

    public MutationResponseProjection transferDataCenterOwner(String alias, MutationTransferDataCenterOwnerParametrizedInput input) {
        fields.add(new GraphQLResponseField("transferDataCenterOwner").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection addMembersToDataCenterRole() {
        return addMembersToDataCenterRole((String)null);
    }

    public MutationResponseProjection addMembersToDataCenterRole(String alias) {
        fields.add(new GraphQLResponseField("addMembersToDataCenterRole").alias(alias));
        return this;
    }

    public MutationResponseProjection addMembersToDataCenterRole(MutationAddMembersToDataCenterRoleParametrizedInput input) {
        return addMembersToDataCenterRole(null, input);
    }

    public MutationResponseProjection addMembersToDataCenterRole(String alias, MutationAddMembersToDataCenterRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("addMembersToDataCenterRole").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection addMemberToProjects() {
        return addMemberToProjects((String)null);
    }

    public MutationResponseProjection addMemberToProjects(String alias) {
        fields.add(new GraphQLResponseField("addMemberToProjects").alias(alias));
        return this;
    }

    public MutationResponseProjection addMemberToProjects(MutationAddMemberToProjectsParametrizedInput input) {
        return addMemberToProjects(null, input);
    }

    public MutationResponseProjection addMemberToProjects(String alias, MutationAddMemberToProjectsParametrizedInput input) {
        fields.add(new GraphQLResponseField("addMemberToProjects").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createWebHook(WebHookResponseProjection subProjection) {
        return createWebHook((String)null, subProjection);
    }

    public MutationResponseProjection createWebHook(String alias, WebHookResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createWebHook").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createWebHook(MutationCreateWebHookParametrizedInput input, WebHookResponseProjection subProjection) {
        return createWebHook(null, input, subProjection);
    }

    public MutationResponseProjection createWebHook(String alias, MutationCreateWebHookParametrizedInput input, WebHookResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createWebHook").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateWebHook() {
        return updateWebHook((String)null);
    }

    public MutationResponseProjection updateWebHook(String alias) {
        fields.add(new GraphQLResponseField("updateWebHook").alias(alias));
        return this;
    }

    public MutationResponseProjection updateWebHook(MutationUpdateWebHookParametrizedInput input) {
        return updateWebHook(null, input);
    }

    public MutationResponseProjection updateWebHook(String alias, MutationUpdateWebHookParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateWebHook").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateWebHookStatus() {
        return updateWebHookStatus((String)null);
    }

    public MutationResponseProjection updateWebHookStatus(String alias) {
        fields.add(new GraphQLResponseField("updateWebHookStatus").alias(alias));
        return this;
    }

    public MutationResponseProjection updateWebHookStatus(MutationUpdateWebHookStatusParametrizedInput input) {
        return updateWebHookStatus(null, input);
    }

    public MutationResponseProjection updateWebHookStatus(String alias, MutationUpdateWebHookStatusParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateWebHookStatus").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createNotificationTask(NotificationTaskResponseProjection subProjection) {
        return createNotificationTask((String)null, subProjection);
    }

    public MutationResponseProjection createNotificationTask(String alias, NotificationTaskResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createNotificationTask").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createNotificationTask(MutationCreateNotificationTaskParametrizedInput input, NotificationTaskResponseProjection subProjection) {
        return createNotificationTask(null, input, subProjection);
    }

    public MutationResponseProjection createNotificationTask(String alias, MutationCreateNotificationTaskParametrizedInput input, NotificationTaskResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createNotificationTask").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateNotificationTask() {
        return updateNotificationTask((String)null);
    }

    public MutationResponseProjection updateNotificationTask(String alias) {
        fields.add(new GraphQLResponseField("updateNotificationTask").alias(alias));
        return this;
    }

    public MutationResponseProjection updateNotificationTask(MutationUpdateNotificationTaskParametrizedInput input) {
        return updateNotificationTask(null, input);
    }

    public MutationResponseProjection updateNotificationTask(String alias, MutationUpdateNotificationTaskParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateNotificationTask").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection deleteNotificationTask() {
        return deleteNotificationTask((String)null);
    }

    public MutationResponseProjection deleteNotificationTask(String alias) {
        fields.add(new GraphQLResponseField("deleteNotificationTask").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteNotificationTask(MutationDeleteNotificationTaskParametrizedInput input) {
        return deleteNotificationTask(null, input);
    }

    public MutationResponseProjection deleteNotificationTask(String alias, MutationDeleteNotificationTaskParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteNotificationTask").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createAccount(CreateAccountReplyResponseProjection subProjection) {
        return createAccount((String)null, subProjection);
    }

    public MutationResponseProjection createAccount(String alias, CreateAccountReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createAccount").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createAccount(MutationCreateAccountParametrizedInput input, CreateAccountReplyResponseProjection subProjection) {
        return createAccount(null, input, subProjection);
    }

    public MutationResponseProjection createAccount(String alias, MutationCreateAccountParametrizedInput input, CreateAccountReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createAccount").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteAccount() {
        return deleteAccount((String)null);
    }

    public MutationResponseProjection deleteAccount(String alias) {
        fields.add(new GraphQLResponseField("deleteAccount").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteAccount(MutationDeleteAccountParametrizedInput input) {
        return deleteAccount(null, input);
    }

    public MutationResponseProjection deleteAccount(String alias, MutationDeleteAccountParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteAccount").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection resetAccountPassword() {
        return resetAccountPassword((String)null);
    }

    public MutationResponseProjection resetAccountPassword(String alias) {
        fields.add(new GraphQLResponseField("resetAccountPassword").alias(alias));
        return this;
    }

    public MutationResponseProjection resetAccountPassword(MutationResetAccountPasswordParametrizedInput input) {
        return resetAccountPassword(null, input);
    }

    public MutationResponseProjection resetAccountPassword(String alias, MutationResetAccountPasswordParametrizedInput input) {
        fields.add(new GraphQLResponseField("resetAccountPassword").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createMember(MemberResponseProjection subProjection) {
        return createMember((String)null, subProjection);
    }

    public MutationResponseProjection createMember(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createMember").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createMember(MutationCreateMemberParametrizedInput input, MemberResponseProjection subProjection) {
        return createMember(null, input, subProjection);
    }

    public MutationResponseProjection createMember(String alias, MutationCreateMemberParametrizedInput input, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createMember").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection resetPassword() {
        return resetPassword((String)null);
    }

    public MutationResponseProjection resetPassword(String alias) {
        fields.add(new GraphQLResponseField("resetPassword").alias(alias));
        return this;
    }

    public MutationResponseProjection resetPassword(MutationResetPasswordParametrizedInput input) {
        return resetPassword(null, input);
    }

    public MutationResponseProjection resetPassword(String alias, MutationResetPasswordParametrizedInput input) {
        fields.add(new GraphQLResponseField("resetPassword").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateMember() {
        return updateMember((String)null);
    }

    public MutationResponseProjection updateMember(String alias) {
        fields.add(new GraphQLResponseField("updateMember").alias(alias));
        return this;
    }

    public MutationResponseProjection updateMember(MutationUpdateMemberParametrizedInput input) {
        return updateMember(null, input);
    }

    public MutationResponseProjection updateMember(String alias, MutationUpdateMemberParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateMember").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createAccountApplication() {
        return createAccountApplication((String)null);
    }

    public MutationResponseProjection createAccountApplication(String alias) {
        fields.add(new GraphQLResponseField("createAccountApplication").alias(alias));
        return this;
    }

    public MutationResponseProjection createAccountApplication(MutationCreateAccountApplicationParametrizedInput input) {
        return createAccountApplication(null, input);
    }

    public MutationResponseProjection createAccountApplication(String alias, MutationCreateAccountApplicationParametrizedInput input) {
        fields.add(new GraphQLResponseField("createAccountApplication").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection acceptAccountApplication() {
        return acceptAccountApplication((String)null);
    }

    public MutationResponseProjection acceptAccountApplication(String alias) {
        fields.add(new GraphQLResponseField("acceptAccountApplication").alias(alias));
        return this;
    }

    public MutationResponseProjection acceptAccountApplication(MutationAcceptAccountApplicationParametrizedInput input) {
        return acceptAccountApplication(null, input);
    }

    public MutationResponseProjection acceptAccountApplication(String alias, MutationAcceptAccountApplicationParametrizedInput input) {
        fields.add(new GraphQLResponseField("acceptAccountApplication").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection toggleAccountApplicationSetting(AccountApplicationSettingResponseProjection subProjection) {
        return toggleAccountApplicationSetting(null, subProjection);
    }

    public MutationResponseProjection toggleAccountApplicationSetting(String alias, AccountApplicationSettingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("toggleAccountApplicationSetting").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection togglePasswordRecoverySetting(PasswordRecoverySettingResponseProjection subProjection) {
        return togglePasswordRecoverySetting(null, subProjection);
    }

    public MutationResponseProjection togglePasswordRecoverySetting(String alias, PasswordRecoverySettingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("togglePasswordRecoverySetting").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateAccountApplicationSetting() {
        return updateAccountApplicationSetting((String)null);
    }

    public MutationResponseProjection updateAccountApplicationSetting(String alias) {
        fields.add(new GraphQLResponseField("updateAccountApplicationSetting").alias(alias));
        return this;
    }

    public MutationResponseProjection updateAccountApplicationSetting(MutationUpdateAccountApplicationSettingParametrizedInput input) {
        return updateAccountApplicationSetting(null, input);
    }

    public MutationResponseProjection updateAccountApplicationSetting(String alias, MutationUpdateAccountApplicationSettingParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateAccountApplicationSetting").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updatePasswordRecoverySetting() {
        return updatePasswordRecoverySetting((String)null);
    }

    public MutationResponseProjection updatePasswordRecoverySetting(String alias) {
        fields.add(new GraphQLResponseField("updatePasswordRecoverySetting").alias(alias));
        return this;
    }

    public MutationResponseProjection updatePasswordRecoverySetting(MutationUpdatePasswordRecoverySettingParametrizedInput input) {
        return updatePasswordRecoverySetting(null, input);
    }

    public MutationResponseProjection updatePasswordRecoverySetting(String alias, MutationUpdatePasswordRecoverySettingParametrizedInput input) {
        fields.add(new GraphQLResponseField("updatePasswordRecoverySetting").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection rejectAccountApplication() {
        return rejectAccountApplication((String)null);
    }

    public MutationResponseProjection rejectAccountApplication(String alias) {
        fields.add(new GraphQLResponseField("rejectAccountApplication").alias(alias));
        return this;
    }

    public MutationResponseProjection rejectAccountApplication(MutationRejectAccountApplicationParametrizedInput input) {
        return rejectAccountApplication(null, input);
    }

    public MutationResponseProjection rejectAccountApplication(String alias, MutationRejectAccountApplicationParametrizedInput input) {
        fields.add(new GraphQLResponseField("rejectAccountApplication").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateAccount() {
        return updateAccount((String)null);
    }

    public MutationResponseProjection updateAccount(String alias) {
        fields.add(new GraphQLResponseField("updateAccount").alias(alias));
        return this;
    }

    public MutationResponseProjection updateAccount(MutationUpdateAccountParametrizedInput input) {
        return updateAccount(null, input);
    }

    public MutationResponseProjection updateAccount(String alias, MutationUpdateAccountParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateAccount").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createElement(ElementResponseProjection subProjection) {
        return createElement((String)null, subProjection);
    }

    public MutationResponseProjection createElement(String alias, ElementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createElement").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createElement(MutationCreateElementParametrizedInput input, ElementResponseProjection subProjection) {
        return createElement(null, input, subProjection);
    }

    public MutationResponseProjection createElement(String alias, MutationCreateElementParametrizedInput input, ElementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createElement").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateElement(ElementResponseProjection subProjection) {
        return updateElement((String)null, subProjection);
    }

    public MutationResponseProjection updateElement(String alias, ElementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateElement").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateElement(MutationUpdateElementParametrizedInput input, ElementResponseProjection subProjection) {
        return updateElement(null, input, subProjection);
    }

    public MutationResponseProjection updateElement(String alias, MutationUpdateElementParametrizedInput input, ElementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateElement").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteElement() {
        return deleteElement((String)null);
    }

    public MutationResponseProjection deleteElement(String alias) {
        fields.add(new GraphQLResponseField("deleteElement").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteElement(MutationDeleteElementParametrizedInput input) {
        return deleteElement(null, input);
    }

    public MutationResponseProjection deleteElement(String alias, MutationDeleteElementParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteElement").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteElements() {
        return batchDeleteElements((String)null);
    }

    public MutationResponseProjection batchDeleteElements(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteElements").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteElements(MutationBatchDeleteElementsParametrizedInput input) {
        return batchDeleteElements(null, input);
    }

    public MutationResponseProjection batchDeleteElements(String alias, MutationBatchDeleteElementsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteElements").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createDataCenterCustomEvent(CustomEventResponseProjection subProjection) {
        return createDataCenterCustomEvent((String)null, subProjection);
    }

    public MutationResponseProjection createDataCenterCustomEvent(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterCustomEvent").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDataCenterCustomEvent(MutationCreateDataCenterCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        return createDataCenterCustomEvent(null, input, subProjection);
    }

    public MutationResponseProjection createDataCenterCustomEvent(String alias, MutationCreateDataCenterCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterCustomEvent").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterCustomEvent(CustomEventResponseProjection subProjection) {
        return updateDataCenterCustomEvent((String)null, subProjection);
    }

    public MutationResponseProjection updateDataCenterCustomEvent(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterCustomEvent").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterCustomEvent(MutationUpdateDataCenterCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        return updateDataCenterCustomEvent(null, input, subProjection);
    }

    public MutationResponseProjection updateDataCenterCustomEvent(String alias, MutationUpdateDataCenterCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterCustomEvent").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDataCenterCustomEvent() {
        return deleteDataCenterCustomEvent((String)null);
    }

    public MutationResponseProjection deleteDataCenterCustomEvent(String alias) {
        fields.add(new GraphQLResponseField("deleteDataCenterCustomEvent").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDataCenterCustomEvent(MutationDeleteDataCenterCustomEventParametrizedInput input) {
        return deleteDataCenterCustomEvent(null, input);
    }

    public MutationResponseProjection deleteDataCenterCustomEvent(String alias, MutationDeleteDataCenterCustomEventParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDataCenterCustomEvent").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterCustomEvents() {
        return batchDeleteDataCenterCustomEvents((String)null);
    }

    public MutationResponseProjection batchDeleteDataCenterCustomEvents(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterCustomEvents").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterCustomEvents(MutationBatchDeleteDataCenterCustomEventsParametrizedInput input) {
        return batchDeleteDataCenterCustomEvents(null, input);
    }

    public MutationResponseProjection batchDeleteDataCenterCustomEvents(String alias, MutationBatchDeleteDataCenterCustomEventsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterCustomEvents").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createComplexMetric(ComplexMetricResponseProjection subProjection) {
        return createComplexMetric((String)null, subProjection);
    }

    public MutationResponseProjection createComplexMetric(String alias, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createComplexMetric").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createComplexMetric(MutationCreateComplexMetricParametrizedInput input, ComplexMetricResponseProjection subProjection) {
        return createComplexMetric(null, input, subProjection);
    }

    public MutationResponseProjection createComplexMetric(String alias, MutationCreateComplexMetricParametrizedInput input, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createComplexMetric").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateComplexMetric(ComplexMetricResponseProjection subProjection) {
        return updateComplexMetric((String)null, subProjection);
    }

    public MutationResponseProjection updateComplexMetric(String alias, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateComplexMetric").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateComplexMetric(MutationUpdateComplexMetricParametrizedInput input, ComplexMetricResponseProjection subProjection) {
        return updateComplexMetric(null, input, subProjection);
    }

    public MutationResponseProjection updateComplexMetric(String alias, MutationUpdateComplexMetricParametrizedInput input, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateComplexMetric").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteComplexMetric() {
        return deleteComplexMetric((String)null);
    }

    public MutationResponseProjection deleteComplexMetric(String alias) {
        fields.add(new GraphQLResponseField("deleteComplexMetric").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteComplexMetric(MutationDeleteComplexMetricParametrizedInput input) {
        return deleteComplexMetric(null, input);
    }

    public MutationResponseProjection deleteComplexMetric(String alias, MutationDeleteComplexMetricParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteComplexMetric").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteComplexMetrics() {
        return batchDeleteComplexMetrics((String)null);
    }

    public MutationResponseProjection batchDeleteComplexMetrics(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteComplexMetrics").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteComplexMetrics(MutationBatchDeleteComplexMetricsParametrizedInput input) {
        return batchDeleteComplexMetrics(null, input);
    }

    public MutationResponseProjection batchDeleteComplexMetrics(String alias, MutationBatchDeleteComplexMetricsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteComplexMetrics").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createDataCenterEventVariable(EventVariableResponseProjection subProjection) {
        return createDataCenterEventVariable((String)null, subProjection);
    }

    public MutationResponseProjection createDataCenterEventVariable(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterEventVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDataCenterEventVariable(MutationCreateDataCenterEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        return createDataCenterEventVariable(null, input, subProjection);
    }

    public MutationResponseProjection createDataCenterEventVariable(String alias, MutationCreateDataCenterEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterEventVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterEventVariable(EventVariableResponseProjection subProjection) {
        return updateDataCenterEventVariable((String)null, subProjection);
    }

    public MutationResponseProjection updateDataCenterEventVariable(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterEventVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterEventVariable(MutationUpdateDataCenterEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        return updateDataCenterEventVariable(null, input, subProjection);
    }

    public MutationResponseProjection updateDataCenterEventVariable(String alias, MutationUpdateDataCenterEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterEventVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDataCenterEventVariable() {
        return deleteDataCenterEventVariable((String)null);
    }

    public MutationResponseProjection deleteDataCenterEventVariable(String alias) {
        fields.add(new GraphQLResponseField("deleteDataCenterEventVariable").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDataCenterEventVariable(MutationDeleteDataCenterEventVariableParametrizedInput input) {
        return deleteDataCenterEventVariable(null, input);
    }

    public MutationResponseProjection deleteDataCenterEventVariable(String alias, MutationDeleteDataCenterEventVariableParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDataCenterEventVariable").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterEventVariables() {
        return batchDeleteDataCenterEventVariables((String)null);
    }

    public MutationResponseProjection batchDeleteDataCenterEventVariables(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterEventVariables").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterEventVariables(MutationBatchDeleteDataCenterEventVariablesParametrizedInput input) {
        return batchDeleteDataCenterEventVariables(null, input);
    }

    public MutationResponseProjection batchDeleteDataCenterEventVariables(String alias, MutationBatchDeleteDataCenterEventVariablesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterEventVariables").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateDataCenterItemVariable(ItemVariableResponseProjection subProjection) {
        return updateDataCenterItemVariable((String)null, subProjection);
    }

    public MutationResponseProjection updateDataCenterItemVariable(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterItemVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterItemVariable(MutationUpdateDataCenterItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        return updateDataCenterItemVariable(null, input, subProjection);
    }

    public MutationResponseProjection updateDataCenterItemVariable(String alias, MutationUpdateDataCenterItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterItemVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDataCenterItemVariable() {
        return deleteDataCenterItemVariable((String)null);
    }

    public MutationResponseProjection deleteDataCenterItemVariable(String alias) {
        fields.add(new GraphQLResponseField("deleteDataCenterItemVariable").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDataCenterItemVariable(MutationDeleteDataCenterItemVariableParametrizedInput input) {
        return deleteDataCenterItemVariable(null, input);
    }

    public MutationResponseProjection deleteDataCenterItemVariable(String alias, MutationDeleteDataCenterItemVariableParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDataCenterItemVariable").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterItemVariables() {
        return batchDeleteDataCenterItemVariables((String)null);
    }

    public MutationResponseProjection batchDeleteDataCenterItemVariables(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterItemVariables").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterItemVariables(MutationBatchDeleteDataCenterItemVariablesParametrizedInput input) {
        return batchDeleteDataCenterItemVariables(null, input);
    }

    public MutationResponseProjection batchDeleteDataCenterItemVariables(String alias, MutationBatchDeleteDataCenterItemVariablesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterItemVariables").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createDataCenterItemModel(ItemModelResponseProjection subProjection) {
        return createDataCenterItemModel((String)null, subProjection);
    }

    public MutationResponseProjection createDataCenterItemModel(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterItemModel").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDataCenterItemModel(MutationCreateDataCenterItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        return createDataCenterItemModel(null, input, subProjection);
    }

    public MutationResponseProjection createDataCenterItemModel(String alias, MutationCreateDataCenterItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterItemModel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterItemModel(ItemModelResponseProjection subProjection) {
        return updateDataCenterItemModel((String)null, subProjection);
    }

    public MutationResponseProjection updateDataCenterItemModel(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterItemModel").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterItemModel(MutationUpdateDataCenterItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        return updateDataCenterItemModel(null, input, subProjection);
    }

    public MutationResponseProjection updateDataCenterItemModel(String alias, MutationUpdateDataCenterItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterItemModel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDataCenterItemModel() {
        return deleteDataCenterItemModel((String)null);
    }

    public MutationResponseProjection deleteDataCenterItemModel(String alias) {
        fields.add(new GraphQLResponseField("deleteDataCenterItemModel").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDataCenterItemModel(MutationDeleteDataCenterItemModelParametrizedInput input) {
        return deleteDataCenterItemModel(null, input);
    }

    public MutationResponseProjection deleteDataCenterItemModel(String alias, MutationDeleteDataCenterItemModelParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDataCenterItemModel").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterItemModels() {
        return batchDeleteDataCenterItemModels((String)null);
    }

    public MutationResponseProjection batchDeleteDataCenterItemModels(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterItemModels").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterItemModels(MutationBatchDeleteDataCenterItemModelsParametrizedInput input) {
        return batchDeleteDataCenterItemModels(null, input);
    }

    public MutationResponseProjection batchDeleteDataCenterItemModels(String alias, MutationBatchDeleteDataCenterItemModelsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterItemModels").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection dataCenterAddItemModelAttribute(ItemVariableResponseProjection subProjection) {
        return dataCenterAddItemModelAttribute((String)null, subProjection);
    }

    public MutationResponseProjection dataCenterAddItemModelAttribute(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterAddItemModelAttribute").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection dataCenterAddItemModelAttribute(MutationDataCenterAddItemModelAttributeParametrizedInput input, ItemVariableResponseProjection subProjection) {
        return dataCenterAddItemModelAttribute(null, input, subProjection);
    }

    public MutationResponseProjection dataCenterAddItemModelAttribute(String alias, MutationDataCenterAddItemModelAttributeParametrizedInput input, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterAddItemModelAttribute").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDataCenterUserVariable(UserVariableResponseProjection subProjection) {
        return createDataCenterUserVariable((String)null, subProjection);
    }

    public MutationResponseProjection createDataCenterUserVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterUserVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDataCenterUserVariable(MutationCreateDataCenterUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        return createDataCenterUserVariable(null, input, subProjection);
    }

    public MutationResponseProjection createDataCenterUserVariable(String alias, MutationCreateDataCenterUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDataCenterUserVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterUserVariable(UserVariableResponseProjection subProjection) {
        return updateDataCenterUserVariable((String)null, subProjection);
    }

    public MutationResponseProjection updateDataCenterUserVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterUserVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDataCenterUserVariable(MutationUpdateDataCenterUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        return updateDataCenterUserVariable(null, input, subProjection);
    }

    public MutationResponseProjection updateDataCenterUserVariable(String alias, MutationUpdateDataCenterUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDataCenterUserVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDataCenterUserVariable() {
        return deleteDataCenterUserVariable((String)null);
    }

    public MutationResponseProjection deleteDataCenterUserVariable(String alias) {
        fields.add(new GraphQLResponseField("deleteDataCenterUserVariable").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDataCenterUserVariable(MutationDeleteDataCenterUserVariableParametrizedInput input) {
        return deleteDataCenterUserVariable(null, input);
    }

    public MutationResponseProjection deleteDataCenterUserVariable(String alias, MutationDeleteDataCenterUserVariableParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDataCenterUserVariable").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterUserVariables() {
        return batchDeleteDataCenterUserVariables((String)null);
    }

    public MutationResponseProjection batchDeleteDataCenterUserVariables(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterUserVariables").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteDataCenterUserVariables(MutationBatchDeleteDataCenterUserVariablesParametrizedInput input) {
        return batchDeleteDataCenterUserVariables(null, input);
    }

    public MutationResponseProjection batchDeleteDataCenterUserVariables(String alias, MutationBatchDeleteDataCenterUserVariablesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteDataCenterUserVariables").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateClickhouseView() {
        return updateClickhouseView(null);
    }

    public MutationResponseProjection updateClickhouseView(String alias) {
        fields.add(new GraphQLResponseField("updateClickhouseView").alias(alias));
        return this;
    }

    public MutationResponseProjection createKpiAnalysis(KpiAnalysisResponseProjection subProjection) {
        return createKpiAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection createKpiAnalysis(String alias, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createKpiAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createKpiAnalysis(MutationCreateKpiAnalysisParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        return createKpiAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection createKpiAnalysis(String alias, MutationCreateKpiAnalysisParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createKpiAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateKpiAnalysis(KpiAnalysisResponseProjection subProjection) {
        return updateKpiAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection updateKpiAnalysis(String alias, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateKpiAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateKpiAnalysis(MutationUpdateKpiAnalysisParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        return updateKpiAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection updateKpiAnalysis(String alias, MutationUpdateKpiAnalysisParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateKpiAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteKpiAnalysis() {
        return deleteKpiAnalysis((String)null);
    }

    public MutationResponseProjection deleteKpiAnalysis(String alias) {
        fields.add(new GraphQLResponseField("deleteKpiAnalysis").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteKpiAnalysis(MutationDeleteKpiAnalysisParametrizedInput input) {
        return deleteKpiAnalysis(null, input);
    }

    public MutationResponseProjection deleteKpiAnalysis(String alias, MutationDeleteKpiAnalysisParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteKpiAnalysis").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteKpiAnalyses() {
        return batchDeleteKpiAnalyses((String)null);
    }

    public MutationResponseProjection batchDeleteKpiAnalyses(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteKpiAnalyses").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteKpiAnalyses(MutationBatchDeleteKpiAnalysesParametrizedInput input) {
        return batchDeleteKpiAnalyses(null, input);
    }

    public MutationResponseProjection batchDeleteKpiAnalyses(String alias, MutationBatchDeleteKpiAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteKpiAnalyses").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createFunnelAnalysis(FunnelAnalysisResponseProjection subProjection) {
        return createFunnelAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection createFunnelAnalysis(String alias, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFunnelAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFunnelAnalysis(MutationCreateFunnelAnalysisParametrizedInput input, FunnelAnalysisResponseProjection subProjection) {
        return createFunnelAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection createFunnelAnalysis(String alias, MutationCreateFunnelAnalysisParametrizedInput input, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFunnelAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateFunnelAnalysis(FunnelAnalysisResponseProjection subProjection) {
        return updateFunnelAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection updateFunnelAnalysis(String alias, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateFunnelAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateFunnelAnalysis(MutationUpdateFunnelAnalysisParametrizedInput input, FunnelAnalysisResponseProjection subProjection) {
        return updateFunnelAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection updateFunnelAnalysis(String alias, MutationUpdateFunnelAnalysisParametrizedInput input, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateFunnelAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteFunnelAnalysis() {
        return deleteFunnelAnalysis((String)null);
    }

    public MutationResponseProjection deleteFunnelAnalysis(String alias) {
        fields.add(new GraphQLResponseField("deleteFunnelAnalysis").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteFunnelAnalysis(MutationDeleteFunnelAnalysisParametrizedInput input) {
        return deleteFunnelAnalysis(null, input);
    }

    public MutationResponseProjection deleteFunnelAnalysis(String alias, MutationDeleteFunnelAnalysisParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteFunnelAnalysis").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteFunnelAnalyses() {
        return batchDeleteFunnelAnalyses((String)null);
    }

    public MutationResponseProjection batchDeleteFunnelAnalyses(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteFunnelAnalyses").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteFunnelAnalyses(MutationBatchDeleteFunnelAnalysesParametrizedInput input) {
        return batchDeleteFunnelAnalyses(null, input);
    }

    public MutationResponseProjection batchDeleteFunnelAnalyses(String alias, MutationBatchDeleteFunnelAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteFunnelAnalyses").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createFrequencyAnalysis(FrequencyAnalysisResponseProjection subProjection) {
        return createFrequencyAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection createFrequencyAnalysis(String alias, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFrequencyAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFrequencyAnalysis(MutationCreateFrequencyAnalysisParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        return createFrequencyAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection createFrequencyAnalysis(String alias, MutationCreateFrequencyAnalysisParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFrequencyAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateFrequencyAnalysis(FrequencyAnalysisResponseProjection subProjection) {
        return updateFrequencyAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection updateFrequencyAnalysis(String alias, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateFrequencyAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateFrequencyAnalysis(MutationUpdateFrequencyAnalysisParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        return updateFrequencyAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection updateFrequencyAnalysis(String alias, MutationUpdateFrequencyAnalysisParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateFrequencyAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteFrequencyAnalysis() {
        return deleteFrequencyAnalysis((String)null);
    }

    public MutationResponseProjection deleteFrequencyAnalysis(String alias) {
        fields.add(new GraphQLResponseField("deleteFrequencyAnalysis").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteFrequencyAnalysis(MutationDeleteFrequencyAnalysisParametrizedInput input) {
        return deleteFrequencyAnalysis(null, input);
    }

    public MutationResponseProjection deleteFrequencyAnalysis(String alias, MutationDeleteFrequencyAnalysisParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteFrequencyAnalysis").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteFrequencyAnalyses() {
        return batchDeleteFrequencyAnalyses((String)null);
    }

    public MutationResponseProjection batchDeleteFrequencyAnalyses(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteFrequencyAnalyses").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteFrequencyAnalyses(MutationBatchDeleteFrequencyAnalysesParametrizedInput input) {
        return batchDeleteFrequencyAnalyses(null, input);
    }

    public MutationResponseProjection batchDeleteFrequencyAnalyses(String alias, MutationBatchDeleteFrequencyAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteFrequencyAnalyses").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createOlapEventAnalysis(EventAnalysisResponseProjection subProjection) {
        return createOlapEventAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection createOlapEventAnalysis(String alias, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createOlapEventAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createOlapEventAnalysis(MutationCreateOlapEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        return createOlapEventAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection createOlapEventAnalysis(String alias, MutationCreateOlapEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createOlapEventAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateOlapEventAnalysis(EventAnalysisResponseProjection subProjection) {
        return updateOlapEventAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection updateOlapEventAnalysis(String alias, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateOlapEventAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateOlapEventAnalysis(MutationUpdateOlapEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        return updateOlapEventAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection updateOlapEventAnalysis(String alias, MutationUpdateOlapEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateOlapEventAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteOlapEventAnalysis() {
        return deleteOlapEventAnalysis((String)null);
    }

    public MutationResponseProjection deleteOlapEventAnalysis(String alias) {
        fields.add(new GraphQLResponseField("deleteOlapEventAnalysis").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteOlapEventAnalysis(MutationDeleteOlapEventAnalysisParametrizedInput input) {
        return deleteOlapEventAnalysis(null, input);
    }

    public MutationResponseProjection deleteOlapEventAnalysis(String alias, MutationDeleteOlapEventAnalysisParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteOlapEventAnalysis").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteOlapEventAnalyses() {
        return batchDeleteOlapEventAnalyses((String)null);
    }

    public MutationResponseProjection batchDeleteOlapEventAnalyses(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteOlapEventAnalyses").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteOlapEventAnalyses(MutationBatchDeleteOlapEventAnalysesParametrizedInput input) {
        return batchDeleteOlapEventAnalyses(null, input);
    }

    public MutationResponseProjection batchDeleteOlapEventAnalyses(String alias, MutationBatchDeleteOlapEventAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteOlapEventAnalyses").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createEventAnalysis(EventAnalysisResponseProjection subProjection) {
        return createEventAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection createEventAnalysis(String alias, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createEventAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createEventAnalysis(MutationCreateEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        return createEventAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection createEventAnalysis(String alias, MutationCreateEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createEventAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateEventAnalysis(EventAnalysisResponseProjection subProjection) {
        return updateEventAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection updateEventAnalysis(String alias, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateEventAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateEventAnalysis(MutationUpdateEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        return updateEventAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection updateEventAnalysis(String alias, MutationUpdateEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateEventAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteEventAnalysis() {
        return deleteEventAnalysis((String)null);
    }

    public MutationResponseProjection deleteEventAnalysis(String alias) {
        fields.add(new GraphQLResponseField("deleteEventAnalysis").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteEventAnalysis(MutationDeleteEventAnalysisParametrizedInput input) {
        return deleteEventAnalysis(null, input);
    }

    public MutationResponseProjection deleteEventAnalysis(String alias, MutationDeleteEventAnalysisParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteEventAnalysis").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteEventAnalyses() {
        return batchDeleteEventAnalyses((String)null);
    }

    public MutationResponseProjection batchDeleteEventAnalyses(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteEventAnalyses").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteEventAnalyses(MutationBatchDeleteEventAnalysesParametrizedInput input) {
        return batchDeleteEventAnalyses(null, input);
    }

    public MutationResponseProjection batchDeleteEventAnalyses(String alias, MutationBatchDeleteEventAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteEventAnalyses").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createRetentionAnalysis(RetentionAnalysisResponseProjection subProjection) {
        return createRetentionAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection createRetentionAnalysis(String alias, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRetentionAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRetentionAnalysis(MutationCreateRetentionAnalysisParametrizedInput input, RetentionAnalysisResponseProjection subProjection) {
        return createRetentionAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection createRetentionAnalysis(String alias, MutationCreateRetentionAnalysisParametrizedInput input, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRetentionAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateRetentionAnalysis(RetentionAnalysisResponseProjection subProjection) {
        return updateRetentionAnalysis((String)null, subProjection);
    }

    public MutationResponseProjection updateRetentionAnalysis(String alias, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateRetentionAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateRetentionAnalysis(MutationUpdateRetentionAnalysisParametrizedInput input, RetentionAnalysisResponseProjection subProjection) {
        return updateRetentionAnalysis(null, input, subProjection);
    }

    public MutationResponseProjection updateRetentionAnalysis(String alias, MutationUpdateRetentionAnalysisParametrizedInput input, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateRetentionAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteRetentionAnalysis() {
        return deleteRetentionAnalysis((String)null);
    }

    public MutationResponseProjection deleteRetentionAnalysis(String alias) {
        fields.add(new GraphQLResponseField("deleteRetentionAnalysis").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteRetentionAnalysis(MutationDeleteRetentionAnalysisParametrizedInput input) {
        return deleteRetentionAnalysis(null, input);
    }

    public MutationResponseProjection deleteRetentionAnalysis(String alias, MutationDeleteRetentionAnalysisParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteRetentionAnalysis").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteRetentionAnalyses() {
        return batchDeleteRetentionAnalyses((String)null);
    }

    public MutationResponseProjection batchDeleteRetentionAnalyses(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteRetentionAnalyses").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteRetentionAnalyses(MutationBatchDeleteRetentionAnalysesParametrizedInput input) {
        return batchDeleteRetentionAnalyses(null, input);
    }

    public MutationResponseProjection batchDeleteRetentionAnalyses(String alias, MutationBatchDeleteRetentionAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteRetentionAnalyses").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createDashboard(DashboardResponseProjection subProjection) {
        return createDashboard((String)null, subProjection);
    }

    public MutationResponseProjection createDashboard(String alias, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDashboard").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDashboard(MutationCreateDashboardParametrizedInput input, DashboardResponseProjection subProjection) {
        return createDashboard(null, input, subProjection);
    }

    public MutationResponseProjection createDashboard(String alias, MutationCreateDashboardParametrizedInput input, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDashboard").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDashboard(DashboardResponseProjection subProjection) {
        return updateDashboard((String)null, subProjection);
    }

    public MutationResponseProjection updateDashboard(String alias, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDashboard").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDashboard(MutationUpdateDashboardParametrizedInput input, DashboardResponseProjection subProjection) {
        return updateDashboard(null, input, subProjection);
    }

    public MutationResponseProjection updateDashboard(String alias, MutationUpdateDashboardParametrizedInput input, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDashboard").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDashboard() {
        return deleteDashboard((String)null);
    }

    public MutationResponseProjection deleteDashboard(String alias) {
        fields.add(new GraphQLResponseField("deleteDashboard").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDashboard(MutationDeleteDashboardParametrizedInput input) {
        return deleteDashboard(null, input);
    }

    public MutationResponseProjection deleteDashboard(String alias, MutationDeleteDashboardParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDashboard").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteDashboards() {
        return batchDeleteDashboards((String)null);
    }

    public MutationResponseProjection batchDeleteDashboards(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteDashboards").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteDashboards(MutationBatchDeleteDashboardsParametrizedInput input) {
        return batchDeleteDashboards(null, input);
    }

    public MutationResponseProjection batchDeleteDashboards(String alias, MutationBatchDeleteDashboardsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteDashboards").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateDashboardComment(DashboardCommentResponseProjection subProjection) {
        return updateDashboardComment((String)null, subProjection);
    }

    public MutationResponseProjection updateDashboardComment(String alias, DashboardCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDashboardComment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateDashboardComment(MutationUpdateDashboardCommentParametrizedInput input, DashboardCommentResponseProjection subProjection) {
        return updateDashboardComment(null, input, subProjection);
    }

    public MutationResponseProjection updateDashboardComment(String alias, MutationUpdateDashboardCommentParametrizedInput input, DashboardCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateDashboardComment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteDashboardComment() {
        return deleteDashboardComment((String)null);
    }

    public MutationResponseProjection deleteDashboardComment(String alias) {
        fields.add(new GraphQLResponseField("deleteDashboardComment").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteDashboardComment(MutationDeleteDashboardCommentParametrizedInput input) {
        return deleteDashboardComment(null, input);
    }

    public MutationResponseProjection deleteDashboardComment(String alias, MutationDeleteDashboardCommentParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteDashboardComment").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createDashboardComment(DashboardCommentResponseProjection subProjection) {
        return createDashboardComment((String)null, subProjection);
    }

    public MutationResponseProjection createDashboardComment(String alias, DashboardCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDashboardComment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createDashboardComment(MutationCreateDashboardCommentParametrizedInput input, DashboardCommentResponseProjection subProjection) {
        return createDashboardComment(null, input, subProjection);
    }

    public MutationResponseProjection createDashboardComment(String alias, MutationCreateDashboardCommentParametrizedInput input, DashboardCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createDashboardComment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFunnelDrillDownSegment(DrillDownSegmentReplyResponseProjection subProjection) {
        return createFunnelDrillDownSegment((String)null, subProjection);
    }

    public MutationResponseProjection createFunnelDrillDownSegment(String alias, DrillDownSegmentReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFunnelDrillDownSegment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFunnelDrillDownSegment(MutationCreateFunnelDrillDownSegmentParametrizedInput input, DrillDownSegmentReplyResponseProjection subProjection) {
        return createFunnelDrillDownSegment(null, input, subProjection);
    }

    public MutationResponseProjection createFunnelDrillDownSegment(String alias, MutationCreateFunnelDrillDownSegmentParametrizedInput input, DrillDownSegmentReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFunnelDrillDownSegment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRetentionDrillDownSegment(DrillDownSegmentReplyResponseProjection subProjection) {
        return createRetentionDrillDownSegment((String)null, subProjection);
    }

    public MutationResponseProjection createRetentionDrillDownSegment(String alias, DrillDownSegmentReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRetentionDrillDownSegment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRetentionDrillDownSegment(MutationCreateRetentionDrillDownSegmentParametrizedInput input, DrillDownSegmentReplyResponseProjection subProjection) {
        return createRetentionDrillDownSegment(null, input, subProjection);
    }

    public MutationResponseProjection createRetentionDrillDownSegment(String alias, MutationCreateRetentionDrillDownSegmentParametrizedInput input, DrillDownSegmentReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRetentionDrillDownSegment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFrequencyDrillDownSegment(DrillDownSegmentReplyResponseProjection subProjection) {
        return createFrequencyDrillDownSegment((String)null, subProjection);
    }

    public MutationResponseProjection createFrequencyDrillDownSegment(String alias, DrillDownSegmentReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFrequencyDrillDownSegment").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFrequencyDrillDownSegment(MutationCreateFrequencyDrillDownSegmentParametrizedInput input, DrillDownSegmentReplyResponseProjection subProjection) {
        return createFrequencyDrillDownSegment(null, input, subProjection);
    }

    public MutationResponseProjection createFrequencyDrillDownSegment(String alias, MutationCreateFrequencyDrillDownSegmentParametrizedInput input, DrillDownSegmentReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFrequencyDrillDownSegment").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFunnelDrillDownSegmentSnapshot(DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        return createFunnelDrillDownSegmentSnapshot((String)null, subProjection);
    }

    public MutationResponseProjection createFunnelDrillDownSegmentSnapshot(String alias, DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFunnelDrillDownSegmentSnapshot").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFunnelDrillDownSegmentSnapshot(MutationCreateFunnelDrillDownSegmentSnapshotParametrizedInput input, DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        return createFunnelDrillDownSegmentSnapshot(null, input, subProjection);
    }

    public MutationResponseProjection createFunnelDrillDownSegmentSnapshot(String alias, MutationCreateFunnelDrillDownSegmentSnapshotParametrizedInput input, DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFunnelDrillDownSegmentSnapshot").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRetentionDrillDownSegmentSnapshot(DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        return createRetentionDrillDownSegmentSnapshot((String)null, subProjection);
    }

    public MutationResponseProjection createRetentionDrillDownSegmentSnapshot(String alias, DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRetentionDrillDownSegmentSnapshot").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRetentionDrillDownSegmentSnapshot(MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput input, DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        return createRetentionDrillDownSegmentSnapshot(null, input, subProjection);
    }

    public MutationResponseProjection createRetentionDrillDownSegmentSnapshot(String alias, MutationCreateRetentionDrillDownSegmentSnapshotParametrizedInput input, DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRetentionDrillDownSegmentSnapshot").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFrequencyDrillDownSegmentSnapshot(DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        return createFrequencyDrillDownSegmentSnapshot((String)null, subProjection);
    }

    public MutationResponseProjection createFrequencyDrillDownSegmentSnapshot(String alias, DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFrequencyDrillDownSegmentSnapshot").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createFrequencyDrillDownSegmentSnapshot(MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput input, DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        return createFrequencyDrillDownSegmentSnapshot(null, input, subProjection);
    }

    public MutationResponseProjection createFrequencyDrillDownSegmentSnapshot(String alias, MutationCreateFrequencyDrillDownSegmentSnapshotParametrizedInput input, DrillDownSegmentSnapshotReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createFrequencyDrillDownSegmentSnapshot").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection typename() {
        return typename(null);
    }

    public MutationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
