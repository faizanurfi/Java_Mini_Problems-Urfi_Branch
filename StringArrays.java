class StringArrays{
	public static void main(String[] args) {
		
	}
	
	 public static String reverse_recursive(String s)
			{
				//using recursion, return string in reverse
				if (s.length() == 0)
				return s;
				
				return s.charAt(s.length() - 1) + reverse_recursive(s.substring(0, s.length()-1));
			}

	/*-----------------------------------------------------------------------------------------------------*/
			
	public static String reverse_words(String s)
	{
		// "My name is saad" ==> "yM eman si daas"
		//using reverse recursive to reverse multiple tokens within a string
		if(s.length()==0)
			return s;
		
		StringTokenizer st = new StringTokenizer(s);
		String newString = "";
		while(st.hasMoreTokens())
		{
			//System.out.println(s);
			newString+=reverse_recursive(st.nextToken())+" ";
		}
		
		return newString; 
	}
	
	/*-----------------------------------------------------------------------------------------------------*/
	
	public static String reverse(String str)
		{
			char newString [] = new char [str.length()];
				for(int i = 0; i<str.length(); i++)
					{
						newString[i]=str.charAt(str.length()-1-i);
					} 

			return new String(newString);
		}
		
	/*-----------------------------------------------------------------------------------------------------*/
	
	public static String stringReplace(String s, String find, String replace){
	}

}// end of class