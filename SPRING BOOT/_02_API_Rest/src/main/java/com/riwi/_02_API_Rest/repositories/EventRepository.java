package com.riwi._02_API_Rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi._02_API_Rest.entities.Evento;

//interface
@Repository //para que springboot lo lea como repositorio
public interface EventRepository extends JpaRepository<Evento,String>{ 
    //extiende de la dependencia jpa, con generico (entidad y tipo de dato de la llave primaria) 

    //metodo publico que ejecuta dependencia Hibernate en springboot que devuelve una lista de entidad tipo evento, que lo busca por nombre
    public List<Evento> findByName(String name);
}
