package com.nrsgroup.service;

import java.util.ArrayList;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.nrsgroup.dao.DAOVehiculo;
import com.nrsgroup.entities.Autobus;
import com.nrsgroup.entities.Automovil;
import com.nrsgroup.entities.Motocicleta;
import com.nrsgroup.entities.Vehiculo;

@Service
public class ServiceVehiculo {
	
	/* @Async METODOS QUE SERAN ASINCRONICOS */

	@Autowired
	DAOVehiculo daoVehiculo;
	
	Logger logger=LoggerFactory.getLogger(ServiceVehiculo.class);
		
	/*****************  METODOS DE BUSQUEDA **********************************/
	
	// METDO PARA LISTAR LOS VEHICULOS 												/* LISTADO DE TODOS LOS VEHICULOS */
	public ArrayList<Vehiculo> ListaVehiculo(){
		logger.info("LISTA VEHICULOS " + Thread.currentThread().getName());
		return (ArrayList<Vehiculo>)daoVehiculo.findAll();
	}
	
	// METDO PARA LISTAR LOS AUTOMOVILES											/* LISTADO DE VEHICULOS POR TIPO */
	public ArrayList<Automovil> ListaAutomovil(){
		logger.info("LISTA AUTOMOVILES " + Thread.currentThread().getName());
		return daoVehiculo.findAllAutomovil();
	}
	
	// METDO PARA LISTAR LA MOTOCICLETAS
	public ArrayList<Motocicleta> ListaMotocicleta(){
		logger.info("LISTA MOTOCICLETA " + Thread.currentThread().getName());
		return daoVehiculo.findAllMotocicleta();
	}
	
	// METDO PARA LISTAR LOS AUTOBUSES
	public ArrayList<Autobus> ListaAutobus(){
		logger.info("LISTA AUTOBUS " + Thread.currentThread().getName());
		return daoVehiculo.findAllAutobus();
	}
	
	// METODO PARA LISTA LOS VEHICULOS SEGUN SU MARCA								  /* LISTADO DE VEHICULOS SEGUN UNA CATEGORIA */
	public ArrayList<Vehiculo> ListaVehiculoMarca(String marca){
		logger.info("LISTA VEHICULOS MARCA " + Thread.currentThread().getName());
		return daoVehiculo.findBymarca(marca);
	}
	
	// METODO PARA BUSCAR DETALLE VEHICULO POR ID									   /* BUSQUEDA PUNTUAL DE UN VEHICULO  */
	public Optional<Vehiculo> VehiculoId(Integer id){
		logger.info("VEHICULO POR ID " + Thread.currentThread().getName());
		return  daoVehiculo.findById(id);
	}
	
	/***************  METODOS PARA INSERTAR VEHICULOS ****************************/
	
	// METODO INSERTAR AUTOMOVIL
	@Async
	public Automovil InsertarAutomovil(Automovil automovil) {
		logger.info("INSERTAR AUTOMOVIL " + Thread.currentThread().getName());
		return daoVehiculo.save(automovil);
	}
	
	// METODO INSERTAR MOTOCICLETA
	@Async
	public Motocicleta InsertarMotocicleta(Motocicleta motocicleta) {
		logger.info("INSERTAR MOTOCICLETA " + Thread.currentThread().getName());
		return daoVehiculo.save(motocicleta);
	}
	
	// METODO INSERTAR AUTOBUS
	@Async
	public Autobus InsertarAutobus(Autobus autobus) {
		logger.info("INSERTAR AUTOBUS " + Thread.currentThread().getName());
		return daoVehiculo.save(autobus);
	}
	
	/***************  METODO PARA EDITAR VEHICULOS ****************************/
	
	// METODO PARA ACTUALIZAR AUTOMOVIL
	@Async
	public Automovil ActualizarAutomovil (Automovil automovil) {
		logger.info("ACTUALIZAR AUTOMOVIL " + Thread.currentThread().getName());
		return daoVehiculo.save(automovil);
	}
	
	// METODO PARA ACTUALIZAR MOTOCICLETA
	@Async
	public Motocicleta ActualizarMotocicleta (Motocicleta motocicleta) {
		logger.info("ACTUALIZAR MOTOCICLETA " + Thread.currentThread().getName());
		return daoVehiculo.save(motocicleta);
	}
	
	// METODO PARA ACTUALIZAR AUTOBUS
	@Async
	public Autobus ActualizarAutobus (Autobus autobus) {
		logger.info("ACTUALIZAR AUTOBUS " + Thread.currentThread().getName());
		return daoVehiculo.save(autobus);
	}
	
	/***************  METODO PARA ELIMINAR VEHICULOS ****************************/
	
	// METODO PARA ELIMINAR UN VEHICULO - SE PASA EL ID DEL AUTOMOVIL A ELIMINAR COMO PARAMETRO EN LA URL
	@Async
	public void EliminarVehiculo(Integer id) {
		logger.info("ELIMINAR VEHICULO " + Thread.currentThread().getName());
		daoVehiculo.deleteById(id);;		
	}	
}
