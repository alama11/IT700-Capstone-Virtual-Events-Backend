package com.it700.virtualevents.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * REST controller for checking the health/status of the application.
 * Endpoint: GET /api/status
 */
@RestController
@RequestMapping("/api")
public class StatusController {

    @GetMapping("/status")
    public ResponseEntity<Map<String, String>> getStatus() {
        return ResponseEntity.ok(Map.of("status", "running"));
    }
}
