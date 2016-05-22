package br.com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example02 {
	
	static class Person {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return name;
	    }
	}

	static List<Person> persons = Arrays.asList(
        new Person("Max", 18),
        new Person("Peter", 23),
        new Person("Pamela", 23),
        new Person("David", 12)
	);
	
	public static void main(String[] args) {
		List<Person> filtered =
			    persons
			        .stream()
			        .filter(p -> p.name.startsWith("P"))
			        .collect(Collectors.toList());

		System.out.println(filtered);
		
		Map<Integer, List<Person>> personsByAge = persons
		    .stream()
		    .collect(Collectors.groupingBy(p -> p.age));

		personsByAge
		    .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
			
			
	}


}
