package br.com.java8.functions;

import java.util.function.Function;

public class Examples {
	
	public static void main(String[] args) {
		Function<String, Integer> toInteger = Integer::valueOf;
		Function<String, String> backToString = toInteger.andThen(String::valueOf);

		String apply = backToString.apply("123");
		System.out.println(apply);
	}

}
