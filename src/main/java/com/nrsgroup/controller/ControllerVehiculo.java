package com.nrsgroup.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nrsgroup.entities.Autobus;
import com.nrsgroup.entities.Automovil;
import com.nrsgroup.entities.Motocicleta;
import com.nrsgroup.entities.Vehiculo;
import com.nrsgroup.service.ServiceVehiculo;

@RestController
@RequestMapping("vehiculo")
public class ControllerVehiculo {
	
	@Autowired
	ServiceVehiculo serviceVehiculo;
	
	/************************  GET  **********************************/
	// ENDPOINT LISTA DE VEHICULO
	@GetMapping("/GET/listaVehiculo")
	public ArrayList<Vehiculo> ListaVehiculo(){
		return serviceVehiculo.ListaVehiculo();
		
	}
	
	// ENDPOINT LISTA DE AUTOMOVIL
	@GetMapping("/GET/listaAutomovil")
	public ArrayList<Automovil> ListaAutomovil(){
		return serviceVehiculo.ListaAutomovil();
	}
	
	// ENDPOINT LISTA MOTOCICLETA
	@GetMapping("/GET/listaMotocicleta")
	public ArrayList<Motocicleta>ListaMotocicleta(){
		return serviceVehiculo.ListaMotocicleta();
	}
	
	// ENDPOINT LISTA AUTOBUS
	@GetMapping("/GET/listaAutobus")
	public ArrayList<Autobus>ListaAutobus(){
		return serviceVehiculo.ListaAutobus();
	}
	
	// ENDPOINT LISTA VEHICULOS POR MARCA - SE PASA LA MARCA COMO PARAMETRO EN LA URL
	@GetMapping("/GET/vehiculoMarca/{marca}")
	public ArrayList<Vehiculo> ListaAutomovilMarca (@PathVariable("marca") String marca) {
		 return serviceVehiculo.ListaVehiculoMarca(marca);
	}	 
	
	// ENDPOINT VEHICULO POR ID - SE PASA EL ID COMO PARAMETRO EN LA URL
	@GetMapping("/GET/vehiculoId/{id}")
	public Optional<Vehiculo> VehiculoId (@PathVariable("id") Integer id) {
		return serviceVehiculo.VehiculoId(id);
	}
	
	/************************  POST  **********************************/
	
	// ENDPOINT INSERSION AUTOMOVIL
	@PostMapping("/POST/automovil")
	public Vehiculo InsertarAutomovil (@RequestBody Automovil automovil) {
		return serviceVehiculo.InsertarAutomovil(automovil);
	}
	
	// ENDPOINT INSERSION MOTOCICLETA
	@PostMapping("/POST/motocicleta")
	public Vehiculo InsertarMotocicleta (@RequestBody Motocicleta motocicleta) {
		return serviceVehiculo.InsertarMotocicleta(motocicleta);
	}
	
	// ENDPOINT INSERSION AUTOBUS
	@PostMapping("/POST/autobus")
	public Vehiculo InsertarAutobus (@RequestBody Autobus autobus) {
		return serviceVehiculo.InsertarAutobus(autobus);
	}
	
	/************************  PUT  **********************************/
	
	// ENDPOINT PARA ACTUALIZAR AUTOMOVIL
	@PutMapping("/PUT/automovil")
	public void ActualizarAutomovil(@RequestBody Automovil automovil) {
		serviceVehiculo.ActualizarAutomovil(automovil);
	}
	
	// ENDPOINT PARA ACTUALIZAR MOTOCICLETA
	@PutMapping("/PUT/motocicleta")
	public void ActualizarMotocicleta(@RequestBody Motocicleta motocicleta) {
		serviceVehiculo.ActualizarMotocicleta(motocicleta);
	}

	// ENDPOINT PARA ACTUALIZAR AUTOBUS
	@PutMapping("/PUT/autobus")
	public void ActualizarAutobus(@RequestBody Autobus autobus) {
		serviceVehiculo.ActualizarAutobus(autobus);
	}
	
	/************************  DELETE  **********************************/
	// ENDPOINT ELIMINAR VEHICULO - SE PASA EL ID DEL AUTOMOVIL A ELIMINAR COMO PARAMETRO EN LA URL
	@DeleteMapping("/DELETE/vehiculo/{id}")
	public void EliminarVehiculoporID (@PathVariable("id") Integer id) {
		 this.serviceVehiculo.EliminarVehiculo(id);
	}
}
