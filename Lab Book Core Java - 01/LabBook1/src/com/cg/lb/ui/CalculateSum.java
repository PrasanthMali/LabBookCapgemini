package com.cg.lb.ui;

import java.util.Scanner;

public class CalculateSum {
	static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("The sum of first n natural numbers which are divisible by 3 or 5 :" + calculateSum(n));
		sc.close();
	}

}