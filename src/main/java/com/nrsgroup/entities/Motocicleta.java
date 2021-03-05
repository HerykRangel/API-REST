package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Table;

@Entity
@Table(name = "motocicletas")
=======

@Entity
@DiscriminatorValue("Motocicleta")
>>>>>>> 5b0a0cb (RE-ESTRUCTURACION DEL PROYECTO)
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

<<<<<<< HEAD
	// GETTER Y SETTER
=======
	// GETTERS Y SETTERS
>>>>>>> 5b0a0cb (RE-ESTRUCTURACION DEL PROYECTO)
	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
}
