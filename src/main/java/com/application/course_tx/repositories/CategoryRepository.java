package com.application.course_tx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.course_tx.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
