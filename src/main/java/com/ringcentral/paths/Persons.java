package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class Persons extends Path {
    public Persons(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "persons", id);
    }

    public static class GetResponse {
        // Internal identifier of a user
        public String id;
        // First name of a user
        public String firstName;
        // Last name of a user
        public String lastName;
        // Email of a user
        public String email;
        // Photo of a user
        public String avatar;
        // Internal identifier of a company
        public String companyId;
        // Time of creation in ISO 8601 format
        public String creationTime;
        // Time of last modification in ISO 8601 format
        public String lastModifiedTime;

        public GetResponse id(String id) {
            this.id = id;
            return this;
        }

        public GetResponse firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public GetResponse lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public GetResponse email(String email) {
            this.email = email;
            return this;
        }

        public GetResponse avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        public GetResponse companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }

        public GetResponse creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public GetResponse lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
    }
}
