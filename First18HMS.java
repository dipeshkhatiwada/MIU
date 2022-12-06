package MIU;

import java.util.Arrays;

public class First18HMS {
	static int[] computeHMS (int sec) {
		int[] arr = new int[3];
		if (sec <= 0) return arr;
		arr[0]= sec / 3600;
		sec = sec % 3600;
		arr[1] = sec / 60;
		sec = sec % 60;
		arr[2] = sec;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(computeHMS(3735)));
		System.out.println(Arrays.toString(computeHMS(380)));
		System.out.println(Arrays.toString(computeHMS(3650)));
		System.out.println(Arrays.toString(computeHMS(55)));
		System.out.println(Arrays.toString(computeHMS(0)));
		
		
		

	}

}
