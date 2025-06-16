package org.Simple.MyWorkSpace;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="fakeergouda";
	       List<String> lst=new ArrayList<String>();
	       for(int i=0; i<str1.length(); i++)
	       {
	           String st1=String.valueOf(str1.charAt(i));
	           for(int j=i+1; j<str1.length(); j++)
	           {
	               if(!String.valueOf(str1.charAt(i)).equalsIgnoreCase(String.valueOf(str1.charAt(j))) && !lst.contains(String.valueOf(str1.charAt(i))))
	               {
	                   lst.add(String.valueOf(str1.charAt(i)));
	               }
	           }
	       }
	       for(int k=0; k<lst.size(); k++)
	       {
	           System.out.print(lst.get(k));
	       }

	}

}
