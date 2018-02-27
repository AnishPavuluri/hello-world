package com.test.one;
/**
 * The main class
 * @author Anish
 *
 */
public class TestOne {
	/**
	 * main method it loop from 1 to 100, it will
	 * print BizzAppz if multiples of both three and five,
	 * print Bizz if multiples of three 
	 * print Appz if multiples of five
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%15 == 0) {
				System.out.println("BizzAppz");
			} else if(i%3 == 0) {
				System.out.println("Bizz");
				
			} else if(i%5 == 0) {
				System.out.println("Appz");
				
			} else {
				System.out.println(i);
			}
		}
	}
}
