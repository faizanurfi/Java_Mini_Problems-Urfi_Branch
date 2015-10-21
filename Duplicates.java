import java.util.ArrayList; 

class Duplicates {
	public static void main(String[] args) {
        
        int arr[] = {0,1,2,2,3,3,3,3,3,4,4,4,4,4,4,4,4,5,5};
        System.out.println(deleteDuplicates(arr));
		
	}
	
	public static ArrayList deleteDuplicates(int [] arr)
	{
		ArrayList aL = new ArrayList(); 
		
	  int temp = -1;
		for(int i=0; i<arr.length; i++)
		{
			
		   if(arr[i]!=temp){
				 aL.add(arr[i]); 
		      temp = arr[i];
			}
		}
		
        return aL;
	}
}