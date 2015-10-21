class SumOf5and3 {
	public static void main(String[] args) {
		System.out.println(sumOf5And3(1000));
	}
	
	public static int sumOf5And3(int x)
	{
	int total = 0; 
	
	for(int i = 1; i<x; i++)
	{
		if(i%5 ==0 || i%3==0)
		   total+=i;
	}
	
	return total;
}
}