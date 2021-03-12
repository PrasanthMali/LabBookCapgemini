package com.cg.tsw.ui;

import java.util.Scanner;

public class DigitInWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be printed in words : ");
		int num = sc.nextInt();
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		String result="";
		while(rev>0) {
			int rem1=rev%10;
			if(rem1==0) {
				result=result+"Zero ";
			}else if(rem1==1) {
				result+="One ";
			}else if(rem1==2) {
				result+="Two ";
			}else if(rem1==3) {
				result+="Three ";
			}else if(rem1==4) {
				result+="Four ";
			}else if(rem1==5) {
				result+="Five ";
			}else if(rem1==6) {
				result+="Six ";
			}else if(rem1==7) {
				result+="Seven ";
			}else if(rem1==8) {
				result+="Eight ";
			}else if(rem1==9) {
				result+="Nine ";
			}
			rev/=10;
		}
		System.out.println(result);
		sc.close();
	}
}