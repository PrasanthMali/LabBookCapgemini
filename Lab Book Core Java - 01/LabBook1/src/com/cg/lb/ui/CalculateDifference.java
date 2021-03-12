package com.cg.lb.ui;

import java.util.Scanner;

public class CalculateDifference {
	static int calculateDifference(int n) {
		int sum=0,sum1=0,sum2=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			sum1+=(int)(Math.pow(i, 2));
		}
		sum2=(int)Math.pow(sum, 2);
		return sum1-sum2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("The difference between the sum of the squares of the first n natural numbers and the square of their sum : " + calculateDifference(n));
		sc.close();
	}

}