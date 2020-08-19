GrowingIO GraphQL Java SDK
---

目前只支持 Growing CDP 平台（测试阶段）

## 如何使用

1. 添加依赖

- maven
```
<dependency>
    <groupId>io.growing</groupId>
    <artifactId>growingio-graphql-javasdk_2.12</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <exclusions>
        <exclusion>
            <groupId>io.growing.cdp</groupId>
            <artifactId>*</artifactId>
        </exclusion>
     </exclusions>
</dependency>
```

- gradle
```
compile group: 'io.growing', name: 'growingio-graphql-javasdk_2.12', version: '0.0.1-SNAPSHOT' exclude group: 'io.growing.cdp'
```

- sbt
```
libraryDependencies += "io.growing" % "growingio-graphql-javasdk" % "0.0.1-SNAPSHOT" excludeAll ExclusionRule("io.growing.cdp")
```

2. 调用接口，调用有三种方式：

具体可以参考 [javasdk-examples](https://github.com/growingio/growingio-graphql-javasdk/blob/master/javasdk-examples/src/main/java/io/growing/graphql/InsightServiceExample.java)，这是使用Gradle+Java构建的示例项目。

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
发起调用：
```scala
ResolverImplClient.ResolverImplClientBuilder.newBuilder().setProjection(new LogEntryResponseProjection).
    setRequest(new JobLogsQueryRequest).build(classOf[JobLogsQueryResolver]).jobLogs(id)
```
* `setProjection`：参数是返回结构，描述哪些结构的哪些字段被返回，`LogEntryDto`对应的就是`LogEntryResponseProjection`
* `setRequest`：参数是该方法对应的请求的实例，`jobLogs`对应的就是`JobLogsQueryRequest`的实例
* `JobLogsQueryResolver`和`JobLogsQueryRequest`是对应的，`LogEntryResponseProjection`可能被多个方法用作返回类型，如：`List<LogEntryResponseProjection>`和`LogEntryResponseProjection`
* `build`：表示`jobLogs`方法在哪里被定义，需要生成哪个接口的代理对象，此处是在`JobLogsQueryResolver`中定义的
* `GrowingIOQueryResolver`和`GrowingIOMutationResolver`是查询和突变的两个聚合接口，包含了所有的查询方法和突变方法，通过代理这两个Resolver，可以实现调用任意接口
> 注：若返回的是基本类型，则setProjection的参数值为null

- 3.手动实现`src/main/java/io/growing/graphql/resolver`包中的接口，并手动使用`*Request`、`*Response`、`*ResponseProjection`和`*Resolver`发起请求
    如：https://github.com/kobylynskyi/graphql-java-codegen/blob/master/plugins/sbt/graphql-java-codegen-sbt-plugin/src/sbt-test/graphql-codegen-sbt-plugin/example-client/src/main/scala/io/github/dreamylost/service/QueryResolverImpl.scala
    
> 前面两种使用代理，默认返回所有字段，如果需要仅返回部分字段，请使用第三种方式。如非必要，使用第一种最好。

> 本SDK没有像示例1一样封装每个API，但为了方便，使用者可以参考第一种方法自己封装一下。

> 代理调用 需要在 Java 1.8 上编译！

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
4. 完善schema依赖方式，去除依赖引入时的`exclude`