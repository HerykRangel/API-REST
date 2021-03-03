package com.nrsgroup.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/listaVehiculos")
	public ArrayList<Vehiculo> ListaVehiculos(){
		return restService.ListaVehiculos();
	}
	
	@PostMapping("/insertarAutomovil")
	public Automovil InsertarAutomovil (@RequestBody Automovil automovil) {
		return restService.InsertarVehiculo(automovil);
	}
	
	@PostMapping("/insertarMotocicleta")
	public Motocicleta InsertarMotocileta (@RequestBody Motocicleta motocicleta) {
		return restService.InsertarMotocicleta(motocicleta);
	}
	
	@PostMapping("/insertarAutobus")
	public Autobus InsertarAutobus (@RequestBody Autobus autobus) {
		return restService.InsertarAutobus(autobus);
	}
}
