package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity 
@DiscriminatorValue("Automovil")
public class Automovil extends Vehiculo {
	
	@Column (name = "cantidad_puertas")
	private String cantidadPuerta;

	// CONSTRUCTOR VACIO
	public Automovil() {
		
	}

	// CONSTRUCTOR DE LA CLASE	
	public Automovil(Integer id,String marca, String nombre, String tipoCombustible, String velocidadMax, String catidadPuerta) {
		super (id, marca, nombre, tipoCombustible, velocidadMax);
		this.cantidadPuerta = catidadPuerta;
	}
	
	//toSTRING
	@Override
	public String toString() {
		return "AUTOMOVIL: " + super.toString() + "CANTIDAD_PUERTA = " + "catidadPuerta";
	}

	//GETTERS Y SETTERS
	public String getCantidadPuerta() {
		return cantidadPuerta;
	}

	public void setCatidadPuerta(String catidadPuerta) {
		this.cantidadPuerta = catidadPuerta;
	}
}
