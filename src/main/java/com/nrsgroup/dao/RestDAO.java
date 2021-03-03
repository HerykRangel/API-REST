package com.nrsgroup.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nrsgroup.entities.Vehiculo;

@Repository
public interface RestDAO extends JpaRepository <Vehiculo, Integer> {
	
	// "JpaRepository" METODOS QUE TIENE POR DEFAULT SPRING PARA LA PERSISTENCIA DE DATOS.
	
}
