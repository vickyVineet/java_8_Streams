import java.util.*;
import java.lang.*;
import java.io.*;

class Test{
	public static void main (String[] args) throws java.lang.Exception{
		// square of each Number
		Arrays.asList(1, 3, 2, 7, 4).stream()
		.map(i -> i*i)
		.forEach(System.out :: println);

	}
}
