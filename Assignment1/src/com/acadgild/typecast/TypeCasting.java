package com.acadgild.typecast;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * @author
 * Iranna Bannatti
 * This class demonstrate the type-casting between different java datatypes
 */

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double doubleValue=125.50;
		float floatValue=150.50f;
		long longValue=1000;
		int intValue=100;
		byte byteValue=127;
		
		//Demo: no explicit type-castings required
		
		double dVal=floatValue;
		float fVal=longValue;
		long lVal=intValue;
		int iVal=byteValue;
		System.out.println("No Explicit type conversion required");
		System.out.println("Double Value: "+dVal);
		System.out.println("Float Value: "+fVal);
		System.out.println("Long Value: "+lVal);
		System.out.println("Int Value: "+iVal);
		System.out.println("Byte Value: "+byteValue);
		
		//Demo: Explicit type-casting required
		
		byte byteVal=(byte) intValue;
		int intVal=(int)longValue;
		long longVal=(long) floatValue;
		float floatVal=(float)doubleValue;
		System.out.println("Explicit type conversion required");
		System.out.println("Double Value: "+doubleValue);
		System.out.println("Float Value: "+floatVal);
		System.out.println("Long Value: "+longVal);
		System.out.println("Int Value: "+intVal);
		System.out.println("Byte Value: "+byteVal);
		
		
	
	}

}
 