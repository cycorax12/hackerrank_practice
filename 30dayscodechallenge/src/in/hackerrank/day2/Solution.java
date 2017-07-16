package in.hackerrank.day2;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int j = scan.nextInt();
		double k = scan.nextDouble();
		scan.nextLine();
		String s2 = scan.nextLine();
		
		System.out.println(i+j);
		System.out.println(d+k);
		System.out.println(s+s2);

		scan.close();
	}

}
