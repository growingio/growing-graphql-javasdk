package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class CrystalBallTrackOverviewAnalysisQueryResponse extends GraphQLResult<Map<String, TrackOverviewAnalysisDto>> {

    private static final String OPERATION_NAME = "crystalBallTrackOverviewAnalysis";

    public CrystalBallTrackOverviewAnalysisQueryResponse() {
    }

    public TrackOverviewAnalysisDto crystalBallTrackOverviewAnalysis() {
        Map<String, TrackOverviewAnalysisDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
