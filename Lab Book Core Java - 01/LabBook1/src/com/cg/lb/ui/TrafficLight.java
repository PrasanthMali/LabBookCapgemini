package com.cg.lb.ui;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose traffic light number: \n1.Red\n2.Yellow\n3.Green");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Stop");break;
		case 2:System.out.println("Wait");break;
		case 3:System.out.println("Go");break;
		default:System.out.println("Invalid input!");
		}
		sc.close();
	}

}