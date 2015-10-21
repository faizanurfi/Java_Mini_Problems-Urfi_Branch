	import java.util.Scanner;

class IntegerArrays {
public static void main(String[] args) {
	
	}
	
	private static void Test_getCount() {
	System.out.println("Test_getCount()");
	System.out.println(getCount(new int [] {1, 2, 6, 6, 7, 11, 6}, 6) == 3 );
	System.out.println(getCount(new int [] {}, 6) == 0 );
	System.out.println(getCount(new int [] {1}, 6) == 0 );
	System.out.println(getCount(new int [] {1}, 1) == 1 );
	}
		
	private static void Test_indexOf() {
	System.out.println("Test_indexOf()");
	System.out.println(indexOf(new int [] {1, 2, 6, 6, 7, 11, 6}, 6) == 2 );
	System.out.println(indexOf(new int [] {}, 0) == -1 );
	System.out.println(indexOf(new int [] {1}, 6) == -1 );
	System.out.println(indexOf(new int [] {1}, 1) == 0 );
	System.out.println(indexOf(new int [] {1,2}, 1) == 0 );
	}

	public static void Test_isSame()
	{
	System.out.println("Test_isSame()");
	System.out.println(isSame(new int [] {1, 2, 6, 6, 7, 11, 6}, new int [] {1, 2, 6, 6, 7, 11, 6})==true);
	System.out.println(isSame(new int [] {}, new int[] {}) == true);
	System.out.println(isSame(new int [] {}, new int [] {6}) == false );
	System.out.println(isSame(new int [] {1}, new int [] {}) == false );
	System.out.println(isSame(new int [] {1,2},new int [] {1,2,3}) == false);
	System.out.println(isSame(new int [] {1,2,3},new int [] {1,2}) == false);
	}
				
	public static void Test_isSorted()
	{
	System.out.println("Test_isSorted()");
	System.out.println(isSorted(new int [] {1, 2, 6, 6, 7, 11, 6})==false);
	System.out.println(isSorted(new int [] {}) == true);
	System.out.println(isSorted(new int [] {3}) == true);
	System.out.println(isSorted(new int [] {1,4}) == true);
	System.out.println(isSorted(new int [] {1,1,2,3}) == true);
	System.out.println(isSorted(new int [] {1,1}) == true);

		}

	public static void Test_findMax()
	{
	System.out.println("Test_findMax()");
	System.out.println(findMax(new int [] {1, 2, 6, 6, 7, 11, 6})==5);
	System.out.println(findMax(new int [] {}) == -1);
	System.out.println(findMax(new int [] {3}) == 0);
	System.out.println(findMax(new int [] {1,4}) == 1);
	System.out.println(findMax(new int [] {4,1}) == 0);
	System.out.println(findMax(new int [] {1,1}) == 0);
	System.out.println(findMax(new int [] {2,5,6,6,8,4,17,1,6,9,11}) == 6);
	System.out.println(findMax(new int [] {-1,-2}) == 0);
	System.out.println(findMax(new int [] {-2,-1}) == 1);
	}
	
	public static void Test_findMin()
	{
	System.out.println("Test_findMin()");
	System.out.println(findMin(new int [] {1, 2, 6, 6, 7, 11, 6})==0);
	System.out.println(findMin(new int [] {}) == -1);
	System.out.println(findMin(new int [] {3}) == 0);
	System.out.println(findMin(new int [] {1,4}) == 0);
	System.out.println(findMin(new int [] {4,1}) ==1);
	System.out.println(findMin(new int [] {1,1}) == 0);
	System.out.println(findMin(new int [] {2,5,6,6,8,4,17,1,6,9,11}) == 7);
	System.out.println(findMin(new int [] {-1,-2}) == 1);
	System.out.println(findMin(new int [] {-2,-1}) == 0);
	System.out.println(findMin(new int [] {-2}) == 0);

	}

				
	public static void Test_isConsecutive()
	{
	System.out.println("Test_isConsecutive()");
	System.out.println(isConsecutive(new int [] {1, 2, 6, 6, 7, 11, 6})==false);
	System.out.println(isConsecutive(new int [] {}) == true);
	System.out.println(isConsecutive(new int [] {1,2,3,4,5}) == true );
	System.out.println(isConsecutive(new int [] {1,2,3,5,8,9}) == false );
	System.out.println(isConsecutive(new int [] {1,2}) == true);
	System.out.println(isConsecutive(new int [] {1}) == true);
	System.out.println(isConsecutive(new int [] {2,1}) == false);
	}
					
public static void Test_isPalindrome()
{
	System.out.println("Test_isPalindrome()");
	System.out.println(isPalindrome(new int [] {})==true);
	System.out.println(isPalindrome(new int [] {1})==true);
	System.out.println(isPalindrome(new int [] {1,1})==true);
	System.out.println(isPalindrome(new int [] {1,2})==false);
	System.out.println(isPalindrome(new int [] {1,2,3})==false);
	System.out.println(isPalindrome(new int [] {1,2,1})==true);
	System.out.println(isPalindrome(new int [] {1,2,2,1})==true);
	System.out.println(isPalindrome(new int [] {1,2,3,4,5})==false);
	System.out.println(isPalindrome(new int [] {1,2,3,4,5,4,3,2,1})==true);
	System.out.println(isPalindrome(new int [] {1,2,3,4,5,5,4,3,2,1})==true);
	System.out.println(isPalindrome(new int [] {1,3,6,7,6,3,1})==true);
	System.out.println(isPalindrome(new int [] {1,3,6,6,3,1})==true);
}

public static void Test_findHoleCount(){
		System.out.println("Test_findHoleCount()");
		System.out.println(findHoleCount(new int [] {1,2,3,4,6,7,9,11,12,13,19})==4);
		System.out.println(findHoleCount(new int [] {})==0);
		System.out.println(findHoleCount(new int [] {1})==0);
		System.out.println(findHoleCount(new int [] {1,2})==0);
		System.out.println(findHoleCount(new int [] {1,3})==1);
		System.out.println(findHoleCount(new int [] {1,2,3})==0);
		System.out.println(findHoleCount(new int [] {1,2,4})==1);
		System.out.println(findHoleCount(new int [] {-2,0,1,3,4})==2);
	}
	
