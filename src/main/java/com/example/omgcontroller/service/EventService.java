package com.example.omgcontroller.service;

import com.example.omgcontroller.model.Event;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface EventService {
    Event saveEvent(Event event);

    List<Event> findByEndTimeGreaterThan(Date date);

    void deleteEventById(Long eventId);
}
