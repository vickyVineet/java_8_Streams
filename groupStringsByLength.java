import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;

class Main{
	public static void main (String[] args) throws java.lang.Exception {
		// Group Strings by Length
		List<String> strList = Arrays.asList("Vineet", "Anand", "Vicky");
		
// 		Map<Integer, List<String> > groupedString = 
		strList.stream().collect(Collectors.groupingBy(String :: length))
		.forEach(
		    (length, string) -> System.out.println("Length " + length + " : " + string));
		
// 		System.out.println(groupedString);

	}
}
