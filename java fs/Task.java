package com.example.taskmanager.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    
    private String description;
    
    private LocalDateTime deadline;
    
    private String priority;  // High, Medium, Low
    
    public Task() {}

    // Getters and Setters
}
