package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryResponseProjection extends GraphQLResponseProjection {

    public QueryResponseProjection() {
    }

    @Override
    public QueryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public QueryResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurementResponseProjection.personaMeasurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MeasurementResponseProjection.personaMeasurements", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurementResponseProjection.personaMeasurements", 0) + 1);
            this.personaMeasurements(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurementResponseProjection.personaMeasurements", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurementResponseProjection.segmentMeasurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MeasurementResponseProjection.segmentMeasurements", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurementResponseProjection.segmentMeasurements", 0) + 1);
            this.segmentMeasurements(new MeasurementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurementResponseProjection.segmentMeasurements", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UtmArgumentResponseProjection.utmArguments", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UtmArgumentResponseProjection.utmArguments", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UtmArgumentResponseProjection.utmArguments", 0) + 1);
            this.utmArguments(new UtmArgumentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UtmArgumentResponseProjection.utmArguments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DataCenterInfoResponseProjection.dataCenterInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DataCenterInfoResponseProjection.dataCenterInfo", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DataCenterInfoResponseProjection.dataCenterInfo", 0) + 1);
            this.dataCenterInfo(new DataCenterInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DataCenterInfoResponseProjection.dataCenterInfo", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.OriginDataSettingResponseProjection.originDataSettings", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.OriginDataSettingResponseProjection.originDataSettings", projectionDepthOnFields.getOrDefault("QueryResponseProjection.OriginDataSettingResponseProjection.originDataSettings", 0) + 1);
            this.originDataSettings(new OriginDataSettingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.OriginDataSettingResponseProjection.originDataSettings", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CrystalBallUserInfoPanelResponseProjection.crystalBallUserInfoPanels", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CrystalBallUserInfoPanelResponseProjection.crystalBallUserInfoPanels", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CrystalBallUserInfoPanelResponseProjection.crystalBallUserInfoPanels", 0) + 1);
            this.crystalBallUserInfoPanels(new CrystalBallUserInfoPanelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CrystalBallUserInfoPanelResponseProjection.crystalBallUserInfoPanels", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.dataCenterTags", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TagResponseProjection.dataCenterTags", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.dataCenterTags", 0) + 1);
            this.dataCenterTags(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.dataCenterTags", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.dataCenterTag", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TagResponseProjection.dataCenterTag", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.dataCenterTag", 0) + 1);
            this.dataCenterTag(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.dataCenterTag", 0)));
        }
        this.dataCenterCountTags();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.tags", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TagResponseProjection.tags", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.tags", 0) + 1);
            this.tags(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.tags", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.tag", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TagResponseProjection.tag", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.tag", 0) + 1);
            this.tag(new TagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TagResponseProjection.tag", 0)));
        }
        this.countTags();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SegmentResponseProjection.segments", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SegmentResponseProjection.segments", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SegmentResponseProjection.segments", 0) + 1);
            this.segments(new SegmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SegmentResponseProjection.segments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SegmentResponseProjection.segment", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SegmentResponseProjection.segment", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SegmentResponseProjection.segment", 0) + 1);
            this.segment(new SegmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SegmentResponseProjection.segment", 0)));
        }
        this.countSegments();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.BasicProfileResponseProjection.basicProfile", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.BasicProfileResponseProjection.basicProfile", projectionDepthOnFields.getOrDefault("QueryResponseProjection.BasicProfileResponseProjection.basicProfile", 0) + 1);
            this.basicProfile(new BasicProfileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.BasicProfileResponseProjection.basicProfile", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.PersonaProfileResponseProjection.personaProfile", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.PersonaProfileResponseProjection.personaProfile", projectionDepthOnFields.getOrDefault("QueryResponseProjection.PersonaProfileResponseProjection.personaProfile", 0) + 1);
            this.personaProfile(new PersonaProfileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.PersonaProfileResponseProjection.personaProfile", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserProfileResponseProjection.userProfile", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserProfileResponseProjection.userProfile", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserProfileResponseProjection.userProfile", 0) + 1);
            this.userProfile(new UserProfileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserProfileResponseProjection.userProfile", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TimeUserProfileResponseProjection.userProfileWithTime", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TimeUserProfileResponseProjection.userProfileWithTime", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TimeUserProfileResponseProjection.userProfileWithTime", 0) + 1);
            this.userProfileWithTime(new TimeUserProfileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TimeUserProfileResponseProjection.userProfileWithTime", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventTrendResponseProjection.userEventsTrend", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.EventTrendResponseProjection.userEventsTrend", projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventTrendResponseProjection.userEventsTrend", 0) + 1);
            this.userEventsTrend(new EventTrendResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventTrendResponseProjection.userEventsTrend", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserSearchResponseProjection.searchUsers", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserSearchResponseProjection.searchUsers", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserSearchResponseProjection.searchUsers", 0) + 1);
            this.searchUsers(new UserSearchResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserSearchResponseProjection.searchUsers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SlicePaginationResponseProjection.users", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SlicePaginationResponseProjection.users", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SlicePaginationResponseProjection.users", 0) + 1);
            this.users(new SlicePaginationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SlicePaginationResponseProjection.users", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SlicePaginationResponseProjection.activeUsers", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SlicePaginationResponseProjection.activeUsers", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SlicePaginationResponseProjection.activeUsers", 0) + 1);
            this.activeUsers(new SlicePaginationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SlicePaginationResponseProjection.activeUsers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CursorPaginationResponseProjection.userEvents", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CursorPaginationResponseProjection.userEvents", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CursorPaginationResponseProjection.userEvents", 0) + 1);
            this.userEvents(new CursorPaginationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CursorPaginationResponseProjection.userEvents", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserEventCountResponseProjection.userEventCount", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserEventCountResponseProjection.userEventCount", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserEventCountResponseProjection.userEventCount", 0) + 1);
            this.userEventCount(new UserEventCountResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserEventCountResponseProjection.userEventCount", 0)));
        }
        this.searchUserEvents();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedSegmentResponseProjection.preparedSegment", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.PreparedSegmentResponseProjection.preparedSegment", projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedSegmentResponseProjection.preparedSegment", 0) + 1);
            this.preparedSegment(new PreparedSegmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedSegmentResponseProjection.preparedSegment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SegmentDocumentResponseProjection.segmentDocument", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SegmentDocumentResponseProjection.segmentDocument", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SegmentDocumentResponseProjection.segmentDocument", 0) + 1);
            this.segmentDocument(new SegmentDocumentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SegmentDocumentResponseProjection.segmentDocument", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TunnelResponseProjection.tunnels", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TunnelResponseProjection.tunnels", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TunnelResponseProjection.tunnels", 0) + 1);
            this.tunnels(new TunnelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TunnelResponseProjection.tunnels", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TunnelResponseProjection.tunnel", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TunnelResponseProjection.tunnel", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TunnelResponseProjection.tunnel", 0) + 1);
            this.tunnel(new TunnelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TunnelResponseProjection.tunnel", 0)));
        }
        this.countTunnels();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.ubaCustomEvents", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CustomEventResponseProjection.ubaCustomEvents", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.ubaCustomEvents", 0) + 1);
            this.ubaCustomEvents(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.ubaCustomEvents", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.ubaUserVariables", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserVariableResponseProjection.ubaUserVariables", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.ubaUserVariables", 0) + 1);
            this.ubaUserVariables(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.ubaUserVariables", 0)));
        }
        this.tunnelActivated();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TunnelEventsTrendResponseProjection.getTunnelEventsTrend", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TunnelEventsTrendResponseProjection.getTunnelEventsTrend", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TunnelEventsTrendResponseProjection.getTunnelEventsTrend", 0) + 1);
            this.getTunnelEventsTrend(new TunnelEventsTrendResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TunnelEventsTrendResponseProjection.getTunnelEventsTrend", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.JobResultResponseProjection.jobResult", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.JobResultResponseProjection.jobResult", projectionDepthOnFields.getOrDefault("QueryResponseProjection.JobResultResponseProjection.jobResult", 0) + 1);
            this.jobResult(new JobResultResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.JobResultResponseProjection.jobResult", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventImportJobResponseProjection.eventImportJobs", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.EventImportJobResponseProjection.eventImportJobs", projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventImportJobResponseProjection.eventImportJobs", 0) + 1);
            this.eventImportJobs(new EventImportJobResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventImportJobResponseProjection.eventImportJobs", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.LogEntryResponseProjection.jobLogs", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.LogEntryResponseProjection.jobLogs", projectionDepthOnFields.getOrDefault("QueryResponseProjection.LogEntryResponseProjection.jobLogs", 0) + 1);
            this.jobLogs(new LogEntryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.LogEntryResponseProjection.jobLogs", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.FileDescriptorResponseProjection.jobFiles", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.FileDescriptorResponseProjection.jobFiles", projectionDepthOnFields.getOrDefault("QueryResponseProjection.FileDescriptorResponseProjection.jobFiles", 0) + 1);
            this.jobFiles(new FileDescriptorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.FileDescriptorResponseProjection.jobFiles", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CircleQrcodeResponseProjection.circleQrcode", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CircleQrcodeResponseProjection.circleQrcode", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CircleQrcodeResponseProjection.circleQrcode", 0) + 1);
            this.circleQrcode(new CircleQrcodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CircleQrcodeResponseProjection.circleQrcode", 0)));
        }
        this.minpActiveUserIps();
        this.minpCircleQrcode();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SubscriptionResponseProjection.subscriptions", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SubscriptionResponseProjection.subscriptions", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SubscriptionResponseProjection.subscriptions", 0) + 1);
            this.subscriptions(new SubscriptionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SubscriptionResponseProjection.subscriptions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.FeatureResponseProjection.features", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.FeatureResponseProjection.features", projectionDepthOnFields.getOrDefault("QueryResponseProjection.FeatureResponseProjection.features", 0) + 1);
            this.features(new FeatureResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.FeatureResponseProjection.features", 0)));
        }
        this.version();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.categories", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CategoryResponseProjection.categories", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.categories", 0) + 1);
            this.categories(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.categories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.category", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CategoryResponseProjection.category", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.category", 0) + 1);
            this.category(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.category", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.defaultCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CategoryResponseProjection.defaultCategory", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.defaultCategory", 0) + 1);
            this.defaultCategory(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.defaultCategory", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.searchCategories", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CategoryResponseProjection.searchCategories", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.searchCategories", 0) + 1);
            this.searchCategories(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.searchCategories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.treeLikeCategoriesWithResource", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CategoryResponseProjection.treeLikeCategoriesWithResource", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.treeLikeCategoriesWithResource", 0) + 1);
            this.treeLikeCategoriesWithResource(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.treeLikeCategoriesWithResource", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterDefaultCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CategoryResponseProjection.dataCenterDefaultCategory", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterDefaultCategory", 0) + 1);
            this.dataCenterDefaultCategory(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterDefaultCategory", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterSearchCategories", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CategoryResponseProjection.dataCenterSearchCategories", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterSearchCategories", 0) + 1);
            this.dataCenterSearchCategories(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterSearchCategories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterTreeLikeCategories", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CategoryResponseProjection.dataCenterTreeLikeCategories", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterTreeLikeCategories", 0) + 1);
            this.dataCenterTreeLikeCategories(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterTreeLikeCategories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterTreeLikeCategoryWithResource", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CategoryResponseProjection.dataCenterTreeLikeCategoryWithResource", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterTreeLikeCategoryWithResource", 0) + 1);
            this.dataCenterTreeLikeCategoryWithResource(new CategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CategoryResponseProjection.dataCenterTreeLikeCategoryWithResource", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.userDataCenterPermissionModules", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ModuleResponseProjection.userDataCenterPermissionModules", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.userDataCenterPermissionModules", 0) + 1);
            this.userDataCenterPermissionModules(new ModuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.userDataCenterPermissionModules", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.dataCenterPermissionModules", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ModuleResponseProjection.dataCenterPermissionModules", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.dataCenterPermissionModules", 0) + 1);
            this.dataCenterPermissionModules(new ModuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.dataCenterPermissionModules", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DataCenterRoleResponseProjection.dataCenterRole", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DataCenterRoleResponseProjection.dataCenterRole", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DataCenterRoleResponseProjection.dataCenterRole", 0) + 1);
            this.dataCenterRole(new DataCenterRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DataCenterRoleResponseProjection.dataCenterRole", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DataCenterRoleResponseProjection.dataCenterRoles", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DataCenterRoleResponseProjection.dataCenterRoles", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DataCenterRoleResponseProjection.dataCenterRoles", 0) + 1);
            this.dataCenterRoles(new DataCenterRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DataCenterRoleResponseProjection.dataCenterRoles", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserAccessCtrlResponseProjection.dataCenterAcls", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserAccessCtrlResponseProjection.dataCenterAcls", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserAccessCtrlResponseProjection.dataCenterAcls", 0) + 1);
            this.dataCenterAcls(new UserAccessCtrlResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserAccessCtrlResponseProjection.dataCenterAcls", 0)));
        }
        this.dataCenterResourceActions();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.AccessEntryResponseProjection.dataCenterUserGrants", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.AccessEntryResponseProjection.dataCenterUserGrants", projectionDepthOnFields.getOrDefault("QueryResponseProjection.AccessEntryResponseProjection.dataCenterUserGrants", 0) + 1);
            this.dataCenterUserGrants(new AccessEntryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.AccessEntryResponseProjection.dataCenterUserGrants", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DepartmentResponseProjection.departments", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DepartmentResponseProjection.departments", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DepartmentResponseProjection.departments", 0) + 1);
            this.departments(new DepartmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DepartmentResponseProjection.departments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DepartmentResponseProjection.allDepartments", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DepartmentResponseProjection.allDepartments", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DepartmentResponseProjection.allDepartments", 0) + 1);
            this.allDepartments(new DepartmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DepartmentResponseProjection.allDepartments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectResponseProjection.project", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ProjectResponseProjection.projects", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectResponseProjection.projects", 0) + 1);
            this.projects(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectResponseProjection.projects", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectRoleResponseProjection.projectRole", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ProjectRoleResponseProjection.projectRole", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectRoleResponseProjection.projectRole", 0) + 1);
            this.projectRole(new ProjectRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectRoleResponseProjection.projectRole", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectRoleResponseProjection.projectRoles", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ProjectRoleResponseProjection.projectRoles", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectRoleResponseProjection.projectRoles", 0) + 1);
            this.projectRoles(new ProjectRoleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectRoleResponseProjection.projectRoles", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.userProjectPermissionModules", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ModuleResponseProjection.userProjectPermissionModules", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.userProjectPermissionModules", 0) + 1);
            this.userProjectPermissionModules(new ModuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.userProjectPermissionModules", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.projectPermissionModules", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ModuleResponseProjection.projectPermissionModules", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.projectPermissionModules", 0) + 1);
            this.projectPermissionModules(new ModuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ModuleResponseProjection.projectPermissionModules", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectDataCtrlResponseProjection.projectDataCtrl", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ProjectDataCtrlResponseProjection.projectDataCtrl", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectDataCtrlResponseProjection.projectDataCtrl", 0) + 1);
            this.projectDataCtrl(new ProjectDataCtrlResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ProjectDataCtrlResponseProjection.projectDataCtrl", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TreeNodeResponseProjection.resourceTrees", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TreeNodeResponseProjection.resourceTrees", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TreeNodeResponseProjection.resourceTrees", 0) + 1);
            this.resourceTrees(new TreeNodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TreeNodeResponseProjection.resourceTrees", 0)));
        }
        this.verifyProjectAi();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MemberResponseProjection.currentUser", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MemberResponseProjection.currentUser", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MemberResponseProjection.currentUser", 0) + 1);
            this.currentUser(new MemberResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MemberResponseProjection.currentUser", 0)));
        }
        this.passwordValidation();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.dataCenterCustomEvents", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CustomEventResponseProjection.dataCenterCustomEvents", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.dataCenterCustomEvents", 0) + 1);
            this.dataCenterCustomEvents(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.dataCenterCustomEvents", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.dataCenterCustomEvent", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CustomEventResponseProjection.dataCenterCustomEvent", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.dataCenterCustomEvent", 0) + 1);
            this.dataCenterCustomEvent(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.dataCenterCustomEvent", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.customEvents", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CustomEventResponseProjection.customEvents", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.customEvents", 0) + 1);
            this.customEvents(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.customEvents", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.customEvent", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CustomEventResponseProjection.customEvent", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.customEvent", 0) + 1);
            this.customEvent(new CustomEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CustomEventResponseProjection.customEvent", 0)));
        }
        this.countCustomEvents();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ElementResponseProjection.elements", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ElementResponseProjection.elements", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ElementResponseProjection.elements", 0) + 1);
            this.elements(new ElementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ElementResponseProjection.elements", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ElementResponseProjection.element", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ElementResponseProjection.element", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ElementResponseProjection.element", 0) + 1);
            this.element(new ElementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ElementResponseProjection.element", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SimpleEventResponseProjection.simpleEvents", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SimpleEventResponseProjection.simpleEvents", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SimpleEventResponseProjection.simpleEvents", 0) + 1);
            this.simpleEvents(new SimpleEventResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SimpleEventResponseProjection.simpleEvents", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ComplexMetricResponseProjection.complexMetrics", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ComplexMetricResponseProjection.complexMetrics", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ComplexMetricResponseProjection.complexMetrics", 0) + 1);
            this.complexMetrics(new ComplexMetricResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ComplexMetricResponseProjection.complexMetrics", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ComplexMetricResponseProjection.complexMetric", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ComplexMetricResponseProjection.complexMetric", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ComplexMetricResponseProjection.complexMetric", 0) + 1);
            this.complexMetric(new ComplexMetricResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ComplexMetricResponseProjection.complexMetric", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedMetricResponseProjection.preparedMetrics", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.PreparedMetricResponseProjection.preparedMetrics", projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedMetricResponseProjection.preparedMetrics", 0) + 1);
            this.preparedMetrics(new PreparedMetricResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedMetricResponseProjection.preparedMetrics", 0)));
        }
        this.countComplexMetrics();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.eventVariables", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.EventVariableResponseProjection.eventVariables", projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.eventVariables", 0) + 1);
            this.eventVariables(new EventVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.eventVariables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.eventVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.EventVariableResponseProjection.eventVariable", projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.eventVariable", 0) + 1);
            this.eventVariable(new EventVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.eventVariable", 0)));
        }
        this.countEventVariables();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.itemModels", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ItemModelResponseProjection.itemModels", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.itemModels", 0) + 1);
            this.itemModels(new ItemModelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.itemModels", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.itemModel", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ItemModelResponseProjection.itemModel", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.itemModel", 0) + 1);
            this.itemModel(new ItemModelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.itemModel", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.itemVariables", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ItemVariableResponseProjection.itemVariables", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.itemVariables", 0) + 1);
            this.itemVariables(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.itemVariables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.itemVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ItemVariableResponseProjection.itemVariable", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.itemVariable", 0) + 1);
            this.itemVariable(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.itemVariable", 0)));
        }
        this.countItemVariables();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.userVariables", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserVariableResponseProjection.userVariables", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.userVariables", 0) + 1);
            this.userVariables(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.userVariables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.userVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserVariableResponseProjection.userVariable", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.userVariable", 0) + 1);
            this.userVariable(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.userVariable", 0)));
        }
        this.countUserVariables();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserPropertyResponseProjection.userProperties", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserPropertyResponseProjection.userProperties", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserPropertyResponseProjection.userProperties", 0) + 1);
            this.userProperties(new UserPropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserPropertyResponseProjection.userProperties", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedDimensionResponseProjection.preparedDimensions", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.PreparedDimensionResponseProjection.preparedDimensions", projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedDimensionResponseProjection.preparedDimensions", 0) + 1);
            this.preparedDimensions(new PreparedDimensionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedDimensionResponseProjection.preparedDimensions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurableResponseProjection.measurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MeasurableResponseProjection.measurements", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurableResponseProjection.measurements", 0) + 1);
            this.measurements(new MeasurableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurableResponseProjection.measurements", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DimensionResponseProjection.insightDimensions", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DimensionResponseProjection.insightDimensions", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DimensionResponseProjection.insightDimensions", 0) + 1);
            this.insightDimensions(new DimensionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DimensionResponseProjection.insightDimensions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.dataCenterEventVariables", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.EventVariableResponseProjection.dataCenterEventVariables", projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.dataCenterEventVariables", 0) + 1);
            this.dataCenterEventVariables(new EventVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.dataCenterEventVariables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.dataCenterEventVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.EventVariableResponseProjection.dataCenterEventVariable", projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.dataCenterEventVariable", 0) + 1);
            this.dataCenterEventVariable(new EventVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventVariableResponseProjection.dataCenterEventVariable", 0)));
        }
        this.dataCenterCountEventVariables();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.dataCenterItemModels", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ItemModelResponseProjection.dataCenterItemModels", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.dataCenterItemModels", 0) + 1);
            this.dataCenterItemModels(new ItemModelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.dataCenterItemModels", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.dataCenterItemModel", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ItemModelResponseProjection.dataCenterItemModel", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.dataCenterItemModel", 0) + 1);
            this.dataCenterItemModel(new ItemModelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemModelResponseProjection.dataCenterItemModel", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.dataCenterItemVariables", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ItemVariableResponseProjection.dataCenterItemVariables", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.dataCenterItemVariables", 0) + 1);
            this.dataCenterItemVariables(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.dataCenterItemVariables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.dataCenterItemVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.ItemVariableResponseProjection.dataCenterItemVariable", projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.dataCenterItemVariable", 0) + 1);
            this.dataCenterItemVariable(new ItemVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.ItemVariableResponseProjection.dataCenterItemVariable", 0)));
        }
        this.dataCenterCountItemVariables();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.dataCenterUserVariables", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserVariableResponseProjection.dataCenterUserVariables", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.dataCenterUserVariables", 0) + 1);
            this.dataCenterUserVariables(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.dataCenterUserVariables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.dataCenterUserVariable", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserVariableResponseProjection.dataCenterUserVariable", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.dataCenterUserVariable", 0) + 1);
            this.dataCenterUserVariable(new UserVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserVariableResponseProjection.dataCenterUserVariable", 0)));
        }
        this.dataCenterCountUserVariables();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedDimensionResponseProjection.dataCenterPreparedDimensions", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.PreparedDimensionResponseProjection.dataCenterPreparedDimensions", projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedDimensionResponseProjection.dataCenterPreparedDimensions", 0) + 1);
            this.dataCenterPreparedDimensions(new PreparedDimensionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.PreparedDimensionResponseProjection.dataCenterPreparedDimensions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurableResponseProjection.dataCenterMeasurements", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MeasurableResponseProjection.dataCenterMeasurements", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurableResponseProjection.dataCenterMeasurements", 0) + 1);
            this.dataCenterMeasurements(new MeasurableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MeasurableResponseProjection.dataCenterMeasurements", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DimensionResponseProjection.dataCenterInsightDimensions", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DimensionResponseProjection.dataCenterInsightDimensions", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DimensionResponseProjection.dataCenterInsightDimensions", 0) + 1);
            this.dataCenterInsightDimensions(new DimensionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DimensionResponseProjection.dataCenterInsightDimensions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.KpiAnalysisResponseProjection.kpiAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.KpiAnalysisResponseProjection.kpiAnalysis", projectionDepthOnFields.getOrDefault("QueryResponseProjection.KpiAnalysisResponseProjection.kpiAnalysis", 0) + 1);
            this.kpiAnalysis(new KpiAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.KpiAnalysisResponseProjection.kpiAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.KpiAnalysisResponseProjection.kpiAnalyses", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.KpiAnalysisResponseProjection.kpiAnalyses", projectionDepthOnFields.getOrDefault("QueryResponseProjection.KpiAnalysisResponseProjection.kpiAnalyses", 0) + 1);
            this.kpiAnalyses(new KpiAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.KpiAnalysisResponseProjection.kpiAnalyses", 0)));
        }
        this.countKpiAnalyses();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.FunnelAnalysisResponseProjection.funnelAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.FunnelAnalysisResponseProjection.funnelAnalysis", projectionDepthOnFields.getOrDefault("QueryResponseProjection.FunnelAnalysisResponseProjection.funnelAnalysis", 0) + 1);
            this.funnelAnalysis(new FunnelAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.FunnelAnalysisResponseProjection.funnelAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.FunnelAnalysisResponseProjection.funnelAnalyses", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.FunnelAnalysisResponseProjection.funnelAnalyses", projectionDepthOnFields.getOrDefault("QueryResponseProjection.FunnelAnalysisResponseProjection.funnelAnalyses", 0) + 1);
            this.funnelAnalyses(new FunnelAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.FunnelAnalysisResponseProjection.funnelAnalyses", 0)));
        }
        this.countFunnelAnalyses();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.FrequencyAnalysisResponseProjection.frequencyAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.FrequencyAnalysisResponseProjection.frequencyAnalysis", projectionDepthOnFields.getOrDefault("QueryResponseProjection.FrequencyAnalysisResponseProjection.frequencyAnalysis", 0) + 1);
            this.frequencyAnalysis(new FrequencyAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.FrequencyAnalysisResponseProjection.frequencyAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.FrequencyAnalysisResponseProjection.frequencyAnalyses", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.FrequencyAnalysisResponseProjection.frequencyAnalyses", projectionDepthOnFields.getOrDefault("QueryResponseProjection.FrequencyAnalysisResponseProjection.frequencyAnalyses", 0) + 1);
            this.frequencyAnalyses(new FrequencyAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.FrequencyAnalysisResponseProjection.frequencyAnalyses", 0)));
        }
        this.countFrequencyAnalyses();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventAnalysisResponseProjection.eventAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.EventAnalysisResponseProjection.eventAnalysis", projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventAnalysisResponseProjection.eventAnalysis", 0) + 1);
            this.eventAnalysis(new EventAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventAnalysisResponseProjection.eventAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventAnalysisResponseProjection.eventAnalyses", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.EventAnalysisResponseProjection.eventAnalyses", projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventAnalysisResponseProjection.eventAnalyses", 0) + 1);
            this.eventAnalyses(new EventAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventAnalysisResponseProjection.eventAnalyses", 0)));
        }
        this.countEventAnalyses();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RetentionAnalysisResponseProjection.retentionAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.RetentionAnalysisResponseProjection.retentionAnalysis", projectionDepthOnFields.getOrDefault("QueryResponseProjection.RetentionAnalysisResponseProjection.retentionAnalysis", 0) + 1);
            this.retentionAnalysis(new RetentionAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RetentionAnalysisResponseProjection.retentionAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RetentionAnalysisResponseProjection.retentionAnalyses", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.RetentionAnalysisResponseProjection.retentionAnalyses", projectionDepthOnFields.getOrDefault("QueryResponseProjection.RetentionAnalysisResponseProjection.retentionAnalyses", 0) + 1);
            this.retentionAnalyses(new RetentionAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RetentionAnalysisResponseProjection.retentionAnalyses", 0)));
        }
        this.countRetentionAnalyses();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.dashboard", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DashboardResponseProjection.dashboard", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.dashboard", 0) + 1);
            this.dashboard(new DashboardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.dashboard", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.dashboards", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DashboardResponseProjection.dashboards", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.dashboards", 0) + 1);
            this.dashboards(new DashboardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.dashboards", 0)));
        }
        this.countDashboards();
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardReferenceResponseProjection.analysisDashboardReferers", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DashboardReferenceResponseProjection.analysisDashboardReferers", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardReferenceResponseProjection.analysisDashboardReferers", 0) + 1);
            this.analysisDashboardReferers(new DashboardReferenceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardReferenceResponseProjection.analysisDashboardReferers", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardCommentResponseProjection.dashboardComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DashboardCommentResponseProjection.dashboardComment", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardCommentResponseProjection.dashboardComment", 0) + 1);
            this.dashboardComment(new DashboardCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardCommentResponseProjection.dashboardComment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.crystalBallDashboard", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DashboardResponseProjection.crystalBallDashboard", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.crystalBallDashboard", 0) + 1);
            this.crystalBallDashboard(new DashboardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.crystalBallDashboard", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.crystalBallDashboards", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DashboardResponseProjection.crystalBallDashboards", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.crystalBallDashboards", 0) + 1);
            this.crystalBallDashboards(new DashboardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardResponseProjection.crystalBallDashboards", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.KpiAnalysisResponseProjection.crystalBallKpiAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.KpiAnalysisResponseProjection.crystalBallKpiAnalysis", projectionDepthOnFields.getOrDefault("QueryResponseProjection.KpiAnalysisResponseProjection.crystalBallKpiAnalysis", 0) + 1);
            this.crystalBallKpiAnalysis(new KpiAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.KpiAnalysisResponseProjection.crystalBallKpiAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventAnalysisResponseProjection.crystalBallEventAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.EventAnalysisResponseProjection.crystalBallEventAnalysis", projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventAnalysisResponseProjection.crystalBallEventAnalysis", 0) + 1);
            this.crystalBallEventAnalysis(new EventAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.EventAnalysisResponseProjection.crystalBallEventAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TrackOverviewAnalysisResponseProjection.crystalBallTrackOverviewAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TrackOverviewAnalysisResponseProjection.crystalBallTrackOverviewAnalysis", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TrackOverviewAnalysisResponseProjection.crystalBallTrackOverviewAnalysis", 0) + 1);
            this.crystalBallTrackOverviewAnalysis(new TrackOverviewAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TrackOverviewAnalysisResponseProjection.crystalBallTrackOverviewAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.FrequencyAnalysisResponseProjection.crystalBallFrequencyAnalysis", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.FrequencyAnalysisResponseProjection.crystalBallFrequencyAnalysis", projectionDepthOnFields.getOrDefault("QueryResponseProjection.FrequencyAnalysisResponseProjection.crystalBallFrequencyAnalysis", 0) + 1);
            this.crystalBallFrequencyAnalysis(new FrequencyAnalysisResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.FrequencyAnalysisResponseProjection.crystalBallFrequencyAnalysis", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardCommentResponseProjection.crystalBallDashboardComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.DashboardCommentResponseProjection.crystalBallDashboardComment", projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardCommentResponseProjection.crystalBallDashboardComment", 0) + 1);
            this.crystalBallDashboardComment(new DashboardCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.DashboardCommentResponseProjection.crystalBallDashboardComment", 0)));
        }
        this.typename();
        return this;
    }

    public QueryResponseProjection personaMeasurements(MeasurementResponseProjection subProjection) {
        return personaMeasurements((String)null, subProjection);
    }

    public QueryResponseProjection personaMeasurements(String alias, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("personaMeasurements").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection personaMeasurements(QueryPersonaMeasurementsParametrizedInput input, MeasurementResponseProjection subProjection) {
        return personaMeasurements(null, input, subProjection);
    }

    public QueryResponseProjection personaMeasurements(String alias, QueryPersonaMeasurementsParametrizedInput input, MeasurementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("personaMeasurements").alias(alias).parameters(input).projection(subProjection));
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

    public QueryResponseProjection dataCenterInfo(DataCenterInfoResponseProjection subProjection) {
        return dataCenterInfo(null, subProjection);
    }

    public QueryResponseProjection dataCenterInfo(String alias, DataCenterInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterInfo").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection originDataSettings(OriginDataSettingResponseProjection subProjection) {
        return originDataSettings(null, subProjection);
    }

    public QueryResponseProjection originDataSettings(String alias, OriginDataSettingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("originDataSettings").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallUserInfoPanels(CrystalBallUserInfoPanelResponseProjection subProjection) {
        return crystalBallUserInfoPanels((String)null, subProjection);
    }

    public QueryResponseProjection crystalBallUserInfoPanels(String alias, CrystalBallUserInfoPanelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallUserInfoPanels").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallUserInfoPanels(QueryCrystalBallUserInfoPanelsParametrizedInput input, CrystalBallUserInfoPanelResponseProjection subProjection) {
        return crystalBallUserInfoPanels(null, input, subProjection);
    }

    public QueryResponseProjection crystalBallUserInfoPanels(String alias, QueryCrystalBallUserInfoPanelsParametrizedInput input, CrystalBallUserInfoPanelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallUserInfoPanels").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterTags(TagResponseProjection subProjection) {
        return dataCenterTags(null, subProjection);
    }

    public QueryResponseProjection dataCenterTags(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterTags").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterTag(TagResponseProjection subProjection) {
        return dataCenterTag((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterTag").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterTag(QueryDataCenterTagParametrizedInput input, TagResponseProjection subProjection) {
        return dataCenterTag(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterTag(String alias, QueryDataCenterTagParametrizedInput input, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterTag").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterCountTags() {
        return dataCenterCountTags(null);
    }

    public QueryResponseProjection dataCenterCountTags(String alias) {
        fields.add(new GraphQLResponseField("dataCenterCountTags").alias(alias));
        return this;
    }

    public QueryResponseProjection tags(TagResponseProjection subProjection) {
        return tags((String)null, subProjection);
    }

    public QueryResponseProjection tags(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection tags(QueryTagsParametrizedInput input, TagResponseProjection subProjection) {
        return tags(null, input, subProjection);
    }

    public QueryResponseProjection tags(String alias, QueryTagsParametrizedInput input, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).parameters(input).projection(subProjection));
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
        return countTags((String)null);
    }

    public QueryResponseProjection countTags(String alias) {
        fields.add(new GraphQLResponseField("countTags").alias(alias));
        return this;
    }

    public QueryResponseProjection countTags(QueryCountTagsParametrizedInput input) {
        return countTags(null, input);
    }

    public QueryResponseProjection countTags(String alias, QueryCountTagsParametrizedInput input) {
        fields.add(new GraphQLResponseField("countTags").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection segments(SegmentResponseProjection subProjection) {
        return segments((String)null, subProjection);
    }

    public QueryResponseProjection segments(String alias, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("segments").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection segments(QuerySegmentsParametrizedInput input, SegmentResponseProjection subProjection) {
        return segments(null, input, subProjection);
    }

    public QueryResponseProjection segments(String alias, QuerySegmentsParametrizedInput input, SegmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("segments").alias(alias).parameters(input).projection(subProjection));
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
        return countSegments((String)null);
    }

    public QueryResponseProjection countSegments(String alias) {
        fields.add(new GraphQLResponseField("countSegments").alias(alias));
        return this;
    }

    public QueryResponseProjection countSegments(QueryCountSegmentsParametrizedInput input) {
        return countSegments(null, input);
    }

    public QueryResponseProjection countSegments(String alias, QueryCountSegmentsParametrizedInput input) {
        fields.add(new GraphQLResponseField("countSegments").alias(alias).parameters(input));
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

    public QueryResponseProjection userProfileWithTime(TimeUserProfileResponseProjection subProjection) {
        return userProfileWithTime((String)null, subProjection);
    }

    public QueryResponseProjection userProfileWithTime(String alias, TimeUserProfileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userProfileWithTime").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userProfileWithTime(QueryUserProfileWithTimeParametrizedInput input, TimeUserProfileResponseProjection subProjection) {
        return userProfileWithTime(null, input, subProjection);
    }

    public QueryResponseProjection userProfileWithTime(String alias, QueryUserProfileWithTimeParametrizedInput input, TimeUserProfileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userProfileWithTime").alias(alias).parameters(input).projection(subProjection));
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

    public QueryResponseProjection userEventCount(UserEventCountResponseProjection subProjection) {
        return userEventCount((String)null, subProjection);
    }

    public QueryResponseProjection userEventCount(String alias, UserEventCountResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userEventCount").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userEventCount(QueryUserEventCountParametrizedInput input, UserEventCountResponseProjection subProjection) {
        return userEventCount(null, input, subProjection);
    }

    public QueryResponseProjection userEventCount(String alias, QueryUserEventCountParametrizedInput input, UserEventCountResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userEventCount").alias(alias).parameters(input).projection(subProjection));
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

    public QueryResponseProjection circleQrcode(CircleQrcodeResponseProjection subProjection) {
        return circleQrcode((String)null, subProjection);
    }

    public QueryResponseProjection circleQrcode(String alias, CircleQrcodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("circleQrcode").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection circleQrcode(QueryCircleQrcodeParametrizedInput input, CircleQrcodeResponseProjection subProjection) {
        return circleQrcode(null, input, subProjection);
    }

    public QueryResponseProjection circleQrcode(String alias, QueryCircleQrcodeParametrizedInput input, CircleQrcodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("circleQrcode").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection minpActiveUserIps() {
        return minpActiveUserIps((String)null);
    }

    public QueryResponseProjection minpActiveUserIps(String alias) {
        fields.add(new GraphQLResponseField("minpActiveUserIps").alias(alias));
        return this;
    }

    public QueryResponseProjection minpActiveUserIps(QueryMinpActiveUserIpsParametrizedInput input) {
        return minpActiveUserIps(null, input);
    }

    public QueryResponseProjection minpActiveUserIps(String alias, QueryMinpActiveUserIpsParametrizedInput input) {
        fields.add(new GraphQLResponseField("minpActiveUserIps").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection minpCircleQrcode() {
        return minpCircleQrcode((String)null);
    }

    public QueryResponseProjection minpCircleQrcode(String alias) {
        fields.add(new GraphQLResponseField("minpCircleQrcode").alias(alias));
        return this;
    }

    public QueryResponseProjection minpCircleQrcode(QueryMinpCircleQrcodeParametrizedInput input) {
        return minpCircleQrcode(null, input);
    }

    public QueryResponseProjection minpCircleQrcode(String alias, QueryMinpCircleQrcodeParametrizedInput input) {
        fields.add(new GraphQLResponseField("minpCircleQrcode").alias(alias).parameters(input));
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

    public QueryResponseProjection categories(CategoryResponseProjection subProjection) {
        return categories(null, subProjection);
    }

    public QueryResponseProjection categories(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("categories").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection category(CategoryResponseProjection subProjection) {
        return category((String)null, subProjection);
    }

    public QueryResponseProjection category(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("category").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection category(QueryCategoryParametrizedInput input, CategoryResponseProjection subProjection) {
        return category(null, input, subProjection);
    }

    public QueryResponseProjection category(String alias, QueryCategoryParametrizedInput input, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("category").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection defaultCategory(CategoryResponseProjection subProjection) {
        return defaultCategory((String)null, subProjection);
    }

    public QueryResponseProjection defaultCategory(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("defaultCategory").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection defaultCategory(QueryDefaultCategoryParametrizedInput input, CategoryResponseProjection subProjection) {
        return defaultCategory(null, input, subProjection);
    }

    public QueryResponseProjection defaultCategory(String alias, QueryDefaultCategoryParametrizedInput input, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("defaultCategory").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection searchCategories(CategoryResponseProjection subProjection) {
        return searchCategories((String)null, subProjection);
    }

    public QueryResponseProjection searchCategories(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("searchCategories").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection searchCategories(QuerySearchCategoriesParametrizedInput input, CategoryResponseProjection subProjection) {
        return searchCategories(null, input, subProjection);
    }

    public QueryResponseProjection searchCategories(String alias, QuerySearchCategoriesParametrizedInput input, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("searchCategories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection treeLikeCategoriesWithResource(CategoryResponseProjection subProjection) {
        return treeLikeCategoriesWithResource((String)null, subProjection);
    }

    public QueryResponseProjection treeLikeCategoriesWithResource(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("treeLikeCategoriesWithResource").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection treeLikeCategoriesWithResource(QueryTreeLikeCategoriesWithResourceParametrizedInput input, CategoryResponseProjection subProjection) {
        return treeLikeCategoriesWithResource(null, input, subProjection);
    }

    public QueryResponseProjection treeLikeCategoriesWithResource(String alias, QueryTreeLikeCategoriesWithResourceParametrizedInput input, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("treeLikeCategoriesWithResource").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterDefaultCategory(CategoryResponseProjection subProjection) {
        return dataCenterDefaultCategory(null, subProjection);
    }

    public QueryResponseProjection dataCenterDefaultCategory(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterDefaultCategory").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterSearchCategories(CategoryResponseProjection subProjection) {
        return dataCenterSearchCategories((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterSearchCategories(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterSearchCategories").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterSearchCategories(QueryDataCenterSearchCategoriesParametrizedInput input, CategoryResponseProjection subProjection) {
        return dataCenterSearchCategories(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterSearchCategories(String alias, QueryDataCenterSearchCategoriesParametrizedInput input, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterSearchCategories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterTreeLikeCategories(CategoryResponseProjection subProjection) {
        return dataCenterTreeLikeCategories(null, subProjection);
    }

    public QueryResponseProjection dataCenterTreeLikeCategories(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterTreeLikeCategories").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterTreeLikeCategoryWithResource(CategoryResponseProjection subProjection) {
        return dataCenterTreeLikeCategoryWithResource((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterTreeLikeCategoryWithResource(String alias, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterTreeLikeCategoryWithResource").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterTreeLikeCategoryWithResource(QueryDataCenterTreeLikeCategoryWithResourceParametrizedInput input, CategoryResponseProjection subProjection) {
        return dataCenterTreeLikeCategoryWithResource(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterTreeLikeCategoryWithResource(String alias, QueryDataCenterTreeLikeCategoryWithResourceParametrizedInput input, CategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterTreeLikeCategoryWithResource").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userDataCenterPermissionModules(ModuleResponseProjection subProjection) {
        return userDataCenterPermissionModules((String)null, subProjection);
    }

    public QueryResponseProjection userDataCenterPermissionModules(String alias, ModuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userDataCenterPermissionModules").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userDataCenterPermissionModules(QueryUserDataCenterPermissionModulesParametrizedInput input, ModuleResponseProjection subProjection) {
        return userDataCenterPermissionModules(null, input, subProjection);
    }

    public QueryResponseProjection userDataCenterPermissionModules(String alias, QueryUserDataCenterPermissionModulesParametrizedInput input, ModuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userDataCenterPermissionModules").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterPermissionModules(ModuleResponseProjection subProjection) {
        return dataCenterPermissionModules(null, subProjection);
    }

    public QueryResponseProjection dataCenterPermissionModules(String alias, ModuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterPermissionModules").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterRole(DataCenterRoleResponseProjection subProjection) {
        return dataCenterRole((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterRole(String alias, DataCenterRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterRole").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterRole(QueryDataCenterRoleParametrizedInput input, DataCenterRoleResponseProjection subProjection) {
        return dataCenterRole(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterRole(String alias, QueryDataCenterRoleParametrizedInput input, DataCenterRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterRole").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterRoles(DataCenterRoleResponseProjection subProjection) {
        return dataCenterRoles(null, subProjection);
    }

    public QueryResponseProjection dataCenterRoles(String alias, DataCenterRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterRoles").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterAcls(UserAccessCtrlResponseProjection subProjection) {
        return dataCenterAcls((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterAcls(String alias, UserAccessCtrlResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterAcls").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterAcls(QueryDataCenterAclsParametrizedInput input, UserAccessCtrlResponseProjection subProjection) {
        return dataCenterAcls(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterAcls(String alias, QueryDataCenterAclsParametrizedInput input, UserAccessCtrlResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterAcls").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterResourceActions() {
        return dataCenterResourceActions((String)null);
    }

    public QueryResponseProjection dataCenterResourceActions(String alias) {
        fields.add(new GraphQLResponseField("dataCenterResourceActions").alias(alias));
        return this;
    }

    public QueryResponseProjection dataCenterResourceActions(QueryDataCenterResourceActionsParametrizedInput input) {
        return dataCenterResourceActions(null, input);
    }

    public QueryResponseProjection dataCenterResourceActions(String alias, QueryDataCenterResourceActionsParametrizedInput input) {
        fields.add(new GraphQLResponseField("dataCenterResourceActions").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection dataCenterUserGrants(AccessEntryResponseProjection subProjection) {
        return dataCenterUserGrants((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterUserGrants(String alias, AccessEntryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterUserGrants").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterUserGrants(QueryDataCenterUserGrantsParametrizedInput input, AccessEntryResponseProjection subProjection) {
        return dataCenterUserGrants(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterUserGrants(String alias, QueryDataCenterUserGrantsParametrizedInput input, AccessEntryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterUserGrants").alias(alias).parameters(input).projection(subProjection));
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

    public QueryResponseProjection project(ProjectResponseProjection subProjection) {
        return project((String)null, subProjection);
    }

    public QueryResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection project(QueryProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        return project(null, input, subProjection);
    }

    public QueryResponseProjection project(String alias, QueryProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection projects(ProjectResponseProjection subProjection) {
        return projects(null, subProjection);
    }

    public QueryResponseProjection projects(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection projectRole(ProjectRoleResponseProjection subProjection) {
        return projectRole((String)null, subProjection);
    }

    public QueryResponseProjection projectRole(String alias, ProjectRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectRole").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection projectRole(QueryProjectRoleParametrizedInput input, ProjectRoleResponseProjection subProjection) {
        return projectRole(null, input, subProjection);
    }

    public QueryResponseProjection projectRole(String alias, QueryProjectRoleParametrizedInput input, ProjectRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectRole").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection projectRoles(ProjectRoleResponseProjection subProjection) {
        return projectRoles((String)null, subProjection);
    }

    public QueryResponseProjection projectRoles(String alias, ProjectRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectRoles").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection projectRoles(QueryProjectRolesParametrizedInput input, ProjectRoleResponseProjection subProjection) {
        return projectRoles(null, input, subProjection);
    }

    public QueryResponseProjection projectRoles(String alias, QueryProjectRolesParametrizedInput input, ProjectRoleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectRoles").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userProjectPermissionModules(ModuleResponseProjection subProjection) {
        return userProjectPermissionModules((String)null, subProjection);
    }

    public QueryResponseProjection userProjectPermissionModules(String alias, ModuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userProjectPermissionModules").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userProjectPermissionModules(QueryUserProjectPermissionModulesParametrizedInput input, ModuleResponseProjection subProjection) {
        return userProjectPermissionModules(null, input, subProjection);
    }

    public QueryResponseProjection userProjectPermissionModules(String alias, QueryUserProjectPermissionModulesParametrizedInput input, ModuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userProjectPermissionModules").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection projectPermissionModules(ModuleResponseProjection subProjection) {
        return projectPermissionModules(null, subProjection);
    }

    public QueryResponseProjection projectPermissionModules(String alias, ModuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectPermissionModules").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection projectDataCtrl(ProjectDataCtrlResponseProjection subProjection) {
        return projectDataCtrl((String)null, subProjection);
    }

    public QueryResponseProjection projectDataCtrl(String alias, ProjectDataCtrlResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectDataCtrl").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection projectDataCtrl(QueryProjectDataCtrlParametrizedInput input, ProjectDataCtrlResponseProjection subProjection) {
        return projectDataCtrl(null, input, subProjection);
    }

    public QueryResponseProjection projectDataCtrl(String alias, QueryProjectDataCtrlParametrizedInput input, ProjectDataCtrlResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectDataCtrl").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection resourceTrees(TreeNodeResponseProjection subProjection) {
        return resourceTrees((String)null, subProjection);
    }

    public QueryResponseProjection resourceTrees(String alias, TreeNodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resourceTrees").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection resourceTrees(QueryResourceTreesParametrizedInput input, TreeNodeResponseProjection subProjection) {
        return resourceTrees(null, input, subProjection);
    }

    public QueryResponseProjection resourceTrees(String alias, QueryResourceTreesParametrizedInput input, TreeNodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resourceTrees").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection verifyProjectAi() {
        return verifyProjectAi((String)null);
    }

    public QueryResponseProjection verifyProjectAi(String alias) {
        fields.add(new GraphQLResponseField("verifyProjectAi").alias(alias));
        return this;
    }

    public QueryResponseProjection verifyProjectAi(QueryVerifyProjectAiParametrizedInput input) {
        return verifyProjectAi(null, input);
    }

    public QueryResponseProjection verifyProjectAi(String alias, QueryVerifyProjectAiParametrizedInput input) {
        fields.add(new GraphQLResponseField("verifyProjectAi").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection currentUser(MemberResponseProjection subProjection) {
        return currentUser(null, subProjection);
    }

    public QueryResponseProjection currentUser(String alias, MemberResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("currentUser").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection passwordValidation() {
        return passwordValidation((String)null);
    }

    public QueryResponseProjection passwordValidation(String alias) {
        fields.add(new GraphQLResponseField("passwordValidation").alias(alias));
        return this;
    }

    public QueryResponseProjection passwordValidation(QueryPasswordValidationParametrizedInput input) {
        return passwordValidation(null, input);
    }

    public QueryResponseProjection passwordValidation(String alias, QueryPasswordValidationParametrizedInput input) {
        fields.add(new GraphQLResponseField("passwordValidation").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection dataCenterCustomEvents(CustomEventResponseProjection subProjection) {
        return dataCenterCustomEvents(null, subProjection);
    }

    public QueryResponseProjection dataCenterCustomEvents(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterCustomEvents").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterCustomEvent(CustomEventResponseProjection subProjection) {
        return dataCenterCustomEvent((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterCustomEvent(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterCustomEvent").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterCustomEvent(QueryDataCenterCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        return dataCenterCustomEvent(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterCustomEvent(String alias, QueryDataCenterCustomEventParametrizedInput input, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterCustomEvent").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection customEvents(CustomEventResponseProjection subProjection) {
        return customEvents((String)null, subProjection);
    }

    public QueryResponseProjection customEvents(String alias, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("customEvents").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection customEvents(QueryCustomEventsParametrizedInput input, CustomEventResponseProjection subProjection) {
        return customEvents(null, input, subProjection);
    }

    public QueryResponseProjection customEvents(String alias, QueryCustomEventsParametrizedInput input, CustomEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("customEvents").alias(alias).parameters(input).projection(subProjection));
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
        return countCustomEvents((String)null);
    }

    public QueryResponseProjection countCustomEvents(String alias) {
        fields.add(new GraphQLResponseField("countCustomEvents").alias(alias));
        return this;
    }

    public QueryResponseProjection countCustomEvents(QueryCountCustomEventsParametrizedInput input) {
        return countCustomEvents(null, input);
    }

    public QueryResponseProjection countCustomEvents(String alias, QueryCountCustomEventsParametrizedInput input) {
        fields.add(new GraphQLResponseField("countCustomEvents").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection elements(ElementResponseProjection subProjection) {
        return elements((String)null, subProjection);
    }

    public QueryResponseProjection elements(String alias, ElementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("elements").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection elements(QueryElementsParametrizedInput input, ElementResponseProjection subProjection) {
        return elements(null, input, subProjection);
    }

    public QueryResponseProjection elements(String alias, QueryElementsParametrizedInput input, ElementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("elements").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection element(ElementResponseProjection subProjection) {
        return element((String)null, subProjection);
    }

    public QueryResponseProjection element(String alias, ElementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("element").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection element(QueryElementParametrizedInput input, ElementResponseProjection subProjection) {
        return element(null, input, subProjection);
    }

    public QueryResponseProjection element(String alias, QueryElementParametrizedInput input, ElementResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("element").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection simpleEvents(SimpleEventResponseProjection subProjection) {
        return simpleEvents((String)null, subProjection);
    }

    public QueryResponseProjection simpleEvents(String alias, SimpleEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("simpleEvents").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection simpleEvents(QuerySimpleEventsParametrizedInput input, SimpleEventResponseProjection subProjection) {
        return simpleEvents(null, input, subProjection);
    }

    public QueryResponseProjection simpleEvents(String alias, QuerySimpleEventsParametrizedInput input, SimpleEventResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("simpleEvents").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection complexMetrics(ComplexMetricResponseProjection subProjection) {
        return complexMetrics((String)null, subProjection);
    }

    public QueryResponseProjection complexMetrics(String alias, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("complexMetrics").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection complexMetrics(QueryComplexMetricsParametrizedInput input, ComplexMetricResponseProjection subProjection) {
        return complexMetrics(null, input, subProjection);
    }

    public QueryResponseProjection complexMetrics(String alias, QueryComplexMetricsParametrizedInput input, ComplexMetricResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("complexMetrics").alias(alias).parameters(input).projection(subProjection));
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
        return countComplexMetrics((String)null);
    }

    public QueryResponseProjection countComplexMetrics(String alias) {
        fields.add(new GraphQLResponseField("countComplexMetrics").alias(alias));
        return this;
    }

    public QueryResponseProjection countComplexMetrics(QueryCountComplexMetricsParametrizedInput input) {
        return countComplexMetrics(null, input);
    }

    public QueryResponseProjection countComplexMetrics(String alias, QueryCountComplexMetricsParametrizedInput input) {
        fields.add(new GraphQLResponseField("countComplexMetrics").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection eventVariables(EventVariableResponseProjection subProjection) {
        return eventVariables((String)null, subProjection);
    }

    public QueryResponseProjection eventVariables(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection eventVariables(QueryEventVariablesParametrizedInput input, EventVariableResponseProjection subProjection) {
        return eventVariables(null, input, subProjection);
    }

    public QueryResponseProjection eventVariables(String alias, QueryEventVariablesParametrizedInput input, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventVariables").alias(alias).parameters(input).projection(subProjection));
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
        return countEventVariables((String)null);
    }

    public QueryResponseProjection countEventVariables(String alias) {
        fields.add(new GraphQLResponseField("countEventVariables").alias(alias));
        return this;
    }

    public QueryResponseProjection countEventVariables(QueryCountEventVariablesParametrizedInput input) {
        return countEventVariables(null, input);
    }

    public QueryResponseProjection countEventVariables(String alias, QueryCountEventVariablesParametrizedInput input) {
        fields.add(new GraphQLResponseField("countEventVariables").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection itemModels(ItemModelResponseProjection subProjection) {
        return itemModels((String)null, subProjection);
    }

    public QueryResponseProjection itemModels(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemModels").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection itemModels(QueryItemModelsParametrizedInput input, ItemModelResponseProjection subProjection) {
        return itemModels(null, input, subProjection);
    }

    public QueryResponseProjection itemModels(String alias, QueryItemModelsParametrizedInput input, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemModels").alias(alias).parameters(input).projection(subProjection));
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
        return itemVariables((String)null, subProjection);
    }

    public QueryResponseProjection itemVariables(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection itemVariables(QueryItemVariablesParametrizedInput input, ItemVariableResponseProjection subProjection) {
        return itemVariables(null, input, subProjection);
    }

    public QueryResponseProjection itemVariables(String alias, QueryItemVariablesParametrizedInput input, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemVariables").alias(alias).parameters(input).projection(subProjection));
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
        return countItemVariables((String)null);
    }

    public QueryResponseProjection countItemVariables(String alias) {
        fields.add(new GraphQLResponseField("countItemVariables").alias(alias));
        return this;
    }

    public QueryResponseProjection countItemVariables(QueryCountItemVariablesParametrizedInput input) {
        return countItemVariables(null, input);
    }

    public QueryResponseProjection countItemVariables(String alias, QueryCountItemVariablesParametrizedInput input) {
        fields.add(new GraphQLResponseField("countItemVariables").alias(alias).parameters(input));
        return this;
    }

    public QueryResponseProjection userVariables(UserVariableResponseProjection subProjection) {
        return userVariables((String)null, subProjection);
    }

    public QueryResponseProjection userVariables(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection userVariables(QueryUserVariablesParametrizedInput input, UserVariableResponseProjection subProjection) {
        return userVariables(null, input, subProjection);
    }

    public QueryResponseProjection userVariables(String alias, QueryUserVariablesParametrizedInput input, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userVariables").alias(alias).parameters(input).projection(subProjection));
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
        return countUserVariables((String)null);
    }

    public QueryResponseProjection countUserVariables(String alias) {
        fields.add(new GraphQLResponseField("countUserVariables").alias(alias));
        return this;
    }

    public QueryResponseProjection countUserVariables(QueryCountUserVariablesParametrizedInput input) {
        return countUserVariables(null, input);
    }

    public QueryResponseProjection countUserVariables(String alias, QueryCountUserVariablesParametrizedInput input) {
        fields.add(new GraphQLResponseField("countUserVariables").alias(alias).parameters(input));
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
        return preparedDimensions((String)null, subProjection);
    }

    public QueryResponseProjection preparedDimensions(String alias, PreparedDimensionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("preparedDimensions").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection preparedDimensions(QueryPreparedDimensionsParametrizedInput input, PreparedDimensionResponseProjection subProjection) {
        return preparedDimensions(null, input, subProjection);
    }

    public QueryResponseProjection preparedDimensions(String alias, QueryPreparedDimensionsParametrizedInput input, PreparedDimensionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("preparedDimensions").alias(alias).parameters(input).projection(subProjection));
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

    public QueryResponseProjection dataCenterEventVariables(EventVariableResponseProjection subProjection) {
        return dataCenterEventVariables(null, subProjection);
    }

    public QueryResponseProjection dataCenterEventVariables(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterEventVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterEventVariable(EventVariableResponseProjection subProjection) {
        return dataCenterEventVariable((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterEventVariable(String alias, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterEventVariable").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterEventVariable(QueryDataCenterEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        return dataCenterEventVariable(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterEventVariable(String alias, QueryDataCenterEventVariableParametrizedInput input, EventVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterEventVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterCountEventVariables() {
        return dataCenterCountEventVariables(null);
    }

    public QueryResponseProjection dataCenterCountEventVariables(String alias) {
        fields.add(new GraphQLResponseField("dataCenterCountEventVariables").alias(alias));
        return this;
    }

    public QueryResponseProjection dataCenterItemModels(ItemModelResponseProjection subProjection) {
        return dataCenterItemModels(null, subProjection);
    }

    public QueryResponseProjection dataCenterItemModels(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterItemModels").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterItemModel(ItemModelResponseProjection subProjection) {
        return dataCenterItemModel((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterItemModel(String alias, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterItemModel").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterItemModel(QueryDataCenterItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        return dataCenterItemModel(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterItemModel(String alias, QueryDataCenterItemModelParametrizedInput input, ItemModelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterItemModel").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterItemVariables(ItemVariableResponseProjection subProjection) {
        return dataCenterItemVariables(null, subProjection);
    }

    public QueryResponseProjection dataCenterItemVariables(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterItemVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterItemVariable(ItemVariableResponseProjection subProjection) {
        return dataCenterItemVariable((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterItemVariable(String alias, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterItemVariable").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterItemVariable(QueryDataCenterItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        return dataCenterItemVariable(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterItemVariable(String alias, QueryDataCenterItemVariableParametrizedInput input, ItemVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterItemVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterCountItemVariables() {
        return dataCenterCountItemVariables(null);
    }

    public QueryResponseProjection dataCenterCountItemVariables(String alias) {
        fields.add(new GraphQLResponseField("dataCenterCountItemVariables").alias(alias));
        return this;
    }

    public QueryResponseProjection dataCenterUserVariables(UserVariableResponseProjection subProjection) {
        return dataCenterUserVariables(null, subProjection);
    }

    public QueryResponseProjection dataCenterUserVariables(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterUserVariables").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterUserVariable(UserVariableResponseProjection subProjection) {
        return dataCenterUserVariable((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterUserVariable(String alias, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterUserVariable").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterUserVariable(QueryDataCenterUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        return dataCenterUserVariable(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterUserVariable(String alias, QueryDataCenterUserVariableParametrizedInput input, UserVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterUserVariable").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterCountUserVariables() {
        return dataCenterCountUserVariables(null);
    }

    public QueryResponseProjection dataCenterCountUserVariables(String alias) {
        fields.add(new GraphQLResponseField("dataCenterCountUserVariables").alias(alias));
        return this;
    }

    public QueryResponseProjection dataCenterPreparedDimensions(PreparedDimensionResponseProjection subProjection) {
        return dataCenterPreparedDimensions(null, subProjection);
    }

    public QueryResponseProjection dataCenterPreparedDimensions(String alias, PreparedDimensionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterPreparedDimensions").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterMeasurements(MeasurableResponseProjection subProjection) {
        return dataCenterMeasurements(null, subProjection);
    }

    public QueryResponseProjection dataCenterMeasurements(String alias, MeasurableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterMeasurements").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterInsightDimensions(DimensionResponseProjection subProjection) {
        return dataCenterInsightDimensions((String)null, subProjection);
    }

    public QueryResponseProjection dataCenterInsightDimensions(String alias, DimensionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterInsightDimensions").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dataCenterInsightDimensions(QueryDataCenterInsightDimensionsParametrizedInput input, DimensionResponseProjection subProjection) {
        return dataCenterInsightDimensions(null, input, subProjection);
    }

    public QueryResponseProjection dataCenterInsightDimensions(String alias, QueryDataCenterInsightDimensionsParametrizedInput input, DimensionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dataCenterInsightDimensions").alias(alias).parameters(input).projection(subProjection));
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
        return kpiAnalyses((String)null, subProjection);
    }

    public QueryResponseProjection kpiAnalyses(String alias, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kpiAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection kpiAnalyses(QueryKpiAnalysesParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        return kpiAnalyses(null, input, subProjection);
    }

    public QueryResponseProjection kpiAnalyses(String alias, QueryKpiAnalysesParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kpiAnalyses").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countKpiAnalyses() {
        return countKpiAnalyses((String)null);
    }

    public QueryResponseProjection countKpiAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countKpiAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection countKpiAnalyses(QueryCountKpiAnalysesParametrizedInput input) {
        return countKpiAnalyses(null, input);
    }

    public QueryResponseProjection countKpiAnalyses(String alias, QueryCountKpiAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("countKpiAnalyses").alias(alias).parameters(input));
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
        return funnelAnalyses((String)null, subProjection);
    }

    public QueryResponseProjection funnelAnalyses(String alias, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("funnelAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection funnelAnalyses(QueryFunnelAnalysesParametrizedInput input, FunnelAnalysisResponseProjection subProjection) {
        return funnelAnalyses(null, input, subProjection);
    }

    public QueryResponseProjection funnelAnalyses(String alias, QueryFunnelAnalysesParametrizedInput input, FunnelAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("funnelAnalyses").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countFunnelAnalyses() {
        return countFunnelAnalyses((String)null);
    }

    public QueryResponseProjection countFunnelAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countFunnelAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection countFunnelAnalyses(QueryCountFunnelAnalysesParametrizedInput input) {
        return countFunnelAnalyses(null, input);
    }

    public QueryResponseProjection countFunnelAnalyses(String alias, QueryCountFunnelAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("countFunnelAnalyses").alias(alias).parameters(input));
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
        return frequencyAnalyses((String)null, subProjection);
    }

    public QueryResponseProjection frequencyAnalyses(String alias, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("frequencyAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection frequencyAnalyses(QueryFrequencyAnalysesParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        return frequencyAnalyses(null, input, subProjection);
    }

    public QueryResponseProjection frequencyAnalyses(String alias, QueryFrequencyAnalysesParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("frequencyAnalyses").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countFrequencyAnalyses() {
        return countFrequencyAnalyses((String)null);
    }

    public QueryResponseProjection countFrequencyAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countFrequencyAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection countFrequencyAnalyses(QueryCountFrequencyAnalysesParametrizedInput input) {
        return countFrequencyAnalyses(null, input);
    }

    public QueryResponseProjection countFrequencyAnalyses(String alias, QueryCountFrequencyAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("countFrequencyAnalyses").alias(alias).parameters(input));
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
        return eventAnalyses((String)null, subProjection);
    }

    public QueryResponseProjection eventAnalyses(String alias, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection eventAnalyses(QueryEventAnalysesParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        return eventAnalyses(null, input, subProjection);
    }

    public QueryResponseProjection eventAnalyses(String alias, QueryEventAnalysesParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventAnalyses").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countEventAnalyses() {
        return countEventAnalyses((String)null);
    }

    public QueryResponseProjection countEventAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countEventAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection countEventAnalyses(QueryCountEventAnalysesParametrizedInput input) {
        return countEventAnalyses(null, input);
    }

    public QueryResponseProjection countEventAnalyses(String alias, QueryCountEventAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("countEventAnalyses").alias(alias).parameters(input));
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
        return retentionAnalyses((String)null, subProjection);
    }

    public QueryResponseProjection retentionAnalyses(String alias, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("retentionAnalyses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection retentionAnalyses(QueryRetentionAnalysesParametrizedInput input, RetentionAnalysisResponseProjection subProjection) {
        return retentionAnalyses(null, input, subProjection);
    }

    public QueryResponseProjection retentionAnalyses(String alias, QueryRetentionAnalysesParametrizedInput input, RetentionAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("retentionAnalyses").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countRetentionAnalyses() {
        return countRetentionAnalyses((String)null);
    }

    public QueryResponseProjection countRetentionAnalyses(String alias) {
        fields.add(new GraphQLResponseField("countRetentionAnalyses").alias(alias));
        return this;
    }

    public QueryResponseProjection countRetentionAnalyses(QueryCountRetentionAnalysesParametrizedInput input) {
        return countRetentionAnalyses(null, input);
    }

    public QueryResponseProjection countRetentionAnalyses(String alias, QueryCountRetentionAnalysesParametrizedInput input) {
        fields.add(new GraphQLResponseField("countRetentionAnalyses").alias(alias).parameters(input));
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
        return dashboards((String)null, subProjection);
    }

    public QueryResponseProjection dashboards(String alias, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dashboards").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection dashboards(QueryDashboardsParametrizedInput input, DashboardResponseProjection subProjection) {
        return dashboards(null, input, subProjection);
    }

    public QueryResponseProjection dashboards(String alias, QueryDashboardsParametrizedInput input, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dashboards").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection countDashboards() {
        return countDashboards((String)null);
    }

    public QueryResponseProjection countDashboards(String alias) {
        fields.add(new GraphQLResponseField("countDashboards").alias(alias));
        return this;
    }

    public QueryResponseProjection countDashboards(QueryCountDashboardsParametrizedInput input) {
        return countDashboards(null, input);
    }

    public QueryResponseProjection countDashboards(String alias, QueryCountDashboardsParametrizedInput input) {
        fields.add(new GraphQLResponseField("countDashboards").alias(alias).parameters(input));
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

    public QueryResponseProjection crystalBallDashboard(DashboardResponseProjection subProjection) {
        return crystalBallDashboard((String)null, subProjection);
    }

    public QueryResponseProjection crystalBallDashboard(String alias, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallDashboard").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallDashboard(QueryCrystalBallDashboardParametrizedInput input, DashboardResponseProjection subProjection) {
        return crystalBallDashboard(null, input, subProjection);
    }

    public QueryResponseProjection crystalBallDashboard(String alias, QueryCrystalBallDashboardParametrizedInput input, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallDashboard").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallDashboards(DashboardResponseProjection subProjection) {
        return crystalBallDashboards((String)null, subProjection);
    }

    public QueryResponseProjection crystalBallDashboards(String alias, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallDashboards").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallDashboards(QueryCrystalBallDashboardsParametrizedInput input, DashboardResponseProjection subProjection) {
        return crystalBallDashboards(null, input, subProjection);
    }

    public QueryResponseProjection crystalBallDashboards(String alias, QueryCrystalBallDashboardsParametrizedInput input, DashboardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallDashboards").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallKpiAnalysis(KpiAnalysisResponseProjection subProjection) {
        return crystalBallKpiAnalysis((String)null, subProjection);
    }

    public QueryResponseProjection crystalBallKpiAnalysis(String alias, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallKpiAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallKpiAnalysis(QueryCrystalBallKpiAnalysisParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        return crystalBallKpiAnalysis(null, input, subProjection);
    }

    public QueryResponseProjection crystalBallKpiAnalysis(String alias, QueryCrystalBallKpiAnalysisParametrizedInput input, KpiAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallKpiAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallEventAnalysis(EventAnalysisResponseProjection subProjection) {
        return crystalBallEventAnalysis((String)null, subProjection);
    }

    public QueryResponseProjection crystalBallEventAnalysis(String alias, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallEventAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallEventAnalysis(QueryCrystalBallEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        return crystalBallEventAnalysis(null, input, subProjection);
    }

    public QueryResponseProjection crystalBallEventAnalysis(String alias, QueryCrystalBallEventAnalysisParametrizedInput input, EventAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallEventAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallTrackOverviewAnalysis(TrackOverviewAnalysisResponseProjection subProjection) {
        return crystalBallTrackOverviewAnalysis((String)null, subProjection);
    }

    public QueryResponseProjection crystalBallTrackOverviewAnalysis(String alias, TrackOverviewAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallTrackOverviewAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallTrackOverviewAnalysis(QueryCrystalBallTrackOverviewAnalysisParametrizedInput input, TrackOverviewAnalysisResponseProjection subProjection) {
        return crystalBallTrackOverviewAnalysis(null, input, subProjection);
    }

    public QueryResponseProjection crystalBallTrackOverviewAnalysis(String alias, QueryCrystalBallTrackOverviewAnalysisParametrizedInput input, TrackOverviewAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallTrackOverviewAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallFrequencyAnalysis(FrequencyAnalysisResponseProjection subProjection) {
        return crystalBallFrequencyAnalysis((String)null, subProjection);
    }

    public QueryResponseProjection crystalBallFrequencyAnalysis(String alias, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallFrequencyAnalysis").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallFrequencyAnalysis(QueryCrystalBallFrequencyAnalysisParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        return crystalBallFrequencyAnalysis(null, input, subProjection);
    }

    public QueryResponseProjection crystalBallFrequencyAnalysis(String alias, QueryCrystalBallFrequencyAnalysisParametrizedInput input, FrequencyAnalysisResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallFrequencyAnalysis").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallDashboardComment(DashboardCommentResponseProjection subProjection) {
        return crystalBallDashboardComment((String)null, subProjection);
    }

    public QueryResponseProjection crystalBallDashboardComment(String alias, DashboardCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallDashboardComment").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection crystalBallDashboardComment(QueryCrystalBallDashboardCommentParametrizedInput input, DashboardCommentResponseProjection subProjection) {
        return crystalBallDashboardComment(null, input, subProjection);
    }

    public QueryResponseProjection crystalBallDashboardComment(String alias, QueryCrystalBallDashboardCommentParametrizedInput input, DashboardCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crystalBallDashboardComment").alias(alias).parameters(input).projection(subProjection));
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
