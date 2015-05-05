package com.acadgild.interestutils;

import java.util.Scanner;

import com.acadgild.simpleinterest.SimpleInterest;

public class InterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SimpleInterest si=new SimpleInterest();
		double principleAmount;
		double rateOfInterest;
		float timePeriod;
		double simpleInterest;
		System.out.print("Enter Principle Amount: ");
		principleAmount=sc.nextDouble();
		si.setPrincipleAmount(principleAmount);
		System.out.print("Enter Rate of Interest: ");
		rateOfInterest=sc.nextDouble();
		si.setRateOfInterest(rateOfInterest);
		System.out.print("Enter Time Period: ");
		timePeriod=sc.nextFloat();
		si.setTimePeriod(timePeriod);
		simpleInterest=si.getPrincipleAmount();
		System.out.println("####################################################");
		System.out.println("Simple Interest calculated for following Particulars");
		System.out.println("Principle Amount: "+si.getPrincipleAmount());
		System.out.println("Rate of Interest: "+si.getRateOfInterest());
		System.out.println("Loan Duration: "+si.getTimePeriod());
		System.out.println("Simple Interest: "+simpleInterest);
		
	}

}
