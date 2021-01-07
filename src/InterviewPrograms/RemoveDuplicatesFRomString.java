package InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFRomString {

	public static void main(String[] args) {
		String str = "sheetal";
		System.out.println(removeDupsFRomString(str));

	}

	public static String removeDupsFRomString(String str) {

		Set<Character> set = new HashSet<Character>();
		String newWord = "";

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				newWord = newWord + c;

			}
		}

		return newWord;
	}

}
