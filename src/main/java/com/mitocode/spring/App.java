package com.mitocode.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		/*Con Xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");*/
		
		/*Pasando los Configuration como parametro*/
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
		
		//Otra forma, utilizando register	
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
		
		Mundo m = (Mundo)appContext.getBean("marte");
		((ConfigurableApplicationContext)appContext).close();
		
		System.out.println(m.getSaludo());
	}

}
