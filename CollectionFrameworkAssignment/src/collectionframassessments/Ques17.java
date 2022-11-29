package collectionframassessments;

import java.util.*;

public class Ques17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 *  A school offers medals to the students of tenth based on the following criteria
			If(Marks>=90) : Gold
			
			If(Marks between 80 and 90) : Silver
			
			If(Marks between 70 and 80) : Bronze
			
			Note: Marks between 80 and 90 means à marks>=80 and marks<90
			
			Write a function which accepts the marks of students as a Hashmap and return the details
			of the students eligible for the medals along with type of medal.
			 
			The input hashmap contains the student registration number as key and mark as value.
			
			The output hashmap should contain the student registration number as key and the medal type as value.
		 	*/
		
		
		
		 
		 
		Scanner sc = new Scanner(System.in);
			
		HashMap <Integer, String> students = new HashMap<>(); 
			
		Integer k;
		String v;
			
		System.out.println("Enter regd.NO  and marks: ");
			
		for(int i = 0; i < 3; i++) {
				
				
			k = sc.nextInt();
				
			v = sc.next();
				
				
			students.put(k, v);
				
				
			}
		 
		Iterator<Map.Entry<Integer, String>> it = students.entrySet().iterator();
		
		while (it.hasNext()) {
			
			Map.Entry<Integer, String> set = (Map.Entry<Integer, String>) it.next();
			float value = Float.parseFloat(set.getValue());
			
			if(value >= 90) {
				
				students.put(set.getKey(), "Gold");
			}
			else if(value >= 80 && value <=70) {
				
				students.put(set.getKey(), "Silver");
			}
			
			else if (value >= 70 && value <=80) {
				students.put(set.getKey(), "Bronze");
			}
			
			
		}
		System.out.println(students);
		 

	}

}
