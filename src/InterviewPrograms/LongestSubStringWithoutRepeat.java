package InterviewPrograms;

import java.util.HashSet;

public class LongestSubStringWithoutRepeat {

	public static void main(String[] args) {
		String str = "abcdab";
		System.out.println(longestSubString(str));

	}

	public static String longestSubString(String str) {

		HashSet<Character> hs = new HashSet<Character>();

		String LongestTillNow = "";
		String LongestOverall = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hs.contains(c)) {
				LongestTillNow = "";
				hs.clear();

			}
			hs.add(c);
			LongestTillNow += c;
			if (LongestTillNow.length() > LongestOverall.length()) {
				LongestOverall = LongestTillNow;
			}

		}

		return LongestOverall;

	}
}
