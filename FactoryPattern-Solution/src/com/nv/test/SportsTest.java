package com.nv.test;

import com.nv.components.Car;
import com.nv.components.SportsCar;
import com.nv.factory.CarFactory;

public class SportsTest {

	public static void main(String[] args) {
		/*Car sc=new SportsCar("TS 05 ET 7784");
		 sc.drive();*/
		
		Car ec=CarFactory.createCarReg("sports", "TSWUHJAG");
		ec.drive();
	}

}
