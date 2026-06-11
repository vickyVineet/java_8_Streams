import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.lang.*;
import java.io.*;

class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// find the first non-repeated character in given String
		String str = "vineetanand";
		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(
		    Function.identity(), 
		    LinkedHashMap :: new, 
		    Collectors.counting()
		  )
		)
		.entrySet().stream()
		.filter(ch -> ch.getValue() == 1)
		.map(ch -> ch.getKey())
		.findFirst()
		.ifPresent(System.out :: println);

	}
}
