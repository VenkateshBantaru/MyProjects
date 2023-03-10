package org;


abstract class person{
	abstract void eat();
}
class jerry extends person{

	@Override // Annotation override
	void eat() {
		System.out.println("eating birayni!");	
	}

}
public class solution {
	public static void main(String[] args) {
		jerry jerry=new jerry();
		jerry.eat();
	}
}
//contract of abstract : rules:
//1.make the class as abstract
//2.override the abstract method




