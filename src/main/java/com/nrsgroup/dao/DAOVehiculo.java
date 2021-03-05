package com.nrsgroup.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nrsgroup.entities.Autobus;
import com.nrsgroup.entities.Automovil;
import com.nrsgroup.entities.Motocicleta;
import com.nrsgroup.entities.Vehiculo;

@Repository
public interface DAOVehiculo extends JpaRepository<Vehiculo, Integer>{
	
	// QUERYS POR TIPO DE VEHICULO
	@Query(value = "SELECT automovil FROM Automovil automovil")
	ArrayList<Automovil> findAllAutomovil();
	
	@Query(value = "SELECT motocicleta FROM Motocicleta motocicleta")
	ArrayList<Motocicleta> findAllMotocicleta();
	
	@Query(value = "SELECT autobus FROM Autobus autobus")
	ArrayList<Autobus> findAllAutobus();
		
	// QUERY POR MARCA DE VEHICULO
	ArrayList<Vehiculo> findBymarca(String marca);
}
