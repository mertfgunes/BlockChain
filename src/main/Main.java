package main;

import java.util.Arrays;

public class Main {

	
	// hash = digital signature 
	// each block will have list of transactions and the previous hash.
	
	public static void main(String[] args) {
		String[] list1 = {"a", "b", "c" };
		String[] list2 = {"aa", "b", "c" };
		
		
		System.out.println(Arrays.hashCode(list1));
		System.out.println(Arrays.hashCode(list2));	
	}
}