package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class MeasurableDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String type;
    private String action;
    private String elementId;
    private String valueType;
    private java.util.List<String> platforms;
    private java.util.List<MeasurableAttributeDto> attributes;
    private java.util.List<String> labels;
    private Boolean favorites;
    private Boolean isComplexDistinct;

    public MeasurableDto() {
    }

    public MeasurableDto(String id, String name, String type, String action, String elementId, String valueType, java.util.List<String> platforms, java.util.List<MeasurableAttributeDto> attributes, java.util.List<String> labels, Boolean favorites, Boolean isComplexDistinct) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.action = action;
        this.elementId = elementId;
        this.valueType = valueType;
        this.platforms = platforms;
        this.attributes = attributes;
        this.labels = labels;
        this.favorites = favorites;
        this.isComplexDistinct = isComplexDistinct;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public String getElementId() {
        return elementId;
    }
    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public java.util.List<String> getPlatforms() {
        return platforms;
    }
    public void setPlatforms(java.util.List<String> platforms) {
        this.platforms = platforms;
    }

    public java.util.List<MeasurableAttributeDto> getAttributes() {
        return attributes;
    }
    public void setAttributes(java.util.List<MeasurableAttributeDto> attributes) {
        this.attributes = attributes;
    }

    public java.util.List<String> getLabels() {
        return labels;
    }
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    public Boolean getFavorites() {
        return favorites;
    }
    public void setFavorites(Boolean favorites) {
        this.favorites = favorites;
    }

    /**
     * 用户分群和分层/累计值标签，下面两种需要标记禁用
     * 1.计算指标中含有打点事件且为人数的
     * 2.计算指标含有用户量
     */
    public Boolean getIsComplexDistinct() {
        return isComplexDistinct;
    }
    /**
     * 用户分群和分层/累计值标签，下面两种需要标记禁用
     * 1.计算指标中含有打点事件且为人数的
     * 2.计算指标含有用户量
     */
    public void setIsComplexDistinct(Boolean isComplexDistinct) {
        this.isComplexDistinct = isComplexDistinct;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
        }
        if (elementId != null) {
            joiner.add("elementId: " + GraphQLRequestSerializer.getEntry(elementId));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (platforms != null) {
            joiner.add("platforms: " + GraphQLRequestSerializer.getEntry(platforms));
        }
        if (attributes != null) {
            joiner.add("attributes: " + GraphQLRequestSerializer.getEntry(attributes));
        }
        if (labels != null) {
            joiner.add("labels: " + GraphQLRequestSerializer.getEntry(labels));
        }
        if (favorites != null) {
            joiner.add("favorites: " + GraphQLRequestSerializer.getEntry(favorites));
        }
        if (isComplexDistinct != null) {
            joiner.add("isComplexDistinct: " + GraphQLRequestSerializer.getEntry(isComplexDistinct));
        }
        return joiner.toString();
    }

    public static MeasurableDto.Builder builder() {
        return new MeasurableDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String type;
        private String action;
        private String elementId;
        private String valueType;
        private java.util.List<String> platforms;
        private java.util.List<MeasurableAttributeDto> attributes;
        private java.util.List<String> labels;
        private Boolean favorites;
        private Boolean isComplexDistinct;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setAction(String action) {
            this.action = action;
            return this;
        }

        public Builder setElementId(String elementId) {
            this.elementId = elementId;
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setPlatforms(java.util.List<String> platforms) {
            this.platforms = platforms;
            return this;
        }

        public Builder setAttributes(java.util.List<MeasurableAttributeDto> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setFavorites(Boolean favorites) {
            this.favorites = favorites;
            return this;
        }

        /**
         * 用户分群和分层/累计值标签，下面两种需要标记禁用
         * 1.计算指标中含有打点事件且为人数的
         * 2.计算指标含有用户量
         */
        public Builder setIsComplexDistinct(Boolean isComplexDistinct) {
            this.isComplexDistinct = isComplexDistinct;
            return this;
        }


        public MeasurableDto build() {
            return new MeasurableDto(id, name, type, action, elementId, valueType, platforms, attributes, labels, favorites, isComplexDistinct);
        }

    }
}
