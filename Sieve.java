class Sieve {
	public static void main(String[] args) {
	
	
	int n = 100;

	boolean [] sieve = new boolean [n]; 
	
	for(int i = 2; i<sieve.length; i++)
	{
		sieve[i]=true; 
	}
		for(int m = 2; m<(n/2); m++){
			for(int k = 2; m*k<n; k++){
			    sieve[m*k]= false;
			}
			
		}
		
		Print(sieve);	
	}
	
	private static void Print(boolean[] arr)
		{
			
		for(int k = 0; k<arr.length; k++)
			{
				if(arr[k]==true)
					System.out.print(k + " ");
			}	
			
		System.out.println("---");
			
		}


	
}