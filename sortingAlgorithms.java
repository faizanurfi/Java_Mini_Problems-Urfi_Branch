import java.util.Arrays;

public class sortingAlgorithms
{
	//selection sort
	public static int[] selectionSort(int[] unsorted)
	{
		int[] sorted = new int[unsorted.length];
		for(int i=0; i<sorted.length; i++)
		{
			sorted[i] = unsorted[i];
		}
		
		System.out.println(Arrays.toString(sorted));
		for(int j=0; j<sorted.length-1; j++)
		{
			int lower = 0;
			int higher = 0;
			for(int k=j; k<sorted.length-1; k++)
			{
				if(sorted[j] > sorted[k+1])
				{
					lower = sorted[k+1];
					higher = sorted[j];
				}
				else
				{
					lower = sorted[j];
					higher = sorted[k+1];
				}
				sorted[j] = lower;
				sorted[k+1] = higher;
			}
			System.out.println(Arrays.toString(sorted));
		}
		return sorted;
	}
	
	//insertion sort
	public static int[] insertionSort(int[] unsorted)
	{
		int[] sorted = new int[unsorted.length];
		for(int i=0; i<sorted.length; i++)
		{
			sorted[i] = unsorted[i];
		}
		
		System.out.println(Arrays.toString(sorted));
		for(int i=1; i<sorted.length; i++)
		{
			int element = sorted[i];
			int j=i;
			while(j>0 && element<sorted[j-1])
			{
				sorted[j] = sorted[j-1];
				j--;
				sorted[j] = element;
			}
			System.out.println(Arrays.toString(sorted));
		}
		return sorted;
	}
	
	//bubble sort
	public static int[] bubbleSort(int[] unsorted)
	{
		int[] sorted = new int[unsorted.length];
		for(int i=0; i<sorted.length; i++)
		{
			sorted[i] = unsorted[i];
		}
		
		boolean flag = false;
		int temp;
		int count;
		System.out.println(Arrays.toString(sorted));
		for(int j=0; j<sorted.length-1; j++)
		{
			count = 0;
			for(int k=0; k<sorted.length-1-j; k++)
			{
				if(sorted[k] > sorted[k+1])
				{
					temp = sorted[k];
					sorted[k] = sorted[k+1];
					sorted[k+1] = temp;
					count++;
				}
			}
			System.out.println(Arrays.toString(sorted));
			if(count == 0)
			{
				break;
			}
		}
		return sorted;
	}
	
	//main method
	/*public static void main(String[]args)
	{
		int [] unsorted = {6, 5, 4, 3, 2, 1};
		
		int [] selSorted = selectionSort(unsorted);
		System.out.println("Selection Sorting Results: "+Arrays.toString(selSorted));
		
		int [] inSorted = insertionSort(unsorted);
		System.out.println("Insertion Sorting Results: "+Arrays.toString(inSorted));

		int [] bbSorted = bubbleSort(unsorted);
		System.out.println("Bubble Sorting Results: "+Arrays.toString(bbSorted));
	}*/
}