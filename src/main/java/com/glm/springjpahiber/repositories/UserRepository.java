package com.glm.springjpahiber.repositories;

import com.glm.springjpahiber.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
