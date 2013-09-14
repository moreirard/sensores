package ar.edu.unlam.tallerweb.sensores;

public class Sensor {

	private Alarma alarma;
	@SuppressWarnings("unused")
	private boolean estoyActivado = false;	
	
	
	public void setAlarma(Alarma alarma) {
		this.alarma = alarma;
	}
	
	public void detectar() {
		this.estoyActivado = true;
		this.alarma.activar();
	}
	
	public void desactivar() {
		this.estoyActivado = false;
	}	
}
