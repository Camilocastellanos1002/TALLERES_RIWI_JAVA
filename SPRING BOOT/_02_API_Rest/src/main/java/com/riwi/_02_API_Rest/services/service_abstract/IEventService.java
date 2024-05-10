package com.riwi._02_API_Rest.services.service_abstract;

import java.util.List;

import com.riwi._02_API_Rest.entities.Evento;

//interface propia para los servicios de los eventos
/*
 * Utilizamos una interfaz para ser utilizada como inyeccion de dependencias en controlador, mantiene integridad, desacoplamiento y
 * principios solid
 */
public interface IEventService {

    //Metodos CRUD
        //create
        public Evento create (Evento event);
        //read
        public List <Evento> getAll();
            public Evento findById(String id);
            public List<Evento> search(String name);
        //update
        public Evento update (String id, Evento evento); //obtiene el id del producto y todo el objeto para actualizarlo
        //delete
        public void delete(String id);

        /* SpringBootApp.bind(IEventService,EventService) 
            es la forma en la que springboot genera la conexion entre la interface y el servicio
        */  
        
}
