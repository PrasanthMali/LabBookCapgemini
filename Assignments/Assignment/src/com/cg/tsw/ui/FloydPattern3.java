package com.cg.tsw.ui;

import java.util.*;

public class FloydPattern3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row=sc.nextInt();
		int k;
		for(int i=1;i<=row;i++) {
			k=1;
			for(int j=1;j<row*2;j++) {
				if(j<=row+i-1 && j>=row+1-i) {
					System.out.print(k+"\t");
					 if(j<(row)) {
	                        k++;
					 }
	                 else {
	                        k--;
	                    }    
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