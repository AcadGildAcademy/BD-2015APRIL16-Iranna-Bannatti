package com.acadgild.abstractclass;

public class StringedInstrument extends Instrument{

	int numberOfStrings=7;
	@Override
	public void Play() {
		
			// TODO Auto-generated method stub
		System.out.println("Playing StringedInstrument and it has "+numberOfStrings+" strings");
	}

}
