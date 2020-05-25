package com.mitocode.beans;

public class Ciudad {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodo para ejecutarse antes de la inicializacion
	private void initBean() {
		System.out.println("Antes de inicializar el bean");
	}

	// Metodo para ejecutarse justo antes de ser destruido
	private void destroyBean() {
		System.out.println("Bean a punto de ser destruido");
	}
}
