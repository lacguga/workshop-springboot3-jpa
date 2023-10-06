package com.projetojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojava.course.entities.Category;
import com.projetojava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
