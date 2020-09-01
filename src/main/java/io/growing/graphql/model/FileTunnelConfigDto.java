package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2020-09-01T14:41:35+0800"
)
public class FileTunnelConfigDto implements java.io.Serializable, TunnelConfigDto {

    private FilesTunnelConfigTypeDto type;

    public FileTunnelConfigDto() {
    }

    public FileTunnelConfigDto(FilesTunnelConfigTypeDto type) {
        this.type = type;
    }

    public FilesTunnelConfigTypeDto getType() {
        return type;
    }
    public void setType(FilesTunnelConfigTypeDto type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

    public static FileTunnelConfigDto.Builder builder() {
        return new FileTunnelConfigDto.Builder();
    }

    public static class Builder {

        private FilesTunnelConfigTypeDto type;

        public Builder() {
        }

        public Builder setType(FilesTunnelConfigTypeDto type) {
            this.type = type;
            return this;
        }


        public FileTunnelConfigDto build() {
            return new FileTunnelConfigDto(type);
        }

    }
}
