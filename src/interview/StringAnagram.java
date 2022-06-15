package interview;

import java.util.Arrays;
import java.util.TreeSet;

public class StringAnagram {

	/*
	 * Write a function that check if a string is build out of the same letters as
	 * another string. 
	 * Ex: same("abc", "cab"); -> true 
	 *     same("abc", "abb"); -> false:
	 * 
	 * Anagram - strings made up of the same chars
	 */
	
	
	//input 										------                                   output
	//abbbbc, aaaabc																		 true																					
	//abc, abc				
	
	public static void main(String[] args) {

		System.out.println(same("abc", "cabbbbbb"));
		System.out.println(SAME("abc", "cabbbbbb"));
		
	}

	
	//solution 1
	public static boolean same(String str1, String str2)
	{
		char[] cs1 = str1.toCharArray();
		char[] cs2 = str2.toCharArray();
		
		Arrays.sort(cs1); //abbbc  ----> abc
		Arrays.sort(cs2);// abcccc ----> abc	
		
		//1. order does not matter
		//2. what about repetition? lets allow repetition
		
		//if we allow repetition
		
		String a1 = "";
		String a2 = "";
		
		for (char c: cs1)
		{
			//to remove duplicated
			if(!a1.contains(c+""))
			{
				a1+=c;
			}
		}
		
		for (char c: cs2)
		{
			//to remove duplicated
			if(!a2.contains(c+""))
			{
				a2+=c;
			}
		}
		
		
		/*
		 * //if we dont allow repetition
		 * 
		 * if(cs1.length == cs2.length) { for (int i = 0; i < cs1.length;i++) {
		 * if(cs1[i]==cs2[i]) {
		 * 
		 * } else { return false; } }
		 * 
		 * }
		 */
		
		return a1.equals(a2);
	}
	
	//solution 2
	public static boolean SAME(String str1, String str2)
	{
		//if we use a treeSet, then we are already ordering letter and also keeping only unique values

		//abcc  , abd
		//	("a","b","c")				split all the chars in the str1 and keep them as String ("a","b","c","c"))
		/*
		 * String a1, a2;
		 * 
		 * TreeSet<String> ts1 = new TreeSet<String>();
		 * ts1.addAll(Arrays.asList(str1.split(""))); System.out.println(ts1); a1 =
		 * ts1.toString(); System.out.println(a1);
		 * 
		 * TreeSet<String> ts2 = new TreeSet<String>();
		 * ts2.addAll(Arrays.asList(str2.split(""))); System.out.println(ts2); a2 =
		 * ts2.toString(); System.out.println(a2);
		 */
		
		
		String a1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
		String a2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
		
		
		
		
		return a1.equals(a2);
	}
	
	
	
	
	
}
