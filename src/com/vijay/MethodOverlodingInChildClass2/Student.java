package com.vijay.MethodOverlodingInChildClass2;

public class Student{
	String name;
	String city;
	int roll;
	//int age;
	public Student(String name, String city, int roll){
		this.name = name;
		this.city = city;
		this.roll = roll;
		//this.age = age;
	}
	void show(int age){ //add new required data add new method
		//show();
		System.out.println("Student age is : "+age);
	}
	void show(){
		show(27);
		System.out.println("student name : "+name);
		System.out.println("student city : "+city);
		System.out.println("student roll number : "+roll);
		//show(25);

	}
}




