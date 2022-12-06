package MIU;

public class First15largestDifferenceOfEvens {
	static int largestDifferenceOfEvens (int [] a) {
		int max = 0;
		int min = 0;
		int counter = -1;
		for(int i = 0; i < a.length ; i++ ) {
			if(a[i] % 2 ==0 ) {
				if (max == 0 || max < a[i])
					max = a[i];
				if (min == 0 || min > a[i])
					min = a[i];
				counter++;
			}
				
		}
		if (counter <= 0)
			return -1;

		if (max == 0 || min == 0)
			return -1;
		return max - min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestDifferenceOfEvens(new int[] {1, 3, 5, 9}));
		System.out.println(largestDifferenceOfEvens(new int[] {1, 18, 5, 7, 33}));
		System.out.println(largestDifferenceOfEvens(new int[] {2, 2, 2, 2}));
		System.out.println(largestDifferenceOfEvens(new int[] {1, 2, 1, 2, 1, 4, 1, 6, 4}));

	}

}
