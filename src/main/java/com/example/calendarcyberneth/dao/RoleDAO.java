package com.example.calendarcyberneth.dao;

import com.example.calendarcyberneth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO  extends JpaRepository<Role,Long> {
}