	public static void Test_findBiggestHole(){
		System.out.println("Test_findBiggestHole()");
		System.out.println(findBiggestHole(new int [] {1,2,9,11,12,13,19})==6);
		System.out.println(findBiggestHole(new int [] {1,2,3,12,12,13,21})==8);
		System.out.println(findBiggestHole(new int [] {1,2,3,4,7,20,40,61})==20);
		System.out.println(findBiggestHole(new int [] {1,2,25,26,27,28,28,29})==22);
		System.out.println(findBiggestHole(new int [] {1,3})==1);
		System.out.println(findBiggestHole(new int [] {1,2,3})==0);
		System.out.println(findBiggestHole(new int [] {1,2,4})==1);
		System.out.println(findBiggestHole(new int [] {-2,12,28,29,30})==15);
		System.out.println(findBiggestHole(new int [] {})==0);
		System.out.println(findBiggestHole(new int [] {-1,1})==1);
		System.out.println(findBiggestHole(new int [] {0,0})==0);
		System.out.println(findBiggestHole(new int [] {0})==0);
		}


public static void Test_rotate()
{
	System.out.println("Test_Rotate()");
	
}


/*-----------------------------------------------------------------------------------------------------*/

public static int getCount(int [] arr, int a)
{
	//given integer array, find the count of 'a' in that array
	int count = 0; 
	for (int i = 0; i <arr.length; i++) 
		{
				if(arr[i]==a)
				{
					count++;
				}
		}
				return(count); 
}


/*-----------------------------------------------------------------------------------------------------*/

public static int indexOf(int [] arr, int a)
{
	//find 'a' in arr, return index, if not there return -1
			for (int i = 0; i < arr.length; i++) 
				{
					if(arr[i]==a)
							return i;
				}
			return -1; 
			
			
}  //DONE//

/*-----------------------------------------------------------------------------------------------------*/

public static boolean isConsecutive(int [] arr)
{
	//if 1,2,3,4,5 == true; 1,3,4,5 == false; empty then true; 
	if(arr.length==0)
	return true; 
	for (int i = 0; i < arr.length-1; i++) {
		if(arr[i]+1 != arr[i+1])
			return false;
	}
	return true; 
}

/*-----------------------------------------------------------------------------------------------------*/

public static boolean isSame(int [] arrX, int [] arrY)
{
	//if arrays are same, then true, else false
	if(arrX.length!=arrY.length)
		return false; 
	for (int i = 0; i < arrX.length; i++) {
		if(arrX[i]!=arrY[i])
			   	return false;
	}
	
	return true; 

}

/*-----------------------------------------------------------------------------------------------------*/

public static boolean isSorted(int [] arr)
{
	//if array is sorted, then true, otherwise false; empty then true;
	
	if(arr.length==0)
		return true; 
	
for (int i = 0; i < arr.length-1; i++) 
	{
		if(arr[i]>arr[i+1])
			return false;
	}
	return true; 
	}

/*-----------------------------------------------------------------------------------------------------*/

public static int findMax(int [] arr)
{
	//find max element in array; return the INDEX of the element, if empty return -1
	if(arr.length==0)
		return -1; 
	int max = 0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>arr[max])
			max = i;
	}		
	return max; 
}

/*-----------------------------------------------------------------------------------------------------*/

public static int findMin(int [] arr)
{
	//find min element in array; return the index of the element, if empty return -1
	int min = 0;
	if(arr.length==0)
		return -1; 
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]<arr[min]){
			min = i; 
		}
	}		
	  return min;
}

