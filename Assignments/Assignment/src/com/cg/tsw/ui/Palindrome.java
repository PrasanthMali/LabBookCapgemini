package com.cg.tsw.ui;
import java.util.*;

public class Palindrome {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int temp=number,rev=0;
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		if(rev==number) {
			System.out.println("The entered number is a Palindrome");
		}else {
			System.out.println("The entered number is not a Palindrome");
		}
		sc.close();
	}
}