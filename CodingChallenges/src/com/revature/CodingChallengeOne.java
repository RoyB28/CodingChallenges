/**
 * 
 */
package com.revature;

import java.util.Arrays;

/**
 * @author roybernstein
 *
 */
public class CodingChallengeOne {
		public static int[] selectiveReverse(int[] array, int num) {
			if (array.length<1) {
				return array;
			}
			int[] sortedArray = new int[array.length];
			if (array.length <= num) {
				for(int i=0; i<array.length; i++) {
					sortedArray[i] = array[array.length-i-1];
			}
			}
			else {
				for(int i=0; i<array.length; i++) {
					int reverseMax = i+num;
					if(reverseMax >= array.length) {
						reverseMax = array.length;
					}
					for (int x = 0; x < num; x++) {
						if(i+x > array.length-1) {
							break;
						}
						sortedArray[i+x] = array[reverseMax-x-1];
						sortedArray[reverseMax-x-1] = array[i+x];
					}
					i+=num-1;
				}

}
			return sortedArray;
}
		public static void main(String[] args) {
			int[] array = {1,3,5,7,9,11};
			System.out.println(Arrays.toString(selectiveReverse(array, 2)));
		}
}