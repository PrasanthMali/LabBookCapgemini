package com.cg.tsw.ui;

import java.util.*;

public class FloydPattern1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j<=row+1-i) {
					System.out.print("*	");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}