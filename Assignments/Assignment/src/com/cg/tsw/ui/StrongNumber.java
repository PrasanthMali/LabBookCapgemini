package com.cg.tsw.ui;
import java.util.*;

public class StrongNumber {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum+=fact;
			temp/=10;
		}
		if(sum==number) {
			System.out.println("The entered number is a strong number.");
		}
		else {
			System.out.println("The entered number is a not strong number.");
		}
		sc.close();
	}
}