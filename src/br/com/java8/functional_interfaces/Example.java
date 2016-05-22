package br.com.java8.functional_interfaces;

public class Example {
	
	public static void main(String[] args) {
		Converter<String, Integer> converter = Integer::valueOf;
		
		String value = "5";
		Integer convert = converter.convert(value);
		System.out.println(convert);
	}

}
