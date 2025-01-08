package com.example.quickstart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JiraIssueController {

    @Autowired
    private JiraIssueService JiraIssueService;

    @Autowired
    private ScheduledTasks scheduledTasks;

    @GetMapping(path = "/jiraissues")
    public List<JiraIssues> getIssues() {
        return JiraIssueService.getIssues();
    }

    @GetMapping(path = "/jiraissues/{index}")
    public JiraIssues getIssuesByIndex(@PathVariable int index) {
        return JiraIssueService.getIssuesByIndex(index);
    }

    @GetMapping("/")
    public String root() {
        return "Root endpoint";
    }

    @PostMapping("/jiraissues/post")
    public JiraIssues postIssues(@RequestBody JiraIssues issue) {
        JiraIssueService.postIssues(issue);
        return issue;
    }

    @GetMapping("/latestMessage")
    @CrossOrigin(origins = "*")
    public String getLatestMessage() {
        return scheduledTasks.getLatestMessage();
    }

    @DeleteMapping("/jiraissues/remove/{index}")
    public JiraIssues removeIssues(@PathVariable int index) {
        return JiraIssueService.removeIssues(index);
    }
}




