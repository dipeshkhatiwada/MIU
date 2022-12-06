package MIU;

import java.util.ArrayList;
import java.util.List;

public class First7IntegerBasedRounding {
	
	static List<Integer> doIntegerBasedRounding (int [] a, int n) {
		int val = 0;
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i = 0; i < a.length ; i++ ) {
			System.out.print((a[i] /n) * n);
			list1.add((a[i] /n) * n);
		}
		return list1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doIntegerBasedRounding(new int[] {1, 2, 3, 4, 5}, 2));
		System.out.println(doIntegerBasedRounding(new int[] {1, 2, 3, 4, 5}, 3));
		System.out.println(doIntegerBasedRounding(new int[] {1, 2, 3, 4, 5}, -3));
		System.out.println(doIntegerBasedRounding(new int[] {-1, -2, -3, -4, -5}, 3));
		System.out.println(doIntegerBasedRounding(new int[] {-18, 1, 2, 3, 4, 5}, 4));

	}

}
