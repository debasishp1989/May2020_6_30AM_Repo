package com.icici.loans.homeloans;

public class VariableTypes 
{
	//primitive variable
	int x=100; // instance (or) non-static (or) global  variable
	static String cname="vmware";  //static variable
	static VariableTypes obj;
	
	public void m1()
	{
		int x=10; // local variable
		System.out.println(this.x);
		
		System.out.println(x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void m2()
	{
		 obj=new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
		
	}
	
	
	public static void main(String[] args)
	{
		//reference variable
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);	
		
	}

}
