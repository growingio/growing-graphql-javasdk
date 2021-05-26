package io.growing.graphql.resolver.impl;

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig;
import com.kobylynskyi.graphql.codegen.extension.utils.JavaCollectionUtils;
import com.kobylynskyi.graphql.codegen.extension.utils.OkHttpUtils;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import io.growing.graphql.resolver.*;
import io.growing.graphql.model.*;

/**
 * 提交用户标签导出任务  exportFileName: 导出的文件名称，不带后缀
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:24+0800"
)
final public class $SubmitTagUserExportJobMutationResolver implements SubmitTagUserExportJobMutationResolver {

    private GrowingIOConfig growingIOConfig;

    public $SubmitTagUserExportJobMutationResolver(GrowingIOConfig growingIOConfig) {
        this.growingIOConfig = growingIOConfig;
    }

    private $SubmitTagUserExportJobMutationResolver() {}

    /**
     * 提交用户标签导出任务  exportFileName: 导出的文件名称，不带后缀
     */
    @javax.validation.constraints.NotNull
    @Override
    public TagUserExportJobDto submitTagUserExportJob(String tagId, String exportFileName, java.util.List<String> properties, String charset, Boolean detailExport) throws Exception {
        SubmitTagUserExportJobMutationRequest request = new SubmitTagUserExportJobMutationRequest();
        List<String> keys = Arrays.asList("tagId", "exportFileName", "properties", "charset", "detailExport");
        List<?> values = Arrays.asList(tagId, exportFileName, properties, charset, detailExport);
        Map<String, ?> parameters = JavaCollectionUtils.listToMap(keys, values);
        request.getInput().putAll(parameters);
        TagUserExportJobResponseProjection projection = new TagUserExportJobResponseProjection().all$(growingIOConfig.getResponseProjectionMaxDepth());
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        SubmitTagUserExportJobMutationResponse result = OkHttpUtils.executeGraphQLRemote(growingIOConfig, graphQLRequest, SubmitTagUserExportJobMutationResponse.class);
        return result.submitTagUserExportJob();
    }

}