package br.com.java8.default_interface;

public class FormulaImpl implements IFormula{

	@Override
	public double calculate(int a) {
		return sqrt(a) + 2;
	}
	
	public static void main(String[] args) {
		FormulaImpl formulaImpl = new FormulaImpl();
		System.out.println(formulaImpl.calculate(16));
	}

}
