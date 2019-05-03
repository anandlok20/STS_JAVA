/**
 * 
 */
package com.core;

import java.util.Scanner;

/**
 * @author Anand Lok
 *
 */
public class ExceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter two numbers:");
			int res=sc.nextInt()/sc.nextInt();
			System.out.println("Result = "+res);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		if(sc!=null)
			sc.close();
	}
}
