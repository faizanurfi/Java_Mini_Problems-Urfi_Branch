class DontInclude {
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5}; 
		
		Print(dontInclude(arr)); 
		
	}
	
	public static int [] dontInclude(int [] arr) {
		int num = 0; 
		int result = 1; 
		int [] temp = new int[arr.length]; 
		while(num < arr.length) {
			for(int i = 0; i< arr.length; i++){
				if(i!= num)
				   result*= arr[i];
			}
				temp[num] = result; 
				result = 1; 
				num++; 
		}
		
		return temp; 
	}
	
	private static void Print(int[] arr) {
		System.out.print("{ ");

		for(int k = 0; k<arr.length; k++)
			{
				System.out.print("["+arr[k] + "] ");
			}	
			
		System.out.println("}");
			
		}
}

