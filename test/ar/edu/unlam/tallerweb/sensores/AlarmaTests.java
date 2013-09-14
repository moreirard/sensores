package ar.edu.unlam.tallerweb.sensores;

import org.junit.Assert;
import org.junit.Test;




public class AlarmaTests {

	@Test
	public void testQueUnaAlrmaRecienInstaladaArrancaDesactivada() {
		
		//1. Preparación
		Alarma a = new Alarma();
		Sensor s = new Sensor();
		a.setSensor(s);
		s.setAlarma(a);
		//2. Ejecución
		Boolean activada = a.estaActivada();
		Boolean desactivada = a.estaDesactivada();
		
		//3. Contrastación
		Assert.assertFalse(activada);
		Assert.assertTrue(desactivada);
	}
	
	@Test
	public void testQueUnaAlrmaActivadaQuedaActivada() {
		
		//1. Preparación
		Alarma a = new Alarma();
		Sensor s = new Sensor();
		a.setSensor(s);
		s.setAlarma(a);
		
		//2. Ejecución
		s.detectar();	
		
		//3. Contrastación
		Assert.assertTrue(a.estaActivada());
	}
	
}
