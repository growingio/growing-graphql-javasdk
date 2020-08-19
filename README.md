GrowingIO GraphQL Java SDK
---

目前只支持 Growing CDP 平台（测试阶段）

## 如何使用

1. 添加依赖

- maven
```
<dependency>
    <groupId>io.growing</groupId>
    <artifactId>growingio-graphql-javasdk</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

- gradle
```
compile group: 'io.growing', name: 'growingio-graphql-javasdk', version: '0.0.1-SNAPSHOT'
```

- sbt
```
libraryDependencies += "io.growing" % "growingio-graphql-javasdk" % "0.0.1-SNAPSHOT"
```
2. 调用接口，调用有三种方式：

- 1.使用`src/main/scala/io/growing/graphql/api`包中已经封装好的API，如：
```scala
val jobService = new JobService()
val logs = jobService.jobLogs(id)
println(logs)
```
- 2.依靠代理工具类手动构造调用，以一个查询任务日志的接口为例：
```java
java.util.List<LogEntryDto> jobLogs(String id) throws Exception;//在JobLogsQueryResolver中，以此类推
```    
```scala
//setProjection的参数是返回内容投影，LogEntryDto对应的就是LogEntryResponseProjection
//setRequest的参数是请求方法，jobLogs对应的就是JobLogsQueryRequest
//JobLogsQueryResolver和JobLogsQueryRequest是对应的，build表示jobLogs方法在哪里被定义，是在JobLogsQueryResolver中定义的
//GrowingIOQueryResolver和GrowingIOMutationResolver是查询和突变的两个聚合接口，包含了所有的查询方法和突变方法
//注：若返回的是基本类型，则setProjection参数值为null

ResolverImplClient.ResolverImplClientBuilder.newBuilder().setProjection(new LogEntryResponseProjection).
    setRequest(new JobLogsQueryRequest).build(classOf[JobLogsQueryResolver]).jobLogs(id)
```
- 3.手动实现`src/main/java/io/growing/graphql/resolver`包中的接口，并手动使用`*Request`、`*Response`、`*ResponseProjection`和`*Resolver`发起请求
    如：https://github.com/kobylynskyi/graphql-java-codegen/blob/master/plugins/sbt/graphql-java-codegen-sbt-plugin/src/sbt-test/graphql-codegen-sbt-plugin/example-client/src/main/scala/io/github/dreamylost/service/QueryResolverImpl.scala
    
> 前面两种使用代理，默认返回所有字段，如果需要仅返回部分字段，请使用第三种方式。如非必要，使用第一种最好。
> 本SDK不会像示例1一样封装每个API，但为了方便，使用者可以参考第一种方法自己封装一下。

## 如何开发新接口

1. 更新growing-cdp的schema后，重新执行`GraphqlSchemaMergeApp.scala`合并schema，生成`all.graphqls`文件
2. 执行`sbt graphqlCodegen compile`生成Java客户端和API
    - 根据需要新增配置项，参考：https://github.com/kobylynskyi/graphql-java-codegen/blob/master/docs/codegen-options.md
3. 在`src/mian/scala/io/growing/graphql/api`包中，实现接口中新增的方法（方便用户使用，也方便写自己测试验证，一般不实现）
    - 建议为最有可能出错的接口写一些使用示例，比如：多实例的子类序列化，指定的类型格式，多层嵌套结构，异步接口，订阅等等
    
    
## TODO

1. 根据功能将代码划分出多个`package`
2. 支持Long类型的默认值
3. 支持订阅