package io.growing.graphql.resolver;

import io.growing.graphql.model.*;

/**
 * 提交用户标签导出任务  exportFileName: 导出的文件名称，不带后缀
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
public interface SubmitTagUserExportJobMutationResolver {

    /**
     * 提交用户标签导出任务  exportFileName: 导出的文件名称，不带后缀
     */
    @javax.validation.constraints.NotNull
    TagUserExportJobDto submitTagUserExportJob(String tagId, String exportFileName, java.util.List<String> properties, String charset, Boolean detailExport) throws Exception;

}