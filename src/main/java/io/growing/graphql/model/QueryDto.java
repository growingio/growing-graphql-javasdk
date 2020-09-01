package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Created automatically at 2020-08-28T15:46:06.490. Don't modify it
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:35+0800"
)
public class QueryDto implements java.io.Serializable {

    private java.util.List<MeasurementDto> personaMeasurements;
    private java.util.List<UtmArgumentDto> utmArguments;
    @javax.validation.constraints.NotNull
    private ProjectInfoDto projectInfo;
    @javax.validation.constraints.NotNull
    private java.util.List<OriginDataSettingDto> originDataSettings;
    private java.util.List<TagDto> tags;
    private Integer countTags;
    private java.util.List<SegmentDto> segments;
    private Integer countSegments;
    private java.util.List<TunnelDto> tunnels;
    private Integer countTunnels;
    @javax.validation.constraints.NotNull
    private java.util.List<EventImportJobDto> eventImportJobs;
    @javax.validation.constraints.NotNull
    private java.util.List<FeatureDto> features;
    @javax.validation.constraints.NotNull
    private String version;
    private java.util.List<ModuleDto> permissionModules;
    private java.util.List<RoleDto> roles;
    @javax.validation.constraints.NotNull
    private java.util.List<DepartmentDto> allDepartments;
    private java.util.List<CustomEventDto> customEvents;
    private Integer countCustomEvents;
    private java.util.List<ComplexMetricDto> complexMetrics;
    private java.util.List<PreparedMetricDto> preparedMetrics;
    private Integer countComplexMetrics;
    private java.util.List<EventVariableDto> eventVariables;
    private Integer countEventVariables;
    private java.util.List<ItemModelDto> itemModels;
    private java.util.List<ItemVariableDto> itemVariables;
    private Integer countItemVariables;
    private java.util.List<UserVariableDto> userVariables;
    private Integer countUserVariables;
    private java.util.List<UserPropertyDto> userProperties;
    private java.util.List<PreparedDimensionDto> preparedDimensions;
    private java.util.List<KpiAnalysisDto> kpiAnalyses;
    private Integer countKpiAnalyses;
    private java.util.List<FunnelAnalysisDto> funnelAnalyses;
    private Integer countFunnelAnalyses;
    private java.util.List<FrequencyAnalysisDto> frequencyAnalyses;
    private Integer countFrequencyAnalyses;
    private java.util.List<EventAnalysisDto> eventAnalyses;
    private Integer countEventAnalyses;
    private java.util.List<RetentionAnalysisDto> retentionAnalyses;
    private Integer countRetentionAnalyses;
    private java.util.List<DashboardDto> dashboards;
    private Integer countDashboards;

    public QueryDto() {
    }

