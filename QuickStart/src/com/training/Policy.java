package com.training;


public class Policy
{
	 private int policyType;
	//private double commission;
	private double amount;

	public int getPolicyType()
	{
		
		return policyType;
	}

	public void setPolicyType(int policyType)
	{
		this.policyType = policyType;
	}

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}

	
	 
}
