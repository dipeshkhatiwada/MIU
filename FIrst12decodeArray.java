package MIU;

public class FIrst12decodeArray {
	
	static int decodeArray (int [] a) {
		if(a.length <= 1) return 0;
		String max = "";
		int counter = 0;
		if (a[0] == -1 ) return -1;
		for(int i=0; i< a.length; i++ ) {
			if (a[i] == 0) {
				counter++;
			}
			if (a[i] == 1) {
				max = max +""+ counter;
				counter = 0;
			}
		}
		return Integer.parseInt(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decodeArray(new int[] {1}));
		System.out.println(decodeArray(new int[] {0, 1}));
		System.out.println(decodeArray(new int[] {-1, 0, 1}));
		System.out.println(decodeArray(new int[] {0, 1, 1, 1, 1, 1, 0, 1}));
		System.out.println(decodeArray(new int[] {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));

	}

}
