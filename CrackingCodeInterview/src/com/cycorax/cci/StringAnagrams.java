package com.cycorax.cci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Given two strings, 'a' and 'b', that may or may not be of the same length,
 * determine the minimum number of character deletions required to make 'a' and
 * 'b' anagrams. Any characters can be deleted from either of the strings
 * 
 * @author Virendra
 * 
 */
public class StringAnagrams {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

	public static int numberNeeded(String first, String second) {
		int count = 0;
		List<String> secondList = new ArrayList<>(Arrays.asList(second.split("")));
		String[] firstArr = first.split("");
		for (int i = 0; i < firstArr.length; i++) {
			if (secondList.contains(firstArr[i])) {
				secondList.remove(firstArr[i]);
			} else {
				count++;
			}
		}

		return count + secondList.size();
	}

}
