package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 获取腾讯分群画像用户信息统计数据, 返回两组数据，第一组为手机号覆盖率，第二组为设备覆盖率
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class GetTGIStatisticDataQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "getTGIStatisticData";

    private Map<String, Object> input = new LinkedHashMap<>();

    public GetTGIStatisticDataQueryRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setSegmentId(String segmentId) {
        this.input.put("segmentId", segmentId);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String projectId;
        private String segmentId;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }


        public GetTGIStatisticDataQueryRequest build() {
            GetTGIStatisticDataQueryRequest obj = new GetTGIStatisticDataQueryRequest();
            obj.setProjectId(projectId);
            obj.setSegmentId(segmentId);
            return obj;
        }

    }
}
