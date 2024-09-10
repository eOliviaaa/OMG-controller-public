package com.example.omgcontroller.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.omgcontroller.model.Event;
import com.example.omgcontroller.repository.EventRepository;
import com.example.omgcontroller.service.EventService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/event")
@CrossOrigin
public class EventController {
    @Autowired
    private EventService eventService;

    EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/create")
    Event newEvent(@RequestBody Event newEvent) {
        System.out.println(newEvent);
        return eventService.saveEvent(newEvent);
    } // POST method that saves events in database.

    @GetMapping("/getAll")
    public List<Event> findByEndTimeGreaterThan() {
        return eventService.findByEndTimeGreaterThan(new Date());
    } // GET method which returns all events from database.

    @Transactional
    @DeleteMapping("/deleteSingle/{id}")
    void deleteSingle(@PathVariable Long id) {
        eventService.deleteEventById(id);
    } // A DELETE method to remove a specific event from database.
}
