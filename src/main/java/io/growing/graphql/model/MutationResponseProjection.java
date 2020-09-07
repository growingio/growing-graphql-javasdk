package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
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
        this.updateProjectInfo();
        this.updateOriginDataSetting();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.createTag", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TagResponseProjection.createTag", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.createTag", 0) + 1);
            this.createTag(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.createTag", 0)));
        }
        this.deleteTag();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.updateTag", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.TagResponseProjection.updateTag", projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.updateTag", 0) + 1);
            this.updateTag(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.TagResponseProjection.updateTag", 0)));
        }
        this.batchDeleteTags();
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
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJob", 0) + 1);
            this.submitSegmentUserExportJob(new SegmentUserExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentUserExportJob", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentSnapshotUserExportJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentSnapshotUserExportJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentSnapshotUserExportJob", 0) + 1);
            this.submitSegmentSnapshotUserExportJob(new SegmentUserExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.SegmentUserExportJobResponseProjection.submitSegmentSnapshotUserExportJob", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisExportJobResponseProjection.submitAnalysisExportJob", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.AnalysisExportJobResponseProjection.submitAnalysisExportJob", projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisExportJobResponseProjection.submitAnalysisExportJob", 0) + 1);
            this.submitAnalysisExportJob(new AnalysisExportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.AnalysisExportJobResponseProjection.submitAnalysisExportJob", 0)));
        }
        this.createSubscription();
        this.deleteSubscription();
        this.batchUpdateSubscriptions();
        this.roleAppendUser();
        this.updateUserPermissions();
        this.updateResourceAcls();
        this.batchUpdateResourceAcl();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.RoleResponseProjection.createRole", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.RoleResponseProjection.createRole", projectionDepthOnFields.getOrDefault("MutationResponseProjection.RoleResponseProjection.createRole", 0) + 1);
            this.createRole(new RoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.RoleResponseProjection.createRole", 0)));
        }
        this.deleteRole();
        this.updateRole();
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
        this.updateMemberRole();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateAccountReplyResponseProjection.createAccount", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CreateAccountReplyResponseProjection.createAccount", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateAccountReplyResponseProjection.createAccount", 0) + 1);
            this.createAccount(new CreateAccountReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CreateAccountReplyResponseProjection.createAccount", 0)));
        }
        this.disableAccount();
        this.resetAccountPassword();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.MemberResponseProjection.createMember", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.MemberResponseProjection.createMember", projectionDepthOnFields.getOrDefault("MutationResponseProjection.MemberResponseProjection.createMember", 0) + 1);
            this.createMember(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.MemberResponseProjection.createMember", 0)));
        }
        this.resetPassword();
        this.updateMember();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.createCustomEvent", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CustomEventResponseProjection.createCustomEvent", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.createCustomEvent", 0) + 1);
            this.createCustomEvent(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.createCustomEvent", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.updateCustomEvent", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.CustomEventResponseProjection.updateCustomEvent", projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.updateCustomEvent", 0) + 1);
            this.updateCustomEvent(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.CustomEventResponseProjection.updateCustomEvent", 0)));
        }
        this.deleteCustomEvent();
        this.batchDeleteCustomEvents();
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
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.createEventVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.EventVariableResponseProjection.createEventVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.createEventVariable", 0) + 1);
            this.createEventVariable(new EventVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.createEventVariable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.updateEventVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.EventVariableResponseProjection.updateEventVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.updateEventVariable", 0) + 1);
            this.updateEventVariable(new EventVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.EventVariableResponseProjection.updateEventVariable", 0)));
        }
        this.deleteEventVariable();
        this.batchDeleteEventVariables();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.createItemVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ItemVariableResponseProjection.createItemVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.createItemVariable", 0) + 1);
            this.createItemVariable(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.createItemVariable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.updateItemVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ItemVariableResponseProjection.updateItemVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.updateItemVariable", 0) + 1);
            this.updateItemVariable(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.updateItemVariable", 0)));
        }
        this.deleteItemVariable();
        this.batchDeleteItemVariables();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.createItemModel", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ItemModelResponseProjection.createItemModel", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.createItemModel", 0) + 1);
            this.createItemModel(new ItemModelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.createItemModel", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.updateItemModel", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ItemModelResponseProjection.updateItemModel", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.updateItemModel", 0) + 1);
            this.updateItemModel(new ItemModelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemModelResponseProjection.updateItemModel", 0)));
        }
        this.deleteItemModel();
        this.batchDeleteItemModels();
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.addItemModelAttribute", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.ItemVariableResponseProjection.addItemModelAttribute", projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.addItemModelAttribute", 0) + 1);
            this.addItemModelAttribute(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.ItemVariableResponseProjection.addItemModelAttribute", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.createUserVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UserVariableResponseProjection.createUserVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.createUserVariable", 0) + 1);
            this.createUserVariable(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.createUserVariable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.updateUserVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutationResponseProjection.UserVariableResponseProjection.updateUserVariable", projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.updateUserVariable", 0) + 1);
            this.updateUserVariable(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutationResponseProjection.UserVariableResponseProjection.updateUserVariable", 0)));
        }
        this.deleteUserVariable();
        this.batchDeleteUserVariables();
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

    public MutationResponseProjection updateProjectInfo() {
        return updateProjectInfo((String)null);
    }

    public MutationResponseProjection updateProjectInfo(String alias) {
        fields.add(new GraphQLResponseField("updateProjectInfo").alias(alias));
        return this;
    }

    public MutationResponseProjection updateProjectInfo(MutationUpdateProjectInfoParametrizedInput input) {
        return updateProjectInfo(null, input);
    }

    public MutationResponseProjection updateProjectInfo(String alias, MutationUpdateProjectInfoParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateProjectInfo").alias(alias).parameters(input));
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

    public MutationResponseProjection createTag(TagResponseProjection subProjection) {
        return createTag((String)null, subProjection);
    }

    public MutationResponseProjection createTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createTag").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createTag(MutationCreateTagParametrizedInput input, TagResponseProjection subProjection) {
        return createTag(null, input, subProjection);
    }

    public MutationResponseProjection createTag(String alias, MutationCreateTagParametrizedInput input, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createTag").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteTag() {
        return deleteTag((String)null);
    }

    public MutationResponseProjection deleteTag(String alias) {
        fields.add(new GraphQLResponseField("deleteTag").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteTag(MutationDeleteTagParametrizedInput input) {
        return deleteTag(null, input);
    }

    public MutationResponseProjection deleteTag(String alias, MutationDeleteTagParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteTag").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateTag(TagResponseProjection subProjection) {
        return updateTag((String)null, subProjection);
    }

    public MutationResponseProjection updateTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateTag").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateTag(MutationUpdateTagParametrizedInput input, TagResponseProjection subProjection) {
        return updateTag(null, input, subProjection);
    }

    public MutationResponseProjection updateTag(String alias, MutationUpdateTagParametrizedInput input, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateTag").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection batchDeleteTags() {
        return batchDeleteTags((String)null);
    }

    public MutationResponseProjection batchDeleteTags(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteTags").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteTags(MutationBatchDeleteTagsParametrizedInput input) {
        return batchDeleteTags(null, input);
    }

    public MutationResponseProjection batchDeleteTags(String alias, MutationBatchDeleteTagsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteTags").alias(alias).parameters(input));
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

    public MutationResponseProjection roleAppendUser() {
        return roleAppendUser((String)null);
    }

    public MutationResponseProjection roleAppendUser(String alias) {
        fields.add(new GraphQLResponseField("roleAppendUser").alias(alias));
        return this;
    }

    public MutationResponseProjection roleAppendUser(MutationRoleAppendUserParametrizedInput input) {
        return roleAppendUser(null, input);
    }

    public MutationResponseProjection roleAppendUser(String alias, MutationRoleAppendUserParametrizedInput input) {
        fields.add(new GraphQLResponseField("roleAppendUser").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateUserPermissions() {
        return updateUserPermissions((String)null);
    }

    public MutationResponseProjection updateUserPermissions(String alias) {
        fields.add(new GraphQLResponseField("updateUserPermissions").alias(alias));
        return this;
    }

    public MutationResponseProjection updateUserPermissions(MutationUpdateUserPermissionsParametrizedInput input) {
        return updateUserPermissions(null, input);
    }

    public MutationResponseProjection updateUserPermissions(String alias, MutationUpdateUserPermissionsParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateUserPermissions").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateResourceAcls() {
        return updateResourceAcls((String)null);
    }

    public MutationResponseProjection updateResourceAcls(String alias) {
        fields.add(new GraphQLResponseField("updateResourceAcls").alias(alias));
        return this;
    }

    public MutationResponseProjection updateResourceAcls(MutationUpdateResourceAclsParametrizedInput input) {
        return updateResourceAcls(null, input);
    }

    public MutationResponseProjection updateResourceAcls(String alias, MutationUpdateResourceAclsParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateResourceAcls").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchUpdateResourceAcl() {
        return batchUpdateResourceAcl((String)null);
    }

    public MutationResponseProjection batchUpdateResourceAcl(String alias) {
        fields.add(new GraphQLResponseField("batchUpdateResourceAcl").alias(alias));
        return this;
    }

    public MutationResponseProjection batchUpdateResourceAcl(MutationBatchUpdateResourceAclParametrizedInput input) {
        return batchUpdateResourceAcl(null, input);
    }

    public MutationResponseProjection batchUpdateResourceAcl(String alias, MutationBatchUpdateResourceAclParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchUpdateResourceAcl").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createRole(RoleResponseProjection subProjection) {
        return createRole((String)null, subProjection);
    }

    public MutationResponseProjection createRole(String alias, RoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRole").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createRole(MutationCreateRoleParametrizedInput input, RoleResponseProjection subProjection) {
        return createRole(null, input, subProjection);
    }

    public MutationResponseProjection createRole(String alias, MutationCreateRoleParametrizedInput input, RoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createRole").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteRole() {
        return deleteRole((String)null);
    }

    public MutationResponseProjection deleteRole(String alias) {
        fields.add(new GraphQLResponseField("deleteRole").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteRole(MutationDeleteRoleParametrizedInput input) {
        return deleteRole(null, input);
    }

    public MutationResponseProjection deleteRole(String alias, MutationDeleteRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteRole").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection updateRole() {
        return updateRole((String)null);
    }

    public MutationResponseProjection updateRole(String alias) {
        fields.add(new GraphQLResponseField("updateRole").alias(alias));
        return this;
    }

    public MutationResponseProjection updateRole(MutationUpdateRoleParametrizedInput input) {
        return updateRole(null, input);
    }

    public MutationResponseProjection updateRole(String alias, MutationUpdateRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateRole").alias(alias).parameters(input));
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

    public MutationResponseProjection updateMemberRole() {
        return updateMemberRole((String)null);
    }

    public MutationResponseProjection updateMemberRole(String alias) {
        fields.add(new GraphQLResponseField("updateMemberRole").alias(alias));
        return this;
    }

    public MutationResponseProjection updateMemberRole(MutationUpdateMemberRoleParametrizedInput input) {
        return updateMemberRole(null, input);
    }

    public MutationResponseProjection updateMemberRole(String alias, MutationUpdateMemberRoleParametrizedInput input) {
        fields.add(new GraphQLResponseField("updateMemberRole").alias(alias).parameters(input));
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

    public MutationResponseProjection disableAccount() {
        return disableAccount((String)null);
    }

    public MutationResponseProjection disableAccount(String alias) {
        fields.add(new GraphQLResponseField("disableAccount").alias(alias));
        return this;
    }

    public MutationResponseProjection disableAccount(MutationDisableAccountParametrizedInput input) {
        return disableAccount(null, input);
    }

    public MutationResponseProjection disableAccount(String alias, MutationDisableAccountParametrizedInput input) {
        fields.add(new GraphQLResponseField("disableAccount").alias(alias).parameters(input));
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

    public MutationResponseProjection createCustomEvent(CustomEventResponseProjection subProjection) {
        return createCustomEvent((String)null, subProjection);
    }

    public MutationResponseProjection createCustomEvent(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createCustomEvent").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createCustomEvent(MutationCreateCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        return createCustomEvent(null, input, subProjection);
    }

    public MutationResponseProjection createCustomEvent(String alias, MutationCreateCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createCustomEvent").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateCustomEvent(CustomEventResponseProjection subProjection) {
        return updateCustomEvent((String)null, subProjection);
    }

    public MutationResponseProjection updateCustomEvent(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateCustomEvent").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateCustomEvent(MutationUpdateCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        return updateCustomEvent(null, input, subProjection);
    }

    public MutationResponseProjection updateCustomEvent(String alias, MutationUpdateCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateCustomEvent").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteCustomEvent() {
        return deleteCustomEvent((String)null);
    }

    public MutationResponseProjection deleteCustomEvent(String alias) {
        fields.add(new GraphQLResponseField("deleteCustomEvent").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteCustomEvent(MutationDeleteCustomEventParametrizedInput input) {
        return deleteCustomEvent(null, input);
    }

    public MutationResponseProjection deleteCustomEvent(String alias, MutationDeleteCustomEventParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteCustomEvent").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteCustomEvents() {
        return batchDeleteCustomEvents((String)null);
    }

    public MutationResponseProjection batchDeleteCustomEvents(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteCustomEvents").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteCustomEvents(MutationBatchDeleteCustomEventsParametrizedInput input) {
        return batchDeleteCustomEvents(null, input);
    }

    public MutationResponseProjection batchDeleteCustomEvents(String alias, MutationBatchDeleteCustomEventsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteCustomEvents").alias(alias).parameters(input));
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

    public MutationResponseProjection createEventVariable(EventVariableResponseProjection subProjection) {
        return createEventVariable((String)null, subProjection);
    }

    public MutationResponseProjection createEventVariable(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createEventVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createEventVariable(MutationCreateEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        return createEventVariable(null, input, subProjection);
    }

    public MutationResponseProjection createEventVariable(String alias, MutationCreateEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createEventVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateEventVariable(EventVariableResponseProjection subProjection) {
        return updateEventVariable((String)null, subProjection);
    }

    public MutationResponseProjection updateEventVariable(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateEventVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateEventVariable(MutationUpdateEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        return updateEventVariable(null, input, subProjection);
    }

    public MutationResponseProjection updateEventVariable(String alias, MutationUpdateEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateEventVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteEventVariable() {
        return deleteEventVariable((String)null);
    }

    public MutationResponseProjection deleteEventVariable(String alias) {
        fields.add(new GraphQLResponseField("deleteEventVariable").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteEventVariable(MutationDeleteEventVariableParametrizedInput input) {
        return deleteEventVariable(null, input);
    }

    public MutationResponseProjection deleteEventVariable(String alias, MutationDeleteEventVariableParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteEventVariable").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteEventVariables() {
        return batchDeleteEventVariables((String)null);
    }

    public MutationResponseProjection batchDeleteEventVariables(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteEventVariables").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteEventVariables(MutationBatchDeleteEventVariablesParametrizedInput input) {
        return batchDeleteEventVariables(null, input);
    }

    public MutationResponseProjection batchDeleteEventVariables(String alias, MutationBatchDeleteEventVariablesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteEventVariables").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createItemVariable(ItemVariableResponseProjection subProjection) {
        return createItemVariable((String)null, subProjection);
    }

    public MutationResponseProjection createItemVariable(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createItemVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createItemVariable(MutationCreateItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        return createItemVariable(null, input, subProjection);
    }

    public MutationResponseProjection createItemVariable(String alias, MutationCreateItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createItemVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateItemVariable(ItemVariableResponseProjection subProjection) {
        return updateItemVariable((String)null, subProjection);
    }

    public MutationResponseProjection updateItemVariable(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateItemVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateItemVariable(MutationUpdateItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        return updateItemVariable(null, input, subProjection);
    }

    public MutationResponseProjection updateItemVariable(String alias, MutationUpdateItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateItemVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteItemVariable() {
        return deleteItemVariable((String)null);
    }

    public MutationResponseProjection deleteItemVariable(String alias) {
        fields.add(new GraphQLResponseField("deleteItemVariable").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteItemVariable(MutationDeleteItemVariableParametrizedInput input) {
        return deleteItemVariable(null, input);
    }

    public MutationResponseProjection deleteItemVariable(String alias, MutationDeleteItemVariableParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteItemVariable").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteItemVariables() {
        return batchDeleteItemVariables((String)null);
    }

    public MutationResponseProjection batchDeleteItemVariables(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteItemVariables").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteItemVariables(MutationBatchDeleteItemVariablesParametrizedInput input) {
        return batchDeleteItemVariables(null, input);
    }

    public MutationResponseProjection batchDeleteItemVariables(String alias, MutationBatchDeleteItemVariablesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteItemVariables").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection createItemModel(ItemModelResponseProjection subProjection) {
        return createItemModel((String)null, subProjection);
    }

    public MutationResponseProjection createItemModel(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createItemModel").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createItemModel(MutationCreateItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        return createItemModel(null, input, subProjection);
    }

    public MutationResponseProjection createItemModel(String alias, MutationCreateItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createItemModel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateItemModel(ItemModelResponseProjection subProjection) {
        return updateItemModel((String)null, subProjection);
    }

    public MutationResponseProjection updateItemModel(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateItemModel").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateItemModel(MutationUpdateItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        return updateItemModel(null, input, subProjection);
    }

    public MutationResponseProjection updateItemModel(String alias, MutationUpdateItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateItemModel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteItemModel() {
        return deleteItemModel((String)null);
    }

    public MutationResponseProjection deleteItemModel(String alias) {
        fields.add(new GraphQLResponseField("deleteItemModel").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteItemModel(MutationDeleteItemModelParametrizedInput input) {
        return deleteItemModel(null, input);
    }

    public MutationResponseProjection deleteItemModel(String alias, MutationDeleteItemModelParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteItemModel").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteItemModels() {
        return batchDeleteItemModels((String)null);
    }

    public MutationResponseProjection batchDeleteItemModels(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteItemModels").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteItemModels(MutationBatchDeleteItemModelsParametrizedInput input) {
        return batchDeleteItemModels(null, input);
    }

    public MutationResponseProjection batchDeleteItemModels(String alias, MutationBatchDeleteItemModelsParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteItemModels").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection addItemModelAttribute(ItemVariableResponseProjection subProjection) {
        return addItemModelAttribute((String)null, subProjection);
    }

    public MutationResponseProjection addItemModelAttribute(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addItemModelAttribute").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection addItemModelAttribute(MutationAddItemModelAttributeParametrizedInput input, ItemVariableResponseProjection subProjection) {
        return addItemModelAttribute(null, input, subProjection);
    }

    public MutationResponseProjection addItemModelAttribute(String alias, MutationAddItemModelAttributeParametrizedInput input, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("addItemModelAttribute").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createUserVariable(UserVariableResponseProjection subProjection) {
        return createUserVariable((String)null, subProjection);
    }

    public MutationResponseProjection createUserVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createUserVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection createUserVariable(MutationCreateUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        return createUserVariable(null, input, subProjection);
    }

    public MutationResponseProjection createUserVariable(String alias, MutationCreateUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createUserVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateUserVariable(UserVariableResponseProjection subProjection) {
        return updateUserVariable((String)null, subProjection);
    }

    public MutationResponseProjection updateUserVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateUserVariable").alias(alias).projection(subProjection));
        return this;
    }

    public MutationResponseProjection updateUserVariable(MutationUpdateUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        return updateUserVariable(null, input, subProjection);
    }

    public MutationResponseProjection updateUserVariable(String alias, MutationUpdateUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("updateUserVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MutationResponseProjection deleteUserVariable() {
        return deleteUserVariable((String)null);
    }

    public MutationResponseProjection deleteUserVariable(String alias) {
        fields.add(new GraphQLResponseField("deleteUserVariable").alias(alias));
        return this;
    }

    public MutationResponseProjection deleteUserVariable(MutationDeleteUserVariableParametrizedInput input) {
        return deleteUserVariable(null, input);
    }

    public MutationResponseProjection deleteUserVariable(String alias, MutationDeleteUserVariableParametrizedInput input) {
        fields.add(new GraphQLResponseField("deleteUserVariable").alias(alias).parameters(input));
        return this;
    }

    public MutationResponseProjection batchDeleteUserVariables() {
        return batchDeleteUserVariables((String)null);
    }

    public MutationResponseProjection batchDeleteUserVariables(String alias) {
        fields.add(new GraphQLResponseField("batchDeleteUserVariables").alias(alias));
        return this;
    }

    public MutationResponseProjection batchDeleteUserVariables(MutationBatchDeleteUserVariablesParametrizedInput input) {
        return batchDeleteUserVariables(null, input);
    }

    public MutationResponseProjection batchDeleteUserVariables(String alias, MutationBatchDeleteUserVariablesParametrizedInput input) {
        fields.add(new GraphQLResponseField("batchDeleteUserVariables").alias(alias).parameters(input));
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
