package com.veraxion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veraxion.course.entities.OrderItem;
import com.veraxion.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
