package com.cg.lb.ui;

import java.util.Scanner;

public class PrimeNumberUptoN {
	static boolean checkPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	static void printPrimeNumber(int n) {
		for(int i= 2; i<=n;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		printPrimeNumber(n);
		sc.close();
	}

}