package jspiders;

public interface Calculator {
	int add(int x,int y);
	int sub(int x,int y);
	int mul(int x,int y);  //by default methods are public and abstract 
	int div(int x,int y);
	
	String displayErrorMessage();
	
}
