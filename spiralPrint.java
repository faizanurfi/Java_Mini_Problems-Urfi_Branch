class SpiralPrint {
    public static void main(String[] args) {
        int [][] dubArr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        spiralPrint(dubArr, 4,4);
    }
    
    public static void spiralPrint(int [][] arr, int rows, int columns){
        int direction = 0; 
        // direction numbers
        //0 -> right 
        //1 -> down
        //2 -> left
        //3 -> up
        int top = 0;
        int bottom = rows - 1; 
        int left = 0; 
        int right = columns - 1; 
        
        while(top<= bottom && left <= right){
            
            if(direction==0){
                for(int i = left; i<=right; i++){
                    System.out.print(arr[top][i]+ " ");
                }
                top++;
                direction = 1; 
            }
            
            else if (direction ==1) {
                for(int j = top; j<=bottom; j++){
                    System.out.print(arr[j][right] + " ");
                }
                right--;
                direction = 2; 
            }
            
            else if (direction == 2) {
                for(int k = right; k>=left; k--){
                    System.out.print(arr[bottom][k] + " ");
                }
                bottom--;
                direction = 3; 
            }
            
            else if (direction ==3){
                for(int l = bottom; l<=top; l--) {
                    System.out.print(arr[left][l]);
                }
                left++;
                direction = 0; 
            }
                         
        }
    }
}