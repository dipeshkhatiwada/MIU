package MIU;

import java.util.*;

public class First5PrimeNumber {
	
	static List<Integer> primeFactor (int n) {
		List<Integer> list1 = new ArrayList<Integer>();
		if (n == 1) return list1;
		for(int i = 2; i < n; i++) {
			while (n%i == 0) {
//				System.out.println(i+" ");
				list1.add(i);
				n = n / i;
			}
		}
		list1.add(n);
		return list1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeFactor(2));
		System.out.println(primeFactor(5));
		System.out.println(primeFactor(14));
		System.out.println(primeFactor(24));
		System.out.println(primeFactor(1200));
		System.out.println(primeFactor(1));
		System.out.println(primeFactor(-18));

	}

}
