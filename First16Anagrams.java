package MIU;

import java.util.*;

public class First16Anagrams {
	static int areAnagrams (char [ ] a1, char [ ] a2) {
		if (a1.length != a2.length)
			return 0;
		Arrays.sort(a1);
		Arrays.sort(a2);
		for(int i = 0; i < a1.length ; i++ ) {
			if(a1[i] != a2[i] )
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 't', 's'}));
		System.out.println(areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 'd', 's'}));
		System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 't'}));
		System.out.println(areAnagrams(new char[] {'b', 'o', 'g'}, new char[] {'b', 'o', 'o'}));
		System.out.println(areAnagrams(new char[] {}, new char[] {}));
		System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 'g'}));

	}
}
