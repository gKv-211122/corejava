package collectionframassessments;

import java.util.*;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Write a program to synchronize a HashMap in java
		
		HashMap <String, String> countries = new HashMap<>();
		
		countries.put("India", "New Delhi");
		countries.put("USA", "Washinton");
		countries.put("Russia", "Moscow");
		countries.put("Australia", "Canberra");
		
		
		Map map= Collections.synchronizedMap(countries);
	    Set set = map.entrySet();
	    
	    synchronized(map){
	        Iterator i = set.iterator();
	        
	        while(i.hasNext()) {
	        	
	            Map.Entry pair = (Map.Entry)i.next();
	            System.out.print(pair.getKey() + ": ");
	            System.out.println(pair.getValue());
	        }
	    }
	}

}
