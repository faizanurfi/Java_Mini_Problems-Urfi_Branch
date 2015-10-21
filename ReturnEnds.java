class ReturnEnds {
    public static void main(String[] args) {
        int x [] = {7,4,5,6,1,2,3};
        Print(makeEnds(x));
    }
 
public static int[] makeEnds(int[] nums) {
     int newR [] = {nums[0], nums[nums.length-1]};
   
   return newR; 
}

private static void Print(int[] arr)
    {
        
    for(int k = 0; k<arr.length; k++)
        {
            System.out.print(arr[k] + ",");
        }	
        
    //System.out.println("---");
        
    }

    
}