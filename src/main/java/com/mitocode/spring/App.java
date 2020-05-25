package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Persona;

public class App {

	public static void main(String[] args) {

		/* Con Xml */
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");

		Persona per = (Persona) appContext.getBean("persona");

		Ciudad ciu = (Ciudad) appContext.getBean("ciudad");

		System.out.println(per.getApodo());
		System.out.println(ciu.getNombre());

		((ConfigurableApplicationContext) appContext).close();
	}

}
