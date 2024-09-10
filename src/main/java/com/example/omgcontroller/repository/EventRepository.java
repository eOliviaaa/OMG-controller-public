package com.example.omgcontroller.repository;

import com.example.omgcontroller.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByEndTimeGreaterThan(Date date);
}
