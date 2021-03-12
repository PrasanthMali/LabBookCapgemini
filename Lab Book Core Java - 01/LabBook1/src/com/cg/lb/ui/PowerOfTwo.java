package com.cg.lb.ui;

import java.util.Scanner;

public class PowerOfTwo {
	static boolean powerOfTwoCheck(int num) {
		int n = num;
		int count=0;
		while(n>=2) {
			n=n/2;
			count++;
		}
		int result=(int)(Math.pow(2, count));
		return result==num?true:false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(powerOfTwoCheck(n));
		sc.close();
	}

}