package com.cg.lb3.ui;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceConstant {
	static void alterString(String s) {
		char[] c= s.toCharArray();
		char []c1=new char[c.length];
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a' ||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				c1[i]=c[i];
			}else if(c[i]=='z') {
				c1[i]='b';
			}else {
				c1[i]=(char) (c[i]+1);
			}
		}
		for(char ch:c1) {
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String in lower case only: ");
		String s= sc.next();
		alterString(s);
	}

}