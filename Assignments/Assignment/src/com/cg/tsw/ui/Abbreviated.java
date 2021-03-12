package com.cg.tsw.ui;

import java.util.Scanner;

public class Abbreviated {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String str1[]=str.split(" ");
		for(int i=0;i<str1.length-1;i++) {
			System.out.print(str1[i].charAt(0)+".");
		}System.out.println(str1[str1.length-1].charAt(0));
		sc.close();
	}

}