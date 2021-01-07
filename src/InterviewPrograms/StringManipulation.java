package InterviewPrograms;

public class StringManipulation {

	public static void main(String[] args) {
		String str="54786r1823";
		//System.out.println(ifStringContainsOnlyDigits(str));
		System.out.println(ifStringContainsOnlyDigitsUsingCharacter(str));
	

	}
	public static boolean ifStringContainsOnlyDigits(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				return true;
			}
			
			else {
				return false;
			}
			
		}
		return false;	
	}
	
	public static boolean ifStringContainsOnlyDigitsUsingCharacter(String str) {
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				return true;
			}
			
			else {
				return false;
			}
			
		}
		return false;	
	}

}
