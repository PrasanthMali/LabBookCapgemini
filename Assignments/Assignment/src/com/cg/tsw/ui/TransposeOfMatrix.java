package com.cg.tsw.ui;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first matrix : ");
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
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}