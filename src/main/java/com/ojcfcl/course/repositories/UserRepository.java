package com.ojcfcl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojcfcl.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
