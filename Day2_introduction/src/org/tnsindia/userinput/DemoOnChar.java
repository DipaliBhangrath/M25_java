package org.tnsindia.userinput;

import java.util.Scanner;

public class DemoOnChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			@SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value of x: ");
			char x=s.nextLine().charAt(8);
			System.out.println("The result is: ");
			System.out.print(x);
		}

	}


