package collectionframassessments;

import java.util.*;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to iterate TreeMap in java
		
		TreeMap <Integer, String> tm = new TreeMap();
		
		tm.put(101, "first");
		tm.put(102, "second");
		tm.put(103, "third");
		tm.put(104, "fourth");
		
		System.out.println(tm);
		
		
		for (Map.Entry<Integer, String> entry : tm.entrySet())
			System.out.println( entry.getKey()+ ", " + entry.getValue());
		

	}

}
