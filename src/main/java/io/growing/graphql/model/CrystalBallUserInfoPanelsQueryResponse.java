package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:58+0800"
)
public class CrystalBallUserInfoPanelsQueryResponse extends GraphQLResult<Map<String, java.util.List<CrystalBallUserInfoPanelDto>>> {

    private static final String OPERATION_NAME = "crystalBallUserInfoPanels";

    public CrystalBallUserInfoPanelsQueryResponse() {
    }

    public java.util.List<CrystalBallUserInfoPanelDto> crystalBallUserInfoPanels() {
        Map<String, java.util.List<CrystalBallUserInfoPanelDto>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
