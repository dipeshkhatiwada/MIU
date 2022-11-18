package MIU;

public class First2ContenatedSum {
	static int checkConcatenatedSum (int n, int catlen) {
		if(n % 10 == 0 || catlen % 10 == 0) return 0;
		if(n % 10 == 1 && catlen == 1 ) return 1;
		int catVal = 1;
		for (int i = 1; i < catlen; i++) {
			catVal = catVal * 10 + 1;
		}
		int currentVal = n;
		int newVal = 0;
		int num = 0;
		while(n > 0) {
			num = n % 10;
			newVal += num * catVal;
			n = n/10;
		}
		if(newVal == currentVal) return 1;
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkConcatenatedSum(198, 2));
		System.out.println(checkConcatenatedSum(198, 3));
		System.out.println(checkConcatenatedSum(2997, 3));
		System.out.println(checkConcatenatedSum(2997, 2));
		System.out.println(checkConcatenatedSum(13332, 4));
		System.out.println(checkConcatenatedSum(9, 1));


	}

}
