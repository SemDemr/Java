package practice;

public class RemoveExtraSpaceFromAString {
	/**
	 * Remove All Extra Space from String Input: " Hello world I love Java " Output:
	 * Hello world I love Java
	 */
	public static void main(String[] args) {

		String str1 = "  Hello world      I      love      Java    ";
		// silly way
		// String str2 = str.replace(" ", " ").trim();

		// System.out.println(str2);

		//

		String str = str1.trim();

		String[] str2 = str.split(" ");

		String str3 = "";

		int i = 0;

		for (i = 0; i < str2.length; i++) {
			
			char[] arr = str2[i].toCharArray();

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] != ' ') {

					str3 += arr[j];
				}
				if(j==arr.length-1) {
					str3 += " ";
				}
			}
			
		}

		System.out.println(str3);
	
	System.out.println(removeExtraSpace(str1));
	
	
	}

	public static String removeExtraSpace(String str1) {

		
		String str = str1.trim();

		String[] str2 = str.split(" ");

		String str3 = "";

		int i = 0;

		for (i = 0; i < str2.length; i++) {
			
			char[] arr = str2[i].toCharArray();

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] != ' ') {

					str3 += arr[j];
				}
				if(j==arr.length-1) {
					str3 += " ";
				}
			}
			
		}

		return str3;
	}

}
