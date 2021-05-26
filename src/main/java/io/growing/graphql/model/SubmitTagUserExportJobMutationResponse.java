package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * 提交用户标签导出任务  exportFileName: 导出的文件名称，不带后缀
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public class SubmitTagUserExportJobMutationResponse extends GraphQLResult<Map<String, TagUserExportJobDto>> {

    private static final String OPERATION_NAME = "submitTagUserExportJob";

    public SubmitTagUserExportJobMutationResponse() {
    }

    /**
     * 提交用户标签导出任务  exportFileName: 导出的文件名称，不带后缀
     */
    public TagUserExportJobDto submitTagUserExportJob() {
        Map<String, TagUserExportJobDto> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
