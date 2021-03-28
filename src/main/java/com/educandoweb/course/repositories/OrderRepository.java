package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

// repositórios são interfaces
// essa classe é responsável 
// o spring.data.jpa já tem uma implementaçaõ para a interface
public interface OrderRepository extends JpaRepository<Order, Long> {

}