    public QueryDto(java.util.List<MeasurementDto> personaMeasurements, java.util.List<UtmArgumentDto> utmArguments, ProjectInfoDto projectInfo, java.util.List<OriginDataSettingDto> originDataSettings, java.util.List<TagDto> tags, Integer countTags, java.util.List<SegmentDto> segments, Integer countSegments, java.util.List<TunnelDto> tunnels, Integer countTunnels, java.util.List<EventImportJobDto> eventImportJobs, java.util.List<FeatureDto> features, String version, java.util.List<ModuleDto> permissionModules, java.util.List<RoleDto> roles, java.util.List<DepartmentDto> allDepartments, java.util.List<CustomEventDto> customEvents, Integer countCustomEvents, java.util.List<ComplexMetricDto> complexMetrics, java.util.List<PreparedMetricDto> preparedMetrics, Integer countComplexMetrics, java.util.List<EventVariableDto> eventVariables, Integer countEventVariables, java.util.List<ItemModelDto> itemModels, java.util.List<ItemVariableDto> itemVariables, Integer countItemVariables, java.util.List<UserVariableDto> userVariables, Integer countUserVariables, java.util.List<UserPropertyDto> userProperties, java.util.List<PreparedDimensionDto> preparedDimensions, java.util.List<KpiAnalysisDto> kpiAnalyses, Integer countKpiAnalyses, java.util.List<FunnelAnalysisDto> funnelAnalyses, Integer countFunnelAnalyses, java.util.List<FrequencyAnalysisDto> frequencyAnalyses, Integer countFrequencyAnalyses, java.util.List<EventAnalysisDto> eventAnalyses, Integer countEventAnalyses, java.util.List<RetentionAnalysisDto> retentionAnalyses, Integer countRetentionAnalyses, java.util.List<DashboardDto> dashboards, Integer countDashboards) {
        this.personaMeasurements = personaMeasurements;
        this.utmArguments = utmArguments;
        this.projectInfo = projectInfo;
        this.originDataSettings = originDataSettings;
        this.tags = tags;
        this.countTags = countTags;
        this.segments = segments;
        this.countSegments = countSegments;
        this.tunnels = tunnels;
        this.countTunnels = countTunnels;
        this.eventImportJobs = eventImportJobs;
        this.features = features;
        this.version = version;
        this.permissionModules = permissionModules;
        this.roles = roles;
        this.allDepartments = allDepartments;
        this.customEvents = customEvents;
        this.countCustomEvents = countCustomEvents;
        this.complexMetrics = complexMetrics;
        this.preparedMetrics = preparedMetrics;
        this.countComplexMetrics = countComplexMetrics;
        this.eventVariables = eventVariables;
        this.countEventVariables = countEventVariables;
        this.itemModels = itemModels;
        this.itemVariables = itemVariables;
        this.countItemVariables = countItemVariables;
        this.userVariables = userVariables;
        this.countUserVariables = countUserVariables;
        this.userProperties = userProperties;
        this.preparedDimensions = preparedDimensions;
        this.kpiAnalyses = kpiAnalyses;
        this.countKpiAnalyses = countKpiAnalyses;
        this.funnelAnalyses = funnelAnalyses;
        this.countFunnelAnalyses = countFunnelAnalyses;
        this.frequencyAnalyses = frequencyAnalyses;
        this.countFrequencyAnalyses = countFrequencyAnalyses;
        this.eventAnalyses = eventAnalyses;
        this.countEventAnalyses = countEventAnalyses;
        this.retentionAnalyses = retentionAnalyses;
        this.countRetentionAnalyses = countRetentionAnalyses;
        this.dashboards = dashboards;
        this.countDashboards = countDashboards;
    }

    public java.util.List<MeasurementDto> getPersonaMeasurements() {
        return personaMeasurements;
    }
    public void setPersonaMeasurements(java.util.List<MeasurementDto> personaMeasurements) {
        this.personaMeasurements = personaMeasurements;
    }

    public java.util.List<UtmArgumentDto> getUtmArguments() {
        return utmArguments;
    }
    public void setUtmArguments(java.util.List<UtmArgumentDto> utmArguments) {
        this.utmArguments = utmArguments;
    }

    public ProjectInfoDto getProjectInfo() {
        return projectInfo;
    }
    public void setProjectInfo(ProjectInfoDto projectInfo) {
        this.projectInfo = projectInfo;
    }

    public java.util.List<OriginDataSettingDto> getOriginDataSettings() {
        return originDataSettings;
    }
    public void setOriginDataSettings(java.util.List<OriginDataSettingDto> originDataSettings) {
        this.originDataSettings = originDataSettings;
    }

    public java.util.List<TagDto> getTags() {
        return tags;
    }
    public void setTags(java.util.List<TagDto> tags) {
        this.tags = tags;
    }

    public Integer getCountTags() {
        return countTags;
    }
    public void setCountTags(Integer countTags) {
        this.countTags = countTags;
    }

    public java.util.List<SegmentDto> getSegments() {
        return segments;
    }
    public void setSegments(java.util.List<SegmentDto> segments) {
        this.segments = segments;
    }

    public Integer getCountSegments() {
        return countSegments;
    }
    public void setCountSegments(Integer countSegments) {
        this.countSegments = countSegments;
    }

    public java.util.List<TunnelDto> getTunnels() {
        return tunnels;
    }
    public void setTunnels(java.util.List<TunnelDto> tunnels) {
        this.tunnels = tunnels;
    }

    public Integer getCountTunnels() {
        return countTunnels;
    }
    public void setCountTunnels(Integer countTunnels) {
        this.countTunnels = countTunnels;
    }

    public java.util.List<EventImportJobDto> getEventImportJobs() {
        return eventImportJobs;
    }
    public void setEventImportJobs(java.util.List<EventImportJobDto> eventImportJobs) {
        this.eventImportJobs = eventImportJobs;
    }

