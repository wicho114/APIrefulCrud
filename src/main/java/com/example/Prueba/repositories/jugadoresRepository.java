package com.example.Prueba.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Prueba.models.jugadorModel;


@Repository
public interface jugadoresRepository extends CrudRepository<jugadorModel, Integer>{
    //No hace falta declarar metodos estaticos porque estos metodos ya estan programados en la dependendcia CrudRepository
    //findById()
    //findById()
    //DeleteById()
}
