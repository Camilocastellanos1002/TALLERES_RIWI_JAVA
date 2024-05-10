package com.riwi._02_API_Rest.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "evento")    //genera la entidad y/o tabla llamado evento en la BD MySQL
@Data //crea los getters, setters, toStrings.....
@AllArgsConstructor  //crear constructor lleno
@NoArgsConstructor  //crear constructor vacio
public class Evento {

    @Id //se declara que va hacer del tipo id,
    @GeneratedValue(strategy = GenerationType.UUID) //genera autimaticamente identificador universal unico RFC 4122
    private String id;
    private String name;
    private Date fecha;
    private String ubiacion;
    private int capacidad;
}
