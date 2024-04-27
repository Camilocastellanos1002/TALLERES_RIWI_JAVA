package com.riwi._02_API_Rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi._02_API_Rest.entities.Evento;

@Repository
public interface EventRepository extends JpaRepository<Evento,String>{
    public List<Evento> findByName(String name);
}
