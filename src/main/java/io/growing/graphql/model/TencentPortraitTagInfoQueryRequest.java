package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * * 返回标签分组信息
* @param groupId 非必填,为空 | 查询所有非叶子分组(即⻚面侧边分组),有值 | 查询这个分组的下一级分组及分组下标签信息(即⻚面中部分组及标签)
* @param level   非必填,目前该参数为保留参数,暂时不提供功能
* @return  标签分组信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TencentPortraitTagInfoQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "tencentPortraitTagInfo";

    private Map<String, Object> input = new LinkedHashMap<>();

    public TencentPortraitTagInfoQueryRequest() {
    }

    public void setGroupId(String groupId) {
        this.input.put("groupId", groupId);
    }

    public void setLevel(String level) {
        this.input.put("level", level);
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

        private String groupId;
        private String level;

        public Builder() {
        }

        public Builder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setLevel(String level) {
            this.level = level;
            return this;
        }


        public TencentPortraitTagInfoQueryRequest build() {
            TencentPortraitTagInfoQueryRequest obj = new TencentPortraitTagInfoQueryRequest();
            obj.setGroupId(groupId);
            obj.setLevel(level);
            return obj;
        }

    }
}
