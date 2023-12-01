package com.glm.springjpahiber.repositories;

import com.glm.springjpahiber.entities.Order;
import com.glm.springjpahiber.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
