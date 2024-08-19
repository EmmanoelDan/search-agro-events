package com.demeter.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demeter.api.domain.events.Event;

/**
 * EventRepository
 */
public interface EventRepository extends JpaRepository <Event, UUID> {
    
    
}
