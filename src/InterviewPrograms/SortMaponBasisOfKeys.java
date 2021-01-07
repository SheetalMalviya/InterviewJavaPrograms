package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMaponBasisOfKeys {

	public static void main(String[] args) {
	Map<String,Integer> map=new HashMap();
	map.put("Java", 4);
	map.put("Python", 6);
	map.put("C", 1);
	map.put("XML", 3);
	
	for(Map.Entry<String, Integer> entry:map.entrySet()) {
		
		System.out.println("Unsorted MapKeys "+ entry.getKey());
	}
		
		TreeMap<String,Integer> tm=new TreeMap(map);
		for(Map.Entry<String, Integer> entry:tm.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
