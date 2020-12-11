/**
 * 
 */
package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author 16476
 *
 */
public class DiceGame {
	static int sum = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] result = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < 5; i++) {
			sum = 0;
			Roll(result);
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println("Total " + i + " occured " + result[i] + " times.");
		}

	}

	public static void Roll(int[] result) {
		ArrayList<Integer> aryList = new ArrayList<Integer>();
		aryList.add(new Random().nextInt(11) + 1);
		aryList.add(new Random().nextInt(11) + 1);
		aryList.add(new Random().nextInt(11) + 1);
		aryList.add(new Random().nextInt(11) + 1);
		aryList.add(new Random().nextInt(11) + 1);

		RollDice(aryList, aryList.size());

		if (sum == 0) {
			result[0]++;
		} else if (sum == 1) {
			result[1]++;
		} else if (sum == 2) {
			result[2]++;
		} else if (sum == 3) {
			result[3]++;
		} else if (sum == 4) {
			result[4]++;
		} else if (sum == 5) {
			result[5]++;
		} else if (sum == 6) {
			result[6]++;
		} else if (sum == 7) {
			result[7]++;
		} else if (sum == 8) {
			result[8]++;
		} else if (sum == 9) {
			result[9]++;
		} else if (sum == 10) {
			result[10]++;
		} else if (sum == 11) {
			result[11]++;
		} else if (sum == 12) {
			result[12]++;
		} else {

		}
	}

	public static void RollDice(ArrayList<Integer> aryList, int size) {

		if (size != 5) {
			for (int i = 0; i < size; i++) {
				aryList.add(new Random().nextInt(11) + 1);
			}
		}
		for (int i = 0; i < aryList.size(); i++) {
			int j = aryList.get(i);
			if (j == 3) {
				aryList.remove(i);
			} else {

			}
		} // Remove 3's from List

		sum += getLowestNumber(aryList);

		if (aryList.size() != 0) {
			ArrayList<Integer> ls = new ArrayList<Integer>();
			RollDice(ls, aryList.size());
		}
	}

	public static int getLowestNumber(ArrayList<Integer> ary) {
		int lowestNumber = Collections.min(ary);
		ary.remove(ary.indexOf(lowestNumber)); // Remove Lowest Number
		return lowestNumber;
	}

	public static void printArrayList(ArrayList<Integer> ary) {
		for (int i : ary) {
			System.out.print(i + " ");
		}
	}

}
