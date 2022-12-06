package MIU;

public class First13OnionArray {
	static int isOnionArray (int [] a) {
		if(a.length <= 1) return 1;
		if (a[0] + a[a.length -1] <= 10 && a[1] + a[a.length -2] <= 10) return 1;
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isOnionArray(new int[] {1, 2, 19, 4, 5}));
		System.out.println(isOnionArray(new int[] {1, 2, 3, 4, 15}));
		System.out.println(isOnionArray(new int[] {1, 3, 9, 8}));
		System.out.println(isOnionArray(new int[] {2}));
		System.out.println(isOnionArray(new int[] {}));
		System.out.println(isOnionArray(new int[] {-2, 5, 0, 5, 12}));

	}

}
