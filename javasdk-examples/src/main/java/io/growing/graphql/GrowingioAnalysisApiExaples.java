package io.growing.graphql;

import io.growing.graphql.api.GrowingioApi;
import io.growing.graphql.model.AnalysisExportJobDto;
import io.growing.graphql.model.AnalysisExportJobParamDto;
import io.growing.graphql.model.JobResultDto;

import static io.growing.graphql.model.AnalysisResourceTypeDto.CHARTS;
import static io.growing.graphql.model.AnalysisResourceTypeDto.FUNNELS;
import static io.growing.graphql.model.AnalysisResourceTypeDto.RETENTIONS;
import static io.growing.graphql.model.AnalysisResourceTypeDto.FREQUENCIES;
import static io.growing.graphql.model.JobStageDto.ERROR;

public class GrowingioAnalysisApiExaples {

    static String projectId = "WlGk4Daj"; //如果资源不在项目中，那么就没有projectId参数
    //final static GrowingioApi growingioApi = GrowingioApi.apply("https://opdemo.growingio.com/graphql", "Cookie", "gr_user_id=9c038593-36f4-4e34-9089-cc0ee9f27b14; 0a1b4118dd954ec3bcc69da5138bdb96_gr_last_sent_cs1=275319; Hm_lvt_603ab75906557bfe372ca494468e3e1b=1620476130,1621503522; Hm_lpvt_603ab75906557bfe372ca494468e3e1b=1621503527; gdp_user_session_growingio.com=qgQMPPD3-86cb5c39-7db6-49ba-8ffe-a8566b6b9721; 0a1b4118dd954ec3bcc69da5138bdb96_gr_session_id=b930ddfa-029e-4557-a200-10cda11ed5b4; 0a1b4118dd954ec3bcc69da5138bdb96_gr_last_sent_sid_with_cs1=b930ddfa-029e-4557-a200-10cda11ed5b4; 0a1b4118dd954ec3bcc69da5138bdb96_gr_session_id_b930ddfa-029e-4557-a200-10cda11ed5b4=true; 0a1b4118dd954ec3bcc69da5138bdb96_gr_cs1=275319; gdp_user_session_=WlGk4Daj-cc58f2f8-3d20-487a-87c1-edb4fb554f8d");
    final static GrowingioApi growingioApi = GrowingioApi.apply("http://uat-gdp.growingio.com/graphql", "Authorization", "fab69b1f-35c1-4cb5-81e8-ebe167ee2366");

    public static void main(String[] args) {
        AnalysisExportJobDto analysisChartsExportJobDto = growingioApi.submitAnalysisExportJob(projectId, "kqQewGry", AnalysisExportJobParamDto.builder().setAnalysisType(CHARTS).build(), "UTF-16LE");
        System.out.println(analysisChartsExportJobDto);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }        boolean isDone = false;
        JobResultDto jobResultDto = JobResultDto.builder().build();
        while (!isDone){
            //set对应的id
            jobResultDto = growingioApi.jobResult(analysisChartsExportJobDto.getId());
            if (jobResultDto.getUris().size()!=0) {
                isDone = true;
            }else if (analysisChartsExportJobDto.getStage().equals(ERROR)) {
                isDone = true;
                System.out.println(jobResultDto + "下载失败");
            }
        }
        System.out.println(jobResultDto);
    }
}
