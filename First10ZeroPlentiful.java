package MIU;

public class First10ZeroPlentiful {
	static int isZeroPlentiful (int [] a) {
		if(a.length == 0) return 0;
		int counter = 0;
		int val = 0;
		for(int i=0; i<a.length - 1; i++ ) {
			if (a[i] == 0) {
				counter++;
			} else {
				if (counter >= 4 ) {
					val ++;
					counter = 0;
				} else if ( counter > 0 && val == 0) {
					return 0;
				}
			}
			
		}
		if(counter != 0) val++;
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isZeroPlentiful(new int[] {0, 0, 0, 0, 0}));
		System.out.println(isZeroPlentiful(new int[] {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
		System.out.println(isZeroPlentiful(new int[] {0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0}));
		System.out.println(isZeroPlentiful(new int[] {1, 2, 3, 4}));
		System.out.println(isZeroPlentiful(new int[] {1, 0, 0, 0, 2, 0, 0, 0, 0}));

	}

}
