package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-08-28T14:10:31+0800"
)
public class SplitterInputDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String key;
    private java.util.List<String> values;
    private java.util.List<TargetUserInputDto> users;
    private java.util.List<ActionInputDto> actions;
    private java.util.List<SplitterInputDto> splitters;
    private java.util.List<String> selectedValues;
    private java.util.List<Integer> selectedIndices;
    private String valueType;

    public SplitterInputDto() {
    }

    public SplitterInputDto(String key, java.util.List<String> values, java.util.List<TargetUserInputDto> users, java.util.List<ActionInputDto> actions, java.util.List<SplitterInputDto> splitters, java.util.List<String> selectedValues, java.util.List<Integer> selectedIndices, String valueType) {
        this.key = key;
        this.values = values;
        this.users = users;
        this.actions = actions;
        this.splitters = splitters;
        this.selectedValues = selectedValues;
        this.selectedIndices = selectedIndices;
        this.valueType = valueType;
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

    public java.util.List<TargetUserInputDto> getUsers() {
        return users;
    }
    public void setUsers(java.util.List<TargetUserInputDto> users) {
        this.users = users;
    }

    public java.util.List<ActionInputDto> getActions() {
        return actions;
    }
    public void setActions(java.util.List<ActionInputDto> actions) {
        this.actions = actions;
    }

    public java.util.List<SplitterInputDto> getSplitters() {
        return splitters;
    }
    public void setSplitters(java.util.List<SplitterInputDto> splitters) {
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
        return joiner.toString();
    }

    public static SplitterInputDto.Builder builder() {
        return new SplitterInputDto.Builder();
    }

    public static class Builder {

        private String key;
        private java.util.List<String> values;
        private java.util.List<TargetUserInputDto> users;
        private java.util.List<ActionInputDto> actions;
        private java.util.List<SplitterInputDto> splitters;
        private java.util.List<String> selectedValues;
        private java.util.List<Integer> selectedIndices;
        private String valueType;

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

        public Builder setUsers(java.util.List<TargetUserInputDto> users) {
            this.users = users;
            return this;
        }

        public Builder setActions(java.util.List<ActionInputDto> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setSplitters(java.util.List<SplitterInputDto> splitters) {
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


        public SplitterInputDto build() {
            return new SplitterInputDto(key, values, users, actions, splitters, selectedValues, selectedIndices, valueType);
        }

    }
}
