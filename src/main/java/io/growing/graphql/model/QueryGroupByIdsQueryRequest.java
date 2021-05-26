package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * * 通过id查询分组信息
* @param ids id列表
* @return 对应id的标签分组信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryGroupByIdsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "queryGroupByIds";

    private Map<String, Object> input = new LinkedHashMap<>();

    public QueryGroupByIdsQueryRequest() {
    }

    public void setIds(java.util.List<String> ids) {
        this.input.put("ids", ids);
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

        private java.util.List<String> ids;

        public Builder() {
        }

        public Builder setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }


        public QueryGroupByIdsQueryRequest build() {
            QueryGroupByIdsQueryRequest obj = new QueryGroupByIdsQueryRequest();
            obj.setIds(ids);
            return obj;
        }

    }
}
