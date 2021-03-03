package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "autobuses")
public class Autobus extends Automovil{
	
	@Column (name = "catidad_ruedas")
	private String cantidadRueda;

	// CONSTRUCTOR VACIO
	public Autobus() {

	}

	//CONSTRUCTOR DE LA CLASE
	public Autobus(String nombre, String marcas, String tipoCombustible, String velocidadMax, String cantidadRueda) {
		super();
		this.cantidadRueda = cantidadRueda;
	}

	// GETTER Y SETTER
	public String getCantidadRueda() {
		return cantidadRueda;
	}

	public void setCantidadRueda(String cantidadRueda) {
		this.cantidadRueda = cantidadRueda;
	}
}
