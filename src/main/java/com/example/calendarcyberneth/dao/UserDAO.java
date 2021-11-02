package com.example.calendarcyberneth.dao;

import com.example.calendarcyberneth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Long> {
}
