package com.application.course_tx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.course_tx.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
