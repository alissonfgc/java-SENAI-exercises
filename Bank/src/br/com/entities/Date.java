package br.com.entities;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	//metodo definicao data
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public String formatDate() {
		return this.day + "/" + this.month + "/" + this.year;
	}
}