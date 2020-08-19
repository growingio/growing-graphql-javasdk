name := "growingio-graphql-javasdk"
scalaVersion := "2.12.12"
organization := "io.growing"

Dependencies.javaClient

//插件配置
val generatePluginSettings = Seq(
  graphqlSchemaPaths := Seq("src/main/resources/all.graphqls"),
  modelPackageName := Some("io.growing.graphql.model"),
  apiPackageName := Some("io.growing.graphql.resolver"),
  generateClient := true,
  generateApis := true,
  generateModelsForRootTypes := true,
  apiRootInterfaceStrategy:= com.kobylynskyi.graphql.codegen.model.ApiRootInterfaceStrategy.DO_NOT_GENERATE,
  typeResolverPrefix := Some("GrowingIO"),
  javacOptions += "-parameters",
  //  generateCodegenTargetPath in GraphQLCodegenConfig := crossTarget.value / "src_graphql_java",
  generateCodegenTargetPath in GraphQLCodegenConfig := sourceDirectory.value / "main" / "java",
  customTypesMapping := {
    val types = new java.util.HashMap[String, String]
    //如果只是用来返回查询结果，不定义标量映射直接只用字符串也没什么毛病
    //如果输入也需要，那么必须要定义映射关系才能正确构造请求
    types.put("DateTime", "java.time.ZonedDateTime")
    types.put("Long", "java.lang.Long") //TODO 有默认值的字段会出现类型不匹配错误，先手动修改生成的Java文件
    //TODO 同时Subscription重命名为DashboardSubscription
    types.put("Object", "java.lang.Object")
    types
  }, modelNameSuffix := Some("Dto"),
  customAnnotationsMapping := {
    //为类提供自定义序列化器
    //一般来说，只有当返回的实体是接口类型才需要像这样指定每个子类（主要是graphql的联合类型）
    val typeMappings = new java.util.HashMap[String, java.util.List[String]]
    val jsonTypeInfoAnnotation = "@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,property = \"__typename\")"

    val entities = new java.util.ArrayList[String]()
    entities.add(jsonTypeInfoAnnotation)
    entities.add(
      """@com.fasterxml.jackson.annotation.JsonSubTypes(value = {
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SegmentDto.class, name = "Segment"),
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UserSummaryDto.class, name = "UserSummary"),
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TagDto.class, name = "Tag"),
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TunnelDto.class, name = "Tunnel"),
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UserEventDto.class, name = "UserEvent")
        |        })""".stripMargin)
    typeMappings.put("Entity", entities)

    val tunnelConfigs = new java.util.ArrayList[String]()
    tunnelConfigs.add(jsonTypeInfoAnnotation)
    tunnelConfigs.add(
      """@com.fasterxml.jackson.annotation.JsonSubTypes(value = {
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = JDBCTunnelConfigDto.class, name = "JDBCTunnelConfig"),
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = GIOApiTunnelConfigDto.class, name = "GIOApiTunnelConfig"),
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = FileTunnelConfigDto.class, name = "FileTunnelConfig"),
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = MobileTunnelConfigDto.class, name = "MobileTunnelConfig"),
        |        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = MiniProgramTunnelConfigDto.class, name = "MiniProgramTunnelConfig")
        |        })""".stripMargin)
    typeMappings.put("TunnelConfig", tunnelConfigs)

    typeMappings
  }

)

//引用growing-cdp的gdp分支
lazy val `growing-cdp` = ProjectRef(uri("ssh://vcs-user@codes.growingio.com/diffusion/301/growing-cdp.git#gdp"), "growing-cdp")

//不发布原始文件！！！
(unmanagedResources in Compile) := (unmanagedResources in Compile).value.filter(file => !file.getName.endsWith(".graphql") && !file.getName.endsWith(".graphqls"))

lazy val `growing-graphql-javasdk` = subProject("growing-graphql-javasdk", Some(".")).settings(GraphQLCodegenPluginDependencies).
  enablePlugins(GraphQLCodegenPlugin).settings(generatePluginSettings).dependsOn(`growing-cdp`).settings(Publishing.publishSettings)


def subProject(id: String, path: Option[String] = None): Project = {
  Project(id, file(path.getOrElse(id)))
}
