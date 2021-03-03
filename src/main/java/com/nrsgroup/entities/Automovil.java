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
public class Automovil {
	
	@Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
	private Integer Id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column (name = "marca")
	private String marcas;
	
	@Column (name = "tipo_combustible")
	private String tipoCombustible;
	
	@Column (name = "velocidad_maxima")
	private String velocidadMax;
	
	// CONSTRUCTOR VACIO
	public Automovil() {
		
	}
	
	// CONSTRUCTOR DE LA CLASE 
	public Automovil(Integer id, String nombre, String marcas, String tipoCombustible, String velocidadMax) {
		super();
		Id = id;
		this.nombre = nombre;
		this.marcas = marcas;
		this.tipoCombustible = tipoCombustible;
		this.velocidadMax = velocidadMax;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarcas() {
		return marcas;
	}

	public void setMarcas(String marcas) {
		this.marcas = marcas;
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
