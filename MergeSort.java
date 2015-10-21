public class MergeSort{


	public static int [] merge(int [] array1, int [] array2) {
	int array1Pointer=0;
	int array2Pointer=0;
	int finalArray [] = new int [array1.length + array2.length];

	{4,7,14}
	{1,3,9,17};

		for (int i = 0;i<finalArray.length-1; i++) {
			if (array1[array1Pointer]<array2[array2Pointer]) {
				finalArray[i]=array1[array1Pointer];
				array1Pointer++;
			}
			
			else {
				finalArray[i]=array2[array2Pointer];
				array2Pointer++;
			}
		}

	return finalArray;

	}
}
