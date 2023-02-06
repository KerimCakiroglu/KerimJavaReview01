package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		
	// byte < short < int < long < float < double
		
		int intNumber = 50;
		
		// widening / implicit casting / automatically
		double doubleNumber = intNumber;
		
		System.out.println("inNumber --> " + intNumber);
		System.out.println("doubleNumber --> "+ doubleNumber);
		
		
		
		//narrowing ()
	
		byte byteNumber = (byte) intNumber; //it is risky, you MAY loose data
		
		System.out.println("byteNumber--> " + byteNumber);
		
		
		//re-assign
		intNumber =670;
		
		byte b2 = (byte) intNumber;
		// in this case we will loose data
		System.out.println("b2 --> "+b2);
		
		//widening / implicit casting / automatically
		byte b3 = 90;
		int i3 = b3;
		System.out.println("i3 --> " +i3);
		
		
		
		
		
		
		

	}

}
