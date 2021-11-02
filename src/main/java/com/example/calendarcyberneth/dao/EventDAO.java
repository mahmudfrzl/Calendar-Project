package com.example.calendarcyberneth.dao;

import com.example.calendarcyberneth.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDAO extends JpaRepository<Event,Long> {
}
