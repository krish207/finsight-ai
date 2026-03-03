package com.finsight.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "online",
            "app", "FinSight AI",
            "version", "0.1.0"
        );
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
            "message", "Welcome to FinSight AI — your intelligent finance companion 🚀"
        );
    }
}
