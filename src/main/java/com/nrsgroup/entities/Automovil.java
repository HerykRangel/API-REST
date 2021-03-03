package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name = "autos")
public class Automovil extends Vehiculo {
	
	@Column (name = "catidad_puertas")
	private String catidadPuerta;

	// CONSTRUCTOR VACIO
	public Automovil() {
		
	}

	// CONSTRUCTOR DE LA CLASE
	public Automovil(Integer id, String nombre, String marca, String tipoCombustible, String velocidadMax, String catidadPuerta) {
		super();
		this.catidadPuerta = catidadPuerta;
	}
	
	//toSTRING
	@Override
	public String toString() {
		return "AUTOMOVIL: " + super.toString() + "CANTIDAD_PUERTA = " + "catidadPuerta";
	}

	// GETTER Y SETTER
	public String getCatidadPuerta() {
		return catidadPuerta;
	}

	public void setCatidadPuerta(String catidadPuerta) {
		this.catidadPuerta = catidadPuerta;
	}
}
