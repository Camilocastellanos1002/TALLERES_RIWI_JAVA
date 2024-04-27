package com.riwi._02_API_Rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi._02_API_Rest.entities.Evento;
import com.riwi._02_API_Rest.services.service_abstract.IEventService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/events")
@AllArgsConstructor
public class EventController {
    
    @Autowired
    private final IEventService eventService;

    @PostMapping
    public ResponseEntity<Evento> insert(@RequestBody Evento objEvento){
        return ResponseEntity.ok(this.eventService.create(objEvento));
    }
}
