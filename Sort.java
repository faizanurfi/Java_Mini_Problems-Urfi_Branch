class Sort {
	public static void main(String[] args) {
	
	selectionSort(new int[] {-2,5,7,2,10,5,20,65,-45, -24});
	}
	
	public static void Test_findMin2()
			{
			int [] x= {1, 2,6,6,7,11,6,0,-2, 5,7,9,-8,10};
			System.out.println("Test_findMin2()");
			System.out.println(findMin2(x, 9));
			}
	public static void Test_insertionSort()
	{
	System.out.println("Test_insertionSort()");
	System.out.println(isSame(insertionSort(new int[]{1,0,2,4,5,1,-1,3}), new int [] {-1,0,1,1,2,3,4,5}));
	System.out.println(isSame(insertionSort(new int[]{0}), new int [] {0}));
	System.out.println(isSame(insertionSort(new int[]{-6,-2,-10,-11,0,1,1,4,-14}), new int [] 	{-14,-11,-10,-6,-2,0,1,1,4}));
	System.out.println(isSame(insertionSort(new int[]{0,1,2,3}), new int [] {0,1,2,3}));
	System.out.println(isSame(insertionSort(new int[]{1,1,1,1,1,1,1,1,0}), new int []{0,1,1,1,1,1,1,1,1}));

	}

	/*-----------------------------------------------------------------------------------------------------*/

	private static int[] selectionSort(int[] arr)
	{
		System.out.print("Original Array: ");
		Print(arr);
		for(int i = 0; i < arr.length; i++){
			int min = findMinIndex(arr, i);
			swap(arr, i, min);
			Print(arr);
		}	
		
		//Print(arr);
		return arr;
	}
	
	/*-----------------------------------------------------------------------------------------------------*/

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
	
	/*-----------------------------------------------------------------------------------------------------*/

		public static int [] insertionSort(int [] arr)
			{
				if(arr.length==0)
					return arr; 
				
			for(int i = 1; i<arr.length; i++){
				int key = arr[i];
				int j;
			for(j=i-1; j>-1 && key<arr[j]; j--)
				arr[j+1]=arr[j];
				arr[j+1]=key;
				Print(arr);			
			}
			return arr; 
		}

	/*--------------------------------------PRINT FUNCTION-------------------------------------------------*/
	
	private static void Print(int[] arr)
			{
				
				for(int k = 0; k<arr.length; k++)
				{
					System.out.print(arr[k] + ",");
				}	
				
				System.out.println("---");
				
			}

	/*-----------------------------------------------------------------------------------------------------*/
	
	public static void swap(int[] arr, int i, int j)
	{
		int t = arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	
	/*-----------------------------------------------------------------------------------------------------*/
	
	public static int findMinIndex(int [] arr, int start)
		{
						//find min element in array; return the index of the element, and value if empty return -1
						int min = start;
						if(arr.length==0)
							return -1; 
						for (int i = start; i < arr.length; i++) {
							if(arr[i]<arr[min]){
								min = i; 
								//System.out.print(i);
								}
						}		
						  return min;
					}
	/*-----------------------------------------------------------------------------------------------------*/

	}
