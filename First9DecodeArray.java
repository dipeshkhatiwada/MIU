package MIU;

public class First9DecodeArray {

	static int decodeArray (int [] a) {
		if(a.length == 0) return 0;
		String max = "";
		int val = 0;
		if (a[0] < 0 ) max = "-";
		for(int i=1; i<a.length; i++ ) {
			val = Math.abs(a[i-1] - a[i]);
			max += val;
		}
		return Integer.parseInt(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decodeArray(new int[] {0, -3, 0, -4, 0}));
		System.out.println(decodeArray(new int[] {-1, 5, 8, 17, 15}));
		System.out.println(decodeArray(new int[] {1, 5, 8, 17, 15}));
		System.out.println(decodeArray(new int[] {111, 115, 118, 127, 125}));
		System.out.println(decodeArray(new int[] {1, 1}));

	}

}