    public java.util.List<FeatureDto> getFeatures() {
        return features;
    }
    public void setFeatures(java.util.List<FeatureDto> features) {
        this.features = features;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public java.util.List<ModuleDto> getPermissionModules() {
        return permissionModules;
    }
    public void setPermissionModules(java.util.List<ModuleDto> permissionModules) {
        this.permissionModules = permissionModules;
    }

    public java.util.List<RoleDto> getRoles() {
        return roles;
    }
    public void setRoles(java.util.List<RoleDto> roles) {
        this.roles = roles;
    }

    public java.util.List<DepartmentDto> getAllDepartments() {
        return allDepartments;
    }
    public void setAllDepartments(java.util.List<DepartmentDto> allDepartments) {
        this.allDepartments = allDepartments;
    }

    public java.util.List<CustomEventDto> getCustomEvents() {
        return customEvents;
    }
    public void setCustomEvents(java.util.List<CustomEventDto> customEvents) {
        this.customEvents = customEvents;
    }

    public Integer getCountCustomEvents() {
        return countCustomEvents;
    }
    public void setCountCustomEvents(Integer countCustomEvents) {
        this.countCustomEvents = countCustomEvents;
    }

    public java.util.List<ComplexMetricDto> getComplexMetrics() {
        return complexMetrics;
    }
    public void setComplexMetrics(java.util.List<ComplexMetricDto> complexMetrics) {
        this.complexMetrics = complexMetrics;
    }

    public java.util.List<PreparedMetricDto> getPreparedMetrics() {
        return preparedMetrics;
    }
    public void setPreparedMetrics(java.util.List<PreparedMetricDto> preparedMetrics) {
        this.preparedMetrics = preparedMetrics;
    }

    public Integer getCountComplexMetrics() {
        return countComplexMetrics;
    }
    public void setCountComplexMetrics(Integer countComplexMetrics) {
        this.countComplexMetrics = countComplexMetrics;
    }

    public java.util.List<EventVariableDto> getEventVariables() {
        return eventVariables;
    }
    public void setEventVariables(java.util.List<EventVariableDto> eventVariables) {
        this.eventVariables = eventVariables;
    }

    public Integer getCountEventVariables() {
        return countEventVariables;
    }
    public void setCountEventVariables(Integer countEventVariables) {
        this.countEventVariables = countEventVariables;
    }

    public java.util.List<ItemModelDto> getItemModels() {
        return itemModels;
    }
    public void setItemModels(java.util.List<ItemModelDto> itemModels) {
        this.itemModels = itemModels;
    }

    public java.util.List<ItemVariableDto> getItemVariables() {
        return itemVariables;
    }
    public void setItemVariables(java.util.List<ItemVariableDto> itemVariables) {
        this.itemVariables = itemVariables;
    }

    public Integer getCountItemVariables() {
        return countItemVariables;
    }
    public void setCountItemVariables(Integer countItemVariables) {
        this.countItemVariables = countItemVariables;
    }

    public java.util.List<UserVariableDto> getUserVariables() {
        return userVariables;
    }
    public void setUserVariables(java.util.List<UserVariableDto> userVariables) {
        this.userVariables = userVariables;
    }

    public Integer getCountUserVariables() {
        return countUserVariables;
    }
    public void setCountUserVariables(Integer countUserVariables) {
        this.countUserVariables = countUserVariables;
    }

    public java.util.List<UserPropertyDto> getUserProperties() {
        return userProperties;
    }
    public void setUserProperties(java.util.List<UserPropertyDto> userProperties) {
        this.userProperties = userProperties;
    }

    public java.util.List<PreparedDimensionDto> getPreparedDimensions() {
        return preparedDimensions;
    }
    public void setPreparedDimensions(java.util.List<PreparedDimensionDto> preparedDimensions) {
        this.preparedDimensions = preparedDimensions;
    }

    public java.util.List<KpiAnalysisDto> getKpiAnalyses() {
        return kpiAnalyses;
    }
    public void setKpiAnalyses(java.util.List<KpiAnalysisDto> kpiAnalyses) {
        this.kpiAnalyses = kpiAnalyses;
    }

    public Integer getCountKpiAnalyses() {
        return countKpiAnalyses;
    }
    public void setCountKpiAnalyses(Integer countKpiAnalyses) {
        this.countKpiAnalyses = countKpiAnalyses;
    }

    public java.util.List<FunnelAnalysisDto> getFunnelAnalyses() {
        return funnelAnalyses;
    }
    public void setFunnelAnalyses(java.util.List<FunnelAnalysisDto> funnelAnalyses) {
        this.funnelAnalyses = funnelAnalyses;
    }

    public Integer getCountFunnelAnalyses() {
        return countFunnelAnalyses;
    }
    public void setCountFunnelAnalyses(Integer countFunnelAnalyses) {
        this.countFunnelAnalyses = countFunnelAnalyses;
    }

    public java.util.List<FrequencyAnalysisDto> getFrequencyAnalyses() {
        return frequencyAnalyses;
    }
    public void setFrequencyAnalyses(java.util.List<FrequencyAnalysisDto> frequencyAnalyses) {
        this.frequencyAnalyses = frequencyAnalyses;
    }

    public Integer getCountFrequencyAnalyses() {
        return countFrequencyAnalyses;
    }
    public void setCountFrequencyAnalyses(Integer countFrequencyAnalyses) {
        this.countFrequencyAnalyses = countFrequencyAnalyses;
    }

    public java.util.List<EventAnalysisDto> getEventAnalyses() {
        return eventAnalyses;
    }
    public void setEventAnalyses(java.util.List<EventAnalysisDto> eventAnalyses) {
        this.eventAnalyses = eventAnalyses;
    }

    public Integer getCountEventAnalyses() {
        return countEventAnalyses;
    }
    public void setCountEventAnalyses(Integer countEventAnalyses) {
        this.countEventAnalyses = countEventAnalyses;
    }

    public java.util.List<RetentionAnalysisDto> getRetentionAnalyses() {
        return retentionAnalyses;
    }
    public void setRetentionAnalyses(java.util.List<RetentionAnalysisDto> retentionAnalyses) {
        this.retentionAnalyses = retentionAnalyses;
    }

    public Integer getCountRetentionAnalyses() {
        return countRetentionAnalyses;
    }
    public void setCountRetentionAnalyses(Integer countRetentionAnalyses) {
        this.countRetentionAnalyses = countRetentionAnalyses;
    }

    public java.util.List<DashboardDto> getDashboards() {
        return dashboards;
    }
    public void setDashboards(java.util.List<DashboardDto> dashboards) {
        this.dashboards = dashboards;
    }

    public Integer getCountDashboards() {
        return countDashboards;
    }
    public void setCountDashboards(Integer countDashboards) {
        this.countDashboards = countDashboards;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (personaMeasurements != null) {
            joiner.add("personaMeasurements: " + GraphQLRequestSerializer.getEntry(personaMeasurements));
        }
        if (utmArguments != null) {
            joiner.add("utmArguments: " + GraphQLRequestSerializer.getEntry(utmArguments));
        }
        if (projectInfo != null) {
            joiner.add("projectInfo: " + GraphQLRequestSerializer.getEntry(projectInfo));
        }
        if (originDataSettings != null) {
            joiner.add("originDataSettings: " + GraphQLRequestSerializer.getEntry(originDataSettings));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (countTags != null) {
            joiner.add("countTags: " + GraphQLRequestSerializer.getEntry(countTags));
        }
        if (segments != null) {
            joiner.add("segments: " + GraphQLRequestSerializer.getEntry(segments));
        }
        if (countSegments != null) {
            joiner.add("countSegments: " + GraphQLRequestSerializer.getEntry(countSegments));
        }
        if (tunnels != null) {
            joiner.add("tunnels: " + GraphQLRequestSerializer.getEntry(tunnels));
        }
        if (countTunnels != null) {
            joiner.add("countTunnels: " + GraphQLRequestSerializer.getEntry(countTunnels));
        }
        if (eventImportJobs != null) {
            joiner.add("eventImportJobs: " + GraphQLRequestSerializer.getEntry(eventImportJobs));
        }
        if (features != null) {
            joiner.add("features: " + GraphQLRequestSerializer.getEntry(features));
        }
        if (version != null) {
            joiner.add("version: " + GraphQLRequestSerializer.getEntry(version));
        }
        if (permissionModules != null) {
            joiner.add("permissionModules: " + GraphQLRequestSerializer.getEntry(permissionModules));
        }
        if (roles != null) {
            joiner.add("roles: " + GraphQLRequestSerializer.getEntry(roles));
        }
        if (allDepartments != null) {
            joiner.add("allDepartments: " + GraphQLRequestSerializer.getEntry(allDepartments));
        }
        if (customEvents != null) {
            joiner.add("customEvents: " + GraphQLRequestSerializer.getEntry(customEvents));
        }
        if (countCustomEvents != null) {
            joiner.add("countCustomEvents: " + GraphQLRequestSerializer.getEntry(countCustomEvents));
        }
        if (complexMetrics != null) {
            joiner.add("complexMetrics: " + GraphQLRequestSerializer.getEntry(complexMetrics));
        }
        if (preparedMetrics != null) {
            joiner.add("preparedMetrics: " + GraphQLRequestSerializer.getEntry(preparedMetrics));
        }
        if (countComplexMetrics != null) {
            joiner.add("countComplexMetrics: " + GraphQLRequestSerializer.getEntry(countComplexMetrics));
        }
        if (eventVariables != null) {
            joiner.add("eventVariables: " + GraphQLRequestSerializer.getEntry(eventVariables));
        }
        if (countEventVariables != null) {
            joiner.add("countEventVariables: " + GraphQLRequestSerializer.getEntry(countEventVariables));
        }
        if (itemModels != null) {
            joiner.add("itemModels: " + GraphQLRequestSerializer.getEntry(itemModels));
        }
        if (itemVariables != null) {
            joiner.add("itemVariables: " + GraphQLRequestSerializer.getEntry(itemVariables));
        }
        if (countItemVariables != null) {
            joiner.add("countItemVariables: " + GraphQLRequestSerializer.getEntry(countItemVariables));
        }
        if (userVariables != null) {
            joiner.add("userVariables: " + GraphQLRequestSerializer.getEntry(userVariables));
        }
        if (countUserVariables != null) {
            joiner.add("countUserVariables: " + GraphQLRequestSerializer.getEntry(countUserVariables));
        }
        if (userProperties != null) {
            joiner.add("userProperties: " + GraphQLRequestSerializer.getEntry(userProperties));
        }
        if (preparedDimensions != null) {
            joiner.add("preparedDimensions: " + GraphQLRequestSerializer.getEntry(preparedDimensions));
        }
        if (kpiAnalyses != null) {
            joiner.add("kpiAnalyses: " + GraphQLRequestSerializer.getEntry(kpiAnalyses));
        }
        if (countKpiAnalyses != null) {
            joiner.add("countKpiAnalyses: " + GraphQLRequestSerializer.getEntry(countKpiAnalyses));
        }
        if (funnelAnalyses != null) {
            joiner.add("funnelAnalyses: " + GraphQLRequestSerializer.getEntry(funnelAnalyses));
        }
        if (countFunnelAnalyses != null) {
            joiner.add("countFunnelAnalyses: " + GraphQLRequestSerializer.getEntry(countFunnelAnalyses));
        }
        if (frequencyAnalyses != null) {
            joiner.add("frequencyAnalyses: " + GraphQLRequestSerializer.getEntry(frequencyAnalyses));
        }
        if (countFrequencyAnalyses != null) {
            joiner.add("countFrequencyAnalyses: " + GraphQLRequestSerializer.getEntry(countFrequencyAnalyses));
        }
        if (eventAnalyses != null) {
            joiner.add("eventAnalyses: " + GraphQLRequestSerializer.getEntry(eventAnalyses));
        }
        if (countEventAnalyses != null) {
            joiner.add("countEventAnalyses: " + GraphQLRequestSerializer.getEntry(countEventAnalyses));
        }
        if (retentionAnalyses != null) {
            joiner.add("retentionAnalyses: " + GraphQLRequestSerializer.getEntry(retentionAnalyses));
        }
        if (countRetentionAnalyses != null) {
            joiner.add("countRetentionAnalyses: " + GraphQLRequestSerializer.getEntry(countRetentionAnalyses));
        }
        if (dashboards != null) {
            joiner.add("dashboards: " + GraphQLRequestSerializer.getEntry(dashboards));
        }
        if (countDashboards != null) {
            joiner.add("countDashboards: " + GraphQLRequestSerializer.getEntry(countDashboards));
        }
        return joiner.toString();
    }

    public static QueryDto.Builder builder() {
        return new QueryDto.Builder();
    }

    public static class Builder {

        private java.util.List<MeasurementDto> personaMeasurements;
        private java.util.List<UtmArgumentDto> utmArguments;
        private ProjectInfoDto projectInfo;
        private java.util.List<OriginDataSettingDto> originDataSettings;
        private java.util.List<TagDto> tags;
        private Integer countTags;
        private java.util.List<SegmentDto> segments;
        private Integer countSegments;
        private java.util.List<TunnelDto> tunnels;
        private Integer countTunnels;
        private java.util.List<EventImportJobDto> eventImportJobs;
        private java.util.List<FeatureDto> features;
        private String version;
        private java.util.List<ModuleDto> permissionModules;
        private java.util.List<RoleDto> roles;
        private java.util.List<DepartmentDto> allDepartments;
        private java.util.List<CustomEventDto> customEvents;
        private Integer countCustomEvents;
        private java.util.List<ComplexMetricDto> complexMetrics;
        private java.util.List<PreparedMetricDto> preparedMetrics;
        private Integer countComplexMetrics;
        private java.util.List<EventVariableDto> eventVariables;
        private Integer countEventVariables;
        private java.util.List<ItemModelDto> itemModels;
        private java.util.List<ItemVariableDto> itemVariables;
        private Integer countItemVariables;
        private java.util.List<UserVariableDto> userVariables;
        private Integer countUserVariables;
        private java.util.List<UserPropertyDto> userProperties;
        private java.util.List<PreparedDimensionDto> preparedDimensions;
        private java.util.List<KpiAnalysisDto> kpiAnalyses;
        private Integer countKpiAnalyses;
        private java.util.List<FunnelAnalysisDto> funnelAnalyses;
        private Integer countFunnelAnalyses;
        private java.util.List<FrequencyAnalysisDto> frequencyAnalyses;
        private Integer countFrequencyAnalyses;
        private java.util.List<EventAnalysisDto> eventAnalyses;
        private Integer countEventAnalyses;
        private java.util.List<RetentionAnalysisDto> retentionAnalyses;
        private Integer countRetentionAnalyses;
        private java.util.List<DashboardDto> dashboards;
        private Integer countDashboards;

        public Builder() {
        }

        public Builder setPersonaMeasurements(java.util.List<MeasurementDto> personaMeasurements) {
            this.personaMeasurements = personaMeasurements;
            return this;
        }

        public Builder setUtmArguments(java.util.List<UtmArgumentDto> utmArguments) {
            this.utmArguments = utmArguments;
            return this;
        }

        public Builder setProjectInfo(ProjectInfoDto projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }

        public Builder setOriginDataSettings(java.util.List<OriginDataSettingDto> originDataSettings) {
            this.originDataSettings = originDataSettings;
            return this;
        }

        public Builder setTags(java.util.List<TagDto> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setCountTags(Integer countTags) {
            this.countTags = countTags;
            return this;
        }

        public Builder setSegments(java.util.List<SegmentDto> segments) {
            this.segments = segments;
            return this;
        }

        public Builder setCountSegments(Integer countSegments) {
            this.countSegments = countSegments;
            return this;
        }

        public Builder setTunnels(java.util.List<TunnelDto> tunnels) {
            this.tunnels = tunnels;
            return this;
        }

        public Builder setCountTunnels(Integer countTunnels) {
            this.countTunnels = countTunnels;
            return this;
        }

        public Builder setEventImportJobs(java.util.List<EventImportJobDto> eventImportJobs) {
            this.eventImportJobs = eventImportJobs;
            return this;
        }

        public Builder setFeatures(java.util.List<FeatureDto> features) {
            this.features = features;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setPermissionModules(java.util.List<ModuleDto> permissionModules) {
            this.permissionModules = permissionModules;
            return this;
        }

        public Builder setRoles(java.util.List<RoleDto> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setAllDepartments(java.util.List<DepartmentDto> allDepartments) {
            this.allDepartments = allDepartments;
            return this;
        }

        public Builder setCustomEvents(java.util.List<CustomEventDto> customEvents) {
            this.customEvents = customEvents;
            return this;
        }

        public Builder setCountCustomEvents(Integer countCustomEvents) {
            this.countCustomEvents = countCustomEvents;
            return this;
        }

        public Builder setComplexMetrics(java.util.List<ComplexMetricDto> complexMetrics) {
            this.complexMetrics = complexMetrics;
            return this;
        }

        public Builder setPreparedMetrics(java.util.List<PreparedMetricDto> preparedMetrics) {
            this.preparedMetrics = preparedMetrics;
            return this;
        }

        public Builder setCountComplexMetrics(Integer countComplexMetrics) {
            this.countComplexMetrics = countComplexMetrics;
            return this;
        }

        public Builder setEventVariables(java.util.List<EventVariableDto> eventVariables) {
            this.eventVariables = eventVariables;
            return this;
        }

        public Builder setCountEventVariables(Integer countEventVariables) {
            this.countEventVariables = countEventVariables;
            return this;
        }

        public Builder setItemModels(java.util.List<ItemModelDto> itemModels) {
            this.itemModels = itemModels;
            return this;
        }

        public Builder setItemVariables(java.util.List<ItemVariableDto> itemVariables) {
            this.itemVariables = itemVariables;
            return this;
        }

        public Builder setCountItemVariables(Integer countItemVariables) {
            this.countItemVariables = countItemVariables;
            return this;
        }

        public Builder setUserVariables(java.util.List<UserVariableDto> userVariables) {
            this.userVariables = userVariables;
            return this;
        }

        public Builder setCountUserVariables(Integer countUserVariables) {
            this.countUserVariables = countUserVariables;
            return this;
        }

        public Builder setUserProperties(java.util.List<UserPropertyDto> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setPreparedDimensions(java.util.List<PreparedDimensionDto> preparedDimensions) {
            this.preparedDimensions = preparedDimensions;
            return this;
        }

        public Builder setKpiAnalyses(java.util.List<KpiAnalysisDto> kpiAnalyses) {
            this.kpiAnalyses = kpiAnalyses;
            return this;
        }

        public Builder setCountKpiAnalyses(Integer countKpiAnalyses) {
            this.countKpiAnalyses = countKpiAnalyses;
            return this;
        }

        public Builder setFunnelAnalyses(java.util.List<FunnelAnalysisDto> funnelAnalyses) {
            this.funnelAnalyses = funnelAnalyses;
            return this;
        }

        public Builder setCountFunnelAnalyses(Integer countFunnelAnalyses) {
            this.countFunnelAnalyses = countFunnelAnalyses;
            return this;
        }

        public Builder setFrequencyAnalyses(java.util.List<FrequencyAnalysisDto> frequencyAnalyses) {
            this.frequencyAnalyses = frequencyAnalyses;
            return this;
        }

        public Builder setCountFrequencyAnalyses(Integer countFrequencyAnalyses) {
            this.countFrequencyAnalyses = countFrequencyAnalyses;
            return this;
        }

        public Builder setEventAnalyses(java.util.List<EventAnalysisDto> eventAnalyses) {
            this.eventAnalyses = eventAnalyses;
            return this;
        }

        public Builder setCountEventAnalyses(Integer countEventAnalyses) {
            this.countEventAnalyses = countEventAnalyses;
            return this;
        }

        public Builder setRetentionAnalyses(java.util.List<RetentionAnalysisDto> retentionAnalyses) {
            this.retentionAnalyses = retentionAnalyses;
            return this;
        }

        public Builder setCountRetentionAnalyses(Integer countRetentionAnalyses) {
            this.countRetentionAnalyses = countRetentionAnalyses;
            return this;
        }

        public Builder setDashboards(java.util.List<DashboardDto> dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        public Builder setCountDashboards(Integer countDashboards) {
            this.countDashboards = countDashboards;
            return this;
        }


        public QueryDto build() {
            return new QueryDto(personaMeasurements, utmArguments, projectInfo, originDataSettings, tags, countTags, segments, countSegments, tunnels, countTunnels, eventImportJobs, features, version, permissionModules, roles, allDepartments, customEvents, countCustomEvents, complexMetrics, preparedMetrics, countComplexMetrics, eventVariables, countEventVariables, itemModels, itemVariables, countItemVariables, userVariables, countUserVariables, userProperties, preparedDimensions, kpiAnalyses, countKpiAnalyses, funnelAnalyses, countFunnelAnalyses, frequencyAnalyses, countFrequencyAnalyses, eventAnalyses, countEventAnalyses, retentionAnalyses, countRetentionAnalyses, dashboards, countDashboards);
        }

    }
}
