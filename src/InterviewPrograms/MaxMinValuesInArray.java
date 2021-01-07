package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinValuesInArray {

	public static void main(String[] args) {
		Integer ar[]= {11,55,33,2,10,99,8};
getMaxMinValues(ar);
	}
	
	public static void getMaxMinValues(Integer ar[]) {
		
	List<Integer> list= Arrays.asList(ar);
	System.out.println(Collections.max(list));
	System.out.println(Collections.min(list));
	
	
	
	
	
		
	}

}
