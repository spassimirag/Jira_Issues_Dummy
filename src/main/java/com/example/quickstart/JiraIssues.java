package com.example.quickstart;

import java.util.ArrayList;

public class JiraIssues {
    String summary;
    String description;
    String priority;
    String teamName;
    int reporterID;

    JiraIssues(String summary, String description, String priority, String teamName, int reporterID) {
        this.summary = summary;
        this.description = description;
        this.priority = priority;
        this.reporterID = reporterID;
        this.teamName = teamName;
    }


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getReporterID() {
        return reporterID;
    }

    public void setReporterID(int reporterID) {
        this.reporterID = reporterID;
    }

}

