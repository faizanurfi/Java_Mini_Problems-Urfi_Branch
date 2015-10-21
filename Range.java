class Range {
	public static void main(String[] args) {
		int [] arr = {-1,0,1,2,3,4,6,7,8,9,10};
		range(arr);
	}
	
	//this program reduces an array of sorted integers to ranges 
	// {1,2,3,4,6,7,8} -> {1-4} {6-8}
	
	public static void range(int [] arr) {
		int i = 0;
		System.out.print("{"+arr[i] + "-");

		while(i<arr.length-1) {
			if(arr[i]+1!=arr[i+1] && arr[i] != arr[i+1]) {
				System.out.print(arr[i]+"} ");
				System.out.print("{"+arr[i+1] + "-");
			}
				i++;
		}
		System.out.print(arr[arr.length-1]+"}");
	}
}