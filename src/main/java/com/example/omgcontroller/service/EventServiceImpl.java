package com.example.omgcontroller.service;

import com.example.omgcontroller.model.Event;
import com.example.omgcontroller.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event saveEvent(Event event){
        return eventRepository.save(event);
    }
    @Override
    public List<Event> findByEndTimeGreaterThan(Date date) {
        return eventRepository.findByEndTimeGreaterThan(date);
    }

    @Override
    public void deleteEventById(Long eventId) {
        eventRepository.deleteById(eventId);
    }
}
