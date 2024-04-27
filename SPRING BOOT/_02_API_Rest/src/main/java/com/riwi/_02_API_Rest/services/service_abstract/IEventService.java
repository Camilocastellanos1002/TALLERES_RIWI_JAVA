package com.riwi._02_API_Rest.services.service_abstract;

import java.util.List;

import org.yaml.snakeyaml.events.Event;

//interface para los servicios de los eventos
public interface IEventService {

    public Event create (Event event);
    public Event update (String id, Event event);
    public List <Event> getAll();
        public Event findById(String id);
        public List<Event> search(String name);
    public void delete(String id);
    
}
