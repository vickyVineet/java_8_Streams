import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;

class Main{
	public static void main (String[] args) throws java.lang.Exception {
		// Flatten a List of Lists
		List<List<Integer>> intList = Arrays.asList(
		        Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9)
		    );
		    
	    List flattenedList = intList.stream().flatMap(List :: stream).collect(Collectors.toList());
	    
	    System.out.println(flattenedList);

	}
}
