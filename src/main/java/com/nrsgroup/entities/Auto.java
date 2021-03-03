package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name = "autos")
public class Auto extends Automovil {
	
	@Column (name = "catidad_puertas")
	private String catidadPuerta;

	// CONSTRUCTOR VACIO
	public Auto() {
		
	}

	// CONSTRUCTOR DE LA CLASE
	public Auto(Integer id, String nombre, String marcas, String tipoCombustible, String velocidadMax,
			String catidadPuerta) {
		super(id, nombre, marcas, tipoCombustible, velocidadMax);
		this.catidadPuerta = catidadPuerta;
	}

	// GETTER Y SETTER
	public String getCatidadPuerta() {
		return catidadPuerta;
	}

	public void setCatidadPuerta(String catidadPuerta) {
		this.catidadPuerta = catidadPuerta;
	}
}
