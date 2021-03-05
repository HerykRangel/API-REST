package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Autobus")
public class Autobus extends Vehiculo{
	
	@Column (name = "cantidad_ruedas")
	private String cantidadRueda;

	// CONSTRUCTOR VACIO
	public Autobus() {

	}

	//CONSTRUCTOR DE LA CLASE
	public Autobus(String nombre, String marca, String tipoCombustible, String velocidadMax, String cantidadRueda) {
		super();
		this.cantidadRueda = cantidadRueda;
	}
	
	// toSTRING
	@Override
	public String toString() {
		return "AUTOBUS" + super.toString() + "CATIDAD_RUEDAS = " + cantidadRueda;
	}

	// GETTERS Y SETTERS
	public String getCantidadRueda() {
		return cantidadRueda;
	}

	public void setCantidadRueda(String cantidadRueda) {
		this.cantidadRueda = cantidadRueda;
	}
}
