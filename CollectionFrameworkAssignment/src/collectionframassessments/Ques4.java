package collectionframassessments;

import java.util.*;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// a. How to Iterate ArrayList using Java ListIterator
		
		ArrayList alst = new ArrayList();
		
		alst.add("add");
		alst.add("remove");
		alst.add(23);
		alst.add(34.66);
		alst.add('a');
		alst.add(23);
		alst.add("add");
		alst.add('a');
		
		System.out.print(alst + " ");
		
		System.out.print("\n\nIterate ArrayList using Java ListIterator");
		ListIterator iterator = alst.listIterator(); 
		
		while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
		
		
		
		// b. Arraylist add element at specific index
		
		alst.add(2, "@iam");
		System.out.print("\n" +alst + " ");
		
		
		// c. Sort ArrayList in descending order

		ArrayList <Integer> al = new ArrayList();
		
		al.add(1);
		al.add(0);
		al.add(3);
		al.add(34);
		al.add(-1);
		al.add(7);
		al.add(5);
		
		// c. Sort ArrayList in descending order
		
		System.out.println("\nUnsorted ArrayList: "  + al);
		
		Collections.sort(al, Collections.reverseOrder());
		  
        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList " + "in Descending order : " + al);
    


		// d. insert an element to ArrayList using ListIterator
        
        ListIterator<Integer> it = al.listIterator();
        
        
        System.out.println("\nbefore , inerting an element: ");
        System.out.println(al);
        
        System.out.println("\nafter , inerting an element: ");
        it.add(556);
        System.out.println(al);
        
        
        // e. sort arraylist of strings alphabetically java
        
        
        ArrayList <String> as = new ArrayList();
        
        as.add("Volkswagen");   
        as.add("Toyota");   
        as.add("Porsche");   
        as.add("Ferrari");   
        as.add("Mercedes-Benz");   
        as.add("Audi");   
        as.add("Rolls-Royce");  
        as.add("BMW");
        
        System.out.println("\nBefore Sorting: "+ as);   
        
        
        Collections.sort(as);   
      
        System.out.println("\nAfter Sorting: "+ as);   
        
        // f. Sort elements of Java ArrayList
        
        Collections.sort(al);
        
        System.out.println("\nAfter Sorting: "+ al);  
        
        
        // g. replace an element at specified index arraylist
        
        System.out.println("\nbefore,, replace an element at specified index arraylist");
        System.out.println(al);
        
        al.set(3, 23);
        
        System.out.println("\nafter,, replace an element at specified index arraylist");
        System.out.println(al);
		
        
        // h. Search an element of Java ArrayList
        
        if(al.contains(2)) {
        	System.out.println("\nElement Found");
        	
        }else {
        	
        	System.out.println("\nElement Not Found");
        }
		
        
        // i. Remove element from specified index ArrayList
        
        al.remove(2);
        
        System.out.println("\nafter,,  Removing element from specified index: ");
        System.out.println(al);
        
        
        // j. Remove duplicates from arraylist without using collections

        
        System.out.println("\nBefore Remove Duplicate elements:"+"\n" + alst);
        
        for(int i=0;i<alst.size();i++){
         
         for(int j=i+1;j<alst.size();j++){
                    if(alst.get(i).equals(alst.get(j))){
                        alst.remove(j);
                        j--;
                    }
            }
         
         }
         
            System.out.println("\nAfter Removing duplicate elements:" +"\n" + alst);

	}

}
