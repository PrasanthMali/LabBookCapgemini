package com.cg.lb.ui;

import java.util.Scanner;

public class IncreasingNumber {
	static boolean increasingNumber(int n) {
		boolean result=true;
		int rem = n%10;
		n/=10;
		while(n>0) {
			if(rem<=(n%10)){
				result=false;
				break;
			}
			rem=n%10;
			n/=10;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println(increasingNumber(n));
		sc.close();
	}

}