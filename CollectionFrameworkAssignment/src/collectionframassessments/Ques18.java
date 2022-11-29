package collectionframassessments;

import java.util.*;

public class Ques18 {
	
	
	public static void stringLowerUpper(ArrayList <String> str) {
		
		
		Collections.sort(str);  // sort alphabatically-order
		
		System.out.println("After sorting the element in alphabatically order: \n" + str);
		
		ArrayList <String> str1 = null;
		ArrayList <String> str2 = null;
		
		int div = str.size() % 2;
		
		if( div== 0) {
			
			 str1 = (ArrayList<String>) str.subList(0, str.size() / 2);
			 str2 = (ArrayList<String>) str.subList(str.size() / 2, str.size());
			
			
			for (String up : str1) {
				
	            String upValue = up.toUpperCase(Locale.ROOT);
	            str1.set(str1.indexOf(up), upValue);
	        }
			
			for (String lo : str2) {
				
	            String loValue = lo.toLowerCase(Locale.ROOT);
	            str2.set(str2.indexOf(lo), loValue);
	        }
		}
		
		System.out.println(str1 +" "+ str2);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * 
		 * 	Create a method that can accept an array of String objects and sort in alphabetical order.
		 * 
			The elements in the left half should be completely in uppercase and the elements
			in the right half should be completely in lower case.
			
			Return the resulting array.
			
			Note: If there are odd number of String objects, then (n/2)+1 elements should be in UPPPERCASE
		 	*/
		ArrayList <String> strs = new ArrayList();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of string");
		int n = sc.nextInt();
		
		System.out.println("Enter string: ");
		for(int i = 0; i < n; i++) {
			
			String s = sc.next();
			strs.add(s);
			
		}
		
		stringLowerUpper(strs);
		
		
		
		
		
		
	}

}
