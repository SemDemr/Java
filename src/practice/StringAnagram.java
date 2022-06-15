package practice;

import java.util.Arrays;

public class StringAnagram {

	/*
	 * Write a function that check if a string is build out of the same letters as
	 * another string. Ex: same("abc", "cab"); -> true same("abc", "abb"); -> false:
	 * 
	 * Anagram - strings made up of the same chars
	 */

	// input ------ output
	// abbbbc, aaaabc true
	// abc, abc

	public static void main(String[] args) {

		String str1 = "semademir";
		String str2 = "semihademir";

		System.out.println(same(str1, str2));

	}

	public static boolean same(String str1, String str2) {

		char[] cs1 = str1.toCharArray();
		char[] cs2 = str2.toCharArray();

		Arrays.sort(cs1);
		Arrays.sort(cs2);

		String a1 = "";
		String a2 = "";

		for (char c : cs1) {
			if (!a1.contains(c + "")) {
				a1 += c;
			}
		}

		for (char c : cs2) {
			if (!a2.contains(c + "")) {
				a2 += c;
			}
		}

		return a1.equals(a2);

	}

}
