package InterviewPrograms;

public class CountVowels {

	public static void main(String[] args) {
	String str="sheetal";
	countTheVowels(str);

	}
	
	public static void countTheVowels(String str) {
		
		char ar[]=str.toCharArray();
		int count=0;
		for(char a:ar) {
			
		switch (a){
			case 'a':
			case 'e':
			case 'i':
			case 'o':	
			case 'u':
			count++;
			break;
			
		}
			
		}
		
	System.out.println(count);}

}
