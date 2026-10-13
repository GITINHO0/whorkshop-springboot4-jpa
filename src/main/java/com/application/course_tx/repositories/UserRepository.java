package com.application.course_tx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.course_tx.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
