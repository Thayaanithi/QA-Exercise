package org;


public class Employee {
	String firstName;
	String lastName;
	int age;
	String address;
	String phoneNo;
	String Email;
	int basicSalary;

	public int calculateSalary(int salary) 
	{
		this.basicSalary = salary;
		int finalSalary = (basicSalary * 10 / 100) + basicSalary;
		return finalSalary;
	}
	public int calculateSalary()
	{
		int finalSalary=(basicSalary*10/100)+basicSalary;
		return finalSalary;
	}
	
	public String greeting()
	{
		return "Hello "+firstName+" "+lastName;
	}
	
	public String greeting(String fname, String lname)
	{
		return "Hello "+fname+" "+lname;
	}
	
	public boolean checkPhone()
	{
		if(phoneNo.length()<10)
			return false;
		else
			return true;
	}
	public boolean checkEmail()
	{
		if(Email.contains("@"))
			return true;
		else
			return false;
	}
	}


