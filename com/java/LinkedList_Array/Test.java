package com.java.LinkedList_Array;

import java.util.Scanner;



class Test {

	static int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}

		return (p == 0) ? 1 : n * power(n, p - 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String inputSentence = in.nextLine();
			String[] result = inputSentence.split("  ");
			try {
				System.out.println(power(Integer.parseInt(result[0]),
						Integer.parseInt(result[1])));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		// Write your code here.
	}
}