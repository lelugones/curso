package kk;

public class Coche {

	private String color;
	private int marcha;
	private int velocidad;
	
	public Coche (String color, int marcha, int velocidad){
		this.color = color;
		this.marcha = marcha;
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void frenar(int reduccion)
	{
		this.velocidad -= reduccion;
	}
	
	public void acelerar(int aumento)
	{
		this.velocidad += aumento;
	}
}
