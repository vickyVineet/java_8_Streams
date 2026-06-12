import java.util.*;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.lang.*;
import java.io.*;

class Test{
	public static void main (String[] args) throws java.lang.Exception{
		// Given an integer array nums, return true if any value appears at 
		// least twice in the array, and return false if every element is 
		// distinct 
		List<Integer> nums = List.of(1, 2, 4, 8, 9, 2, 0, 5, 0, 7);
		
		CheckDuplicate cd = new CheckDuplicate();
		System.out.println("Message " + cd.checkDuplicateNum(nums));
	}
}


class CheckDuplicate{
     
    public Boolean checkDuplicateNum(List<Integer> nums){
        HashSet<Integer> set = new HashSet();
        return nums.stream().anyMatch(ch -> set.add(ch));
    }
    
}