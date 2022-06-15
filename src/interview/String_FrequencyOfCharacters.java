package interview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class String_FrequencyOfCharacters {

	public static void main(String[] args) {

		/*
		 * Write function that can find the frequency of characters Ex:
		 * FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
		 * 
		 * "ABABABADDDDCA"
		 */

		System.out.println(characterFrequency("AAABBCDD"));
		System.out.println(characterFrequency("ABABABADDDDCA"));

	}

	// idea 1: use a map <Char.. , Integ..>, and count for each char
	// step 1: generate the map by checking each char
	// step 2: print the map as a string

	// idea 2: use a Set to build a String
	// [A, B, C, D] ->> ABCD
	// loop on the unique elements and count how many of each exist
	
	
	//idea 3: many nested loop ways to deal with this
		//loop on str length
			//loop again on str length
				// check if the letters are the same
				// add the letter and the counter to the result String
	

	public static String characterFrequency(String str) {
		//create a string with all the elements (order and remove duplicates
		String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
		System.out.println(b);
		
		//get the unique string (elements appearing only once)
		b = b.replace("[", "").replace(", ", "").replace("]", ""); // "ABCD"
		// [A, B, C, D] --> A, B, C, D] --> ABCD] --> ABCD

		String result = "";
		//this loops on the unique string (ABCD)
		for (int i = 0; i < b.length(); i++) {
			int count = 0;
			// loop to count the letters on the original string
			for (int j = 0; j < str.length(); j++) {
				// "AAABBCDD"
				//comparing the current letter on the original string, with the current letter of the 
				//unique string
				if (str.substring(j, j + 1).equals("" + b.charAt(i))) {
					count++;
				}
			}
			//after we are done with each letter on the unique string, add the letter and counter 
			//to the result
			result += b.substring(i, i + 1) + count;
		}

		return result;
	}

}
