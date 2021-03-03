package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "motocicletas")
public class Motocicleta extends Vehiculo {
	
	@Column (name = "catidad_cilindros")
	private String cilindrada;

	// CONSTRUCTOR VACIO
	public Motocicleta() {

	}

	// CONSTRUCTOR DE LA CLASE
	public Motocicleta(Integer id, String nombre, String marca, String tipoCombustible, String velocidadMax, String cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}
	
	//toSTRING
	@Override
	public String toString() {
		return "MOTOCICLETA: " + super.toString() + "CILINDRADA = " + cilindrada + "";
	}

	// GETTER Y SETTER
	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
}
