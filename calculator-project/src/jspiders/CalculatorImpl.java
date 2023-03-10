package jspiders;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		if( x!=0 || y!=0) {
		return x/y;
		}
		return 0;
	}

	@Override
	public String displayErrorMessage() {
		
		return "invalid choice!!";
	}

}
