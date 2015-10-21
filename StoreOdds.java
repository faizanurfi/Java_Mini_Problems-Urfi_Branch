class StoreOdds {
	public static void main(String[] args) {
		Print(calcOdds(-6,38));
		int odds [] = new int [22];
	}
	
			public static int [] calcOdds(int start, int end)
			{
				int odds [] = new int[22];

				start = -5;
		   	end = 38;
				
					for(int i = 0; i<odds.length; i++)
					{
							if(start%2!=0)
								{
									odds[i] = start;
									start++;
								}
							start++;
					}
			return odds;
			}
	
	private static void Print(int[] arr)
		{
			
		for(int k = 0; k<arr.length; k++)
			{
				System.out.print(arr[k] + ",");
			}	
			
		System.out.println("---");
}
}