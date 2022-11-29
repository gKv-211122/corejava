package collectionframassessments;

import java.util.*;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ques2. WAP to Convert an Array to ArrayList in Java .Use three ways for conversion and its vice versa.
		
		String [] place = {"India", "USA", "Russia", "Dubai"};
		
		for(String str: place) {
			
			System.out.println(str);
		}
		
		// System.out.println(place.getClass());
		
		/** convert,		Array  -----> ArrayList
		
			Method - 1	, convert the Array -- ArrayList  , using Arrays.asList		
		
		    List lst = Arrays.asList(place);  --- give run time erroe after adding the element */
		
		System.out.println("\nMethod - 1, Array --- ArrayList");
		
		List <String>lst = new ArrayList<String>(Arrays.asList(place));
		
		System.out.println(lst);
		
		// System.out.println(lst.getClass());
		
		lst.add("china");
		lst.add("Aferica");
		// lst.add(34);   , --- error data-type(String),	 is alrady memtioned 
		
		
		System.out.println("After converting the array ---- arraylist, addding elements: ");
		System.out.println(lst);
		
		
		System.out.println();
		// Creating an instance of Iterator
		Iterator<String> iter = lst.iterator();
		 
		while(iter.hasNext()) {
	             
	            System.out.println(iter.next() + " ");
	        }
		
		
		
		/** Method - 2,  Using Collections.addAll() method */
		
		System.out.println("\nMethod - 2, Array --- ArrayList");
		
		List ls = new ArrayList();
		
		// adding elements of array to arrayList.
        Collections.addAll(ls, place);
        
        
        System.out.println(ls);
        
        
        /** Method - 3:		Using Manual method to convert Array using add() method  */
        
        System.out.println("\nMethod - 3, Array --- ArrayList");
        
        for (String x : place)
            ls.add(x);
 
        System.out.println(ls);
        
        
        
        // -------------------- conversion Arraylist ---- Array ------------------
        
        /** Method - 1 :  usint toArray() */
        
        System.out.println("\nMethod - 1, ArrayList --- Array");
        
        for (String x : place)
            ls.add(x);
 
        System.out.println("\nArrayList: " + ls);
        
        // Create a new array of String type
        String[] arr = new String[ls.size()];

        // Convert ArrayList into the string array
        ls.toArray(arr);
        
        System.out.print("Array: ");
        for(String item:arr) {
        	
          System.out.print(item+", ");
        }
        
        
        /** Method - 2 :  Manual method to convert ArrayList using get() method */
        System.out.println("\n\nMethod - 2, ArrayList --- Array");

        
        String [] arr1 = new String[lst.size()];
        
        // ArrayList to Array Conversion
        for (int i = 0; i < lst.size(); i++)
            arr1[i] = lst.get(i);
  
        for (String x : arr1)
            System.out.print(x + " ");
        
        
        
        /** Method - 3 :  Using Object[] toArray() method */
        
        System.out.println("\n\nMethod - 3, ArrayList --- Array");
        
        Object[] objects = lst.toArray();
        
        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
	}

}
