package com.example.omgcontroller.model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="event")
public class Event {
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="header")
    private String header;
    @Column(name="description")
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_time")
    private Date startTime;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_time")
    private Date endTime;
    @Column(name="location")
    private String location;

    protected Event() {}

    public Event(String header, String description, Date startTime, Date endTime, String location) {
        this.header = header;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format(
                "Event[id=%d, header=%s, description=%s, startTime=%s, endTime=%s, location=%s]",
                id, header, description, startTime, endTime, location
        );
    }

    public Long getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id) &&
                Objects.equals(header, event.header) &&
                Objects.equals(description, event.description) &&
                Objects.equals(startTime, event.startTime) &&
                Objects.equals(endTime, event.endTime) &&
                Objects.equals(location, event.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.header, this.description, this.startTime, this.endTime, this.location);
    }
}
