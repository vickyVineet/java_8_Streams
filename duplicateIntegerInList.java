import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;

class Test{
	public static void main (String[] args) throws java.lang.Exception{
		// find duplicate elements in a given integers list
		Set<Integer> intSet = new HashSet();
		Arrays.asList(1, 02 ,01, 11, 5, 2, 97, 0).stream()
		.filter(x -> !intSet.add(x))
		.forEach(System.out :: println);

	}
}
