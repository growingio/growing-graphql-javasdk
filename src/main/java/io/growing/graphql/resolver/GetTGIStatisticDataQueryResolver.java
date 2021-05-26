package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 获取腾讯分群画像用户信息统计数据, 返回两组数据，第一组为手机号覆盖率，第二组为设备覆盖率
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface GetTGIStatisticDataQueryResolver {

    /**
     * 获取腾讯分群画像用户信息统计数据, 返回两组数据，第一组为手机号覆盖率，第二组为设备覆盖率
     */
    @javax.validation.constraints.NotNull
    java.util.List<TGIStatisticDataDto> getTGIStatisticData(String projectId, String segmentId) throws Exception;

}