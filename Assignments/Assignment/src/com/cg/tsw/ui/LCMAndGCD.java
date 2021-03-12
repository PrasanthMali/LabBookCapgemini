package com.cg.tsw.ui;

import java.util.*;
public class LCMAndGCD {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers to find LCM & GCD : ");
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		System.out.println("LCM of two numbers is : "+lcm(firstNumber,secondNumber));
		System.out.println("GCD of two numbers is : "+gcd(firstNumber,secondNumber));
		sc.close();
	}
	static int gcd(int a, int b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
	
	static int lcm(int a, int b)
	{
	    return (a / gcd(a, b)) * b;
	}
}