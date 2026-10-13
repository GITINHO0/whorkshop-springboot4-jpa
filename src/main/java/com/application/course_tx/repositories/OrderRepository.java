package com.application.course_tx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.course_tx.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
