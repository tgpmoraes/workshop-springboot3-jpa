package com.veraxion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veraxion.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
