package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-20T17:55:58+0800"
)
public enum JobStageDto {

    /**
     * NONE 任务的初始状态
     * READY 任务准备执行
     * RUNNING 任务正在执行
     * DATA_READY 数据已经准备就绪
     * FINISH 任务完成
     * ERROR 任务执行失败
     */
    NONE("NONE"),
    READY("READY"),
    RUNNING("RUNNING"),
    DATA_READY("DATA_READY"),
    FINISH("FINISH"),
    ERROR("ERROR");

    private final String graphqlName;

    private JobStageDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}