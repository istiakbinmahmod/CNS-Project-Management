package com.cns.cns.project.management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectId;

    @NotBlank(message = "Please Add Project Name")
    @Size(max = 100)
    @Column(unique = true)
    private String projectName;

    @NotBlank(message = "Please Add Project Intro")
    @Size(max = 250)
    private String projectIntro;
    private String status;
//    private Date startDate;
//    private Date endDate;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "project_user_map",
            joinColumns = @JoinColumn(
                    name = "project_id",
                    referencedColumnName = "projectId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "user_id",
                    referencedColumnName = "userId"
            )
    )
    private Set<User> users;

    public void addUsers(User user) {
        if (this.users == null) {
            this.users = new HashSet<>();
        }
        this.users.add(user);
    }
}
