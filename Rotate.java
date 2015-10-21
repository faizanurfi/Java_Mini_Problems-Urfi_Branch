class Rotate{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		//6 5 4 3 2 1
		//reverse(arr,0,length)
		//reverse(arr,0, pivot)
		//reverse(arr,pivot, length); 
		rotateReverse(arr,0,arr.length-1));
		rotateReverse(arr,0,arr.length-1));
				
	}
	
	
	public static int [] rotateArray(int [] arr, int numTimes){
		
		int effectiveShifts = numTimes%arr.length;
		for(int i = 0; i<effectiveShifts; i++){
			rotate(arr);
		}
		return arr; 
	}
	public static int [] rotate(int[] arr){
		
		int temp = arr[arr.length-1];
		
		for (int i = arr.length-1; i>= 1; i--) {
			arr[i]= arr[i-1];
		}
		
		arr[0] =temp; 
		return arr;
   }

	public static int rotateReverse(int [] arr, int start, int end){
		for(int i = start; i<=end; i++){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp; 
			start++;
			end--;
		}
		
		return arr; 	
	}
	
	private static void Print(int[] arr){
		for(int k = 0; k<arr.length; k++) {
				System.out.print("["+arr[k] + "] ");
			}	
			
		System.out.println("---");
			
		}

}