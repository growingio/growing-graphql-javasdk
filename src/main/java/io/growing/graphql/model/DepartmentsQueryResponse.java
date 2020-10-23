package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-10-23T13:11:58+0800"
)
public class DepartmentsQueryResponse extends GraphQLResult<Map<String, java.util.List<DepartmentDto>>> {

    private static final String OPERATION_NAME = "departments";

    public DepartmentsQueryResponse() {
    }

    public java.util.List<DepartmentDto> departments() {
        Map<String, java.util.List<DepartmentDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