/*-----------------------------------------------------------------------------------------------------*/		
public static int [] rotate(int [] arr, int count)
{	
	// in place***
	for (int i = 0; i < arr.length-count; i++) {
			System.out.print(arr[i-count]);
		}
	// if array is 1,2,3,4,5,6,7,8 and count is 3, then return is 6,7,8,1,2,3,4,5
	return arr; 
}

/*-----------------------------------------------------------------------------------------------------*/

public static boolean isRotatedSorted(int [] arr)
{
	// if 1,2,3,4,5 then true;
	// if 6,7,8,1,2,3,4,5 then true; 
	// if 1,2,5,4 then false;
	return false; 
	
}

/*-----------------------------------------------------------------------------------------------------*/

public static boolean isPalindrome(int [] arr)
{ //is array of numbers palindrome, empty set is true
	if(arr.length==0)
	return true;
	
	for (int i = 0; i < arr.length/2; i++) {
		if(arr[i]!=arr[arr.length-i-1])
			return false;
}
return true; 
}

/*-----------------------------------------------------------------------------------------------------*/

public static int [] subArray(int [] arr, int start, int count)
   //given a starting point and number of elements, return subArray 
{
        int [] subArr = new int[count];
        for(int i =start; i<start+count; i++)
        {
           subArr[i-start]=arr[i];
        }
        
        return subArr;
    }

/*-----------------------------------------------------------------------------------------------------*/

/*public static int indexOf_Sorted(int [] arr, int value)
{
//use binary search
}*/

/*-----------------------------------------------------------------------------------------------------*/

public static int [] merge(int [] a, int [] b)
	{
	int newArr[] = new int [a.length+b.length];
	for (int i = 0; i < a.length; i++) {
		newArr[i]= a[i];
	}

	for (int j = 0; j < b.length; j++) {
		newArr[a.length+j]=b[j];
	
	}
	return newArr;

	}

/*-----------------------------------------------------------------------------------------------------*/

public static int [] reverse(int [] arr)
	{
		//given array of integers, print them in reverse order
			
			for(int i = 0; i<arr.length/2; i++)
				{
					swap(arr, i, arr.length-1-i);
					Print(arr);
				} 

		return arr;
	}

/*-----------------------------------------------------------------------------------------------------*/		
public static int [] flipSkip(int [] arr, int n) throws Exception
			{ //reverses n elements, skips n elements
				for (int i = 0; i <arr.length; i+=(n*2)) {
					reverseSegment(arr,i,i+n-1);
			}
				return arr; 
			}

/*-----------------------------------------------------------------------------------------------------*/			
public static int[] reverseSegment(int [] arr, int start, int end) throws Exception
		{
			//reverses segments if given a starting and ending point
			if(arr.length==0)
				return arr; 
			if(start>=arr.length || end>=arr.length)
			 	{
				throw new Exception("Index Out of Bounds"); 
				}
				
			for (int i = 0; i <=(end-start)/2; i++) {
				swap(arr, start+i, end-i);
				} 
			
		return arr;
		}

/*-----------------------------------------------------------------------------------------------------*/
public static int [] rotate(int [] arr, int count) throws Exception
		{	
			// in place***
			// if array is 1,2,3,4,5,6,7,8 and count is 3, then return is 6,7,8,1,2,3,4,5
			if(count>arr.length)
				throw new Exception("Index Out of Bounds");
			if(arr.length==0)
				return arr;
			int newArr[] = new int [arr.length];
			int i = 0;
			
		   for(i=0; i<count; i++)
			{
				newArr[i]=arr[arr.length-count+i];
			}
			
			for(int j=0; j<arr.length-count; j++)
			{
				newArr[count+j]=arr[j];
			}
			
			return newArr;
		}

/*-----------------------------------------------------------------------------------------------------*/

public static int findHoleCount(int [] arr)
		{ //if numbers are not consecutive, count that as a hole
			int count = 0; 
			if(arr.length==0)
				return 0;

			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]+1 != arr[i+1])
					count++;
			}
			return count; 
		}

/*-----------------------------------------------------------------------------------------------------*/

public static int findBiggestHole(int [] arr)
		{ //return the size of the biggest gap/hole between elements
			if(arr.length==0)
				return 0;
			int max = 0;
			
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]+1 != arr[i+1])
					if(arr[i+1]-arr[i] > max)
						max= arr[i+1]-arr[i];
			}
			if(max!=0)
				return max-1; 
			else
				return max; 	
		}


/*------------------------------------------PRINT FUNCTION-----------------------------------------------*/
private static void Print(int[] arr)
	{
		
	for(int k = 0; k<arr.length; k++)
		{
			System.out.print(arr[k] + ",");
		}	
		
	System.out.println("---");
		
	}

}