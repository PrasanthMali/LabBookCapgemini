package com.cg.tsw.ui;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str= sc.next();
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		if(result.equals(str)) {
			System.out.println("Palindrome!");
		}else {
			System.out.println("Not Palindrome!");
		}
		sc.close();
	}
}