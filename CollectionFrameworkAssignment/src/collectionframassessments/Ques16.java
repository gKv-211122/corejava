package collectionframassessments;

import java.security.KeyStore.Entry;
import java.util.*;

public class Ques16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * Input:HashMap
		   {selva:75.6f, abi:89.5f,ram:40} 
		   
		   Output:hashmap
           {selva:pass,abi:pass,ram:fail}
           
           If the mark is >60 return the names and their status as pass in a output hashmap else fail
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		HashMap <String, String> info = new HashMap<>(); 
		
		String k;
		String v;
		
		System.out.println("Enter name  and marks: ");
		
		for(int i = 0; i < 2; i++) {
			
			
			k = sc.next();
			
			v = sc.next();
			
			
			info.put(k, v);
			
			
		}
		System.out.println(info);
		
		
		Iterator<Map.Entry<String, String>> it = info.entrySet().iterator();
		
		while (it.hasNext()) {
			
			Map.Entry<String, String> set = (Map.Entry<String, String>) it.next();
			
			if(Float.parseFloat(set.getValue()) > 60.00f) {
				
				info.put(set.getKey(), "pass");
			}
			
			else {
				info.put(set.getKey(), "fail");
			}
			
			
		}
		System.out.println(info);
		
		
		
		
	}

}
