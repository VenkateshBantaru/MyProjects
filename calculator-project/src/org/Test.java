package org;

class Student{
	private int age;
	private String name;
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age; 
	}
	public void setName(String name){
		this.name=name;
		
	}
	public String getName(){
		return name;
	}
}
public class Test {
public static void main(String[] args) {
	Student student=new Student();
	
	student.setName("venki");
	student.setAge(22);
	System.out.println("name :"+student.getName());
	int age=student.getAge();
	System.out.println("age :"+age);
}
}
