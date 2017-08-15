package com.cycorax.cci;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-contacts
 * 
 * @author Virendra
 * 
 */
public class TriesContact {
	private static String ADD = "add";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int operations = scan.nextInt();
		scan.nextLine();

		TrieNode root = new TrieNode("");
		for (int i = 0; i < operations; i++) {
			String input = scan.nextLine();
			String[] inputArr = input.split(" ");
			if (inputArr[0].equals(ADD)) {
				root.add(root, inputArr[1]);
			} else {
				System.out.println(root.find(root, inputArr[1]));
			}
		}

		scan.close();

	}
}

/**
 * Trie DS Node.
 * 
 * @author Virendra
 * 
 */
class TrieNode {

	private String data;
	private HashMap<Character, TrieNode> childrens;

	public TrieNode(String data) {
		this.data = data;
		this.childrens = new HashMap<Character, TrieNode>();
	}

	/**
	 * Adds String to Trie.
	 * 
	 * @param node
	 * @param name
	 */
	public void add(TrieNode node, String name) {
		add(node, name, 0);
	}

	private void add(TrieNode node, String name, int index) {
		if (index > name.length() - 1) {
			return;
		}
		Character curr = name.charAt(index);
		if (!node.getChildrens().containsKey(curr)) {
			node.getChildrens().put(curr, new TrieNode(curr.toString()));
		}
		add(node.getChildrens().get(curr), name, index + 1);

	}

	/**
	 * Finds number of strings available for given prefix.
	 * 
	 * @param node
	 * @param partial
	 * @return
	 */
	public int find(TrieNode node, String partial) {
		return find(node, partial, 0);
	}

	private int find(TrieNode node, String partial, int index) {
		if (index > partial.length() - 1) {
			return node.getChildrens().size() + 1;
		}
		Character curr = partial.charAt(index);
		if (node.getChildrens().containsKey(curr)) {
			return find(node.getChildrens().get(curr), partial, index + 1);
		} else {
			return 0;
		}
	}

	public HashMap<Character, TrieNode> getChildrens() {
		return childrens;
	}

}
