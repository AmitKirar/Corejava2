package com.rays.java2;

import java.util.Scanner;

public class Calculatesimpleimterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle");
		float p = sc.nextFloat();

		System.out.println("enter rate");
		float r = sc.nextFloat();
		System.out.println("enter time");
		float t = sc.nextFloat();

		float si = (p * r * t) / 100;

		// System.out.println("principle = " + p + ",rate = " + r + " ,time = " + t + "
		// ,simple interest = " + si);

		System.out.println(" rate" + r);
		System.out.println("time" + t);
		System.out.println("simple interest" + si);

	}

}
