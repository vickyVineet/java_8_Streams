import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.lang.*;
import java.io.*;

class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// sort all the values present in the given Integer list
		Arrays.asList(1, 2, 3, 4, 8, 3, 0, 20).stream()
		.sorted()
		.forEach(System.out :: println);
		
	}
}
