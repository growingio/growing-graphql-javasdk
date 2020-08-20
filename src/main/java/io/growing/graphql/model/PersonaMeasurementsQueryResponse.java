package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public class PersonaMeasurementsQueryResponse extends GraphQLResult<Map<String, java.util.List<MeasurementDto>>> {

    private static final String OPERATION_NAME = "personaMeasurements";

    public PersonaMeasurementsQueryResponse() {
    }

    public java.util.List<MeasurementDto> personaMeasurements() {
        Map<String, java.util.List<MeasurementDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
