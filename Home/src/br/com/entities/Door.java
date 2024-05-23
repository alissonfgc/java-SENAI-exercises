package br.com.entities;

public class Door {
	private boolean open;
	private String color;
	private double dimensionX, dimensionY, dimensionZ;
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setXYZ(double dimensionX, double  dimensionY, double dimensionZ) {
		this.dimensionX = dimensionX;
		this.dimensionY = dimensionY;
		this.dimensionZ = dimensionZ ;
	}
	
	public void open() {
		this.open = true;
	}
	
	public void close() {
		this.open = false;
	}
	
	public void paint(String color) {
		this.color = color;
	}
	
	public boolean itsOpen() {
		return this.open == true ? true : false;
	}
	
	public String printData() {
		return "Esta aberta: " + (this.open == true ? "Sim " : "Não ") + "\nCor da porta: " + this.color + "\nDimensão X: " + this.dimensionX + "\nDimensão Y: " + this.dimensionY + "\nDimensão Z: " + this.dimensionZ;
	}
	
}
