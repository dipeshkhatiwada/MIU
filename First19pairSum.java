package MIU;

import java.util.Arrays;

public class First19pairSum {
	static int[] pairwiseSum (int [] a) {
		if (a.length == 0  ||a.length % 2 != 0) {
			return null;
		}
		int[] arr = new int[a.length/2];
		int arrCount = 0;
		for(int i = 0; i < a.length ; i =i+2  ) {
			arr[arrCount] = a[i] + a[i+1];
			arrCount++;
				
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18, -5})));
		System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18, -5, -5, -15, 0, 0, 1, -1})));
		System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18})));
		System.out.println(Arrays.toString(pairwiseSum(new int[] {})));
	}

}
