package com.nv.factory;

import com.nv.courier.BlueDart;
import com.nv.courier.Courier;
import com.nv.courier.DTDC;
import com.nv.flipkart.Flipkart;

public class FlipkartFactory {
	public static Flipkart createFlipkart(String courierType) {
		Flipkart fpkt = new Flipkart();
		Courier courier = null;

		if (courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		} else {
			if (courierType.equalsIgnoreCase("bDart")) {
				courier = new BlueDart();

			} else {
				throw new IllegalArgumentException("Invalid Courier Type");
			}

		}
		fpkt.setCourier(courier);
		return fpkt;
	}

}
