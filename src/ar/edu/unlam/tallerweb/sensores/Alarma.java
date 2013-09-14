package ar.edu.unlam.tallerweb.sensores;

public class Alarma {

	private Sensor sensor;
	private boolean estoyActivada;
	
	public Alarma() {					
		this.estoyActivada = false;
	}
	
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	
	
	public boolean estaActivada() {
		return this.estoyActivada;
	}
	
	public boolean estaDesactivada() {
		return ! this.estoyActivada;
	}
	
	public void activar() {
		this.estoyActivada = true;
	}
	
	public void desactivar() {
		this.estoyActivada = false;
		this.sensor.desactivar();
	}	
}
