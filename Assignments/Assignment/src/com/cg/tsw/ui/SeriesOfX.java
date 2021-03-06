package com.cg.tsw.ui;

import java.util.*;

public class SeriesOfX {
	
	static int factorial(int n) {
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	static int power(int x,int n) {
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*x;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and n: ");
		int x=sc.nextInt();
		int n=sc.nextInt();
		double result=(double)power(x,n)/factorial(n);
		System.out.println("Result: "+(result+1));
		sc.close();
	}
	    
}