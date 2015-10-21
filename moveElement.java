class moveElement {
	public static void main(String[] args) {
		int [] arr  = {1,2,3,4,5,6,7,8};
		
		Print(moveElement(arr, 6,0));
	}
	
	public static int [] moveElement(int [] arr, int from, int to)
	//from always greater than to
	{
	 	int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(i==from)
			{
				temp= from;
				arr[from-i]=arr[from];
				arr[i+1]=arr[i];
				swap(arr, arr[from], arr[to]);
				System.out.print("i="+i+": ");
			}
		}
		return arr;
	}
	
	public static boolean isSame(int [] arrX, int [] arrY)
				{
					//if arrays are same, then true, else false
					if(arrX.length!=arrY.length)
						return false; 
						for (int i = 0; i < arrX.length; i++) {
						if(arrX[i]!=arrY[i])
							   	return false;
				}
					return true; 
				}
	private static void Print(int[] arr)
				{
				for(int k = 0; k<arr.length; k++)
				{
				System.out.print(arr[k]+",");
				}	
				System.out.println("---");
				}

public static void swap(int [] arr, int a, int b)
{
	int t = arr[a];
	arr[a]= arr[b];
	arr[b]= t;
}
}