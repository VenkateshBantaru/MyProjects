package bank;

import java.util.Scanner;

public class solution {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Bank bank=new Bankimpl(5000);
	
	while(true) {
		System.out.println("1:Deposite Amount\n2:Withdraw Amount");
		System.out.println("3:Check Balance\n4:Exit");
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter amount to be deposited ");
			int amountToDeposite=sc.nextInt();
			bank.deposite(amountToDeposite);
			break;
			
		case 2:
			System.out.println("Enter amout  to be withdraw ");
			int amountTobeWithdraw=sc.nextInt();
			bank.withdraw(amountTobeWithdraw);
			break;
			
		case 3:
			System.out.println("Available Balance :"+bank.getbalance());
			break;
			
		case 4:
			System.out.println("Thank You!! visit Again!!");
			System.exit(0);
			default:
				System.out.println("Inavalid Choice !!");
		}
		System.out.println("--------------------------------");
	}
	
}
}
