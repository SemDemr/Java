package practice;

public class ReverseOfSecondWord {

	public static void main(String[] args) {

		String str = "I Love Java";
		System.out.print(reverseOfSecondWord(str));

	}

	public static String reverseOfSecondWord(String str) {

		String[] strArr = str.split(" ");
		String str3 = "";
		String str2 = strArr[1];
		int i, j;
		char[] cr = str2.toCharArray();
		for (i = 0; i < strArr.length; i++) {
			for (j = cr.length - 1; j >= 0; j--) {

			}
			str3 = strArr[i] + cr[j];

		}

		return str3;

	}

}
