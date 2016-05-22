package br.com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {

	static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
	
	public static void main(String[] args) {
		LambdaExpressions.newWayOneLineSkippingTypes();
		
	}
	
	private static void oldWay() {

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		printNames();
	}
	
	private static void newWay() {
		Collections.sort(names, (String a, String b) -> {
		    return a.compareTo(b);
		});
		printNames();
	}

	private static void newWayOneLine() {
		Collections.sort(names, (String a, String b) -> a.compareTo(b));
		printNames();
	}

	private static void newWayOneLineSkippingTypes() {
		Collections.sort(names, (a, b) -> a.compareTo(b));
		printNames();
	}

	private static void printNames() {
		names.forEach(System.out::println);
	}
}
