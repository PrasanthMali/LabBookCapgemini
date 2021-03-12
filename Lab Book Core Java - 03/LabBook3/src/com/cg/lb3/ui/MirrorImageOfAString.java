package com.cg.lb3.ui;

import java.util.Scanner;

public class MirrorImageOfAString {
	static String mirrorString(String s) {
		StringBuilder sb = new StringBuilder(s);
		StringBuilder s1=sb.reverse();
		return (s+"|"+s1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		System.out.println(mirrorString(s));
		sc.close();
	}

}