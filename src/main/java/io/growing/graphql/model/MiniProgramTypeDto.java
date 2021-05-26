package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public enum MiniProgramTypeDto {

    ALIP("ALIP"),
    WXWV("WXWV"),
    WECHAT("WECHAT"),
    MINP("MINP"),
    QQ("QQ"),
    WXOA("WXOA"),
    BAIDUP("BAIDUP"),
    BYTEDANCE("BYTEDANCE"),
    QUICKAPP("QUICKAPP"),
    MINIGAME("MINIGAME");

    private final String graphqlName;

    private MiniProgramTypeDto(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}