GrowingIO GraphQL Java SDK
---

![Build](https://github.com/growingio/growingio-graphql-javasdk/workflows/Build/badge.svg)

目前只支持 Growing CDP 平台（开发中，暂不可用）

## 如何使用

### 环境

* Scala 2.11.x、2.12.x、2.13.x
* Java 1.7+

### 添加依赖

- maven
```
//这里使用的是2.12
<dependency>
    <groupId>io.growing</groupId>
    <artifactId>growingio-graphql-javasdk_2.12</artifactId>
    <version>0.0.1</version>
</dependency>
```

- gradle
```
//这里使用的是2.12
compile group: 'io.growing', name: 'growingio-graphql-javasdk_2.12', version: '0.0.1'
```

- sbt
```
libraryDependencies += "io.growing" %% "growingio-graphql-javasdk" % "0.0.1"
```

### 使用

具体可以参考 [javasdk-examples](https://github.com/growingio/growingio-graphql-javasdk/blob/master/javasdk-examples/src/main/java/io/growing/graphql/GrowingioApiExamples.java)，这是使用Gradle+Java构建的示例项目。

- 1.使用`api`的`GrowingioApi.scala`类中已经封装好的API，如定义：
```scala
  def submitTagUserExportJob(tagId: String, properties: util.List[String], charset: String, detailExport: Boolean): TagUserExportJobDto = {
    val resolver = new $SubmitTagUserExportJobMutationResolver(conf)
    resolver.submitTagUserExportJob(tagId, properties, charset, detailExport)
  }

  def submitSegmentUserExportJob(projectId: String, segmentId: String, tags: util.List[String], properties: util.List[String], charset: String): SegmentUserExportJobDto = {
    val resolver = new $SubmitSegmentUserExportJobMutationResolver(conf)
    resolver.submitSegmentUserExportJob(projectId, segmentId, tags, properties, charset)
  }

  def jobResult(id: String): JobResultDto = {
    val resolver = new $JobResultQueryResolver(conf)
    resolver.jobResult(id)
  }

  def userProfile(projectId: String, userId: String, tags: util.List[String], properties: util.List[String]): UserProfileDto = {
    val resolver = new $UserProfileQueryResolver(conf)
    resolver.userProfile(projectId, userId, tags, properties)
  }

  def tags(projectId: String): util.List[TagDto] = {
    val resolver = new $TagsQueryResolver(conf)
    resolver.tags(projectId)
  }

  def segments(projectId: String): util.List[SegmentDto] = {
    val resolver = new $SegmentsQueryResolver(conf)
    resolver.segments(projectId)

  }
```

- 2.Java中调用`tags`获取所有标签列表：
```java
final static GrowingioApi growingioApi = GrowingioApi.apply("http://gdp-dev.growingio.com/graphql", "Cookie", "xxxx");

public static void main(String[] args) {
    List<TagDto> tags = growingioApi.tags("projectId");
    System.out.println(tags);
}
```

#### 什么是resolver
- 类似gRPC的client，每个graphql接口都提供一个resolver接口以及默认实现，如Mutation操作
    - `submitTagUserExportJob`接口的resolver是`SubmitTagUserExportJobMutationResolver`
    - `SubmitTagUserExportJobMutationResolver`的默认实现是`$SubmitTagUserExportJobMutationResolver`
- Query操作
    - `tags`接口的resolver是`TagsQueryResolver`
    - `TagsQueryResolver`的默认实现是`$TagsQueryResolver`

一般情况下，直接使用$XXQuery、$XXMutation即可。如需要自己实现resolver，可参考内置的$XXX的的代码。

#### 想用的接口没有在GrowingioApi中定义怎么办

可以参考`GrowingioApi`，比如想使用`batchDeleteItemVariables`接口：
1. 先找到它的默认resolver实现，全局搜索即可：`$BatchDeleteItemVariablesMutationResolver`；
2. 构造它的实例，`$BatchDeleteItemVariablesMutationResolver resolver = new $BatchDeleteItemVariablesMutationResolver(GrowingioApi.apply("服务地址", "可选的鉴权key", "可选的鉴权value"))`；
3. 然后我们就可以直接使用了，`resolver.batchDeleteItemVariables("传入你的参数")`。

#### 接口还需要其他很多请求头怎么办

可以使用`GrowingioApi`的其他构造函数：
```java
Map<String, String> myHeaders = new HashMap<>();
myHeaders.put("Cookie", "my cookie");
myHeaders.put("token", "my token");
myHeaders.put("other key", "other value");

final GrowingioApi newGrowingioApi = GrowingioApi.apply("http://gdp-dev.growingio.com/graphql", myHeaders);
List<TagDto> newTags = newGrowingioApi.tags();
System.out.println(newTags);
```

> 本SDK没有像示例一样封装每个API，但为了方便，使用者可以参考`GrowingioApi`自己封装一下。

## SDK 开发者新增接口

> 使用者忽略

1. 依赖`growing-cdp`项目的原始schema文件（`resources`目录），增加接口前保证最新schema已经land
    - `resources`目录是：`Path.userHome / "project" / "growing-cdp" / "src/main/resources"`
    - 保证`growing-cdp`处于正确的git分支，因为依赖的原始schema文件是当前`growing-cdp`正在使用的git分支中的
2. 更新schema后，重新执行`GraphqlSchemaMergeApp.scala`，该程序会合并schema，生成`all.graphqls`文件（因为`growing-cdp`的schema非标准写法）
3. 执行`sbt graphqlCodegen compile`生成Java客户端和API
    - 根据需要新增配置项，参考：[options](https://github.com/kobylynskyi/graphql-java-codegen/blob/master/docs/codegen-options.md)
4. 生成接口后，在`api`包中实现接口中新增的方法（本SDK将目前常用的接口封装在：`GrowingioApi.scala`）
    - 建议为复杂接口写一些使用示例和单测。
5. 发布`sbt publishSigned` 排除**graphql schema**
    - 发布到本地maven仓库，`sbt publishM2` 未排除**graphql schema**   
    
## TODO

1. 不支持接口返回类型是Query的嵌套查询（relay）
2. 不支持在单个请求中支持多个查询