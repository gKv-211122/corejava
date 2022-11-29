package collectionframassessments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("random");
		// Ques1. Wite a Java program to create read only data using List, Set and Map in example
		
		// -------------------- read oly list -----------------------
		List readOnlyList = new ArrayList();
		
		
		readOnlyList.add("data");
		readOnlyList.add(23);
		readOnlyList.add('c');
		readOnlyList.add("read-only");
		readOnlyList.add(23.6);
		readOnlyList.add(23);
		readOnlyList.add("read-only");
		
		// here we made the lst -- unmodifiable , we cannot perform any operation
		readOnlyList = Collections.unmodifiableList(readOnlyList);
		
		
		
		// readOnlyList.set(0, "changeList"); -- error, java.lang.UnSupportedOperation - List update not allowed
		
		
		System.out.println(readOnlyList);
		
		// --------------- read only set ----------------------
		Set readOnlySet = new HashSet<>(readOnlyList);
		
		readOnlySet.add("set");
		
		// unmodifiable
		readOnlySet = Collections.unmodifiableSet(readOnlySet);
		
		System.out.println(readOnlySet);
		
		
		// readOnlySet.remove("set");  -- error
		
		
		// --------------- read only Map ----------------------
		
		Map <String, Integer> countries = new HashMap<>();
		
		countries.put("India", 101);
		countries.put("USA", 102);
		
		System.out.println("Map, before the making read-only:  ");
		System.out.println(countries);
		
		
		// making the map read-only
		
		 Map readOnlyMap = Collections.unmodifiableMap(countries);
		
		// readOnlyMap.put("Russia", 100);  -- error
		
		// countries.remove("USA");
		
		// System.out.println(countries);
		
		
		
		
		

	}

}
