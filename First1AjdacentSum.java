package MIU;

public class First1AjdacentSum {
	static int LargestAdjacentSum (int [] a) {
		if(a.length == 0) return 0;
		int max = a[0] + a[1];
		for(int i=2; i<a.length; i++ ) {
			if((a[i-1]+a[i]) > max) {
				max = a[i-1]+a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LargestAdjacentSum(new int[] {5,14,3,4}));
		System.out.println(LargestAdjacentSum(new int[] {18, -12, 9, -10}));
		System.out.println(LargestAdjacentSum(new int[] {1,1,1,1,1,1,1,1,1}));
		System.out.println(LargestAdjacentSum(new int[] {1,1,2,1,1,1,1,1,1}));

	}

}
