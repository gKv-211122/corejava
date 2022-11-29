package collectionframassessments;

import java.util.*;

public class Ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		
		 ArrayList<String> l = new ArrayList<String>(); 
		 
		 
		 l.add("A"); 
		 l.add("O"); 
		 l.add("B"); 
		 l.add("P"); 
		 l.add("G"); 
		    
		 // Synchronizing ArrayList in Java. 
		 List<String> synlist = Collections.synchronizedList( l ); // l is non-synchronized. 

		 // Here, we will use a synchronized block to avoid the non-deterministic behavior. 
		 synchronized(synlist) {
			 
		     Iterator<String> itr = synlist.iterator(); 
		     while(itr.hasNext()) {
		    	 
		       String str = itr.next(); 
		       System.out.println(str); 
		     } 
		     
		 } 

	}

}
