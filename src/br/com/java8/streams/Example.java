package br.com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Example {
	
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "a2", "c4", "b1", "c2", "c1");

		myList
		    .stream()
		    .filter(s -> s.startsWith("c"))
		    .map(String::toUpperCase)
		    .sorted()
		    .forEach(System.out::println);
		
		Arrays.asList("a1", "a2", "a3")
		    .stream()
		    .findFirst()
		    .ifPresent(System.out::println); 
		
		Arrays.stream(new int[] {1, 2, 3})
		    .map(n -> 2 * n + 1)
		    .forEach(System.out::println);
	}

}
