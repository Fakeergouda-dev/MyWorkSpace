package org.Simple.MyWorkSpace;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fct=Factorial.factorial(5);
		System.out.println(fct);

	}
	
	
	public static int factorial(int num)
	{
		int fact=1;
		
		for(int i=num; i>0; i--)
		{
			fact=fact*i;
			
		}
		return fact;
	}

}
