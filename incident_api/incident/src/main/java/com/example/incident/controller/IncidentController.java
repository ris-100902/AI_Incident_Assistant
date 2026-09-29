package com.example.incident.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class IncidentController {

    @GetMapping("/incidents")
    public String getIncidents() {
        return "All incidents";
    }
    
}