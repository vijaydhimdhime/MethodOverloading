package com.vijay.MethodOverlodingInChildClass1;

public class ReturnTypeEx1 
{ 
  public int m1(int a, int b) // Duplicate method error. 
  { 
    int x = a + b; 
    return x; 
   } 
 public int m1(int c, double d) // Duplicate method error. 
 { 
	 double y = c * d; 
    return (int) y; 
  } 
 } 
