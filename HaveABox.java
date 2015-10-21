class HaveABox{

	/*

1.	Given an array of sorted integers which represent box sizes and an integer representing an item size
    You have to find best fit box for the item (-1 in case of no box found)
  For example:
    Given 10,20,30,40,50,60,70 and 45
      You have to print 50
    Given 10,20,30,40,50,60,70 and 75
      You have to print -1
      Given 10,20,30,40,50,60,70 and 50
    You have to print 50
*/

    public static void main(String [] args){
    	int [] arr = {10,20,30,40,50,60,70};
    	System.out.println(haveABox(arr, 55));
    }

    public static int haveABox(int [] arr, int itemSize){
    	if(itemSize> arr[arr.length-1])
    		return -1; 

    	return binarySearch(arr, itemSize);
    }

    public static int binarySearch(int [] arr, int itemSize){
    	int lo = 0;
    	int hi = arr.length-1;
    	int mid = 0; 
    	while(hi>lo){
			mid = (lo + hi)/2; 

    		if(arr[mid]== itemSize){
    			return itemSize;
    		}

    		else if(arr[mid]< itemSize){
    			lo = mid+1; 
    		}

    		else if(arr[mid]>itemSize){
    			hi = mid - 1; 
    		}
    	}

    	return arr[mid];
    }

}

