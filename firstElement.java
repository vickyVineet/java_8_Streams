import java.util.*;
import java.lang.*;
import java.io.*;

class Test{
	public static void main (String[] args) throws java.lang.Exception{
		// first element
		Arrays.asList(10, 1, 3, 2, 7, 4).stream()
		.findFirst().ifPresent(System.out :: print);

	}
}
