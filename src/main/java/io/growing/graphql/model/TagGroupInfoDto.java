package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Tag分组信息
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class TagGroupInfoDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String groupId;
    @javax.validation.constraints.NotNull
    private String groupName;
    @javax.validation.constraints.NotNull
    private String parentId;
    @javax.validation.constraints.NotNull
    private String parentName;
    @javax.validation.constraints.NotNull
    private String level;
    @javax.validation.constraints.NotNull
    private String nodePath;
    @javax.validation.constraints.NotNull
    private java.util.List<TagInfoDto> tags;
    @javax.validation.constraints.NotNull
    private java.util.List<UserCustomizedStrDto> userCustomizedStr;
    @javax.validation.constraints.NotNull
    private java.util.List<TagGroupInfoDto> children;

    public TagGroupInfoDto() {
    }

    public TagGroupInfoDto(String groupId, String groupName, String parentId, String parentName, String level, String nodePath, java.util.List<TagInfoDto> tags, java.util.List<UserCustomizedStrDto> userCustomizedStr, java.util.List<TagGroupInfoDto> children) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.parentId = parentId;
        this.parentName = parentName;
        this.level = level;
        this.nodePath = nodePath;
        this.tags = tags;
        this.userCustomizedStr = userCustomizedStr;
        this.children = children;
    }

    /**
     * 分组/标签ID
     */
    public String getGroupId() {
        return groupId;
    }
    /**
     * 分组/标签ID
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 分组/标签名称
     */
    public String getGroupName() {
        return groupName;
    }
    /**
     * 分组/标签名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 父分组ID
     */
    public String getParentId() {
        return parentId;
    }
    /**
     * 父分组ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 父分组名称
     */
    public String getParentName() {
        return parentName;
    }
    /**
     * 父分组名称
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * 标签层级
     */
    public String getLevel() {
        return level;
    }
    /**
     * 标签层级
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 标签路径
     */
    public String getNodePath() {
        return nodePath;
    }
    /**
     * 标签路径
     */
    public void setNodePath(String nodePath) {
        this.nodePath = nodePath;
    }

    /**
     * 非三级分组,则为空数组;三级分组,为该分组下标签信息
     */
    public java.util.List<TagInfoDto> getTags() {
        return tags;
    }
    /**
     * 非三级分组,则为空数组;三级分组,为该分组下标签信息
     */
    public void setTags(java.util.List<TagInfoDto> tags) {
        this.tags = tags;
    }

    /**
     * 非三级分组,则为空数组;三级分组,为该分组下自定义标签信息
     */
    public java.util.List<UserCustomizedStrDto> getUserCustomizedStr() {
        return userCustomizedStr;
    }
    /**
     * 非三级分组,则为空数组;三级分组,为该分组下自定义标签信息
     */
    public void setUserCustomizedStr(java.util.List<UserCustomizedStrDto> userCustomizedStr) {
        this.userCustomizedStr = userCustomizedStr;
    }

    /**
     * 子分组/标签
     */
    public java.util.List<TagGroupInfoDto> getChildren() {
        return children;
    }
    /**
     * 子分组/标签
     */
    public void setChildren(java.util.List<TagGroupInfoDto> children) {
        this.children = children;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (groupId != null) {
            joiner.add("groupId: " + GraphQLRequestSerializer.getEntry(groupId));
        }
        if (groupName != null) {
            joiner.add("groupName: " + GraphQLRequestSerializer.getEntry(groupName));
        }
        if (parentId != null) {
            joiner.add("parentId: " + GraphQLRequestSerializer.getEntry(parentId));
        }
        if (parentName != null) {
            joiner.add("parentName: " + GraphQLRequestSerializer.getEntry(parentName));
        }
        if (level != null) {
            joiner.add("level: " + GraphQLRequestSerializer.getEntry(level));
        }
        if (nodePath != null) {
            joiner.add("nodePath: " + GraphQLRequestSerializer.getEntry(nodePath));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (userCustomizedStr != null) {
            joiner.add("userCustomizedStr: " + GraphQLRequestSerializer.getEntry(userCustomizedStr));
        }
        if (children != null) {
            joiner.add("children: " + GraphQLRequestSerializer.getEntry(children));
        }
        return joiner.toString();
    }

    public static TagGroupInfoDto.Builder builder() {
        return new TagGroupInfoDto.Builder();
    }

    public static class Builder {

        private String groupId;
        private String groupName;
        private String parentId;
        private String parentName;
        private String level;
        private String nodePath;
        private java.util.List<TagInfoDto> tags;
        private java.util.List<UserCustomizedStrDto> userCustomizedStr;
        private java.util.List<TagGroupInfoDto> children;

        public Builder() {
        }

        /**
         * 分组/标签ID
         */
        public Builder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * 分组/标签名称
         */
        public Builder setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * 父分组ID
         */
        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * 父分组名称
         */
        public Builder setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }

        /**
         * 标签层级
         */
        public Builder setLevel(String level) {
            this.level = level;
            return this;
        }

        /**
         * 标签路径
         */
        public Builder setNodePath(String nodePath) {
            this.nodePath = nodePath;
            return this;
        }

        /**
         * 非三级分组,则为空数组;三级分组,为该分组下标签信息
         */
        public Builder setTags(java.util.List<TagInfoDto> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * 非三级分组,则为空数组;三级分组,为该分组下自定义标签信息
         */
        public Builder setUserCustomizedStr(java.util.List<UserCustomizedStrDto> userCustomizedStr) {
            this.userCustomizedStr = userCustomizedStr;
            return this;
        }

        /**
         * 子分组/标签
         */
        public Builder setChildren(java.util.List<TagGroupInfoDto> children) {
            this.children = children;
            return this;
        }


        public TagGroupInfoDto build() {
            return new TagGroupInfoDto(groupId, groupName, parentId, parentName, level, nodePath, tags, userCustomizedStr, children);
        }

    }
}
