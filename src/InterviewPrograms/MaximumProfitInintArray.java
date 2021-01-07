package InterviewPrograms;

public class MaximumProfitInintArray {

	public static void main(String[] args) {
		
		
		int ar[]= {1,10,36,76,81,100,500};
		System.out.println(maxProfit(ar));
		
		
	}
	
	
	
	
	
	public static int maxProfit(int ar[]) {
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
			if(ar[i]-min>max) {
				max=ar[i]-min;
				
			}
		}
		
		
return max;	}

}
