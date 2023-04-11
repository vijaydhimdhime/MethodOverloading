package com.vijay.MethodOverlodingInChildClass1;

public class ReturntypeTest1 
{ 
 public static void main(String[] args) 
 { 
   ReturnTypeEx1 obj = new ReturnTypeEx1(); 
   int sum = obj.m1(20, 30); 
   System.out.println(sum); 

   int multiply = obj.m1(20,30); 
   System.out.println(multiply); 
  } 
}