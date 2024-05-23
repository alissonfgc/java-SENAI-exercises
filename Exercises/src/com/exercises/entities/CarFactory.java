package com.exercises.entities;

public class CarFactory {

	private CarFactory() {

	}

	private static class SingletonHolder {
		private static final CarFactory instance = new CarFactory();
	}

	public static CarFactory getInstance() {
		return SingletonHolder.instance;
	}

}