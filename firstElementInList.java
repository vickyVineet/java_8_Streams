import java.util.*;
import java.lang.*;
import java.io.*;

class Test{
	public static void main (String[] args) throws java.lang.Exception{
		// find the first element of the list
		Arrays.asList(1, 02 ,01, 11, 5, 2, 97, 0).stream()
		.findFirst().ifPresent(System.out :: println);

	}
}
