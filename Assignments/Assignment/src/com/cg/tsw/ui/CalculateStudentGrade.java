package com.cg.tsw.ui;

import java.util.*;

public class CalculateStudentGrade {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks in first subject : ");
		double firstSubjectMarks=sc.nextDouble();
		System.out.println("Enter marks in second subject : ");
		double secondSubjectMarks=sc.nextDouble();
		System.out.println("Enter marks in third subject : ");
		double thirdSubjectMarks=sc.nextDouble();
		double averageOfAllThreeSubjectMarks=(firstSubjectMarks+secondSubjectMarks+thirdSubjectMarks)/3.0;
		
		if(firstSubjectMarks >=35 && secondSubjectMarks>=35 && thirdSubjectMarks>=35) {
			if(averageOfAllThreeSubjectMarks>70) {
				System.out.println("E grade");
			}else if(averageOfAllThreeSubjectMarks>=60 && averageOfAllThreeSubjectMarks<70) {
				System.out.println("A grade!");
			}else if(averageOfAllThreeSubjectMarks>=50 && averageOfAllThreeSubjectMarks<60) {
				System.out.println("B grade!");
			}
			else if(averageOfAllThreeSubjectMarks>=35 && averageOfAllThreeSubjectMarks<50) {
				System.out.println("C grade!");
			}
			else {
				System.out.println("Fail!");
			}
		}
		else {
			System.out.println("The reason for failure is marks are less then 35.");
		}
		sc.close();
	}
}