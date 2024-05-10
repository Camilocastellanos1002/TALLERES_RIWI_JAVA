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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public List<Evento> getAll() {
        return this.objEventRepository.findAll();
    }

    @Override
    public Evento findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Evento> search(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public Evento update(String id, Evento evento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
   
}
