class BinarySearch {
	public static void main(String[] args) {
		
		int [] arr = {1,4,6,8,10,14,15,16,20,25,27};
		System.out.print("The index of specified number is at: " + binarySearch(arr, 12));
	}
	
	public static int binarySearch(int [] arr, int num){
		int start = 0; 
		int end = arr.length -1; 
		
		while(start<end){
			int mid = (start+end)/2;
			
			if(arr[mid] == num)
			  return mid; 
			
			else if(num>arr[mid]){
				start = mid;
			}
			
			else
				end = mid; 	
		}
		
		return 0; 
	}
}