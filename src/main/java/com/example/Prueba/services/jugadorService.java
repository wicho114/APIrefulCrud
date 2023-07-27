package com.example.Prueba.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Prueba.models.jugadorModel;
import com.example.Prueba.repositories.jugadoresRepository;

@Service
public class jugadorService {

@Autowired
jugadoresRepository jugadoresRepository;

//buscar todos los registros
public ArrayList<jugadorModel> obtenerJugadores(){
    return (ArrayList<jugadorModel>) jugadoresRepository.findAll(); 
}
 //buscar por ID
 public Optional <jugadorModel> obtenerporId(Integer Id){
    return jugadoresRepository.findById(Id);
 }
 //metodo para guardar un jugador
 public jugadorModel guardar(jugadorModel jugador){
    return jugadoresRepository.save(jugador);
 }
 public boolean eliminar(Integer Id){
    try {
        jugadoresRepository.deleteById(Id);
        return true;
    } catch (Exception e) {
       return false;
    }
 }
}
