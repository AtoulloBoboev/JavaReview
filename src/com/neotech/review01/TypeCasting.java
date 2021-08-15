package com.neotech.review01;

public class TypeCasting {
	
	public static void main(String[] args) {
		//byte < short < int < long < float < double
		
		int intNumber = 24;
		
		//widening/implicitly/automatically
		double d = intNumber;
		
		System.out.println("The intNumber is " + intNumber);
		System.out.println("THe doubleNumber is " + d);
		
		double a = 23.0 / 6;
		System.out.println("a -> " + a);
		
		//24 is between -128 and 127
		//narrowing/explicit asting/manually
		byte byteNumber = (byte) intNumber;
		//In this case I lost data
		System.out.println("The byteNumber is " + byteNumber);
		
		byte b1 = 80;
		int i1 = b1;
		System.out.println("i1 = " + i1);
	}

}
