package MIU;

public class FIrst11DigitIncreasing {
	public static int isDigitIncreasing (int a, int n) {
		int counter = 1;
		int sum = 0;
		int oldVal = a;
		while ( a != 0) {
			sum += n*counter;
			counter = (counter *10) + 1;
			a = a/10;
		}
		if (sum == oldVal) return 1;
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDigitIncreasing(7, 7));
		System.out.println(isDigitIncreasing(36, 3));
		System.out.println(isDigitIncreasing(984, 8));
		System.out.println(isDigitIncreasing(7404, 6));
		System.out.println(isDigitIncreasing(7404, 2));

	}

}
