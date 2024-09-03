package com.linkcorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkcorp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
