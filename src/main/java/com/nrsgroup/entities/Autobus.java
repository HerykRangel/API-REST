package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "autobuses")
public class Autobus extends Vehiculo{
	
	@Column (name = "cantidad_ruedas")
	private String cantidadRueda;

	// CONSTRUCTOR VACIO
	public Autobus() {

	}

	//CONSTRUCTOR DE LA CLASE
	public Autobus(Integer id, String nombre, String marca, String tipoCombustible, String velocidadMax, String cantidadRueda) {
		super();
		this.cantidadRueda = cantidadRueda;
	}
	
	// toSTRING
	@Override
	public String toString() {
		return "AUTOBUS" + super.toString() + "CATIDAD_RUEDAS = " + cantidadRueda;
	}

	// GETTER Y SETTER
	public String getCantidadRueda() {
		return cantidadRueda;
	}

	public void setCantidadRueda(String cantidadRueda) {
		this.cantidadRueda = cantidadRueda;
	}
}
