package org.example.Numbers;

import java.util.HashMap;
import java.util.Map;

public class Count_fre_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 8329505;
		
		String a = Integer.toString(i);
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		// to char array
		
		char[] c = a.toCharArray();
		
		   //num = s.nextInt();
	       for(char m : c){
	           if(map.containsKey(m)){
	               map.put(m,map.get(m)+1);
	           }
	           else{
	               map.put(m,1);
	           }      
	       
	        for(Map.Entry entry:map.entrySet()){
	        	
	        	System.out.println(entry.getKey()+"-"+entry.getValue());
	        	
	        }
	            
	}

	}}
