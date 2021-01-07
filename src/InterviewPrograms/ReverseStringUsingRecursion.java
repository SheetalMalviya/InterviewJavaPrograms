package InterviewPrograms;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String str="sheetal";
		System.out.println(reverseRecursive(str));

	}
public static String reverseRecursive(String str) {
	
	if(str== null|| str.length()<=1) {
		return str;
	}
	return reverseRecursive (str.substring(1))+str.charAt(0);
}
	
	
}
