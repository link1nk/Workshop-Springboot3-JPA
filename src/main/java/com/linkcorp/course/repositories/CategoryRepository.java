package com.linkcorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkcorp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
