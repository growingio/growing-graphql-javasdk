package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-12-22T15:45:57+0800"
)
public class EventStatDto implements java.io.Serializable {

    private String name;
    @javax.validation.constraints.NotNull
    private UserEventTypeDto type;
    private String key;
    private Integer count;

    public EventStatDto() {
    }

    public EventStatDto(String name, UserEventTypeDto type, String key, Integer count) {
        this.name = name;
        this.type = type;
        this.key = key;
        this.count = count;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public UserEventTypeDto getType() {
        return type;
    }
    public void setType(UserEventTypeDto type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (count != null) {
            joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        }
        return joiner.toString();
    }

    public static EventStatDto.Builder builder() {
        return new EventStatDto.Builder();
    }

    public static class Builder {

        private String name;
        private UserEventTypeDto type;
        private String key;
        private Integer count;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(UserEventTypeDto type) {
            this.type = type;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public EventStatDto build() {
            return new EventStatDto(name, type, key, count);
        }

    }
}
