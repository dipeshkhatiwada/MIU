package MIU;

public class HAsMaximum {
	static int hasSingleMaximum (int [] array) {
		if(array.length == 0) return 0;
		int max = array[0];
		boolean repeated  = false;
		for(int i=1; i<array.length; i++ ) {
			if(array[i] > max) {
				max = array[i];
				repeated = false;
			} else if(max == array[i]) {
				repeated = true;
			}
		}
		if(repeated) return 0;
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSingleMaximum(new int[] {1,2,3,1,0}));
		System.out.println(hasSingleMaximum(new int[] {18}));
		System.out.println(hasSingleMaximum(new int[] {1,2,3,0,1,3}));
		System.out.println(hasSingleMaximum(new int[] {13,1,3,2,13,0,13,1,13}));
		System.out.println(hasSingleMaximum(new int[] {}));
		System.out.println(hasSingleMaximum(new int[] {-6,-6,-6,-6,-6}));

	}

}
