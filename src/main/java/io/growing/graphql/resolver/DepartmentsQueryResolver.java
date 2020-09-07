package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public interface DepartmentsQueryResolver {

    @javax.validation.constraints.NotNull
    java.util.List<DepartmentDto> departments(String parentId) throws Exception;

}