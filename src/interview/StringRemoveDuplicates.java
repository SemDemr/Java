package interview;

import java.util.HashMap;
import java.util.Map;

public class StringRemoveDuplicates {

	public static void main(String[] args) {

		/*
		 * Write function that can remove the duplicated values from String
		 * 
		 * Ex:removeDup("AAABBBCCC") ==> ABC
		 */

		System.out.println(removeDuplicates("AAABBBCCC"));
		System.out.println(countSameLetter("AAABBBCCC"));

	}

	public static String removeDuplicates(String str) {
		// str.toCharArray
		// put that in a Set
		// we still need to return a string

		// we can start with an empty string
		// concatenate chars to string if it does not contain it
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (!result.contains("" + str.charAt(i)))// if the result String contains a certain char, then do not
														// concatenate
			{
				result += "" + str.charAt(i);

			}
		}

		return result;

	}

	// in case we need to count the letters.

	public static Map<Character, Integer> countSameLetter(String str) {

		Map<Character, Integer> count = new HashMap();

		for (int i = 0; i < str.length(); i++) {

			// if the map contains a letter as a key, we update the number +1
			// if the map does not contain a letter as a key, then we add the key:value as
			// (letter:1)

			if (count.containsKey(str.charAt(i))) {
				count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
			} else {
				count.put(str.charAt(i), 1);
			}

		}

		// System.out.println(count);
		return count;

	}

}
