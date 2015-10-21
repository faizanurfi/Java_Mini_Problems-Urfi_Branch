class Has271 {
    public static void main(String[] args) {
        int arr []= {2,7,-1};
        System.out.println(has271(arr));
    }
    
/* Given an array of ints, return true if it contains a 2, 7, 1 pattern -- 

- a value, 
- followed by the value plus 5, 
- followed by the value minus 1. 

Additionally the 271 counts even if the "1" differs by 2 or less from the correct value */


    public static boolean has271(int[] nums) {
            if(nums.length<3)
                return false; 
                
            for (int i = 0; i < nums.length-2; i++) {
                if(nums[i]+ 5 == nums[i+1])
                    if(Math.abs(nums[i]-nums[i+2])<=2)
                        return true; 
            }
            
            return false; 
        }


}