package collectionframassessments;

import java.util.*;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to convert HashSet to Array
		
		HashSet <Integer> hs = new HashSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(5);
		hs.add(1);
		
		System.out.println(hs.getClass());
	    System.out.println(hs);
	        
	        
	    // conversion to, LinkedList --- ArrayList
	     
	    Integer [] arr = new Integer[hs.size()];
	    hs.toArray(arr);
;	     
	    System.out.println(arr.getClass());
	    
	    System.out.println("Array elements: ");
	     for(int e : arr){
	        System.out.println(e);
	        
	     }

	}

}
