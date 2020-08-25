GrowingIO GraphQL Java SDK
---

目前只支持 Growing CDP 平台（测试阶段）

## 如何使用

### 环境
* Scala 2.11、2.12、2.13
* Java 8

### 1.添加依赖

- maven
```
//这里使用的是2.12
<dependency>
    <groupId>io.growing</groupId>
    <artifactId>growingio-graphql-javasdk_2.12</artifactId>
    <version>0.0.2-SNAPSHOT</version>
</dependency>
```

- gradle
```
//这里使用的是2.12
compile group: 'io.growing', name: 'growingio-graphql-javasdk_2.12', version: '0.0.2-SNAPSHOT'
```

- sbt
```
libraryDependencies += "io.growing" %% "growingio-graphql-javasdk" % "0.0.2-SNAPSHOT"
```

### 2.调用接口，调用有三种方式：

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

> 需要返回指定字段怎么办？如可以这样：`new LogEntryResponseProjection().id().name()`，但`new LogEntryResponseProjection()`会返回所有字段。

- 3.手动实现`src/main/java/io/growing/graphql/resolver`包中的接口，并手动使用`*Request`、`*Response`、`*ResponseProjection`和`*Resolver`发起请求
    如：[示例](https://github.com/kobylynskyi/graphql-java-codegen/blob/master/plugins/sbt/graphql-java-codegen-sbt-plugin/src/sbt-test/graphql-codegen-sbt-plugin/example-client/src/main/scala/io/github/dreamylost/service/QueryResolverImpl.scala)
    
前面两种使用代理，默认返回所有字段，如果需要仅返回部分字段，请使用第三种方式。如非必要，使用第一种最好。本SDK没有像示例1一样封装每个API，但为了方便，使用者可以参考第一种方法自己封装一下。

## 配置

```
# src/main/java下定义配置文件：application.conf，可以覆盖默认配置
graphql {
    # 服务端的地址
    server.host = "http://localhost:8086/projects/WlGk4Daj/graphql"
    # graphql最大嵌套查询深度
    maxDepth = 3

    # 授权使用的header，最终以header(X-User-Id, 1)的形式，携带到服务端。
    authenticate = {
        key = "X-User-Id"  # 或者key="Cookie"，等任意字符
        value = "1"
    }

}
```

> 代理调用 需要在 Java 1.8 上编译！

## SDK 开发者新增接口

> 使用者忽略

1. 依赖`growing-cdp`项目的原始schema文件（`resources`目录），增加接口前保证最新schema已经land
    - `resources`目录是：`Path.userHome / "project" / "growing-cdp" / "src/main/resources"`
    - 保证`growing-cdp`处于正确的git分支，因为依赖的原始schema文件是当前`growing-cdp`正在使用的git分支中的
2. 更新schema后，重新执行`GraphqlSchemaMergeApp.scala`，该程序会合并schema，生成`all.graphqls`文件（因为`growing-cdp`的schema非标准写法）
3. 执行`sbt graphqlCodegen compile`生成Java客户端和API
    - 根据需要新增配置项，参考：[options](https://github.com/kobylynskyi/graphql-java-codegen/blob/master/docs/codegen-options.md)
4. 生成的接口后，在`src/mian/scala/io/growing/graphql/api`包中实现接口中新增的方法（方便用户使用，也方便自己测试验证。默认情况：本SDK仅提供一个封装示例`JobService.scala`）
    - 建议为最有可能出错的接口写一些使用示例，比如：多实例的子类序列化，指定的类型格式，多层嵌套结构，异步接口，订阅等等
    
    
## TODO

1. 根据功能将代码划分出多个`package`
2. 支持Long类型的默认值，目前在生成带有`Long`类型的默认值的类型后，需要手动修改生成的代码，为数值追加`L`后缀
3. 支持订阅
4. 不依赖编译参数