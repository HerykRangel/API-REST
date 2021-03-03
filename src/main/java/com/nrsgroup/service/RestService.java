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
}
