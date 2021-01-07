package InterviewPrograms;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		String str="Rajasthan";
		String a="a";
		occuranceOfChars(str, a);
		

	}
	public static void occuranceOfChars(String str,String a) {
		
		int actualLen=str.length();
		String str1=str.replaceAll(a, "");
		int reducedLen=str1.length();
		int finalLen=actualLen-reducedLen;
		
		System.out.println("The number of occurances of "+a+" is "+ finalLen);
		
		
	}

}
