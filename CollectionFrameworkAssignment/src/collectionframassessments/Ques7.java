package collectionframassessments;

import java.util.ArrayList;
import java.util.Collections;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to reverse ArrayList in java
		
		ArrayList al = new ArrayList();
		
		al.add("add");
		al.add("remove");
		al.add(23);
		al.add(34.66);
		al.add('a');
		al.add(23);
		al.add("add");
		al.add('a');
		
		
		System.out.println("Before Reversing");  
        System.out.println(al);  
          
        Collections.reverse(al);  
        
        System.out.println("After Reversing");  
        System.out.println(al);  
		
		

	}

}
