/**
 * 
 */
package com.revature;

/**
 * @author roybernstein
 *
 */

public class QuadraticRoot {
	public static int quadEq(int a, int b, int c) {
		return (int) Math.ceil(((-b/(2*a)) + Math.sqrt(Math.pow(b, 2) - (4*a*c))/(2*a)));
	}
	
	public static void main(String[] args) {
		System.out.println(quadEq(1, 2, -3));
		System.out.println(quadEq(2, -7, 3));
		System.out.println(quadEq(1, -12, -28));
	}
}