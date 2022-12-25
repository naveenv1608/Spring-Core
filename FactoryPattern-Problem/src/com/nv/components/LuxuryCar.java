package com.nv.components;

public class LuxuryCar implements Car{
	private String regno;
	public LuxuryCar(String regno) {
		this.regno=regno;
		System.out.println("One param constructor:: Luxury car"+regno);
	}
	@Override
	public void drive() {
		System.out.println(" drive : Luxury car"+regno);
		
	}
}
