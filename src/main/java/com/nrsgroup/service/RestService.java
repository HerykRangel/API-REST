package com.nrsgroup.service;

import com.nrsgroup.dao.RestDAO;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nrsgroup.entities.Vehiculo;
import com.nrsgroup.entities.Autobus;
import com.nrsgroup.entities.Automovil;
import com.nrsgroup.entities.Motocicleta;

@Service
public class RestService  {
	
	@Autowired
	RestDAO restDAO;

	//METODO PARA LISTAR LOS VEHICULOS
	public ArrayList<Vehiculo> ListaVehiculos(){
		return (ArrayList<Vehiculo>)restDAO.findAll();
	}
	
	// METDO PARA LISTAR LOS AUTOMOVILES
	public ArrayList<Automovil> ListaAutomovil(){
		return (ArrayList<Automovil>)restDAO.finAllAutomovil();
	}
	
	// METDO PARA LISTAR LAS MOTOCICLETAS
	public ArrayList<Motocicleta> ListaMotocicleta(){
		return (ArrayList<Motocicleta>)restDAO.finAllMotocicleta();
	}
	
	// METDO PARA LISTAR LOS AUTOBUSES
	public ArrayList<Autobus> ListaAutobus(){
		return (ArrayList<Autobus>)restDAO.finAllAutobus();
	}

	/*
	//METODO PARA LISTAR VEHICULOS QUE COMPARTAN UNA CATEGORIA (TOYOTA)
	public ArrayList<Vehiculo> ListaVehiculosCategoria(){
		return (ArrayList<Vehiculo>)restDAO.findAllVehiculos_CATEGORIA();
	}
	*/
	
	// METODO PARA INSERTAR AUTOMOVIL
	public Automovil InsertarVehiculo(Automovil automovil) {
		return restDAO.save(automovil);
	}
	
	// METODO PARA INSERTAR MOTOCICLETA
	public Motocicleta InsertarMotocicleta(Motocicleta motocicleta) {
		return restDAO.save(motocicleta);
	}
	
	// METODO PARA INSERTAR AUTOBUS
	public Autobus InsertarAutobus(Autobus autobus) {
		return restDAO.save(autobus);
	}
	
	// METODO PARA EDITAR UN VEHICULO
	public void EditarVehiculo(Autobus autobus) {
		restDAO.save(autobus);
	}
	
	// METODO PARA ELIMINAR UN VEHICULO - SE PASA EL ID DEL VICULO A ELIMINAR COMO PARAMETRO EN LA URL
	public void EliminarVehiculo(Integer id) {
		restDAO.deleteById(id);
	}	
}
