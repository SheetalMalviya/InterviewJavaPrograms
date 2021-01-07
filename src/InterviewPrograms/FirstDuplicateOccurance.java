package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstDuplicateOccurance {

	public static void main(String[] args) {
		String str = "Sheetal Verma Malviya";

		duplicates(str);
		duplicatesUsingCollection(str);

		int ar[] = { 9, 1, 2, 3, 1, 4, 5, 1, 2, 3, 9 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println(ar[i]);
					return;

				}

			}
		}

	}

	public static void duplicates(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i) + " is duplicate");
				}
			}
		}
	}

	public static void duplicatesUsingCollection(String str) {
		char[] ch = str.toCharArray();
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (Character c : ch) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}

		System.out.println(hmap);

		Set<Character> set = hmap.keySet();

		for (Character c1 : set) {
			if (hmap.get(c1) > 1) {
				System.out.println(c1 + " " + hmap.get(c1) + " " + "times");
			}
		}

	}
}
