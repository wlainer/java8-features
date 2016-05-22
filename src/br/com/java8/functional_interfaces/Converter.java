package br.com.java8.functional_interfaces;

@FunctionalInterface
interface Converter<F, T> {
	T convert(F from);
}
