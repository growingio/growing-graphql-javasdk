package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
public interface SettingSegmentMeasurementsMutationResolver {

    @javax.validation.constraints.NotNull
    Boolean settingSegmentMeasurements(SettingSegmentMeasurementPolicyDto policy, java.util.List<MeasurementInputDto> measurements, String id) throws Exception;

}