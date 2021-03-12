package com.cg.tsw.ui;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of matrix: ");
		int [][]firstMatrix=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				firstMatrix[i][j]=sc.nextInt();
			}
		}
		int [][]transpose=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]=firstMatrix[j][i];
			}
		}
		boolean check=true;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(transpose[i][j]!=firstMatrix[i][j]) {
					check=false;
					break;
				}
			}
		}
		if(check) {
			System.out.println("The entered matrix is a symmetric matrix.");
		}
		else {
			System.out.println("The entered matrix is not a symmetric matrix.");
		}
		sc.close();
	}
}