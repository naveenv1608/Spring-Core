package com.nv.components;

public class EconomicCar implements Car{
	private String regno;
	public EconomicCar(String regno) {
		this.regno=regno;
		System.out.println("One param constructor:: Economic car"+regno);
	}
	@Override
	public void drive() {
		System.out.println(" drive : Economic car"+regno);
		
	}
}
