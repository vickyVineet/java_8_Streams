import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;

class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Given a list of integers, find out all the even numbers that exist
		// in the list using Stream functions?
		Arrays.asList(1, 2 ,3, 4, 5, 6, 7).stream()
		.filter(x -> x%2 == 0)
		.forEach(System.out :: println);

	}
}
