package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Table;

@Entity 
@Table(name = "autos")
=======

@Entity 
@DiscriminatorValue("Automovil")
>>>>>>> 5b0a0cb (RE-ESTRUCTURACION DEL PROYECTO)
public class Automovil extends Vehiculo {
	
	@Column (name = "cantidad_puertas")
	private String cantidadPuerta;

	// CONSTRUCTOR VACIO
	public Automovil() {
		
	}

	// CONSTRUCTOR DE LA CLASE
<<<<<<< HEAD
	public Automovil(Integer id, String nombre, String marca, String tipoCombustible, String velocidadMax, String catidadPuerta) {
		super();
=======
	public Automovil(Integer id,String marca, String nombre, String tipoCombustible, String velocidadMax, String catidadPuerta) {
		super (id, marca, nombre, tipoCombustible, velocidadMax);
>>>>>>> 5b0a0cb (RE-ESTRUCTURACION DEL PROYECTO)
		this.cantidadPuerta = catidadPuerta;
	}
	
	//toSTRING
	@Override
	public String toString() {
		return "AUTOMOVIL: " + super.toString() + "CANTIDAD_PUERTA = " + "catidadPuerta";
	}

<<<<<<< HEAD
	// GETTER Y SETTER
	public String getCatidadPuerta() {
=======
	//GETTERS Y SETTERS
	public String getCantidadPuerta() {
>>>>>>> 5b0a0cb (RE-ESTRUCTURACION DEL PROYECTO)
		return cantidadPuerta;
	}

	public void setCatidadPuerta(String catidadPuerta) {
		this.cantidadPuerta = catidadPuerta;
	}
}
