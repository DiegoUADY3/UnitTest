package com.fca.calidad.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;  

public class CalculadoraTest {
	
	public Calculadora miCalculadora; 

	@Before
	public void setUp() throws Exception {
		miCalculadora = new Calculadora(); 
	}

	@Test
	public void sumaPositivosTest() {
		
		double resultadoEjecucion = miCalculadora.suma(1, 3); 
		double resultadoEsperado = 4; 
		
		assertThat(resultadoEjecucion, is(resultadoEsperado)); 
	}
	
	@Test
	public void sumaNegativosTest() {
		
		double resultadoEjecucion = miCalculadora.suma(-1, -3); 
		double resultadoEsperado = -4; 
		
		assertThat(resultadoEjecucion, is(resultadoEsperado)); 
	}
}
