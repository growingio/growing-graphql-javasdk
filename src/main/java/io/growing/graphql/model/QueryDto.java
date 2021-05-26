package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Created automatically at 2021-05-26T15:00:48.749974. Don't modify it
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryDto implements java.io.Serializable {

    private java.util.List<UtmArgumentDto> utmArguments;
    @javax.validation.constraints.NotNull
    private DataCenterInfoDto dataCenterInfo;
    @javax.validation.constraints.NotNull
    private java.util.List<OriginDataSettingDto> originDataSettings;
    private WaterMarkSettingDto waterMarkSetting;
    private java.util.List<TagDto> dataCenterTags;
    private Integer countDataCenterTags;
    @javax.validation.constraints.NotNull
    private java.util.List<TableInfoDto> tableDataDescription;
    @javax.validation.constraints.NotNull
    private TencentPortraitQuotasInfoDto tencentPortraitQuotas;
    private java.util.List<TunnelDto> tunnels;
    private Integer countTunnels;
    @javax.validation.constraints.NotNull
    private java.util.List<EventImportJobDto> eventImportJobs;
    @javax.validation.constraints.NotNull
    private AuditLogQueryOptionDto logQueryOptions;
    @javax.validation.constraints.NotNull
    private java.util.List<FeatureDto> features;
    @javax.validation.constraints.NotNull
    private String version;
    private java.util.List<ModuleDto> dataCenterPermissionModules;
    private java.util.List<DataCenterRoleDto> dataCenterRoles;
    @javax.validation.constraints.NotNull
    private java.util.List<DepartmentDto> allDepartments;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectDto> projects;
    @javax.validation.constraints.NotNull
    private java.util.List<ModuleDto> projectPermissionModules;
    @javax.validation.constraints.NotNull
    private java.util.List<UserProjectRoleTupleDto> currentUserProjectRoleTuples;
    @javax.validation.constraints.NotNull
    private java.util.List<WebHookDto> webHooks;
    @javax.validation.constraints.NotNull
    private java.util.List<NotificationTaskDto> notificationTasks;
    private HubbleInfoDto hubble;
    @javax.validation.constraints.NotNull
    private MemberDto currentUser;
    @javax.validation.constraints.NotNull
    private java.util.List<AccountApplicationDto> accountApplications;
    @javax.validation.constraints.NotNull
    private AccountApplicationSettingDto accountApplicationSetting;
    @javax.validation.constraints.NotNull
    private PasswordRecoverySettingDto passwordRecoverySetting;
    private java.util.List<CustomEventDto> dataCenterCustomEvents;
    private java.util.List<PreparedMetricDto> preparedMetrics;
    private java.util.List<EventVariableDto> dataCenterEventVariables;
    private Integer countDataCenterEventVariables;
    private java.util.List<ItemModelDto> dataCenterItemModels;
    private java.util.List<ItemVariableDto> dataCenterItemVariables;
    private java.util.List<UserVariableDto> dataCenterUserVariables;
    private Integer countDataCenterUserVariables;
    private java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions;
    private java.util.List<MeasurableDto> dataCenterMeasurements;
    @javax.validation.constraints.NotNull
    private java.util.List<UserIdentityDto> dataCenterUserIdentities;

    public QueryDto() {
    }

    public QueryDto(java.util.List<UtmArgumentDto> utmArguments, DataCenterInfoDto dataCenterInfo, java.util.List<OriginDataSettingDto> originDataSettings, WaterMarkSettingDto waterMarkSetting, java.util.List<TagDto> dataCenterTags, Integer countDataCenterTags, java.util.List<TableInfoDto> tableDataDescription, TencentPortraitQuotasInfoDto tencentPortraitQuotas, java.util.List<TunnelDto> tunnels, Integer countTunnels, java.util.List<EventImportJobDto> eventImportJobs, AuditLogQueryOptionDto logQueryOptions, java.util.List<FeatureDto> features, String version, java.util.List<ModuleDto> dataCenterPermissionModules, java.util.List<DataCenterRoleDto> dataCenterRoles, java.util.List<DepartmentDto> allDepartments, java.util.List<ProjectDto> projects, java.util.List<ModuleDto> projectPermissionModules, java.util.List<UserProjectRoleTupleDto> currentUserProjectRoleTuples, java.util.List<WebHookDto> webHooks, java.util.List<NotificationTaskDto> notificationTasks, HubbleInfoDto hubble, MemberDto currentUser, java.util.List<AccountApplicationDto> accountApplications, AccountApplicationSettingDto accountApplicationSetting, PasswordRecoverySettingDto passwordRecoverySetting, java.util.List<CustomEventDto> dataCenterCustomEvents, java.util.List<PreparedMetricDto> preparedMetrics, java.util.List<EventVariableDto> dataCenterEventVariables, Integer countDataCenterEventVariables, java.util.List<ItemModelDto> dataCenterItemModels, java.util.List<ItemVariableDto> dataCenterItemVariables, java.util.List<UserVariableDto> dataCenterUserVariables, Integer countDataCenterUserVariables, java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions, java.util.List<MeasurableDto> dataCenterMeasurements, java.util.List<UserIdentityDto> dataCenterUserIdentities) {
        this.utmArguments = utmArguments;
        this.dataCenterInfo = dataCenterInfo;
        this.originDataSettings = originDataSettings;
        this.waterMarkSetting = waterMarkSetting;
        this.dataCenterTags = dataCenterTags;
        this.countDataCenterTags = countDataCenterTags;
        this.tableDataDescription = tableDataDescription;
        this.tencentPortraitQuotas = tencentPortraitQuotas;
        this.tunnels = tunnels;
        this.countTunnels = countTunnels;
        this.eventImportJobs = eventImportJobs;
        this.logQueryOptions = logQueryOptions;
        this.features = features;
        this.version = version;
        this.dataCenterPermissionModules = dataCenterPermissionModules;
        this.dataCenterRoles = dataCenterRoles;
        this.allDepartments = allDepartments;
        this.projects = projects;
        this.projectPermissionModules = projectPermissionModules;
        this.currentUserProjectRoleTuples = currentUserProjectRoleTuples;
        this.webHooks = webHooks;
        this.notificationTasks = notificationTasks;
        this.hubble = hubble;
        this.currentUser = currentUser;
        this.accountApplications = accountApplications;
        this.accountApplicationSetting = accountApplicationSetting;
        this.passwordRecoverySetting = passwordRecoverySetting;
        this.dataCenterCustomEvents = dataCenterCustomEvents;
        this.preparedMetrics = preparedMetrics;
        this.dataCenterEventVariables = dataCenterEventVariables;
        this.countDataCenterEventVariables = countDataCenterEventVariables;
        this.dataCenterItemModels = dataCenterItemModels;
        this.dataCenterItemVariables = dataCenterItemVariables;
        this.dataCenterUserVariables = dataCenterUserVariables;
        this.countDataCenterUserVariables = countDataCenterUserVariables;
        this.dataCenterPreparedDimensions = dataCenterPreparedDimensions;
        this.dataCenterMeasurements = dataCenterMeasurements;
        this.dataCenterUserIdentities = dataCenterUserIdentities;
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
     * 获取水印配置
     */
    public WaterMarkSettingDto getWaterMarkSetting() {
        return waterMarkSetting;
    }
    /**
     * 获取水印配置
     */
    public void setWaterMarkSetting(WaterMarkSettingDto waterMarkSetting) {
        this.waterMarkSetting = waterMarkSetting;
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

    public Integer getCountDataCenterTags() {
        return countDataCenterTags;
    }
    public void setCountDataCenterTags(Integer countDataCenterTags) {
        this.countDataCenterTags = countDataCenterTags;
    }

    /**
     * 获取所有表字段信息
     */
    public java.util.List<TableInfoDto> getTableDataDescription() {
        return tableDataDescription;
    }
    /**
     * 获取所有表字段信息
     */
    public void setTableDataDescription(java.util.List<TableInfoDto> tableDataDescription) {
        this.tableDataDescription = tableDataDescription;
    }

    /**
     * 查询资源情况
     */
    public TencentPortraitQuotasInfoDto getTencentPortraitQuotas() {
        return tencentPortraitQuotas;
    }
    /**
     * 查询资源情况
     */
    public void setTencentPortraitQuotas(TencentPortraitQuotasInfoDto tencentPortraitQuotas) {
        this.tencentPortraitQuotas = tencentPortraitQuotas;
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

    /**
     * 日志搜索项
     */
    public AuditLogQueryOptionDto getLogQueryOptions() {
        return logQueryOptions;
    }
    /**
     * 日志搜索项
     */
    public void setLogQueryOptions(AuditLogQueryOptionDto logQueryOptions) {
        this.logQueryOptions = logQueryOptions;
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

    /**
     * 获取当前用户所在项目及项目角色
     */
    public java.util.List<UserProjectRoleTupleDto> getCurrentUserProjectRoleTuples() {
        return currentUserProjectRoleTuples;
    }
    /**
     * 获取当前用户所在项目及项目角色
     */
    public void setCurrentUserProjectRoleTuples(java.util.List<UserProjectRoleTupleDto> currentUserProjectRoleTuples) {
        this.currentUserProjectRoleTuples = currentUserProjectRoleTuples;
    }

    public java.util.List<WebHookDto> getWebHooks() {
        return webHooks;
    }
    public void setWebHooks(java.util.List<WebHookDto> webHooks) {
        this.webHooks = webHooks;
    }

    public java.util.List<NotificationTaskDto> getNotificationTasks() {
        return notificationTasks;
    }
    public void setNotificationTasks(java.util.List<NotificationTaskDto> notificationTasks) {
        this.notificationTasks = notificationTasks;
    }

    public HubbleInfoDto getHubble() {
        return hubble;
    }
    public void setHubble(HubbleInfoDto hubble) {
        this.hubble = hubble;
    }

    public MemberDto getCurrentUser() {
        return currentUser;
    }
    public void setCurrentUser(MemberDto currentUser) {
        this.currentUser = currentUser;
    }

    public java.util.List<AccountApplicationDto> getAccountApplications() {
        return accountApplications;
    }
    public void setAccountApplications(java.util.List<AccountApplicationDto> accountApplications) {
        this.accountApplications = accountApplications;
    }

    public AccountApplicationSettingDto getAccountApplicationSetting() {
        return accountApplicationSetting;
    }
    public void setAccountApplicationSetting(AccountApplicationSettingDto accountApplicationSetting) {
        this.accountApplicationSetting = accountApplicationSetting;
    }

    public PasswordRecoverySettingDto getPasswordRecoverySetting() {
        return passwordRecoverySetting;
    }
    public void setPasswordRecoverySetting(PasswordRecoverySettingDto passwordRecoverySetting) {
        this.passwordRecoverySetting = passwordRecoverySetting;
    }

    /**
     * 数据中心 打点事件列表
     */
    public java.util.List<CustomEventDto> getDataCenterCustomEvents() {
        return dataCenterCustomEvents;
    }
    /**
     * 数据中心 打点事件列表
     */
    public void setDataCenterCustomEvents(java.util.List<CustomEventDto> dataCenterCustomEvents) {
        this.dataCenterCustomEvents = dataCenterCustomEvents;
    }

    /**
     * 预定义指标列表
     */
    public java.util.List<PreparedMetricDto> getPreparedMetrics() {
        return preparedMetrics;
    }
    /**
     * 预定义指标列表
     */
    public void setPreparedMetrics(java.util.List<PreparedMetricDto> preparedMetrics) {
        this.preparedMetrics = preparedMetrics;
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
    public Integer getCountDataCenterEventVariables() {
        return countDataCenterEventVariables;
    }
    /**
     * 数据中心的事件变量数量
     */
    public void setCountDataCenterEventVariables(Integer countDataCenterEventVariables) {
        this.countDataCenterEventVariables = countDataCenterEventVariables;
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
    public Integer getCountDataCenterUserVariables() {
        return countDataCenterUserVariables;
    }
    /**
     * 数据中心的用户变量数量
     */
    public void setCountDataCenterUserVariables(Integer countDataCenterUserVariables) {
        this.countDataCenterUserVariables = countDataCenterUserVariables;
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

    /**
     * 数据中心的 用户ID - 所有属性均为预置的用户标识符
     */
    public java.util.List<UserIdentityDto> getDataCenterUserIdentities() {
        return dataCenterUserIdentities;
    }
    /**
     * 数据中心的 用户ID - 所有属性均为预置的用户标识符
     */
    public void setDataCenterUserIdentities(java.util.List<UserIdentityDto> dataCenterUserIdentities) {
        this.dataCenterUserIdentities = dataCenterUserIdentities;
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
        if (waterMarkSetting != null) {
            joiner.add("waterMarkSetting: " + GraphQLRequestSerializer.getEntry(waterMarkSetting));
        }
        if (dataCenterTags != null) {
            joiner.add("dataCenterTags: " + GraphQLRequestSerializer.getEntry(dataCenterTags));
        }
        if (countDataCenterTags != null) {
            joiner.add("countDataCenterTags: " + GraphQLRequestSerializer.getEntry(countDataCenterTags));
        }
        if (tableDataDescription != null) {
            joiner.add("tableDataDescription: " + GraphQLRequestSerializer.getEntry(tableDataDescription));
        }
        if (tencentPortraitQuotas != null) {
            joiner.add("tencentPortraitQuotas: " + GraphQLRequestSerializer.getEntry(tencentPortraitQuotas));
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
        if (logQueryOptions != null) {
            joiner.add("logQueryOptions: " + GraphQLRequestSerializer.getEntry(logQueryOptions));
        }
        if (features != null) {
            joiner.add("features: " + GraphQLRequestSerializer.getEntry(features));
        }
        if (version != null) {
            joiner.add("version: " + GraphQLRequestSerializer.getEntry(version));
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
        if (currentUserProjectRoleTuples != null) {
            joiner.add("currentUserProjectRoleTuples: " + GraphQLRequestSerializer.getEntry(currentUserProjectRoleTuples));
        }
        if (webHooks != null) {
            joiner.add("webHooks: " + GraphQLRequestSerializer.getEntry(webHooks));
        }
        if (notificationTasks != null) {
            joiner.add("notificationTasks: " + GraphQLRequestSerializer.getEntry(notificationTasks));
        }
        if (hubble != null) {
            joiner.add("hubble: " + GraphQLRequestSerializer.getEntry(hubble));
        }
        if (currentUser != null) {
            joiner.add("currentUser: " + GraphQLRequestSerializer.getEntry(currentUser));
        }
        if (accountApplications != null) {
            joiner.add("accountApplications: " + GraphQLRequestSerializer.getEntry(accountApplications));
        }
        if (accountApplicationSetting != null) {
            joiner.add("accountApplicationSetting: " + GraphQLRequestSerializer.getEntry(accountApplicationSetting));
        }
        if (passwordRecoverySetting != null) {
            joiner.add("passwordRecoverySetting: " + GraphQLRequestSerializer.getEntry(passwordRecoverySetting));
        }
        if (dataCenterCustomEvents != null) {
            joiner.add("dataCenterCustomEvents: " + GraphQLRequestSerializer.getEntry(dataCenterCustomEvents));
        }
        if (preparedMetrics != null) {
            joiner.add("preparedMetrics: " + GraphQLRequestSerializer.getEntry(preparedMetrics));
        }
        if (dataCenterEventVariables != null) {
            joiner.add("dataCenterEventVariables: " + GraphQLRequestSerializer.getEntry(dataCenterEventVariables));
        }
        if (countDataCenterEventVariables != null) {
            joiner.add("countDataCenterEventVariables: " + GraphQLRequestSerializer.getEntry(countDataCenterEventVariables));
        }
        if (dataCenterItemModels != null) {
            joiner.add("dataCenterItemModels: " + GraphQLRequestSerializer.getEntry(dataCenterItemModels));
        }
        if (dataCenterItemVariables != null) {
            joiner.add("dataCenterItemVariables: " + GraphQLRequestSerializer.getEntry(dataCenterItemVariables));
        }
        if (dataCenterUserVariables != null) {
            joiner.add("dataCenterUserVariables: " + GraphQLRequestSerializer.getEntry(dataCenterUserVariables));
        }
        if (countDataCenterUserVariables != null) {
            joiner.add("countDataCenterUserVariables: " + GraphQLRequestSerializer.getEntry(countDataCenterUserVariables));
        }
        if (dataCenterPreparedDimensions != null) {
            joiner.add("dataCenterPreparedDimensions: " + GraphQLRequestSerializer.getEntry(dataCenterPreparedDimensions));
        }
        if (dataCenterMeasurements != null) {
            joiner.add("dataCenterMeasurements: " + GraphQLRequestSerializer.getEntry(dataCenterMeasurements));
        }
        if (dataCenterUserIdentities != null) {
            joiner.add("dataCenterUserIdentities: " + GraphQLRequestSerializer.getEntry(dataCenterUserIdentities));
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
        private WaterMarkSettingDto waterMarkSetting;
        private java.util.List<TagDto> dataCenterTags;
        private Integer countDataCenterTags;
        private java.util.List<TableInfoDto> tableDataDescription;
        private TencentPortraitQuotasInfoDto tencentPortraitQuotas;
        private java.util.List<TunnelDto> tunnels;
        private Integer countTunnels;
        private java.util.List<EventImportJobDto> eventImportJobs;
        private AuditLogQueryOptionDto logQueryOptions;
        private java.util.List<FeatureDto> features;
        private String version;
        private java.util.List<ModuleDto> dataCenterPermissionModules;
        private java.util.List<DataCenterRoleDto> dataCenterRoles;
        private java.util.List<DepartmentDto> allDepartments;
        private java.util.List<ProjectDto> projects;
        private java.util.List<ModuleDto> projectPermissionModules;
        private java.util.List<UserProjectRoleTupleDto> currentUserProjectRoleTuples;
        private java.util.List<WebHookDto> webHooks;
        private java.util.List<NotificationTaskDto> notificationTasks;
        private HubbleInfoDto hubble;
        private MemberDto currentUser;
        private java.util.List<AccountApplicationDto> accountApplications;
        private AccountApplicationSettingDto accountApplicationSetting;
        private PasswordRecoverySettingDto passwordRecoverySetting;
        private java.util.List<CustomEventDto> dataCenterCustomEvents;
        private java.util.List<PreparedMetricDto> preparedMetrics;
        private java.util.List<EventVariableDto> dataCenterEventVariables;
        private Integer countDataCenterEventVariables;
        private java.util.List<ItemModelDto> dataCenterItemModels;
        private java.util.List<ItemVariableDto> dataCenterItemVariables;
        private java.util.List<UserVariableDto> dataCenterUserVariables;
        private Integer countDataCenterUserVariables;
        private java.util.List<PreparedDimensionDto> dataCenterPreparedDimensions;
        private java.util.List<MeasurableDto> dataCenterMeasurements;
        private java.util.List<UserIdentityDto> dataCenterUserIdentities;

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
         * 获取水印配置
         */
        public Builder setWaterMarkSetting(WaterMarkSettingDto waterMarkSetting) {
            this.waterMarkSetting = waterMarkSetting;
            return this;
        }

        /**
         * 数据中心标签列表
         */
        public Builder setDataCenterTags(java.util.List<TagDto> dataCenterTags) {
            this.dataCenterTags = dataCenterTags;
            return this;
        }

        public Builder setCountDataCenterTags(Integer countDataCenterTags) {
            this.countDataCenterTags = countDataCenterTags;
            return this;
        }

        /**
         * 获取所有表字段信息
         */
        public Builder setTableDataDescription(java.util.List<TableInfoDto> tableDataDescription) {
            this.tableDataDescription = tableDataDescription;
            return this;
        }

        /**
         * 查询资源情况
         */
        public Builder setTencentPortraitQuotas(TencentPortraitQuotasInfoDto tencentPortraitQuotas) {
            this.tencentPortraitQuotas = tencentPortraitQuotas;
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

        /**
         * 日志搜索项
         */
        public Builder setLogQueryOptions(AuditLogQueryOptionDto logQueryOptions) {
            this.logQueryOptions = logQueryOptions;
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

        /**
         * 获取当前用户所在项目及项目角色
         */
        public Builder setCurrentUserProjectRoleTuples(java.util.List<UserProjectRoleTupleDto> currentUserProjectRoleTuples) {
            this.currentUserProjectRoleTuples = currentUserProjectRoleTuples;
            return this;
        }

        public Builder setWebHooks(java.util.List<WebHookDto> webHooks) {
            this.webHooks = webHooks;
            return this;
        }

        public Builder setNotificationTasks(java.util.List<NotificationTaskDto> notificationTasks) {
            this.notificationTasks = notificationTasks;
            return this;
        }

        public Builder setHubble(HubbleInfoDto hubble) {
            this.hubble = hubble;
            return this;
        }

        public Builder setCurrentUser(MemberDto currentUser) {
            this.currentUser = currentUser;
            return this;
        }

        public Builder setAccountApplications(java.util.List<AccountApplicationDto> accountApplications) {
            this.accountApplications = accountApplications;
            return this;
        }

        public Builder setAccountApplicationSetting(AccountApplicationSettingDto accountApplicationSetting) {
            this.accountApplicationSetting = accountApplicationSetting;
            return this;
        }

        public Builder setPasswordRecoverySetting(PasswordRecoverySettingDto passwordRecoverySetting) {
            this.passwordRecoverySetting = passwordRecoverySetting;
            return this;
        }

        /**
         * 数据中心 打点事件列表
         */
        public Builder setDataCenterCustomEvents(java.util.List<CustomEventDto> dataCenterCustomEvents) {
            this.dataCenterCustomEvents = dataCenterCustomEvents;
            return this;
        }

        /**
         * 预定义指标列表
         */
        public Builder setPreparedMetrics(java.util.List<PreparedMetricDto> preparedMetrics) {
            this.preparedMetrics = preparedMetrics;
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
        public Builder setCountDataCenterEventVariables(Integer countDataCenterEventVariables) {
            this.countDataCenterEventVariables = countDataCenterEventVariables;
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
         * 数据中心的用户变量列表
         */
        public Builder setDataCenterUserVariables(java.util.List<UserVariableDto> dataCenterUserVariables) {
            this.dataCenterUserVariables = dataCenterUserVariables;
            return this;
        }

        /**
         * 数据中心的用户变量数量
         */
        public Builder setCountDataCenterUserVariables(Integer countDataCenterUserVariables) {
            this.countDataCenterUserVariables = countDataCenterUserVariables;
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

        /**
         * 数据中心的 用户ID - 所有属性均为预置的用户标识符
         */
        public Builder setDataCenterUserIdentities(java.util.List<UserIdentityDto> dataCenterUserIdentities) {
            this.dataCenterUserIdentities = dataCenterUserIdentities;
            return this;
        }


        public QueryDto build() {
            return new QueryDto(utmArguments, dataCenterInfo, originDataSettings, waterMarkSetting, dataCenterTags, countDataCenterTags, tableDataDescription, tencentPortraitQuotas, tunnels, countTunnels, eventImportJobs, logQueryOptions, features, version, dataCenterPermissionModules, dataCenterRoles, allDepartments, projects, projectPermissionModules, currentUserProjectRoleTuples, webHooks, notificationTasks, hubble, currentUser, accountApplications, accountApplicationSetting, passwordRecoverySetting, dataCenterCustomEvents, preparedMetrics, dataCenterEventVariables, countDataCenterEventVariables, dataCenterItemModels, dataCenterItemVariables, dataCenterUserVariables, countDataCenterUserVariables, dataCenterPreparedDimensions, dataCenterMeasurements, dataCenterUserIdentities);
        }

    }
}
