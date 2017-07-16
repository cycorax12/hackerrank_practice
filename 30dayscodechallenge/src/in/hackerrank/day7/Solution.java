package in.hackerrank.day7;

import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfTestCases = in.nextInt();
		String[] inputs = new String[numberOfTestCases];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = in.next();
		}
		for (String input : inputs) {
			String evenStr = "";
			String oddStr = "";
			for (int i = 0; i < input.length(); i++) {
				if (i % 2 == 0) {
					evenStr += input.charAt(i);
				} else {
					oddStr += input.charAt(i);
				}
			}
			System.out.format("%s %s%n", evenStr, oddStr);
		}
	}

}
