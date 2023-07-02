package com.cns.cns.project.management.repository;

import com.cns.cns.project.management.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    public Project findByProjectName(String projectName);

    public Project findByProjectNameIgnoreCase(String projectName);
}
