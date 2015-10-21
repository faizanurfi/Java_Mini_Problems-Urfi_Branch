class ZeroDigits {
	public static void main(String[] args) {
	System.out.println(zeroDigits(1020304050));	
	}
	
	public static int zeroDigits(int x)
	{
		//count the zeroes 
	    int count= 0;
	    String y = String.valueOf(x);
	    for(int i = 0; i<y.length(); i++)
	    {
	        if(y.charAt(i) == '0')
	           count++;
	    }

	return count; 
	}
}