package com.nrsgroup.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nrsgroup.service.RestService;

import com.nrsgroup.entities.Autobus;
import com.nrsgroup.entities.Automovil;
import com.nrsgroup.entities.Motocicleta;
import com.nrsgroup.entities.Vehiculo;


@org.springframework.web.bind.annotation.RestController					// UNICA FORMA EN LA QUE EL IDE RECONOCIO LA ANOTACION "RestController"
@RequestMapping("vehiculo")
public class RestController {
	
	@Autowired
	RestService restService;
	
	// ENDPOINT LISTA DE TODOS LOS VEHICULOS
	@GetMapping("/listaVehiculos")
	public ArrayList<Vehiculo> ListaVehiculos(){
		return restService.ListaVehiculos();
	}
	
	// ENDPOINT LISTA DE AUTOMOVILES
	@GetMapping("/listaAutomovil")
	public ArrayList<Automovil> ListaAutomovil(){
		return restService.ListaAutomovil();
	}
	
	// ENDPOINT LISTA DE MOTOCICLETAS
	@GetMapping("/listaMotocicleta")
	public ArrayList<Motocicleta> ListaMotocicleta(){
		return restService.ListaMotocicleta();
	}
	
	// ENDPOINT LISTA DE AUTOBUSES
	@GetMapping("/listaAutobus")
	public ArrayList<Autobus> ListaAutobus(){
		return restService.ListaAutobus();
	}
	
/*	
	// ENDPOINT LISTA DE VEHICULOS QUE COMPARTEN UNA CARACTERISTICA (TOYOTA)
	@GetMapping("/listaVehiculosCaractegoria")
	public ArrayList<Vehiculo> ListaVehiculosCategoria(){
		return restService.ListaVehiculosCategoria();
	}
*/
	
	// ENDPOINT INSERSION AUTOMOVIL
	@PostMapping("/insertarAutomovil")
	public Automovil InsertarAutomovil (@RequestBody Automovil automovil) {
		return restService.InsertarVehiculo(automovil);
	}
	
	// ENDPOINT INSERSION MOTOCICLETA
	@PostMapping("/insertarMotocicleta")
	public Motocicleta InsertarMotocileta (@RequestBody Motocicleta motocicleta) {
		return restService.InsertarMotocicleta(motocicleta);
	}
	
	// ENDPOINT INSERSION AUTOBUS
	@PostMapping("/insertarAutobus")
	public Autobus InsertarAutobus (@RequestBody Autobus autobus) {
		return restService.InsertarAutobus(autobus);
	}
	
	// ENDPOINT PARA ACTUALIZAR VEHICULOS
	@PutMapping("/actualizarVehiculo")
	public void ActualizarVehiculo(@RequestBody Autobus autobus) {
		restService.EditarVehiculo(autobus);
	}
	
	// ENDPOINT ELIMINAR VEHICULO - SE PASA EL ID DEL VICULO A ELIMINAR COMO PARAMETRO EN LA URL
	@DeleteMapping("/eliminarVehiculo/{id}")
	public void EliminarVehiculo (@PathVariable("id") Integer id) {
		restService.EliminarVehiculo(id);
	}
}
