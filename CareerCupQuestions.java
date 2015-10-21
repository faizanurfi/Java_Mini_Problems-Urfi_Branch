class CareerCupQuestions {
	public static void main(String[] args) {
		int arr[] = {2,3,5,4,6,7,8,9};
		//System.out.println("The missing number is: " +findMissingNumber(arr));
     allPrimes(100);
     
		
		//System.out.println(isPrime(18));
	}
/**************************************************************************************************/

	public static int findMissingNumber(int [] arr){
	//given an int array of n elements, with elements from 1 to n, find missing element
	bubbleSort(arr);
	//Print(arr);
   int s= 0; 
   if(arr[0]!=1)
      return 1; 
	
	for(int i = 0; i<arr.length-1; i++){
		if(arr[i]+1 != arr[i+1])
			  s = i+2;
	}
	return s;
	}
	
	public static int [] bubbleSort(int [] arr)
			{
				if (arr.length==0) 
					return arr;
					
				for (int a = 0; a< arr.length; a++) {
					for (int i = 0; i < arr.length-1; i++) {
						if(arr[i]>arr[i+1]) 
						swap(arr, i,i+1);
					}
				}
				return arr;
			}
			
	public static void swap(int[] arr, int i, int j)
		{
			int t = arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
	
	private static void Print(int[] arr){
		for(int k = 0; k<arr.length; k++)
			{
				System.out.print(arr[k] + ",");
			}	
			
		System.out.println("---");
		}
		
		
		public static boolean isPrime2(int n) {
		//	ArrayList<Integer> found = new ArrayList<Integer>();
		//	found.add(1);
		//	found.add(2);
			
			
			if (n == 1 || n == 2)
				return true;
			
			for(int i = 3; i * i < n; i+=2){
				if (isPrime2(i) && n % i == 0)
					return false;
			}
			
			return true;
		}

/**************************************************************************************************/

public static void allPrimes(int num)
{
	int count = 0; 
	for(int i = 1; i<=num; i++)
	{
	  if(isPrime(i))
		    System.out.print(i+",");
	}
 	
}

	public static boolean isPrime(int num){

	for (int i = 2; i*i<=num; i++) 
	{
		 if(num%i==0)
			return false; 
	}	 	
		return true; 
		}
}