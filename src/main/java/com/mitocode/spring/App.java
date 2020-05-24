package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

//import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Persona;

public class App {

	public static void main(String[] args) {

		/* Con Xml */
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");

		/* Pasando los Configuration como parametro */
		// ApplicationContext appContext = new
		// AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);

		// Otra forma, utilizando register
		/*
		 * AnnotationConfigApplicationContext appContext = new
		 * AnnotationConfigApplicationContext();
		 * appContext.register(AppConfig.class);
		 * appContext.register(AppConfig2.class); appContext.refresh();
		 * 
		 * Mundo m = (Mundo)appContext.getBean("marte");
		 * ((ConfigurableApplicationContext)appContext).close();
		 * 
		 * System.out.println(m.getSaludo());
		 */

		Persona per = (Persona) appContext.getBean("persona");
		Persona per2 = (Persona) appContext.getBean("persona");

		per.setId(1);
		per.setNombre("Jaimee");
		per.setApodo("MitoCode");

		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre()
				+ " " + per.getCiudad().getNombre());

		System.out.println(per2.getId() + " " + per2.getNombre() + " " + per2.getApodo() + " "
				+ per2.getPais().getNombre() + " " + per2.getCiudad().getNombre());

		((ConfigurableApplicationContext) appContext).close();

		/*
		 * String nombresCiudades = "";
		 * 
		 * for (Ciudad ciu : per.getPais().getCiudades()) { nombresCiudades +=
		 * ciu.getNombre() + "-"; }
		 * 
		 * System.out.println(per.getId() + " " + per.getNombre() + " " +
		 * per.getApodo() + " " + per.getPais().getNombre() + " " +
		 * nombresCiudades);
		 */
	}

}
