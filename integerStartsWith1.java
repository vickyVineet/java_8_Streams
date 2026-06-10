import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;

class Test{
	public static void main (String[] args) throws java.lang.Exception{
		// Given a list of integers, find out all the numbers starting with 1
		// using Stream functions?
		Arrays.asList(1, 02 ,13, 411, 15, 60, 97).stream()
		.map(x -> x+"")
		.filter(x -> x.startsWith("1"))
		.forEach(System.out :: println);

	}
}
