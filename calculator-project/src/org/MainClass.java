package org;

interface paytm{
	int id=100;      //public static final int id=100;
	void payment();  //public abstract void payment();
}
class Amazon implements paytm{

	@Override
	public void payment() {
		System.out.println("payment through paytm");
		
	}
	
}
public class MainClass {
public static void main(String[] args) {
	System.out.println(paytm.id);
	Amazon amazon=new Amazon();
	amazon.payment();
}
}
// while overriding a method , access modifier should be same or higher visibility
