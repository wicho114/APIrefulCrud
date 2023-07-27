package com.example.Prueba.models;

import jakarta.persistence.*;

@Entity
//nombrar tabla sql
@Table(name="jugadores")
public class jugadorModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique =true , nullable = false)
    private int Id;
    private String nombre;
    private String grupo;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
