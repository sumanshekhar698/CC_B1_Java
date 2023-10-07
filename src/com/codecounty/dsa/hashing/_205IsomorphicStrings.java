package com.codecounty.dsa.hashing;

import java.util.HashMap;

public class _205IsomorphicStrings {

	public static void main(String[] args) {

		String s = "paper";
		String t = "title";
//		boolean ans = isIsomorphic(s, t);
	}

	private static boolean isIsomorphic(String s, String t) {

		
//		s="foo", t = "bar"
//		st ={[f,b]  , [o,a], }
//		ts = {[b,f] , [a,o], }
		
//		O(n) = n
//		TODO do thiswith one hashmap
		HashMap<Character, Character> st = new HashMap<>();
		HashMap<Character, Character> ts = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);

			if ((st.containsKey(ch1) && st.get(ch1) != ch2) || (ts.containsKey(ch2) && ts.get(ch2) != ch1)) {
				return false;
			}
			
			st.put(ch1, ch2);
			ts.put(ch2, ch1);

		}

		return true;
	}

}
