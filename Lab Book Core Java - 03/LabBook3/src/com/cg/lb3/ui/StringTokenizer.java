package com.cg.lb3.ui;

import java.util.*;
import java.lang.*;
import java.io.*; 
public class StringTokenizer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = s.nextLine();
		StringTokenizer st = new StringTokenizer(input," ");
		int sum = 0;
		while(st.hasMoreTokens())
		{
			int num = 0;
			num = Integer.parseInt(st.nextToken());
			System.out.println("Number is: "+num);
			sum += num;
		}
		System.out.println("Sum of the numbers is: "+sum);
	}
}