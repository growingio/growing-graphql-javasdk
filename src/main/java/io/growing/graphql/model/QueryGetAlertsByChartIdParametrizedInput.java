package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field getAlertsByChartId in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class QueryGetAlertsByChartIdParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String projectId;
    @javax.validation.constraints.NotNull
    private String chartId;

    public QueryGetAlertsByChartIdParametrizedInput() {
    }

    public QueryGetAlertsByChartIdParametrizedInput(String projectId, String chartId) {
        this.projectId = projectId;
        this.chartId = chartId;
    }

    public QueryGetAlertsByChartIdParametrizedInput projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public QueryGetAlertsByChartIdParametrizedInput chartId(String chartId) {
        this.chartId = chartId;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (chartId != null) {
            joiner.add("chartId: " + GraphQLRequestSerializer.getEntry(chartId));
        }
        return joiner.toString();
    }

}
