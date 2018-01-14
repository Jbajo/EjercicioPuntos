package com.cice.modelo;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class Punto {
	
	private float x;
	private float y;
	
	public Punto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Punto(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public double calculaDistanciaPuntos(Punto p) {
		
		return Math.sqrt(Math.pow(p.getX()-this.x, 2)+Math.pow(p.getY()-this.y, 2));
		
	}
	
	public double calculaDistanciaCentroCoordenadas() {
		
		
		return Math.sqrt(Math.pow(this.getX(),2)+Math.pow(this.getY(),2));		
		
	}
	
	
	
	

}
