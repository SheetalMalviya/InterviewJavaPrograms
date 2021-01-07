package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		String str[] = { "java", "python", "ruby", "perl", "java" };
		getDuplicates(str);

	}

	public static void getDuplicates(String str[]) {

		Map<String, Integer> map = new HashMap();
		for (String s : str) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}

		}
		System.out.println(map);

		Set<String> keys = map.keySet();
		for (String as : keys) {
			if (map.get(as) > 1) {
				System.out.println(as+map.get(as));
			}

		}
	}
}
