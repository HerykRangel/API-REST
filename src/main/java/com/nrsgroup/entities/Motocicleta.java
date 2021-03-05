package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Motocicleta")
public class Motocicleta extends Vehiculo {
	
	@Column (name = "cantidad_cilindros")
	private String cilindrada;

	// CONSTRUCTOR VACIO
	public Motocicleta() {

	}

	// CONSTRUCTOR DE LA CLASE
	public Motocicleta(String nombre, String marca, String tipoCombustible, String velocidadMax, String cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}
	
	//toSTRING
	@Override
	public String toString() {
		return "MOTOCICLETA: " + super.toString() + "CILINDRADA = " + cilindrada + "";
	}

	// GETTERS Y SETTERS
	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
}
