package practice;

public class FindMinOfArray {

	public static int min(int arr[]) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++)
			if (min > arr[i])
				min = arr[i];

	return min;
	
	}

public static void main(String[] args) {
	
	int a[]= {35,30,40,55};
	
	min(a);
	
	System.out.println(min(a));
	
	
	
}








}
