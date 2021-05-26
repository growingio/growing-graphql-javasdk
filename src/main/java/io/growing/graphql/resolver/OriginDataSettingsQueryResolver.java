package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public interface OriginDataSettingsQueryResolver {

    @javax.validation.constraints.NotNull
    java.util.List<OriginDataSettingDto> originDataSettings() throws Exception;

}