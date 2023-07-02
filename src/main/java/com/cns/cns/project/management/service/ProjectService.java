package com.cns.cns.project.management.service;

import com.cns.cns.project.management.entity.Project;

import java.util.List;

public interface ProjectService {

    public List<Project> fetchProjectList();

    public Project saveProject(Project project);
}
