package com.example.CodeWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*Anotaciones de JPA sobre persistencia @Entity*/
@Entity
public class Persona {

    /*La llave primaria con @Id*/
    /*Darle el nombre de la tabla con @Column y asignar la cantidad*/
    @Id
    private int idPersona;
    @Column(name = "nombre", length = 50)
    private String nombre;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
