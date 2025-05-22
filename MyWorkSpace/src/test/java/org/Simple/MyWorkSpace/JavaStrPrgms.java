package org.Simple.MyWorkSpace;

import java.util.HashMap;

public class JavaStrPrgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello world";
		//countOwels(str);
		boolean prime=isPrime(15);
		System.out.println(prime);
		//fibSeries(10);
		
		checkArmstrongNumber(153);
	}
	
	static void checkArmstrongNumber(int number)
    {
        int copyOfNumber = number;
 
        int noOfDigits = String.valueOf(number).length();
 
        int sum = 0;
 
        while (copyOfNumber != 0)
        {
            int lastDigit = copyOfNumber % 10;
 
            int lastDigitToThePowerOfNoOfDigits = 1;
 
            for(int i = 0; i < noOfDigits; i++)
            {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
            }
 
            sum = sum + lastDigitToThePowerOfNoOfDigits;
 
            copyOfNumber = copyOfNumber / 10;
        }
 
        if (sum == number)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }
    }
 
	
	public static void countOwels(String str)
	{
		
        HashMap<String,Integer> hmap=new HashMap<String,Integer>();
        hmap.put("a",0);
        hmap.put("e",0);
        hmap.put("i",0);
        hmap.put("o",0);
        hmap.put("u",0);
               
        for(int i=0; i<str.length();i++)
        {
            if(hmap.containsKey(String.valueOf(str.charAt(i))))
            {
                int count=hmap.get(String.valueOf(str.charAt(i)));
                hmap.put(String.valueOf(str.charAt(i)),++count);
            }
        }
        System.out.println(hmap);
	}
	
	public static boolean isPrime(int n)
	{
		if(n==0||n==1)
		{
			return true;
		}
		 for(int i=2; i<n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		return true;
	}
	
	public static void fibSeries(int n)
	{
		int a=0;
		int b=1;
		int c=1;
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Fib siries--"+a);
			a=b;
			b=c;
			c=a+b;
		}
	}

}
