package com.ojcfcl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojcfcl.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
