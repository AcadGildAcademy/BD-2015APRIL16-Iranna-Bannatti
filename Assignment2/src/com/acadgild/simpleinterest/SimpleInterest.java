package com.acadgild.simpleinterest;

public class SimpleInterest {

	double principleAmount=0.0;
	public double getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(double principleAmount) {
		this.principleAmount = principleAmount;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public float getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(float timePeriod) {
		this.timePeriod = timePeriod;
	}
	double rateOfInterest=0.0;
	float timePeriod=0.0f;
	
	public double getSimpleInterest()
	{
		return ((principleAmount*rateOfInterest*timePeriod)/100);		
	}
	
	
	
	

}
