package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class SplitterDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String key;
    private java.util.List<String> values;
    private java.util.List<TargetUserDto> users;
    private java.util.List<ActionDto> actions;
    private java.util.List<SplitterDto> splitters;
    private java.util.List<String> selectedValues;
    private java.util.List<Integer> selectedIndices;
    private String valueType;
    private String name;

    public SplitterDto() {
    }

    public SplitterDto(String key, java.util.List<String> values, java.util.List<TargetUserDto> users, java.util.List<ActionDto> actions, java.util.List<SplitterDto> splitters, java.util.List<String> selectedValues, java.util.List<Integer> selectedIndices, String valueType, String name) {
        this.key = key;
        this.values = values;
        this.users = users;
        this.actions = actions;
        this.splitters = splitters;
        this.selectedValues = selectedValues;
        this.selectedIndices = selectedIndices;
        this.valueType = valueType;
        this.name = name;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public java.util.List<String> getValues() {
        return values;
    }
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    public java.util.List<TargetUserDto> getUsers() {
        return users;
    }
    public void setUsers(java.util.List<TargetUserDto> users) {
        this.users = users;
    }

    public java.util.List<ActionDto> getActions() {
        return actions;
    }
    public void setActions(java.util.List<ActionDto> actions) {
        this.actions = actions;
    }

    public java.util.List<SplitterDto> getSplitters() {
        return splitters;
    }
    public void setSplitters(java.util.List<SplitterDto> splitters) {
        this.splitters = splitters;
    }

    public java.util.List<String> getSelectedValues() {
        return selectedValues;
    }
    public void setSelectedValues(java.util.List<String> selectedValues) {
        this.selectedValues = selectedValues;
    }

    public java.util.List<Integer> getSelectedIndices() {
        return selectedIndices;
    }
    public void setSelectedIndices(java.util.List<Integer> selectedIndices) {
        this.selectedIndices = selectedIndices;
    }

    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (values != null) {
            joiner.add("values: " + GraphQLRequestSerializer.getEntry(values));
        }
        if (users != null) {
            joiner.add("users: " + GraphQLRequestSerializer.getEntry(users));
        }
        if (actions != null) {
            joiner.add("actions: " + GraphQLRequestSerializer.getEntry(actions));
        }
        if (splitters != null) {
            joiner.add("splitters: " + GraphQLRequestSerializer.getEntry(splitters));
        }
        if (selectedValues != null) {
            joiner.add("selectedValues: " + GraphQLRequestSerializer.getEntry(selectedValues));
        }
        if (selectedIndices != null) {
            joiner.add("selectedIndices: " + GraphQLRequestSerializer.getEntry(selectedIndices));
        }
        if (valueType != null) {
            joiner.add("valueType: " + GraphQLRequestSerializer.getEntry(valueType));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

    public static SplitterDto.Builder builder() {
        return new SplitterDto.Builder();
    }

    public static class Builder {

        private String key;
        private java.util.List<String> values;
        private java.util.List<TargetUserDto> users;
        private java.util.List<ActionDto> actions;
        private java.util.List<SplitterDto> splitters;
        private java.util.List<String> selectedValues;
        private java.util.List<Integer> selectedIndices;
        private String valueType;
        private String name;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public Builder setUsers(java.util.List<TargetUserDto> users) {
            this.users = users;
            return this;
        }

        public Builder setActions(java.util.List<ActionDto> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setSplitters(java.util.List<SplitterDto> splitters) {
            this.splitters = splitters;
            return this;
        }

        public Builder setSelectedValues(java.util.List<String> selectedValues) {
            this.selectedValues = selectedValues;
            return this;
        }

        public Builder setSelectedIndices(java.util.List<Integer> selectedIndices) {
            this.selectedIndices = selectedIndices;
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public SplitterDto build() {
            return new SplitterDto(key, values, users, actions, splitters, selectedValues, selectedIndices, valueType, name);
        }

    }
}
