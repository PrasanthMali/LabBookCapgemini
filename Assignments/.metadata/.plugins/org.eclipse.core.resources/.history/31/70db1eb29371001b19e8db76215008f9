package com.cg.tsw.ui;

import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System .out.println("Enter the number of word: ");
		int n= sc.nextInt();
		System.out.println("Enter the string: ");
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		String temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(str[i].compareTo(str[j])>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(str[i]);
		}
		sc.close();
	}

}