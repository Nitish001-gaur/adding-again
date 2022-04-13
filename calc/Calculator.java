package com.wipro.calc;
import java.util.Scanner;

public class Calculator {
	//starting point of java
	public static void main(String args[]) {
		//read input from keyboard
		//new keyword is used to create object
		Scanner scan=new Scanner(System.in);
		//declaring variables
		int numberone,numbertwo,result;
		System.out.println("enter number 1");
		numberone=scan.nextInt();
		System.out.println("enter number 2");
		numbertwo=scan.nextInt();
		result=numberone+numbertwo;
		System.out.println("addition of two numbers "+ result);
		
		
		
		
		
		System.out.println("welcome to stackroute program ");
		
	}

}
