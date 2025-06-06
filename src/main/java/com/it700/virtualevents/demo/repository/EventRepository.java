package com.it700.virtualevents.demo.repository;

import com.it700.virtualevents.demo.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Event entities.
 * Provides CRUD operations for managing events.
 */
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
