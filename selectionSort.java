//use selection sort

class selectionSort {
	public static void main(String[] args) {
		int [] arr = {13,0,-4,6,8,2,5,11};
		//Print(selectionSort(arr));
		System.out.print(findMin2(arr,0));
	}
	
	public static int [] selectionSort(int [] arr)
	 {
		for (int i = 0; i < arr.length-1; i++) {
			int min= findMin2(arr,i);  
			swap(arr,i,min);
			Print(arr);
		}
		
		return arr;
	 }
	
	public static int findMin2(int [] arr, int start)
	{
		if(arr.length == 0)
		return -1; 
		
		int min = start; 
		for (int i = start; i < arr.length; i++) {
			if(arr[i]<arr[min])
				min = i;
		   }
		return min; 
	}
		
	
	public static void swap(int[] arr, int i, int j)
	{
				int t = arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		
		private static void Print(int[] arr)
			{
				
			for(int k = 0; k<arr.length; k++)
				{
					System.out.print(arr[k] + ",");
				}	
				
			System.out.println("---");
				
			}

}
