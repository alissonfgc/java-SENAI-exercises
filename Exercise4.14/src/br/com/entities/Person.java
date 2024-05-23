package br.com.entities;

public class Person {
	private String name;
	private int age = 0;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void doBirthday() {
		age++;
	}

}
