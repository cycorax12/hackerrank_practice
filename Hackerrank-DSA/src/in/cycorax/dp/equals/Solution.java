package in.cycorax.dp.equals;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/equal/problem
 * 
 * @TODO:
 * 	1. FIX RUNTIME TESTCASES FAILURE.
 *  2. FIX EDGE CASE.
 * 
 * @author vo08741
 * 
 */
public class Solution {

	private static PriorityQueue<Integer> minHeap;
	private static PriorityQueue<Integer> maxHeap;
	
	private static LinkedList<ArrayList<Integer>> testCaseList = new LinkedList<ArrayList<Integer>>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();
		for (int i = 0; i < numberOfTestCases; i++) {
			int students = scanner.nextInt();
			scanner.nextLine();
			String chocolates = scanner.nextLine();
			String[] numberStrs = chocolates.split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>(numberStrs.length);
			for (int j = 0; j < numberStrs.length; j++) {
				list.add(Integer.parseInt(numberStrs[j]));
			}
			testCaseList.add(list);
		}
		
		for (ArrayList<Integer> values : testCaseList) {
			System.out.println(findOperationsRequired(values));
		}


	}

	private static int findOperationsRequired(ArrayList<Integer> values) {
		createMinHeap(values); // create min heap
		createMaxHeap(values); // create max heap
		int totalOperation = 0;

		int min = minHeap.peek();
		int max = maxHeap.peek();

		while (min != max) {
			int diff = max - min;
			int newMaxValue = 0;
			if (diff / 5 != 0) {
				int quotient = diff / 5;
				newMaxValue = max - (5 * quotient);
				totalOperation += quotient;
			} else if (diff / 2 != 0) {
				int quotient = diff / 2;
				newMaxValue = max - (2 * quotient);
				totalOperation += quotient;
			} else {
				newMaxValue = max - 1;
				totalOperation += 1;
			}
			updateHeaps(max, newMaxValue);

			min = minHeap.peek();
			max = maxHeap.peek();
		}

		return totalOperation;

	}

	private static void createMinHeap(ArrayList<Integer> values) {
		minHeap = new PriorityQueue<Integer>(values);
	}

	private static void createMaxHeap(ArrayList<Integer> values) {
		maxHeap = new PriorityQueue<Integer>(values.size(),
				new Comparator<Integer>() {

					public int compare(Integer o1, Integer o2) {
						return -(o1 - o2);
					}
				});
		maxHeap.addAll(values);
	}

	private static void updateHeaps(Integer maxValue, Integer valueTobeAdded) {
		minHeap.remove(maxValue);
		maxHeap.remove(maxValue);
		minHeap.add(valueTobeAdded);
		maxHeap.add(valueTobeAdded);
	}

}
