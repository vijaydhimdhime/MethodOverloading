package com.vijay.methodoverloading;

import java.util.Scanner;

public class Demo {
	void sum(int a, int b){
		int res = a+b;
		System.out.println(res);
	}
	void sum(int x, int y, int z){
		int res  = x+y+z;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Demo d =new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		d.sum(a,b);
		System.out.println("enter three numbers :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		d.sum(x, y, z);
		//d.sum(a,b,c);
	}

}
