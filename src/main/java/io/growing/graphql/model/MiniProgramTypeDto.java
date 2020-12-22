package io.growing.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
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