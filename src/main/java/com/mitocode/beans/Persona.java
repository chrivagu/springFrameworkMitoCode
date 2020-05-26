package com.mitocode.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Persona {
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;

	// Metodo para ejecutarse antes de la inicializacion
	@PostConstruct
	private void initBean() {
		System.out.println("Antes de inicializar el bean");
	}

	// Metodo para ejecutarse justo antes de ser destruido
	@PreDestroy
	private void destroyBean() {
		System.out.println("Bean a punto de ser destruido");
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
