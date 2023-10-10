package com.projetojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojava.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
