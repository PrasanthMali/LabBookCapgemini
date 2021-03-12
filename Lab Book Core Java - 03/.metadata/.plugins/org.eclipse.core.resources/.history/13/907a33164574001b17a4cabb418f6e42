package com.cg.lb3.ui;

import java.util.Scanner;

public class PositiveString {
	static void positiveOrNegative(String s) {
		boolean isPositive=true;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)>s.charAt(i+1)) {
				isPositive=false;
				break;
			}
		}
		if(isPositive) {
			System.out.println("String Positive");
		}else {
			System.out.println("String Negative");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next();
		positiveOrNegative(s);
		sc.close();
	}

}