package com.vijay.methodoverloading;

public class Student {
	private static final String String = null;
	String name;
	int roll;
	int age;
	double adharNumber;
	public Student(double adharNumber) {
		this.adharNumber = adharNumber;
		show();
		System.out.println("Adhar Number --> "+adharNumber);
	
	}
	Student(String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
		
	}
	void show(){
		System.out.println("Name --> "+name);
		System.out.println("roll --> "+roll);
		System.out.println("age --> "+age);
	}
	public static void main(String[] args) {

		Student s = new Student(152f);
	//	s.show();
		
	}
	

}
