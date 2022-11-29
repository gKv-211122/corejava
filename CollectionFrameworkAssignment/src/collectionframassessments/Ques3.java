package collectionframassessments;

import java.util.*;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map <String, String> countries = new HashMap<>();
		
		countries.put("India", "New Delhi");
		countries.put("USA", "Washinton");
		countries.put("Russia", "Moscow");
		countries.put("Australia", "Canberra");
		
		System.out.println(countries);
		
		System.out.println("\niterating using foreach loop: ");
		countries.forEach((name, capital) -> {
			
			System.out.println("Key : " + name + " value : " + capital);
		});
		
		
		System.out.println("\niterating using,, keyset iterator: ");
		for (String key : countries.keySet()) {
			
		      System.out.println("Key : " + key + " value : " + countries.get(key));
		    }
		
		
		System.out.println("\niterating using,, entryset iterator along with foreach : ");
		  for (Map.Entry<String, String> entry : countries.entrySet()) {
			  
			  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		  }
	            
		  
		 System.out.println("\niterating using,, EntrySet along with Java iterator: ");
		 Iterator<String> iterator = countries.keySet().iterator();
		 	while (iterator.hasNext()) {
		 		
				String key = iterator.next();
				System.out.println("Key : " + key + " value : " + countries.get(key));
		}  
		
	}

}
