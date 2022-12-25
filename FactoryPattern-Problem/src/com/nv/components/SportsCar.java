package com.nv.components;

public class SportsCar implements Car {

	private String regno;
	public SportsCar(String regno) {
		this.regno=regno;
		System.out.println("One param constructor:: Sports car"+regno);
	}
	@Override
	public void drive() {
		System.out.println(" drive : Sports car"+regno);
		
	}

}
