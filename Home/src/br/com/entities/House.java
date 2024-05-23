package br.com.entities;

public class House {
	private String color;
	private boolean door1, door2, door3;
	private static int qntDoors = 0;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void openDoor1() {
		this.door1 = true;
	}
	
	public void openDoor2() {
		this.door2 = true;
	}
	
	public void openDoor3() {
		this.door3 = true;
	}
	
	public void closeDoor1() {
		this.door1 = false;
	}
	
	public void closeDoor2() {
		this.door2 = false;
	}
	
	public void closeDoor3() {
		this.door3 = false;
	}
	
	public int qntDoorsOpen() {
		qntDoors = 0;
		if (this.door1 == true) {
			qntDoors++;
		}
		if (this.door2 == true) {
			qntDoors++;
		}
		if (this.door3 == true) {
			qntDoors++;
		}
		return qntDoors;
	}
	
	public String printData() {
		return "Porta 1: " + (this.door1 == true ? "Aberta " : "Fechada ") + "\nPorta 2: " + (this.door2 == true ? "Aberta " : "Fechada ") + "\nPorta 3: " + (this.door3 == true ? "Aberta " : "Fechada ") + "\nCor da casa: " + this.color + "\nQuantas portas estão abertas: " + qntDoorsOpen();
	}

}
