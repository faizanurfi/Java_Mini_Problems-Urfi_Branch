class RLE {
	public static void main(String[] args) {
		String str = "AAAABBBBCCCCCDDDDDDEEEFFFFGGGHHFF";
		System.out.println(runLengthEncoding(str));
	}
	
	public static String runLengthEncoding(String str)
	{
		int count = 1;
		String s = ""; 
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
			   count++; 

			else {
			    String x = String.valueOf(count); 
			    s+=x+ str.charAt(i) +" ";
			    count = 1; 
			}
				
		}
			String last = String.valueOf(count);
			s+= last+str.charAt(str.length()-1);
			
	return s; 	
		
	}
}