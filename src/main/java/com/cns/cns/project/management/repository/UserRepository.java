package com.cns.cns.project.management.repository;

import com.cns.cns.project.management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);

    public User findByEmailIgnoreCase(String email);
}
