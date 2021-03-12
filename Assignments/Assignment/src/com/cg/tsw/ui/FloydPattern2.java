package com.cg.tsw.ui;

import java.util.*;

public class FloydPattern2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++) {
			int k=i%2==1?1:0;
			for(int j=1;j<=row;j++) {
				if(j<=i) {
					System.out.print(k+"\t");
					k++;
					if(k>1) {
						k=k-2;
					}
				}
			}
			System.out.println();		
		}
		sc.close();
	}
}