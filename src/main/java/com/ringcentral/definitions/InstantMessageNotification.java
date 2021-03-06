package com.ringcentral.definitions;

public class InstantMessageNotification {
    // Universally unique identifier of a notification
    public String uuid;
    // Event filter URI
    public String event;
    // Internal identifier of a subscription
    public String subscriptionId;
    // Datetime of sending a notification in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String timestamp;
    // Notification payload body
    public InstantMessageEvent body;

    public InstantMessageNotification uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public InstantMessageNotification event(String event) {
        this.event = event;
        return this;
    }

    public InstantMessageNotification subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public InstantMessageNotification timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public InstantMessageNotification body(InstantMessageEvent body) {
        this.body = body;
        return this;
    }
}
