package com.example.quickstart;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class JiraIssueService {

    public HashMap<String, JiraIssues> hashMapIssues = new HashMap<>();
    public List<JiraIssues> allIssues = new ArrayList<>();

    public List<JiraIssues> getIssues() {
        return allIssues;
    }

    public JiraIssues getIssuesByIndex(int index) {
        return allIssues.get(index);
    }

    public String root() {
        return "Root endpoint";
    }

    public JiraIssues postIssues(JiraIssues issue) {
        allIssues.add(issue);
        hashMapIssues.put(issue.getSummary(), issue);
        return issue;
    }


    public JiraIssues removeIssues(int index) {
        return allIssues.remove(index);
    }
}




