package com.Assignment2.java;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		
		int length;
		System.out.println("Enter x1");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		System.out.println("Enter x2");
		int x2 = sc.nextInt();
		System.out.println("Enter y1");
		int y1 = sc.nextInt();
		System.out.println("Enter y2");
		int y2 = sc.nextInt();
		System.out.println("x1 : " + x1 );
		System.out.println("x2 : " + x2 );
		System.out.println("y1 : " + y1 );
		System.out.println("y2 : " + y2 );
		length = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
		System.out.println(length);
		
	}

}
