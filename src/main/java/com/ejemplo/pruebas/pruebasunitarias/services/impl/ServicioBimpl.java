/**
 * 
 */
package com.ejemplo.pruebas.pruebasunitarias.services.impl;

import com.ejemplo.pruebas.pruebasunitarias.services.ServicioA;
import com.ejemplo.pruebas.pruebasunitarias.services.ServicioB;

/**
 * @author GonzalezHDanielaA
 *
 */
public class ServicioBimpl implements ServicioB {

	//inyeccion de independencias
	private ServicioA servicioA;

	@Override
	public ServicioA getServicioA() {
		// TODO Auto-generated method stub
		return servicioA;
	}

	public void setServicioA(ServicioA servicioA) {
		this.servicioA = servicioA;	
	}

	@Override
	public int multiplicarSumar(int a, int b, int multiplicador) {
		// TODO Auto-generated method stub
		return servicioA.sumar(a, b)*multiplicador;
	}

	@Override
	public int multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	
	

}
