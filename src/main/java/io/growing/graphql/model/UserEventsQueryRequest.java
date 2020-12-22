package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 用户事件查询，新增filter为过滤条件，小程序无埋点filter中含有appid
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class UserEventsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "userEvents";

    private Map<String, Object> input = new LinkedHashMap<>();

    public UserEventsQueryRequest() {
    }

    public void setProjectId(String projectId) {
        this.input.put("projectId", projectId);
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setTypes(java.util.List<UserEventTypeDto> types) {
        this.input.put("types", types);
    }

    public void setTimeRange(String timeRange) {
        this.input.put("timeRange", timeRange);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
    }

    public void setAfter(String after) {
        this.input.put("after", after);
    }

    public void setLast(Integer last) {
        this.input.put("last", last);
    }

    public void setBefore(String before) {
        this.input.put("before", before);
    }

    public void setLimit(Integer limit) {
        this.input.put("limit", limit);
    }

    public void setFilter(FilterInputDto filter) {
        this.input.put("filter", filter);
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
        private String id;
        private java.util.List<UserEventTypeDto> types;
        private String timeRange;
        private Integer first;
        private String after;
        private Integer last;
        private String before;
        private Integer limit;
        private FilterInputDto filter;

        public Builder() {
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTypes(java.util.List<UserEventTypeDto> types) {
            this.types = types;
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setFirst(Integer first) {
            this.first = first;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setLast(Integer last) {
            this.last = last;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setFilter(FilterInputDto filter) {
            this.filter = filter;
            return this;
        }


        public UserEventsQueryRequest build() {
            UserEventsQueryRequest obj = new UserEventsQueryRequest();
            obj.setProjectId(projectId);
            obj.setId(id);
            obj.setTypes(types);
            obj.setTimeRange(timeRange);
            obj.setFirst(first);
            obj.setAfter(after);
            obj.setLast(last);
            obj.setBefore(before);
            obj.setLimit(limit);
            obj.setFilter(filter);
            return obj;
        }

    }
}
