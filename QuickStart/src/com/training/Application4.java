package com.training;

//import java.io.PrintStream;
import java.util.Scanner;

public class Application4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
 //int type;
	Policy pol=new Policy();
	AgentDetails agent= new AgentDetails();
	Scanner sc =new Scanner(System.in);
	System.out.println("Welcome to the policy portal..\n");
	System.out.println("Enter the agent's name:");
		//String name= sc.next();
		agent.setAgentName(sc.next());
	
	System.out.println("Enter the client's name:");
	String cName=sc.next();
	agent.setCustomerName(cName);
	
	System.out.println("Enter the client's age:");
	int age=sc.nextInt();
	agent.setAge(age);
	
	
	
			
	System.out.println("1-> Money Back Policy\n2-> Endowment Policy\n Please input your choice: ");
	int policy= sc.nextInt();
	
	pol.setPolicyType(policy);
	
	System.out.println("Please enter the premium amount: ");
	double amount=sc.nextDouble();
	pol.setAmount(amount);
	
	agent.calculateCommission(pol);
	
	System.out.println("Commision earned ="+agent.getCommission());
	
	System.out.println("\nDetails\n Agent's name:"+agent.getAgentName()+"\nApplicant's name:"+agent.getCustomerName()+"\n Applicant's Age:"+agent.getAge());
	sc.close();

	}

	public Application4() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
