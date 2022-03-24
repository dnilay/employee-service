package com.example.dmeo.controller;

import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private final Environment environment;

    @GetMapping("/status")
    public ResponseEntity<?> getStatus()
    {
        return ResponseEntity.ok("employee-service is up and running on port: "+environment.getProperty("local.server.port"));
    }
}
