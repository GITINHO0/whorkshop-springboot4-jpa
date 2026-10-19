package com.application.course_tx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.course_tx.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
