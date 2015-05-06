package com.acadgild.abstractclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElectricGuitar eg=new ElectricGuitar();
		eg.Play();
		ElectricBassGuitar ebg=new ElectricBassGuitar();
		ebg.Play();
		StringedInstrument si=new StringedInstrument();
		si.Play();
	}

}
