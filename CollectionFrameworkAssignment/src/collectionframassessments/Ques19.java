package collectionframassessments;

import java.util.*;

public class Ques19 {
	
	public static int[] removeDuplicate(int [] arr) {
		
		    
	      // sort the array in descending-order
	      int temp = 0; 
	      
	      for (int i = 0; i < arr.length; i++)   //Holds each Array element
	         {     
	            for (int k = i+1; k < arr.length; k++)    //compares with remaining Array elements
	            {     
	               if(arr[i] < arr[k]) //Compare and swap
	               {    
	                   temp = arr[i];    
	                   arr[i] = arr[k];    
	                   arr[k] = temp;    
	               }     
	            }     
	        }
	     
	      
	      
	      
	      // remove duplicate element
	      int n = arr.length;
		  int[] temp1 = new int[n];
		  int j = 0;
		    
		  for(int i=0; i<n-1; i++) {
		    	
		      if (arr[i] != arr[i+1]) {
		        	
		          temp1[j++] = arr[i];
		       }
		        
		  }
		    
		  temp1[j++] = arr[n-1];
		  
		  
		 return temp1;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * 
		 * Create a method which accepts an integer array and removes all the duplicates in the array.
		   Return the resulting array in descending order.         */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int n  = sc.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements of array before sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }   
		
		
		
		
		// int size = removeDuplicate(arr).length;
		
		int [] updateArr;
		
		updateArr = removeDuplicate(arr);
		
		System.out.println("\nafter removing duplicate Elements of array and sorted in descending order: ");    
        for (int i = 0; i < updateArr.length; i++) {     
        	
        	if(updateArr[i] != 0){
        		
                System.out.print(updateArr[i]+" ");
             }    
        }   
		
		
	}

}
