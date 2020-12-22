package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Created automatically at 2020-12-22T15:09:56.734. Don't modify it
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class QueryDto implements java.io.Serializable {

    private java.util.List<UtmArgumentDto> utmArguments;
    @javax.validation.constraints.NotNull
    private DataCenterInfoDto dataCenterInfo;
    @javax.validation.constraints.NotNull
    private java.util.List<OriginDataSettingDto> originDataSettings;
    private java.util.List<TagDto> dataCenterTags;
    private Integer dataCenterCountTags;
    private java.util.List<TunnelDto> tunnels;
    private Integer countTunnels;
    @javax.validation.constraints.NotNull
    private java.util.List<EventImportJobDto> eventImportJobs;
    @javax.validation.constraints.NotNull
    private java.util.List<FeatureDto> features;
    @javax.validation.constraints.NotNull
    private String version;
    private java.util.List<CategoryDto> categories;
    private CategoryDto dataCenterDefaultCategory;
    private java.util.List<CategoryDto> dataCenterTreeLikeCategories;
    private java.util.List<ModuleDto> dataCenterPermissionModules;
    private java.util.List<DataCenterRoleDto> dataCenterRoles;
    @javax.validation.constraints.NotNull
    private java.util.List<DepartmentDto> allDepartments;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectDto> projects;
    @javax.validation.constraints.NotNull
    private java.util.List<ModuleDto> projectPermissionModules;
    @javax.validation.constraints.NotNull
    private MemberDto currentUser;
    private java.util.List<CustomEventDto> dataCenterCustomEvents;
    private java.util.List<PreparedMetricDto> preparedMetrics;
    private java.util.List<UserPropertyDto> userProperties;
    private java.util.List<EventVariableDto> dataCenterEventVariables;
    private Integer dataCenterCountEventVariables;
    private java.util.List<ItemModelDto> dataCenterItemModels;
    private java.util.List<ItemVariableDto> dataCenterItemVariables;
    private Integer dataCenterCountItemVariables;
    private java.util.List<UserVariableDto> dataCenterUserVariables;
    private Integer dataCenterCountUserVariables;
    private java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions;
    private java.util.List<MeasurableDto> dataCenterMeasurements;

    public QueryDto() {
    }

    public QueryDto(java.util.List<UtmArgumentDto> utmArguments, DataCenterInfoDto dataCenterInfo, java.util.List<OriginDataSettingDto> originDataSettings, java.util.List<TagDto> dataCenterTags, Integer dataCenterCountTags, java.util.List<TunnelDto> tunnels, Integer countTunnels, java.util.List<EventImportJobDto> eventImportJobs, java.util.List<FeatureDto> features, String version, java.util.List<CategoryDto> categories, CategoryDto dataCenterDefaultCategory, java.util.List<CategoryDto> dataCenterTreeLikeCategories, java.util.List<ModuleDto> dataCenterPermissionModules, java.util.List<DataCenterRoleDto> dataCenterRoles, java.util.List<DepartmentDto> allDepartments, java.util.List<ProjectDto> projects, java.util.List<ModuleDto> projectPermissionModules, MemberDto currentUser, java.util.List<CustomEventDto> dataCenterCustomEvents, java.util.List<PreparedMetricDto> preparedMetrics, java.util.List<UserPropertyDto> userProperties, java.util.List<EventVariableDto> dataCenterEventVariables, Integer dataCenterCountEventVariables, java.util.List<ItemModelDto> dataCenterItemModels, java.util.List<ItemVariableDto> dataCenterItemVariables, Integer dataCenterCountItemVariables, java.util.List<UserVariableDto> dataCenterUserVariables, Integer dataCenterCountUserVariables, java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions, java.util.List<MeasurableDto> dataCenterMeasurements) {
        this.utmArguments = utmArguments;
        this.dataCenterInfo = dataCenterInfo;
        this.originDataSettings = originDataSettings;
        this.dataCenterTags = dataCenterTags;
        this.dataCenterCountTags = dataCenterCountTags;
        this.tunnels = tunnels;
        this.countTunnels = countTunnels;
        this.eventImportJobs = eventImportJobs;
        this.features = features;
        this.version = version;
        this.categories = categories;
        this.dataCenterDefaultCategory = dataCenterDefaultCategory;
        this.dataCenterTreeLikeCategories = dataCenterTreeLikeCategories;
        this.dataCenterPermissionModules = dataCenterPermissionModules;
        this.dataCenterRoles = dataCenterRoles;
        this.allDepartments = allDepartments;
        this.projects = projects;
        this.projectPermissionModules = projectPermissionModules;
        this.currentUser = currentUser;
        this.dataCenterCustomEvents = dataCenterCustomEvents;
        this.preparedMetrics = preparedMetrics;
        this.userProperties = userProperties;
        this.dataCenterEventVariables = dataCenterEventVariables;
        this.dataCenterCountEventVariables = dataCenterCountEventVariables;
        this.dataCenterItemModels = dataCenterItemModels;
        this.dataCenterItemVariables = dataCenterItemVariables;
        this.dataCenterCountItemVariables = dataCenterCountItemVariables;
        this.dataCenterUserVariables = dataCenterUserVariables;
        this.dataCenterCountUserVariables = dataCenterCountUserVariables;
        this.dataCenterPreparedDimensions = dataCenterPreparedDimensions;
        this.dataCenterMeasurements = dataCenterMeasurements;
    }

    public java.util.List<UtmArgumentDto> getUtmArguments() {
        return utmArguments;
    }
    public void setUtmArguments(java.util.List<UtmArgumentDto> utmArguments) {
        this.utmArguments = utmArguments;
    }

    public DataCenterInfoDto getDataCenterInfo() {
        return dataCenterInfo;
    }
    public void setDataCenterInfo(DataCenterInfoDto dataCenterInfo) {
        this.dataCenterInfo = dataCenterInfo;
    }

    public java.util.List<OriginDataSettingDto> getOriginDataSettings() {
        return originDataSettings;
    }
    public void setOriginDataSettings(java.util.List<OriginDataSettingDto> originDataSettings) {
        this.originDataSettings = originDataSettings;
    }

    /**
     * 数据中心标签列表
     */
    public java.util.List<TagDto> getDataCenterTags() {
        return dataCenterTags;
    }
    /**
     * 数据中心标签列表
     */
    public void setDataCenterTags(java.util.List<TagDto> dataCenterTags) {
        this.dataCenterTags = dataCenterTags;
    }

    public Integer getDataCenterCountTags() {
        return dataCenterCountTags;
    }
    public void setDataCenterCountTags(Integer dataCenterCountTags) {
        this.dataCenterCountTags = dataCenterCountTags;
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

    public java.util.List<CategoryDto> getCategories() {
        return categories;
    }
    public void setCategories(java.util.List<CategoryDto> categories) {
        this.categories = categories;
    }

    public CategoryDto getDataCenterDefaultCategory() {
        return dataCenterDefaultCategory;
    }
    public void setDataCenterDefaultCategory(CategoryDto dataCenterDefaultCategory) {
        this.dataCenterDefaultCategory = dataCenterDefaultCategory;
    }

    public java.util.List<CategoryDto> getDataCenterTreeLikeCategories() {
        return dataCenterTreeLikeCategories;
    }
    public void setDataCenterTreeLikeCategories(java.util.List<CategoryDto> dataCenterTreeLikeCategories) {
        this.dataCenterTreeLikeCategories = dataCenterTreeLikeCategories;
    }

    public java.util.List<ModuleDto> getDataCenterPermissionModules() {
        return dataCenterPermissionModules;
    }
    public void setDataCenterPermissionModules(java.util.List<ModuleDto> dataCenterPermissionModules) {
        this.dataCenterPermissionModules = dataCenterPermissionModules;
    }

    public java.util.List<DataCenterRoleDto> getDataCenterRoles() {
        return dataCenterRoles;
    }
    public void setDataCenterRoles(java.util.List<DataCenterRoleDto> dataCenterRoles) {
        this.dataCenterRoles = dataCenterRoles;
    }

    public java.util.List<DepartmentDto> getAllDepartments() {
        return allDepartments;
    }
    public void setAllDepartments(java.util.List<DepartmentDto> allDepartments) {
        this.allDepartments = allDepartments;
    }

    public java.util.List<ProjectDto> getProjects() {
        return projects;
    }
    public void setProjects(java.util.List<ProjectDto> projects) {
        this.projects = projects;
    }

    public java.util.List<ModuleDto> getProjectPermissionModules() {
        return projectPermissionModules;
    }
    public void setProjectPermissionModules(java.util.List<ModuleDto> projectPermissionModules) {
        this.projectPermissionModules = projectPermissionModules;
    }

    public MemberDto getCurrentUser() {
        return currentUser;
    }
    public void setCurrentUser(MemberDto currentUser) {
        this.currentUser = currentUser;
    }

    public java.util.List<CustomEventDto> getDataCenterCustomEvents() {
        return dataCenterCustomEvents;
    }
    public void setDataCenterCustomEvents(java.util.List<CustomEventDto> dataCenterCustomEvents) {
        this.dataCenterCustomEvents = dataCenterCustomEvents;
    }

    public java.util.List<PreparedMetricDto> getPreparedMetrics() {
        return preparedMetrics;
    }
    public void setPreparedMetrics(java.util.List<PreparedMetricDto> preparedMetrics) {
        this.preparedMetrics = preparedMetrics;
    }

    public java.util.List<UserPropertyDto> getUserProperties() {
        return userProperties;
    }
    public void setUserProperties(java.util.List<UserPropertyDto> userProperties) {
        this.userProperties = userProperties;
    }

    /**
     * 数据中心的事件变量列表
     */
    public java.util.List<EventVariableDto> getDataCenterEventVariables() {
        return dataCenterEventVariables;
    }
    /**
     * 数据中心的事件变量列表
     */
    public void setDataCenterEventVariables(java.util.List<EventVariableDto> dataCenterEventVariables) {
        this.dataCenterEventVariables = dataCenterEventVariables;
    }

    /**
     * 数据中心的事件变量数量
     */
    public Integer getDataCenterCountEventVariables() {
        return dataCenterCountEventVariables;
    }
    /**
     * 数据中心的事件变量数量
     */
    public void setDataCenterCountEventVariables(Integer dataCenterCountEventVariables) {
        this.dataCenterCountEventVariables = dataCenterCountEventVariables;
    }

    /**
     * 数据中心物品模型列表
     */
    public java.util.List<ItemModelDto> getDataCenterItemModels() {
        return dataCenterItemModels;
    }
    /**
     * 数据中心物品模型列表
     */
    public void setDataCenterItemModels(java.util.List<ItemModelDto> dataCenterItemModels) {
        this.dataCenterItemModels = dataCenterItemModels;
    }

    /**
     * 数据中心的物品模型变量
     */
    public java.util.List<ItemVariableDto> getDataCenterItemVariables() {
        return dataCenterItemVariables;
    }
    /**
     * 数据中心的物品模型变量
     */
    public void setDataCenterItemVariables(java.util.List<ItemVariableDto> dataCenterItemVariables) {
        this.dataCenterItemVariables = dataCenterItemVariables;
    }

    /**
     * 数据中心的物品模型变量数量
     */
    public Integer getDataCenterCountItemVariables() {
        return dataCenterCountItemVariables;
    }
    /**
     * 数据中心的物品模型变量数量
     */
    public void setDataCenterCountItemVariables(Integer dataCenterCountItemVariables) {
        this.dataCenterCountItemVariables = dataCenterCountItemVariables;
    }

    /**
     * 数据中心的用户变量列表
     */
    public java.util.List<UserVariableDto> getDataCenterUserVariables() {
        return dataCenterUserVariables;
    }
    /**
     * 数据中心的用户变量列表
     */
    public void setDataCenterUserVariables(java.util.List<UserVariableDto> dataCenterUserVariables) {
        this.dataCenterUserVariables = dataCenterUserVariables;
    }

    /**
     * 数据中心的用户变量数量
     */
    public Integer getDataCenterCountUserVariables() {
        return dataCenterCountUserVariables;
    }
    /**
     * 数据中心的用户变量数量
     */
    public void setDataCenterCountUserVariables(Integer dataCenterCountUserVariables) {
        this.dataCenterCountUserVariables = dataCenterCountUserVariables;
    }

    /**
     * 数据中心的预定定维度
     */
    public java.util.List<PreparedDimensionDto> getDataCenterPreparedDimensions() {
        return dataCenterPreparedDimensions;
    }
    /**
     * 数据中心的预定定维度
     */
    public void setDataCenterPreparedDimensions(java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions) {
        this.dataCenterPreparedDimensions = dataCenterPreparedDimensions;
    }

    /**
     * 数据中心的指标列表
     */
    public java.util.List<MeasurableDto> getDataCenterMeasurements() {
        return dataCenterMeasurements;
    }
    /**
     * 数据中心的指标列表
     */
    public void setDataCenterMeasurements(java.util.List<MeasurableDto> dataCenterMeasurements) {
        this.dataCenterMeasurements = dataCenterMeasurements;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (utmArguments != null) {
            joiner.add("utmArguments: " + GraphQLRequestSerializer.getEntry(utmArguments));
        }
        if (dataCenterInfo != null) {
            joiner.add("dataCenterInfo: " + GraphQLRequestSerializer.getEntry(dataCenterInfo));
        }
        if (originDataSettings != null) {
            joiner.add("originDataSettings: " + GraphQLRequestSerializer.getEntry(originDataSettings));
        }
        if (dataCenterTags != null) {
            joiner.add("dataCenterTags: " + GraphQLRequestSerializer.getEntry(dataCenterTags));
        }
        if (dataCenterCountTags != null) {
            joiner.add("dataCenterCountTags: " + GraphQLRequestSerializer.getEntry(dataCenterCountTags));
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
        if (categories != null) {
            joiner.add("categories: " + GraphQLRequestSerializer.getEntry(categories));
        }
        if (dataCenterDefaultCategory != null) {
            joiner.add("dataCenterDefaultCategory: " + GraphQLRequestSerializer.getEntry(dataCenterDefaultCategory));
        }
        if (dataCenterTreeLikeCategories != null) {
            joiner.add("dataCenterTreeLikeCategories: " + GraphQLRequestSerializer.getEntry(dataCenterTreeLikeCategories));
        }
        if (dataCenterPermissionModules != null) {
            joiner.add("dataCenterPermissionModules: " + GraphQLRequestSerializer.getEntry(dataCenterPermissionModules));
        }
        if (dataCenterRoles != null) {
            joiner.add("dataCenterRoles: " + GraphQLRequestSerializer.getEntry(dataCenterRoles));
        }
        if (allDepartments != null) {
            joiner.add("allDepartments: " + GraphQLRequestSerializer.getEntry(allDepartments));
        }
        if (projects != null) {
            joiner.add("projects: " + GraphQLRequestSerializer.getEntry(projects));
        }
        if (projectPermissionModules != null) {
            joiner.add("projectPermissionModules: " + GraphQLRequestSerializer.getEntry(projectPermissionModules));
        }
        if (currentUser != null) {
            joiner.add("currentUser: " + GraphQLRequestSerializer.getEntry(currentUser));
        }
        if (dataCenterCustomEvents != null) {
            joiner.add("dataCenterCustomEvents: " + GraphQLRequestSerializer.getEntry(dataCenterCustomEvents));
        }
        if (preparedMetrics != null) {
            joiner.add("preparedMetrics: " + GraphQLRequestSerializer.getEntry(preparedMetrics));
        }
        if (userProperties != null) {
            joiner.add("userProperties: " + GraphQLRequestSerializer.getEntry(userProperties));
        }
        if (dataCenterEventVariables != null) {
            joiner.add("dataCenterEventVariables: " + GraphQLRequestSerializer.getEntry(dataCenterEventVariables));
        }
        if (dataCenterCountEventVariables != null) {
            joiner.add("dataCenterCountEventVariables: " + GraphQLRequestSerializer.getEntry(dataCenterCountEventVariables));
        }
        if (dataCenterItemModels != null) {
            joiner.add("dataCenterItemModels: " + GraphQLRequestSerializer.getEntry(dataCenterItemModels));
        }
        if (dataCenterItemVariables != null) {
            joiner.add("dataCenterItemVariables: " + GraphQLRequestSerializer.getEntry(dataCenterItemVariables));
        }
        if (dataCenterCountItemVariables != null) {
            joiner.add("dataCenterCountItemVariables: " + GraphQLRequestSerializer.getEntry(dataCenterCountItemVariables));
        }
        if (dataCenterUserVariables != null) {
            joiner.add("dataCenterUserVariables: " + GraphQLRequestSerializer.getEntry(dataCenterUserVariables));
        }
        if (dataCenterCountUserVariables != null) {
            joiner.add("dataCenterCountUserVariables: " + GraphQLRequestSerializer.getEntry(dataCenterCountUserVariables));
        }
        if (dataCenterPreparedDimensions != null) {
            joiner.add("dataCenterPreparedDimensions: " + GraphQLRequestSerializer.getEntry(dataCenterPreparedDimensions));
        }
        if (dataCenterMeasurements != null) {
            joiner.add("dataCenterMeasurements: " + GraphQLRequestSerializer.getEntry(dataCenterMeasurements));
        }
        return joiner.toString();
    }

    public static QueryDto.Builder builder() {
        return new QueryDto.Builder();
    }

    public static class Builder {

        private java.util.List<UtmArgumentDto> utmArguments;
        private DataCenterInfoDto dataCenterInfo;
        private java.util.List<OriginDataSettingDto> originDataSettings;
        private java.util.List<TagDto> dataCenterTags;
        private Integer dataCenterCountTags;
        private java.util.List<TunnelDto> tunnels;
        private Integer countTunnels;
        private java.util.List<EventImportJobDto> eventImportJobs;
        private java.util.List<FeatureDto> features;
        private String version;
        private java.util.List<CategoryDto> categories;
        private CategoryDto dataCenterDefaultCategory;
        private java.util.List<CategoryDto> dataCenterTreeLikeCategories;
        private java.util.List<ModuleDto> dataCenterPermissionModules;
        private java.util.List<DataCenterRoleDto> dataCenterRoles;
        private java.util.List<DepartmentDto> allDepartments;
        private java.util.List<ProjectDto> projects;
        private java.util.List<ModuleDto> projectPermissionModules;
        private MemberDto currentUser;
        private java.util.List<CustomEventDto> dataCenterCustomEvents;
        private java.util.List<PreparedMetricDto> preparedMetrics;
        private java.util.List<UserPropertyDto> userProperties;
        private java.util.List<EventVariableDto> dataCenterEventVariables;
        private Integer dataCenterCountEventVariables;
        private java.util.List<ItemModelDto> dataCenterItemModels;
        private java.util.List<ItemVariableDto> dataCenterItemVariables;
        private Integer dataCenterCountItemVariables;
        private java.util.List<UserVariableDto> dataCenterUserVariables;
        private Integer dataCenterCountUserVariables;
        private java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions;
        private java.util.List<MeasurableDto> dataCenterMeasurements;

        public Builder() {
        }

        public Builder setUtmArguments(java.util.List<UtmArgumentDto> utmArguments) {
            this.utmArguments = utmArguments;
            return this;
        }

        public Builder setDataCenterInfo(DataCenterInfoDto dataCenterInfo) {
            this.dataCenterInfo = dataCenterInfo;
            return this;
        }

        public Builder setOriginDataSettings(java.util.List<OriginDataSettingDto> originDataSettings) {
            this.originDataSettings = originDataSettings;
            return this;
        }

        /**
         * 数据中心标签列表
         */
        public Builder setDataCenterTags(java.util.List<TagDto> dataCenterTags) {
            this.dataCenterTags = dataCenterTags;
            return this;
        }

        public Builder setDataCenterCountTags(Integer dataCenterCountTags) {
            this.dataCenterCountTags = dataCenterCountTags;
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

        public Builder setCategories(java.util.List<CategoryDto> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setDataCenterDefaultCategory(CategoryDto dataCenterDefaultCategory) {
            this.dataCenterDefaultCategory = dataCenterDefaultCategory;
            return this;
        }

        public Builder setDataCenterTreeLikeCategories(java.util.List<CategoryDto> dataCenterTreeLikeCategories) {
            this.dataCenterTreeLikeCategories = dataCenterTreeLikeCategories;
            return this;
        }

        public Builder setDataCenterPermissionModules(java.util.List<ModuleDto> dataCenterPermissionModules) {
            this.dataCenterPermissionModules = dataCenterPermissionModules;
            return this;
        }

        public Builder setDataCenterRoles(java.util.List<DataCenterRoleDto> dataCenterRoles) {
            this.dataCenterRoles = dataCenterRoles;
            return this;
        }

        public Builder setAllDepartments(java.util.List<DepartmentDto> allDepartments) {
            this.allDepartments = allDepartments;
            return this;
        }

        public Builder setProjects(java.util.List<ProjectDto> projects) {
            this.projects = projects;
            return this;
        }

        public Builder setProjectPermissionModules(java.util.List<ModuleDto> projectPermissionModules) {
            this.projectPermissionModules = projectPermissionModules;
            return this;
        }

        public Builder setCurrentUser(MemberDto currentUser) {
            this.currentUser = currentUser;
            return this;
        }

        public Builder setDataCenterCustomEvents(java.util.List<CustomEventDto> dataCenterCustomEvents) {
            this.dataCenterCustomEvents = dataCenterCustomEvents;
            return this;
        }

        public Builder setPreparedMetrics(java.util.List<PreparedMetricDto> preparedMetrics) {
            this.preparedMetrics = preparedMetrics;
            return this;
        }

        public Builder setUserProperties(java.util.List<UserPropertyDto> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        /**
         * 数据中心的事件变量列表
         */
        public Builder setDataCenterEventVariables(java.util.List<EventVariableDto> dataCenterEventVariables) {
            this.dataCenterEventVariables = dataCenterEventVariables;
            return this;
        }

        /**
         * 数据中心的事件变量数量
         */
        public Builder setDataCenterCountEventVariables(Integer dataCenterCountEventVariables) {
            this.dataCenterCountEventVariables = dataCenterCountEventVariables;
            return this;
        }

        /**
         * 数据中心物品模型列表
         */
        public Builder setDataCenterItemModels(java.util.List<ItemModelDto> dataCenterItemModels) {
            this.dataCenterItemModels = dataCenterItemModels;
            return this;
        }

        /**
         * 数据中心的物品模型变量
         */
        public Builder setDataCenterItemVariables(java.util.List<ItemVariableDto> dataCenterItemVariables) {
            this.dataCenterItemVariables = dataCenterItemVariables;
            return this;
        }

        /**
         * 数据中心的物品模型变量数量
         */
        public Builder setDataCenterCountItemVariables(Integer dataCenterCountItemVariables) {
            this.dataCenterCountItemVariables = dataCenterCountItemVariables;
            return this;
        }

        /**
         * 数据中心的用户变量列表
         */
        public Builder setDataCenterUserVariables(java.util.List<UserVariableDto> dataCenterUserVariables) {
            this.dataCenterUserVariables = dataCenterUserVariables;
            return this;
        }

        /**
         * 数据中心的用户变量数量
         */
        public Builder setDataCenterCountUserVariables(Integer dataCenterCountUserVariables) {
            this.dataCenterCountUserVariables = dataCenterCountUserVariables;
            return this;
        }

        /**
         * 数据中心的预定定维度
         */
        public Builder setDataCenterPreparedDimensions(java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions) {
            this.dataCenterPreparedDimensions = dataCenterPreparedDimensions;
            return this;
        }

        /**
         * 数据中心的指标列表
         */
        public Builder setDataCenterMeasurements(java.util.List<MeasurableDto> dataCenterMeasurements) {
            this.dataCenterMeasurements = dataCenterMeasurements;
            return this;
        }


        public QueryDto build() {
            return new QueryDto(utmArguments, dataCenterInfo, originDataSettings, dataCenterTags, dataCenterCountTags, tunnels, countTunnels, eventImportJobs, features, version, categories, dataCenterDefaultCategory, dataCenterTreeLikeCategories, dataCenterPermissionModules, dataCenterRoles, allDepartments, projects, projectPermissionModules, currentUser, dataCenterCustomEvents, preparedMetrics, userProperties, dataCenterEventVariables, dataCenterCountEventVariables, dataCenterItemModels, dataCenterItemVariables, dataCenterCountItemVariables, dataCenterUserVariables, dataCenterCountUserVariables, dataCenterPreparedDimensions, dataCenterMeasurements);
        }

    }
}
