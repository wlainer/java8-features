package br.com.java8.default_interface;

interface IFormula {
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
