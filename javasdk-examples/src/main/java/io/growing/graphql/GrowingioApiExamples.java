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
    final static GrowingioApi growingioApi = GrowingioApi.apply("http://gdp-dev.growingio.com/graphql", "Cookie", "CookieValue");

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
