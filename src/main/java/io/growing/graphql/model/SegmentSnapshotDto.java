package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class SegmentSnapshotDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private Integer totalUsers;
    private Double usersRatio;

    public SegmentSnapshotDto() {
    }

    public SegmentSnapshotDto(String id, Integer totalUsers, Double usersRatio) {
        this.id = id;
        this.totalUsers = totalUsers;
        this.usersRatio = usersRatio;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalUsers() {
        return totalUsers;
    }
    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }

    public Double getUsersRatio() {
        return usersRatio;
    }
    public void setUsersRatio(Double usersRatio) {
        this.usersRatio = usersRatio;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (totalUsers != null) {
            joiner.add("totalUsers: " + GraphQLRequestSerializer.getEntry(totalUsers));
        }
        if (usersRatio != null) {
            joiner.add("usersRatio: " + GraphQLRequestSerializer.getEntry(usersRatio));
        }
        return joiner.toString();
    }

    public static SegmentSnapshotDto.Builder builder() {
        return new SegmentSnapshotDto.Builder();
    }

    public static class Builder {

        private String id;
        private Integer totalUsers;
        private Double usersRatio;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTotalUsers(Integer totalUsers) {
            this.totalUsers = totalUsers;
            return this;
        }

        public Builder setUsersRatio(Double usersRatio) {
            this.usersRatio = usersRatio;
            return this;
        }


        public SegmentSnapshotDto build() {
            return new SegmentSnapshotDto(id, totalUsers, usersRatio);
        }

    }
}
