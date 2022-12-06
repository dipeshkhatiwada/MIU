package MIU;

public class FIrst8CubePowerful {
	static int isCubePowerful (int n) {
		if (n == 1) return 1;
		if(n < 10) return 0;
		int currentVal = n;
		int newVal = 0;
		int num = 0;
		while(n > 0) {
			num = n % 10;
			newVal += (num * num * num);
			n = n/10;
		}
		if(newVal == currentVal) return 1;
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCubePowerful(153));
		System.out.println(isCubePowerful(370));
		System.out.println(isCubePowerful(371));
		System.out.println(isCubePowerful(407));
		System.out.println(isCubePowerful(87));
		System.out.println(isCubePowerful(0));
		System.out.println(isCubePowerful(-81));


	}
	

}
