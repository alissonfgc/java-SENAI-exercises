package br.com.app;

import br.com.entities.*;

public class Application {

	public static void main(String[] args) {
		Door d = new Door();
		House h = new House();
		
		d.setXYZ(80, 190, 4);
		d.setColor("Marrom");
		d.open();
		
		System.out.println(d.printData() + "\n");
		
		d.setXYZ(83, 196, 3);
		d.setColor("Azul");
		d.close();
		
		System.out.println(d.printData() + "\n");
		System.out.println();
		System.out.println();
		System.out.println();
		
		h.closeDoor1();
		h.openDoor2();
		h.closeDoor3();
		
		h.setColor("Amarela");
		
		System.out.println(h.printData());
		System.out.println();
		System.out.println();
		
		h.closeDoor1();
		h.closeDoor2();
		h.closeDoor3();
		
		h.setColor("Branca");
		
		System.out.println(h.printData());
		System.out.println();
		System.out.println();
		
		h.openDoor1();
		h.openDoor2();
		h.openDoor3();
		
		h.setColor("Azul");
		
		System.out.println(h.printData());
		System.out.println();
		System.out.println();
		
		h.openDoor1();
		h.openDoor2();
		h.closeDoor3();
		
		h.setColor("Preta");
		
		System.out.println(h.printData());

	}

}
