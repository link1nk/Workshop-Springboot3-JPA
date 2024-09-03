package com.linkcorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkcorp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
