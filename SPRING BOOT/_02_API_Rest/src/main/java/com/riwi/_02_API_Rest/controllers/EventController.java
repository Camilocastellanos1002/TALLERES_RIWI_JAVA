package com.riwi._02_API_Rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi._02_API_Rest.entities.Evento;
import com.riwi._02_API_Rest.services.service_abstract.IEventService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@RestController //creacion de servicios web restFull, elimina la nesesidad de anotar cada metodo de manejo de solicitudes de la clase de controlador con responsebody
@RequestMapping("/api/v1/events") //asigna ruta para solicitudes web a metodos controller
@AllArgsConstructor
public class EventController {
    
    @Autowired //declaracion de la dependencia para el uso de la  interface del servicio
    private final IEventService objIEventService;

    //anotacion para asignar solicitudes tipo GET http a los metodos del controlador
    @GetMapping
    /* ResponseEntity clase por defecto de srpingboot
        que se utiliza para responder con los estados http (200, 400, 500.....) 
        de un generico doble con una lista de entidades tipo evento */
    public ResponseEntity <List<Evento>>getAll(){
        return ResponseEntity.ok(this.objIEventService.getAll()); //metodo ok devuelve que todo esta bien y recibe la lista de eventos

    }
    

    @PostMapping
    public ResponseEntity<Evento> insert(@RequestBody Evento objEvento){
        return ResponseEntity.ok(this.objIEventService.create(objEvento));
    }
}
