package com.example.calendarcyberneth.dao;

import com.example.calendarcyberneth.model.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarDAO extends JpaRepository<Calendar,Long> {
}
