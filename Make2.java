class Make2 {
    public static void main(String[] args) {
        int [] x  = {};
        int [] y = {2,3};
        Print(make2(x,y));
    }
    
    /*make2({4, 5}, {1, 2, 3}) → {4, 5}
    make2({4}, {1, 2, 3}) → {4, 1}
    make2({}, {1, 2}) → {1, 2}*/
    
    public static int[] make2(int [] a, int [] b){
        int aLength = a.length;  
        int [] newArr = new int[2];
        
        if(aLength>=2) {
            for(int i = 0; i<2; i++){
                newArr[i]= a[i];
            }
            
            return newArr; 
        }
        
        else if(aLength<2 && aLength>0) {
             for(int j = 0; j<1; j++){
                 newArr[j]= a[j];
             }
            
            for(int x = 1; x<2; x++) {
                newArr[x] = b[x-1];
            }
            
            return newArr; 
        }
        
        else {
            
            for (int k = 0; k < 2; k++) {
                newArr[k] = b[k];
            }
            return newArr; 
        }
    }
    
    private static void Print(int[] arr){
            
        for(int k = 0; k<arr.length; k++)
            {
                System.out.print(arr[k] + ",");
            }	
            
        System.out.println("---");
            
        }

}