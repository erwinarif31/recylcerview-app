package com.h071211059.recyclerviewapp;

public class Status {
    private String statusText;
    private String statusTime;

    public Status(String statusText, String statusTime) {
        this.statusText = statusText;
        this.statusTime = statusTime;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }
}
