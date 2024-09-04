package com.linkcorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkcorp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
