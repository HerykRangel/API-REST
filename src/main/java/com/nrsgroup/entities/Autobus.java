package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Table;

@Entity
@Table (name = "autobuses")
=======

@Entity
@DiscriminatorValue("Autobus")
>>>>>>> 5b0a0cb (RE-ESTRUCTURACION DEL PROYECTO)
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

<<<<<<< HEAD
	// GETTER Y SETTER
=======
	// GETTERS Y SETTERS
>>>>>>> 5b0a0cb (RE-ESTRUCTURACION DEL PROYECTO)
	public String getCantidadRueda() {
		return cantidadRueda;
	}

	public void setCantidadRueda(String cantidadRueda) {
		this.cantidadRueda = cantidadRueda;
	}
}
