package io.growing.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-05-26T15:01:23+0800"
)
public class AccountApplicationDto implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String identity;
    @javax.validation.constraints.NotNull
    private String status;
    @javax.validation.constraints.NotNull
    private AccountApplicationProfileDto profile;
    @javax.validation.constraints.NotNull
    private java.time.ZonedDateTime createdAt;
    private String approver;
    private java.time.ZonedDateTime approvedAt;

    public AccountApplicationDto() {
    }

    public AccountApplicationDto(String id, String name, String identity, String status, AccountApplicationProfileDto profile, java.time.ZonedDateTime createdAt, String approver, java.time.ZonedDateTime approvedAt) {
        this.id = id;
        this.name = name;
        this.identity = identity;
        this.status = status;
        this.profile = profile;
        this.createdAt = createdAt;
        this.approver = approver;
        this.approvedAt = approvedAt;
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

    public String getIdentity() {
        return identity;
    }
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public AccountApplicationProfileDto getProfile() {
        return profile;
    }
    public void setProfile(AccountApplicationProfileDto profile) {
        this.profile = profile;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getApprover() {
        return approver;
    }
    public void setApprover(String approver) {
        this.approver = approver;
    }

    public java.time.ZonedDateTime getApprovedAt() {
        return approvedAt;
    }
    public void setApprovedAt(java.time.ZonedDateTime approvedAt) {
        this.approvedAt = approvedAt;
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
        if (identity != null) {
            joiner.add("identity: " + GraphQLRequestSerializer.getEntry(identity));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (profile != null) {
            joiner.add("profile: " + GraphQLRequestSerializer.getEntry(profile));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (approver != null) {
            joiner.add("approver: " + GraphQLRequestSerializer.getEntry(approver));
        }
        if (approvedAt != null) {
            joiner.add("approvedAt: " + GraphQLRequestSerializer.getEntry(approvedAt));
        }
        return joiner.toString();
    }

    public static AccountApplicationDto.Builder builder() {
        return new AccountApplicationDto.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String identity;
        private String status;
        private AccountApplicationProfileDto profile;
        private java.time.ZonedDateTime createdAt;
        private String approver;
        private java.time.ZonedDateTime approvedAt;

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

        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setProfile(AccountApplicationProfileDto profile) {
            this.profile = profile;
            return this;
        }

        public Builder setCreatedAt(java.time.ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setApprover(String approver) {
            this.approver = approver;
            return this;
        }

        public Builder setApprovedAt(java.time.ZonedDateTime approvedAt) {
            this.approvedAt = approvedAt;
            return this;
        }


        public AccountApplicationDto build() {
            return new AccountApplicationDto(id, name, identity, status, profile, createdAt, approver, approvedAt);
        }

    }
}
