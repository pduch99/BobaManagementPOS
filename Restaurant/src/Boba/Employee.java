package Boba;

public class Employee 
{
	private String name;  //The name of the employee
	private String passwd; //The password for the employee
	
	public Employee(String empName, String empPassword)
	{
		this.name = empName;
		this.passwd = empPassword;
	}
	
	//Returns true if the name of the employee object that calls this is the same as the name given
	public boolean isName(String req)
	{
		boolean result = false;
		
		if(req.equalsIgnoreCase(this.name))
		{ result = true; }
		
		return result;
	}
	
	//Returns true if the password of the calling employee is the same
	public boolean isPassword(String req)
	{
		boolean result = false;
		
		if(req.equals(this.passwd))
		{ result = true; }
		
		return result;
	}
}
