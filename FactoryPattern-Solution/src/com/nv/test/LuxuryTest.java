package com.nv.test;

import com.nv.components.Car;
import com.nv.components.LuxuryCar;
import com.nv.factory.CarFactory;

public class LuxuryTest {

	public static void main(String[] args) {
		/*Car lc=new LuxuryCar("TS 06 ET 7784");
		lc.drive();*/
		Car ec=CarFactory.createCarReg("luxury", "TSWUHJAG");
		ec.drive();
	}

}
