package MIU;

import java.util.ArrayList;
import java.util.List;

public class First14PrimeHappy {

	static int primeFactor (int n) {
		if (n <= 2) return 0;
		int original = n;
		int sum = 0;
		// Declaring the variables
        int x, y, flg;
 
        // Using for loop for traversing all
        // the numbers from 1 to n
        for (x = 1; x < n; x++) {
 
            // Omit 0 and 1 as they are
            // neither prime nor composite
            if (x == 1 || x == 0)
                continue;
 
            // Using flag variable to check
            // if x is prime or not
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
 
            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
            	sum += x;
        }
		if (sum % original == 0)
			return 1;
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeFactor(5));
		System.out.println(primeFactor(25));
		System.out.println(primeFactor(32));
		System.out.println(primeFactor(9));
		System.out.println(primeFactor(2));

	}
}
