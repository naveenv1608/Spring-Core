package com.nt.test;

import com.nv.factory.FlipkartFactory;
import com.nv.flipkart.Flipkart;

public class StateryPatternTest {

	public static void main(String[] args) {
     Flipkart fp=FlipkartFactory.createFlipkart("bDart");
     String result=fp.shopping(new String[] {"Shirt","pant"}, new float[] {1000.0f,1000.0f});
     System.out.println(result);
	}

}
