package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-07T14:40:18+0800"
)
public class EventImportJobDto implements java.io.Serializable, NamedEntityDto {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String type;
    private String description;
    @javax.validation.constraints.NotNull
    private EventImportParameterDto parameter;
    @javax.validation.constraints.NotNull
    private EventImportArgumentDto argument;
    @javax.validation.constraints.NotNull
    private JobStageDto stage;
    @javax.validation.constraints.NotNull
    private String creatorId;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String updaterId;
    private java.time.ZonedDateTime updatedAt;
    private String creator;
    private String updater;
    private ErrorDto error;

    public EventImportJobDto() {
    }

    public EventImportJobDto(String id, String name, String type, String description, EventImportParameterDto parameter, EventImportArgumentDto argument, JobStageDto stage, String creatorId, java.time.ZonedDateTime createdAt, String updaterId, java.time.ZonedDateTime updatedAt, String creator, String updater, ErrorDto error) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.parameter = parameter;
        this.argument = argument;
        this.stage = stage;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updaterId = updaterId;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.updater = updater;
        this.error = error;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public EventImportParameterDto getParameter() {
        return parameter;
    }
    public void setParameter(EventImportParameterDto parameter) {
        this.parameter = parameter;
    }

    public EventImportArgumentDto getArgument() {
        return argument;
    }
    public void setArgument(EventImportArgumentDto argument) {
        this.argument = argument;
    }

    public JobStageDto getStage() {
        return stage;
    }
    public void setStage(JobStageDto stage) {
        this.stage = stage;
    }

    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdaterId() {
        return updaterId;
    }
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public java.time.ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public ErrorDto getError() {
        return error;
    }
    public void setError(ErrorDto error) {
        this.error = error;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (parameter != null) {
            joiner.add("parameter: " + GraphQLRequestSerializer.getEntry(parameter));
        }
        if (argument != null) {
            joiner.add("argument: " + GraphQLRequestSerializer.getEntry(argument));
        }
        if (stage != null) {
            joiner.add("stage: " + GraphQLRequestSerializer.getEntry(stage));
        }
        if (creatorId != null) {
            joiner.add("creatorId: " + GraphQLRequestSerializer.getEntry(creatorId));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (updaterId != null) {
            joiner.add("updaterId: " + GraphQLRequestSerializer.getEntry(updaterId));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (updater != null) {
            joiner.add("updater: " + GraphQLRequestSerializer.getEntry(updater));
        }
        if (error != null) {
            joiner.add("error: " + GraphQLRequestSerializer.getEntry(error));
        }
        return joiner.toString();
    }

    public static EventImportJobDto.Builder builder() {
        return new EventImportJobDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String type;
        private String description;
        private EventImportParameterDto parameter;
        private EventImportArgumentDto argument;
        private JobStageDto stage;
        private String creatorId;
        private java.time.ZonedDateTime createdAt;
        private String updaterId;
        private java.time.ZonedDateTime updatedAt;
        private String creator;
        private String updater;
        private ErrorDto error;

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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setParameter(EventImportParameterDto parameter) {
            this.parameter = parameter;
            return this;
        }

        public Builder setArgument(EventImportArgumentDto argument) {
            this.argument = argument;
            return this;
        }

        public Builder setStage(JobStageDto stage) {
            this.stage = stage;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdaterId(String updaterId) {
            this.updaterId = updaterId;
            return this;
        }

        public Builder setUpdatedAt(java.time.ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = creator;
            return this;
        }

        public Builder setUpdater(String updater) {
            this.updater = updater;
            return this;
        }

        public Builder setError(ErrorDto error) {
            this.error = error;
            return this;
        }


        public EventImportJobDto build() {
            return new EventImportJobDto(id, name, type, description, parameter, argument, stage, creatorId, createdAt, updaterId, updatedAt, creator, updater, error);
        }

    }
}
