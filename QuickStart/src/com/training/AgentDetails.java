package com.training;

public class AgentDetails
{

	private String customerName;
	private String agentName;
	private double commission;
	
	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		
		this.agentName = agentName;
	}

	public AgentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	private long number;
	private int age;
	
	void setCustomerDetails(String customerName,long number,int age)

	{
		//System.out.println("Enter the applicant's name:");
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) 
	 {
		//System.out.println("Enter the applicant's name:");
		this.customerName = customerName;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		//System.out.println("Enter the applicant's contact number:");
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//System.out.println("Enter the applicant's age:");
		this.age = age;
	}
	
	double calculateCommission(Policy p)
	{
		if(p.getPolicyType() == 1)
		{
		commission= p.getAmount()*0.15;
		
		}
		
		else if (p.getPolicyType()== 2 )
		{
			commission= p.getAmount()*0.25;
		}
		else 
			
		{
			System.out.println("Option mismatch error,please try again");
			System.exit(0);
		}
		
		return commission;
	}

	public double getCommission() {
		return commission;
	}

	
}
