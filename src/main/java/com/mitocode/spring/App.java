package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		// Jugador jug = (Jugador) appContext.getBean("messi");
		IEquipo bar = (IEquipo) appContext.getBean("barcelona");
		// System.out.println(jug.getNombre() + "-" +
		// jug.getEquipo().mostrar());
		System.out.println(bar.mostrar());

		((ConfigurableApplicationContext) appContext).close();
	}

}
