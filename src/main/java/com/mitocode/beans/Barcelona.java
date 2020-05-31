package com.mitocode.beans;

import org.springframework.stereotype.Service;

import com.mitocode.interfaces.IEquipo;

@Service
public class Barcelona implements IEquipo {

	public String mostrar() {
		return "Barcelona FC";
	}

}
