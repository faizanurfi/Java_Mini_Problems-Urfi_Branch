public class DivisibleBy3 {
	
	public DivisibleBy3()
	{
		
	}
	
	public static void main(String[] args)
	{
		double startTime = System.nanoTime();
		DivisibleBy3 dv = new DivisibleBy3();
		dv.divisibleBy3(27);
		double endTime = System.nanoTime();
		double duration = (endTime - startTime)/1000000.0;
		
		System.out.println("Run time: "+duration+" milliseconds");
	}
	
	public static void divisibleBy3(int num)
	{
		int x = 3;
		int counter = 1;
		if(num < 3)
		{
			System.out.println("Number "+num+"is NOT divisible by 3");
		}
		else
		{
			while(x<num)
			{
				if(x >= num)
				{
					break;
				}
				else
				{
					x = 3*counter;
					counter++;
				}
			}
			if(x>num)
			{
				System.out.println("Number "+num+" is NOT divisible by 3");
			}
			else if (x == num)
			{
				System.out.println("Number "+num+" is divisible by 3");
			}
		}
	}
}