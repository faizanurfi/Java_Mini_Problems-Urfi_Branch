class Palindrome {
	public static void main(String[] args) {
		
	}
	
	public static boolean isPalindrome(String [] str)
		{
			if(str.length ==1 || str.length == 0)
			return true; 
			
	for(int i = 0; i< str.length/2 ; i++)
		{
			if(str[i]!=str[str.length-1-i])
				return false; 
		}
		return true; 
}