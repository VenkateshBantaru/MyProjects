package jspiders;

import java.util.Scanner;

public class solution{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		  //MENU DRIVEN PROGRAMS
		 //upcasting-->to achive abstraction
		 Calculator c=new CalculatorImpl();
		while(true) {
			System.out.println("-------Welcome to Calculator-------");
			System.out.println(" 1. Addition");
			System.out.println(" 2. Substraction");
			System.out.println(" 3. Multiplication");
			System.out.println(" 4. Division");
			System.out.println(" 5. Exit");
			System.out.println("----------------------");
			System.out.println("Enter ur choice");
			System.out.println("-----------------------");
			int choice=sc.nextInt();
			
			int x=0; //local var must be intialzied by default doesnt hv any values
			int y=0;
			
			if(choice>=1 && choice<=4) {
			System.out.println("Enter two numbers :");
			 x=sc.nextInt();
		     y=sc.nextInt();
			}
			
			
			switch(choice) {
			case 1:
				System.out.println("Addition of "+x+" & " +y+" is "+c.add(x,y));
				break;
				
			case 2:
				System.out.println("Substraction of "+x+" & " +y+" is "+c.sub(x,y));
				break;
				
			case 3:
				System.out.println("Multiplication of "+x+" & " +y+" is "+c.mul(x,y));
				break;
				
			case 4:
				 int result=c.div(x, y);
				 if(result!=0) {
				System.out.println("Division of "+x+" & " +y+" is "+c.div(x,y));
				 }
				 else {
					 System.out.println("numinator or denominator cannot be 0");
				 }
			
				break;
				
			case 5:
				System.out.println("Thank you!!");
				System.exit(0);
				break;
				default :
					System.out.println(c.displayErrorMessage());
					 sc.close();
			}
			 
			System.out.println("----------------------------");
			
		}
		
		 
		
	}
	
}