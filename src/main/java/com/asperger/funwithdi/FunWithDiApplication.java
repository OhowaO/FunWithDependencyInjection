package com.asperger.funwithdi;

import com.asperger.funwithdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FunWithDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FunWithDiApplication.class, args);

		System.out.println("------------------------ CONTROLLER ");
		MyController constructorInjectedBean = (MyController) ctx.getBean(
				"constructorInjectedController");
		System.out.println(constructorInjectedBean.sayHello());


		System.out.println("------------------------ PROPERTY ");
		MyController propertyInjectedBean = (MyController) ctx.getBean(
				"propertyInjectedController");
		System.out.println(propertyInjectedBean.sayHello());

		System.out.println("------------------------ SETTER ");
		MyController setterInjectedBean = (MyController) ctx.getBean(
				"setterInjectedController");
		System.out.println(setterInjectedBean.sayHello());

	}

}
