package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class Department extends Path {
    public Department(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "department", id);
    }

    public Members members() {
        return new Members(restClient, pathSegment, null);
    }
}
