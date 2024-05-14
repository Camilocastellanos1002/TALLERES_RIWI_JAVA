package com.riwi._02_API_Rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riwi._02_API_Rest.entities.Evento;
import com.riwi._02_API_Rest.repositories.EventRepository;
import com.riwi._02_API_Rest.services.service_abstract.IEventService;

import lombok.AllArgsConstructor;


@Service //anotacion de servicio 
@AllArgsConstructor //crea el constructor de la clase
public class EventService implements IEventService {

    @Autowired //permite la inyeccion de dependencias, es decir uso de objetos de otra clase
    private final EventRepository objEventRepository;

    @Override
    public Evento create(Evento event) {
        //retorna la creacion del evento con el metodo save del repositorio
        return this.objEventRepository.save(event);
    }

    @Override
    public List<Evento> getAll() {
        //lista todos los eventos
        return this.objEventRepository.findAll();
    }

    @Override
    public Evento findById(String id) {
        //el metodo orElseThrow genera un true si el valor esta presente de lo contrario arroja un NoSuchElementException 
        return this.objEventRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Evento> search(String name) {
        //se busca el evento por el nombre en el repositorio y se devuelve una lista de eventos
       return this.objEventRepository.findByName(name);
    }

    @Override
    public Evento update(String id, Evento objEvento) {
        //se busca el evento por el id
        this.objEventRepository.findById(id).orElseThrow();
        //al objeto evento, se le envia el id
        objEvento.setId(id);
        //devuelve el evento actualizado
        return this.objEventRepository.save(objEvento);
    }

    @Override
    public void delete(String id) {
        //si no se encuentra el evento con el id, arroja un Nosuch....
        Evento eventFind = this.objEventRepository.findById(id).orElseThrow();
        //si se encuentra el evento, se elimina del repositorio
        this.objEventRepository.delete(eventFind);

    }
    
   
}
