package com.cns.cns.project.management.controller;

import com.cns.cns.project.management.entity.Project;
import com.cns.cns.project.management.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/project")
    public List<Project> fetchProjectList() {
        return projectService.fetchProjectList();
    }

    @PostMapping("/project")
    public Project saveProject(Project project) {
        return projectService.saveProject(project);
    }
}
