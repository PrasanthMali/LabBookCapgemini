package com.cg.lb3.ui;

import java.util.Scanner;

public class FormNewDigit {
	static void modifyNumber(int n) {
		String s=String.valueOf(n);
		char c[]=s.toCharArray();
		int sum=0;
		String res="";
		for(int i=0;i<c.length-1;i++) {
			int temp=Math.abs((int)c[i]-(int)c[i+1]);
			res+=String.valueOf(temp);
		}res+=c[c.length-1];
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer: ");
		int n= sc.nextInt();
		modifyNumber(n);
		sc.close();
	}

}