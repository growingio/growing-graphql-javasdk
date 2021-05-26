package io.growing.graphql;

import io.growing.graphql.api.GrowingioApi;
import io.growing.graphql.model.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liguobin@growingio.com
 * @version 1.0, 2020/10/23
 */
public class GrowingioApiExamples {

    /**
     * url是graphql服务地址
     * authKey与authValue是接口调用时的鉴权，可以是任意字符串
     */
    static String projectId = "WlGk4Daj"; //如果资源不在项目中，那么就没有projectId参数
    final static GrowingioApi growingioApi = GrowingioApi.apply("http://gdp-dev.growingio.com/graphql", "Cookie", "gr_user_id=bd604d08-d668-4150-bc4f-06623dfa014f; grwng_uid=63df5f84-e687-4634-b8b2-ae8cdc11a13b; _ga=GA1.2.2052875498.1583474054; 0a1b4118dd954ec3bcc69da5138bdb96_gr_last_sent_cs1=179994; experimentation_subject_id=ImNlNWExNWQ4LTFhOWQtNDgyMy1iYmE0LWJiMTljNmM5YjdiYSI%3D--20d488a5819edba4f04e2427e63a18d16f0a80eb; gdp_user_id=8d9cb452-182e-4875-9200-6ad72cb73405; _fbp=fb.1.1601359690408.1768969548; 866c6e19f3dbddfc_gdp_esid=22; Hm_lvt_603ab75906557bfe372ca494468e3e1b=1602314394; gdp_user_session=oWpE0qQ6-96743e7e-e950-4fd5-ac1f-b65c9fc9d1da; Hm_lpvt_603ab75906557bfe372ca494468e3e1b=1603163258; session=.eJwNjEEKg0AMAL8ScpZiXWmqr-i9iCRL4kq3WszexL93T3OYYU6cLbMndRzfJ0KpwK-686LY4Csru0LeF1g3KDtwjFVCSavDrzY3nK6pqZNDPeFonF0bjH7YXPaPbjiitH0n4c7USaSHBbJenjQQ2yDG1oZuEKIgeP0B_RstSQ.X5JNzg.czsxhk-Y143BLy7M6VTf8BTM19s; 0a1b4118dd954ec3bcc69da5138bdb96_gr_cs1=179994");

    public static void main(String[] args) {
        List<TagDto> tags = growingioApi.tags(projectId);
        System.out.println(tags);

        List<SegmentDto> segmentDtos = growingioApi.segments(projectId);
        System.out.println(segmentDtos);

        SegmentUserExportJobDto segmentUserExportJobDto = growingioApi.submitSegmentUserExportJob(projectId, "J1GlNzQj", Collections.emptyList(), Collections.emptyList(), "UTF-16LE");
        System.out.println(segmentUserExportJobDto);


        TagUserExportJobDto tagUserExportJobDto = growingioApi.submitTagUserExportJob("rRGoVRpm", "name",Collections.emptyList(), "UTF-16LE", false);
        System.out.println(tagUserExportJobDto);


        UserProfileDto userProfileDto = growingioApi.userProfile(projectId, "23945", Collections.emptyList(), Collections.emptyList());
        System.out.println(userProfileDto);


        JobResultDto jobResultDto = growingioApi.jobResult(tagUserExportJobDto.getId());
        System.out.println(jobResultDto);


        Map<String, String> myHeaders = new HashMap<>();
        myHeaders.put("Cookie", "my cookie");
        myHeaders.put("token", "my token");
        myHeaders.put("other key", "other value");

        final GrowingioApi newGrowingioApi = GrowingioApi.apply("http://gdp-dev.growingio.com/graphql", myHeaders);
        List<TagDto> newTags = newGrowingioApi.tags(projectId);
        System.out.println(newTags);
    }

}
