package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class OrderDto implements java.io.Serializable {

    private String id;
    private Boolean isDim;
    private Integer index;
    private Integer valueIndex;
    private String orderType;

    public OrderDto() {
    }

    public OrderDto(String id, Boolean isDim, Integer index, Integer valueIndex, String orderType) {
        this.id = id;
        this.isDim = isDim;
        this.index = index;
        this.valueIndex = valueIndex;
        this.orderType = orderType;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsDim() {
        return isDim;
    }
    public void setIsDim(Boolean isDim) {
        this.isDim = isDim;
    }

    public Integer getIndex() {
        return index;
    }
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getValueIndex() {
        return valueIndex;
    }
    public void setValueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
    }

    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (isDim != null) {
            joiner.add("isDim: " + GraphQLRequestSerializer.getEntry(isDim));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (valueIndex != null) {
            joiner.add("valueIndex: " + GraphQLRequestSerializer.getEntry(valueIndex));
        }
        if (orderType != null) {
            joiner.add("orderType: " + GraphQLRequestSerializer.getEntry(orderType));
        }
        return joiner.toString();
    }

    public static OrderDto.Builder builder() {
        return new OrderDto.Builder();
    }

    public static class Builder {

        private String id;
        private Boolean isDim;
        private Integer index;
        private Integer valueIndex;
        private String orderType;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsDim(Boolean isDim) {
            this.isDim = isDim;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setValueIndex(Integer valueIndex) {
            this.valueIndex = valueIndex;
            return this;
        }

        public Builder setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }


        public OrderDto build() {
            return new OrderDto(id, isDim, index, valueIndex, orderType);
        }

    }
}
