package br.com.entities;

public class Door {
	private boolean open;
	private String color;
	private double dimensionX, dimensionY, dimensionZ;
	
	//getters and setters
	
	public String getCor() {
		return color;
	}
	
	private void setColor(String color) {
		this.color = color;
	}
	
	public boolean getOpen() {
		return open;
	}
	
	private void setOpen(boolean open) {
		this.open = open;
	}
	
	//----------------------------------------
	
	public void openUp() {
		Door.this.setOpen(true);
	}
	
	public void close() {
		Door.this.setOpen(false);
	}
	
	public void paint(String s) {
		Door.this.setColor(s);
	}
	
	public boolean itsOpen() {
		
		return result;
	}
	
	
}
