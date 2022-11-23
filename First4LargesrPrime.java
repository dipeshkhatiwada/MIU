package MIU;

public class First4LargesrPrime {
	
	static int largestPrimeFactor (int n) {
		if (n <= 1) return 0;
		int max = 1;
		for(int i = 2; i < n/2; i++) {
			if (n%i == 0) {
				if (max < i) max = i;
				n = n / i;
				
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestPrimeFactor(10));
		System.out.println(largestPrimeFactor(6936));
		System.out.println(largestPrimeFactor(1));
		
		
		

	}

}
