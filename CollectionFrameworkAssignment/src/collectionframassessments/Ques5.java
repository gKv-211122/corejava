package collectionframassessments;

import java.util.*;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to convert LinkedList to ArrayList?

		LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        
        System.out.println(linkedList.getClass());
        System.out.println(linkedList);
        
        
        // conversion to, LinkedList --- ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        
        System.out.println(arrayList.getClass());
        System.out.println(arrayList);
        
        
        
	}

}
