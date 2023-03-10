package bank;

public class Bankimpl implements Bank {
	int balance;
	
	Bankimpl(int balance){
		this.balance=balance;
	}

	@Override
	public void deposite(int amount) {
		System.out.println("Depositing amount Rs :"+amount);
		balance=balance+amount;
		System.out.println("Amount Deposited succsessfully");
		
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=balance) {
		System.out.println("whithdraw amount Rs :"+amount);
		balance=balance-amount;
		System.out.println("Amount Deposited Successfully");
		}else {
			try {
				throw new Exception("Insufficient Balance");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}

	@Override
	public int getbalance() {
		
		return balance;
	}

}
