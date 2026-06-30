import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;

class Main{
	public static void main (String[] args) throws java.lang.Exception {
		// Concatenate all strings in a list into a single string
		List<String> strList = Arrays.asList("Vineet", "Anand", "Vicky");
		
		String concatenatedString = strList.stream().collect(Collectors.joining(" "));
		
		System.out.println(concatenatedString);

	}
}
