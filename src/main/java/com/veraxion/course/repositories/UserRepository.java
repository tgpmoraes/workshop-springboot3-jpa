package com.veraxion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veraxion.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
