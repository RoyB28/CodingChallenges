/**
 * 
 */
package com.revature;

/**
 * @author roybernstein
 *
 */
public class PerfectNumber {
	public static void isPerfect (int n) {
		System.out.println("Is number " + n + " perfect?");
		if (n==1) {
			System.out.println("False, not perfect");
		}
		int sum = 1;
		for(int i = 2; i < n; i++) {
			if(n%i==0) {
				sum += i;
			}
		}
		if (sum==n) {
			System.out.println("Yes, it is perfect");
		}
		else {
			System.out.println("No, it is not perfect");
		}
	}
	public static void main(String[] args) {
		isPerfect(6);
		System.out.println("\n");
		isPerfect(28);
		System.out.println("\n");
		isPerfect(496);
		System.out.println("\n");
		isPerfect(12);
		System.out.println("\n");
		isPerfect(97);
		System.out.println("\n");
	}
}
