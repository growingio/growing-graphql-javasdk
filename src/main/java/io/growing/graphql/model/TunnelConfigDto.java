package io.growing.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-19T10:59:14+0800"
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,property = "__typename")
@com.fasterxml.jackson.annotation.JsonSubTypes(value = {
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = JDBCTunnelConfigDto.class, name = "JDBCTunnelConfig"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = GIOApiTunnelConfigDto.class, name = "GIOApiTunnelConfig"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = FileTunnelConfigDto.class, name = "FileTunnelConfig"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = MobileTunnelConfigDto.class, name = "MobileTunnelConfig"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = MiniProgramTunnelConfigDto.class, name = "MiniProgramTunnelConfig")
        })
public interface TunnelConfigDto {

}