class KthLargest {
	
	//returns the kth largest element in the list
	public static void main(String[] args) {
		int arr [] = {6,1,1,1,2,8,4,3,5};
		System.out.println(kthLargest(3,arr));
	}
	
	public static int kthLargest(int k, int [] arr)
	{
		sort(arr);
		Print(arr);
		return arr[arr.length-1-k];
	}

	
		public static int [] sort(int arr [])
		{
			for (int k = 0; k < arr.length; k++) {
				for (int i = 0; i < arr.length-1; i++) {
						if(arr[i]>arr[i+1])
							swap(arr, i, i+1);
		
				}
			}
			return arr; 
		}
	
			public static void swap(int [] arr, int a, int b)
			{
			int temp =  arr[a];
			arr[a] = arr[b];
			arr[b] = temp; 
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