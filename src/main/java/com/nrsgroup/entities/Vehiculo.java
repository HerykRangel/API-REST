package com.nrsgroup.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//CLASE PADRE
@Entity
@Inheritance (strategy =  InheritanceType.TABLE_PER_CLASS)				
public class Vehiculo {
	
	@Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
	private Integer Id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column (name = "marca")
	private String marca;
	
	@Column (name = "tipo_combustible")
	private String tipoCombustible;
	
	@Column (name = "velocidad_maxima")
	private String velocidadMax;
	
	// CONSTRUCTOR VACIO
	public Vehiculo() {
		
	}
	
	// CONSTRUCTOR DE LA CLASE
	public Vehiculo(Integer id, String nombre, String marca, String tipoCombustible, String velocidadMax) {
		this.Id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.tipoCombustible = tipoCombustible;
		this.velocidadMax = velocidadMax;
	}
	
	// toSTRING
	@Override
	public String toString() {
		return "Vehiculo ID = " + Id + ", NOMBRE = " + nombre + ", MARCA = " + marca + ", TIPO_COMBUSTIBLE = " + tipoCombustible
				+ ", VELOCIDA_DMAX = " + velocidadMax + " ";
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarcas(String marca) {
		this.marca = marca;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public String getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(String velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
}
