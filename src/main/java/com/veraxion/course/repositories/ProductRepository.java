package com.veraxion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veraxion.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
