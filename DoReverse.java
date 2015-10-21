import java.util.Arrays; 
class DoReverse {
	public static void main(String[] args) {
		int array [] = {1,4,3,7,8,5};
		
		DoReverse doRev = new DoReverse();
		doRev.reverse(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	public void reverse(int [] arr, int start, int end) {
		if(start < end) {
			swap(arr, start, end);
			start++;
			end--; 
			reverse(arr, start, end);
		}
	}
	
	void swap(int [] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}