package com.nrsgroup.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nrsgroup.entities.Vehiculo;
import com.nrsgroup.entities.Autobus;
import com.nrsgroup.entities.Automovil;
import com.nrsgroup.entities.Motocicleta;

@Repository
public interface RestDAO extends JpaRepository <Vehiculo, Integer> {
	
	// "JpaRepository" METODOS QUE TIENE POR DEFAULT SPRING PARA LA PERSISTENCIA DE DATOS.
	
	//QUERYS POR TIPO DE VEHICULO - QUERYS CON JPLQ
	@Query(value = "SELECT automovil FROM Automovil automovil")
	List<Automovil> finAllAutomovil();	
	
	
	@Query(value = "SELECT motocicleta FROM Motocicleta motocicleta")
	List<Motocicleta> finAllMotocicleta();
	
	
	@Query(value = "SELECT autobus FROM Autobus autobus")
	List<Autobus> finAllAutobus();
	
/*	
	// QUERY PARA LISTADO DE VEHICULOS DE UNA CATEGORIA (cantidad_cilindros) - QUERYS CON SQL NATIVO
	@Query(
		value = "SELECT * FROM autobuses WHERE marca = 'TOYOTA' ",
		nativeQuery = true
	)
	List<Vehiculo> findAllVehiculos_CATEGORIA();
	
*/
}
