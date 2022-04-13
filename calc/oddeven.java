package com.wipro.calc;
import java.util.Scanner;

public class oddeven {
	public static void main(String args[]) {
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number to check odd or even");
		x=scan.nextInt();
		if(x%2==0) {
			System.out.println("even number");
		
		}
		else {
			System.out.println("odd number");
		}
		
	}
	
	
	

}
