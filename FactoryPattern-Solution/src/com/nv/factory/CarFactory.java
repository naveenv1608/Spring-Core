package com.nv.factory;

import com.nv.components.Car;
import com.nv.components.EconomicCar;
import com.nv.components.LuxuryCar;
import com.nv.components.SportsCar;

public class CarFactory {
	public static Car createCarReg(String type, String regno) {
		if (type.equalsIgnoreCase("sports")) {
			return new SportsCar(regno);
		} else {
			if (type.equalsIgnoreCase("luxury")) {
				return new LuxuryCar(regno);
			}
			else {
				if (type.equalsIgnoreCase("economic")) {
					return new EconomicCar(regno);
				}
				else {
					throw new IllegalArgumentException("Not a valid Car");
				}
			}
		}

	}
}
