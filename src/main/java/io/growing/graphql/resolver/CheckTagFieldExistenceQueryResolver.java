package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * @param fieldValue：字段值  fieldType：字段类型（枚举值）
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface CheckTagFieldExistenceQueryResolver {

    /**
     * @param fieldValue：字段值  fieldType：字段类型（枚举值）
     */
    @javax.validation.constraints.NotNull
    Boolean checkTagFieldExistence(String fieldValue, TagFieldTypeDto fieldType) throws Exception;

}