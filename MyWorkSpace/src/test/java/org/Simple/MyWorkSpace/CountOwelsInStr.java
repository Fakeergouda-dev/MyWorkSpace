package org.Simple.MyWorkSpace;

import java.util.HashMap;

public class CountOwelsInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Heaxawareaiousi";
		char[] ch= {'a','e','i','o','u'};
		char[] st=str.toCharArray();
		
		HashMap<Character,Integer> hmp=new HashMap<Character, Integer>();
		for(int i=0; i<ch.length; i++)
		{
			String s1=String.valueOf(ch[i]);
			for(int j=0; j<st.length; j++)
			{
				String s2=String.valueOf(st[j]);
				
				if(s1.equalsIgnoreCase(s2))
				{
					if(hmp.containsKey(ch[i])) {
						
						int count=hmp.get(ch[i]);
						hmp.put(ch[i], ++count);
					}
					else
					{
						hmp.put(ch[i], 1);
					}
					
					
				}
				
			}
		}
		
		System.out.println(hmp);

	}

}
