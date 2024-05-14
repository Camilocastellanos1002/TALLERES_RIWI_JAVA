package com.riwi._02_API_Rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi._02_API_Rest.entities.Evento;
import com.riwi._02_API_Rest.services.service_abstract.IEventService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController //creacion de servicios web restFull, elimina la nesesidad de anotar cada metodo de manejo de solicitudes de la clase de controlador con responsebody
@RequestMapping("/events") //asigna ruta para solicitudes web a metodos controller
@AllArgsConstructor
public class EventController {
    
    @Autowired //declaracion de la dependencia para el uso de la  interface del servicio
    private final IEventService objIEventService;

    //READ
        //anotacion para asignar solicitudes tipo GET http a los metodos del controlador
        @GetMapping
        /* ResponseEntity clase por defecto de srpingboot
            que se utiliza para responder con los estados http (200, 400, 500.....) 
            de un generico doble con una lista de entidades tipo evento */
        public ResponseEntity <List<Evento>>getAll(){
            return ResponseEntity.ok(this.objIEventService.getAll()); //metodo ok devuelve que todo esta bien y recibe la lista de eventos

        }
        @GetMapping(path = "/{id}") //forma de ingresar el id de forma dinamica en postman
        public ResponseEntity<List<Evento>> get(@PathVariable Long id){ //PathVariable genera variables dentro de los segmentos URL
            return ResponseEntity.ok(this.objIEventService.getAll());
        }
        @GetMapping(path = "/search")
        public ResponseEntity<List<Evento>> get(@RequestParam String name) { //RequestParam extrae el parametro de consulta
            return ResponseEntity.ok(this.objIEventService.search(name));
        }
    
    //CREATE
        //anotacion para insertar como solicitud tipo POST http
        @PostMapping
        public ResponseEntity<Evento> insert(@RequestBody Evento objEvento){
            //el metodo .ok crea un objeto evento y genera una respuesta vacia de tipo http 200ok
            return ResponseEntity.ok(this.objIEventService.create(objEvento));
        }
    //UPDATE
        @PutMapping("/{id}")
        public ResponseEntity<Evento> update(
            @PathVariable String id, 
            @RequestBody Evento objEvento) {
        
            return ResponseEntity.ok(this.objIEventService.update(id, objEvento));
        }
    //DELETE
        @DeleteMapping(path = "/{id}")
        public ResponseEntity<Void> delete(@PathVariable String id){
            this.objIEventService.delete(id);
            return ResponseEntity.noContent().build();
        }

}
