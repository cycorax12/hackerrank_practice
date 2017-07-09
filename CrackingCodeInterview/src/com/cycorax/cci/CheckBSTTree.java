package com.cycorax.cci;

import java.util.LinkedList;
import java.util.List;

/**
 * Check if given tree is BST or not.
 * @author Virendra
 *
 */
public class CheckBSTTree {
	private static List<Integer> traveresedList = new LinkedList<>();

	static boolean checkBST(Node root) {
		inorderTraversal(root);
		return checkIfListSorted(traveresedList);
	}

	private static boolean checkIfListSorted(List<Integer> traveresedList) {

		for (int i = 0; i < traveresedList.size() - 1; i++) {
			if (traveresedList.get(i) < traveresedList.get(i + 1)) {
				continue;
			}
			return false;
		}
		return true;
	}

	/**
	 * Traverse list using In-order traversal to get list in sorted order.
	 * 
	 * @param root
	 */
	private static void inorderTraversal(Node root) {
		if (root == null) {
			return;
		}
		inorderTraversal(root.left);
		traveresedList.add(root.data);
		inorderTraversal(root.right);
	}

	public static void main(String[] args) {
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(7);
		System.out.println(checkBST(root));
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		super();
		this.data = data;
	}

}
