package com.kotovych.todolistnew.repository;

import com.kotovych.todolistnew.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
