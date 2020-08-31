GrowingIO GraphQL Java SDK
---

目前只支持 Growing CDP 平台（开发中，暂不可用）

## 如何使用

### 环境
* Scala 2.11.x、2.12.x、2.13.x
* Java 1.8

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

### 2.使用：

具体可以参考 [javasdk-examples](https://github.com/growingio/growingio-graphql-javasdk/blob/master/javasdk-examples/src/main/java/io/growing/graphql/InsightServiceExample.java)，这是使用Gradle+Java构建的示例项目。

- 1.使用`api`包中已经封装好的API，如：
```java
public class JobServiceJavaExample {

    public static void main(String[] args) {
        //JobService是SDK提供的一个封装，使用者可以参考这个service，使得接口更加易用
        JobService jobService = new JobService();
        List<EventImportJobDto> eventImportJobs = jobService.eventImportJobs();
        System.out.println(eventImportJobs);
    }
}
```
- 2.使用`resolver`包，以一个查询标签的接口为例：
```java
public interface TagQueryResolver {
    TagDto tag(String id) throws Exception;
}
```
**发起调用：**
```java
GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder growingioApi = GrowingIOGraphQLClient.graphQLClient();
TagDto tag = growingioApi.setProjection(new TagResponseProjection().all$()).setRequest(new TagQueryRequest()).build(TagQueryResolver.class).tag(tagId);
```
**方法描述**
* `setProjection`：参数是返回结构的投影实例，描述哪些结构的哪些字段被返回，`TagDto`对应的就是`TagResponseProjection`。
    - 在projection上调用`all$()`表示返回所有字段且自递归类型的默认深度为3，若有自递归类型，务必指定最大深度。`all$(1)`表示仅返回自递归类型的第一层孩子。
    - 需要返回指定字段怎么办？请依次在projection对象上调用无参方法，如：`new TagResponseProjection().id().name()`表示只返回`id`和`name`（此时不要重复使用`all$`！）
* `setRequest`：参数是该方法对应的请求的实例，`tag`对应的就是`TagQueryRequest`的实例。
* `build`：表示`tag`方法在哪里被定义，需要生成哪个接口的代理对象，此处是在`TagQueryResolver`中定义的。
* 想要配置？调用`growingioApi.setGrowingIOGraphQLConfig`即可

> `TagQueryResolver`和`TagQueryRequest`是对应的，`TagResponseProjection`可能被多个方法用作返回类型的投影，因为返回的Entity可能是集合，如：`List<TagDto>`和`TagDto`。

> `GrowingIOQueryResolver`和`GrowingIOMutationResolver`是查询和突变的两个聚合接口，包含了所有的查询方法和突变方法，通过代理这两个Resolver，可以实现调用任意接口。

> 注：若返回的是基本类型，则setProjection的参数值为null或者不调用setProjection方法。

> 暂时依赖 Java 1.8 上编译！

**完整实例**
```java
package io.growing.graphql;

import io.growing.graphql.model.*;
import io.growing.graphql.proxy.GrowingIOGraphQLClient;
import io.growing.graphql.resolver.CreateTagMutationResolver;
import io.growing.graphql.resolver.TagQueryResolver;
import io.growing.graphql.resolver.TagsQueryResolver;

import java.util.Collections;
import java.util.List;

/**
 * @author liguobin@growingio.com
 * @version 1.0, 2020/8/19
 */
public class InsightServiceExample {

    public static void main(String[] args) throws Exception {

        //这是第二种方法，使用代理直接调用，没有封装。如有需要，使用者可以自己封装，可以选择全部（使用`GrowingIOQueryResolver`和`GrowingIOMutationResolver`）或部分封装
        GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder growingioApi = GrowingIOGraphQLClient.graphQLClient();
        //配置文件
        growingioApi.setGrowingIOGraphQLConfig(new GrowingIOGraphQLConfig() {
            @Override
            public String getAuthenticateKey() {
                //getAuthenticateKey作为请求header的key，getAuthenticateValue作为请求header的value
                return "Cookie";
            }

            @Override
            public String getAuthenticateValue() {
                return "hello world!";
            }

            @Override
            public Integer getResponseProjectionMaxDepth() {
                return 1;
            }

            @Override
            public Integer getTimeOut() {
                return 1;
            }

            @Override
            public String getServerHost() {
                return "https://www.growingio.com/graphql";
            }
        });

        String tagId = "V0G5BZDA";

        //需要注意的是，查询一个和查询多个，它们的projection是相同的，但前者返回单个projection实体，后者返回一个集合（元素是projection）
        System.out.println("=====tag=====");
        TagDto tag = growingioApi.setProjection(new TagResponseProjection().all$()).setRequest(new TagQueryRequest()).build(TagQueryResolver.class).tag(tagId);
        System.out.println(tag);


        System.out.println("=====tags=====");
        List<TagDto> tags = growingioApi.setProjection(new TagResponseProjection().all$()).setRequest(new TagsQueryRequest()).build(TagsQueryResolver.class).tags();
        System.out.println(tags);


        System.out.println("=====createTag=====");
        TagInputDto tagDto = TagInputDto.builder().setName("come from java sdk").setDescription("hello world").
                setType(TagTypeDto.HORIZONTAL).setComputes(Collections.singletonList(ComputeDefinitionInputDto.builder().
                setName("comefromjavasdk").setExpression("A").setDirectives(Collections.singletonList(ComputeDirectiveInputDto.builder().
                setAggregator("sum").setAlias("A").setAttribute("").
                setMeasurement(MeasurementInputDto.builder().setId("usr_test_0420_user_date").setType("attribute").setAttribute("").build()).setOp("=").
                setValues(Collections.singletonList("1587484800000")).setTimeRange("day:31,1").build())).build())).build();
        TagDto createTag = growingioApi.setProjection(new TagResponseProjection().all$()).
                setRequest(new CreateTagMutationRequest()).build(CreateTagMutationResolver.class).createTag(tagDto);
        System.out.println(createTag);
    }
}
```

本SDK没有像示例1一样封装每个API，但为了方便，使用者可以参考第一种方法自己封装一下。

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