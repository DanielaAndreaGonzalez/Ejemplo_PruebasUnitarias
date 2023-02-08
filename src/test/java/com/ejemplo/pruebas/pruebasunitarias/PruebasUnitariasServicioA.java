package com.ejemplo.pruebas.pruebasunitarias;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.util.Assert;

import org.junit.jupiter.api.Assertions;

import com.ejemplo.pruebas.pruebasunitarias.services.ServicioA;
import com.ejemplo.pruebas.pruebasunitarias.services.impl.ServicioAImpl;

@SpringBootTest
public class PruebasUnitariasServicioA {

	@Test
	public void testSumar()
	{
		int a = 2;
		int b =2;
		ServicioA servicioa = new ServicioAImpl();
		Assertions.assertEquals(servicioa.sumar(a, b), 4);
	}
	
	
}
