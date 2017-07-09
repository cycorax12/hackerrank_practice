package com.cycorax.cci;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A left rotation operation on an array of size  shifts each of the array's elements 1 unit to the left. 
 * For example, if 2 left rotations are performed on array [1,2,3,4,5]  , then the array would become [3,4,5,1,2].
 * @author Virendra
 *
 */
public class LeftArrayRotation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] output = arrayLeftRotation(a, k);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();
	}

	private static int[] arrayLeftRotation(int[] a, int k) {
		int[] output = new int[a.length];
		int j = 0;
		for (int i = k; i < a.length; i++) {
			output[j] = a[i];
			j++;
		}
		for (int i = 0; i < k; i++) {
			output[j] = a[i];
			j++;
		}

		return output;
	}
}
