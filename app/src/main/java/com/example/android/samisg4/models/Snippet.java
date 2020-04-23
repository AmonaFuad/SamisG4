package com.example.android.samisg4.models;

import com.google.gson.annotations.SerializedName;

public class Snippet {
    @SerializedName("publishedAt")
    private String publishedAt;
   @SerializedName("channelId")
    private String channelId;
   @SerializedName("title")
    private String title;
   @SerializedName("resourceId")
    private ResourceId resourceId;

    public Snippet(String publishedAt, String channelId, String title, ResourceId resourceId) {
        this.publishedAt = publishedAt;
        this.channelId = channelId;
        this.title = title;
        this.resourceId = resourceId;
    }

    public Snippet(String publishedAt, String channelId, String title) {
        this.publishedAt = publishedAt;
        this.channelId = channelId;
        this.title = title;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getTitle() {
        return title;
    }

    public ResourceId getResourceId() {
        return resourceId;
    }
}
