class PercentEvens {
	
	//calculates the percentage of even numbers in an array of doubles
	public static void main(String[] args) {
	
	int [] arr = {2,1,34,5,3};
	System.out.println(percentEvens(arr));	
	}
	
	public static double percentEven(int [] arr)
		{
	        if(arr.length==0)
	            return 0.0; 
			int count = 0; 
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]%2 == 0)
				 	count++;
		}
			
			double percent = (double)count/(arr.length);
			
			return percent*100; 
		}
}