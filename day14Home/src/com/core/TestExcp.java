/**
 * 
 */
package com.core;

/**
 * @author Anand Lok
 *
 */
public class TestExcp {

	/**
	 * @param args
	 */
		public static void main(String[] args) 
				throws Exception/*InterruptedException,IOException*/ {

			System.out.println("Before");
			Thread.sleep(1000);
			System.out.println("After");
			System.in.read();

			System.out.println("main over");
		}
	}