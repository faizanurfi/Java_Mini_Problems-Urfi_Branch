import java.util.StringTokenizer; 
class reverseStrings {
	public static void main(String[] args) {
		//System.out.println(reverseString("My name is Saad"));
		
		//System.out.println("Original String: 123456789");
		
		
		//System.out.println("Palindrome is: " + reverseString("123456789"));
		
		System.out.println(reverseInPlaceStrings("My name is Saad"));
	}
	
	public static String reverseString(String str){
		if(str.length()==0)
			return str; 
		
		String s="";
		for(int i = str.length()-1; i>-1; i--){
			s+=str.charAt(i);
		}
		return s;
	}
	
	public static String reverseStringR(String str){
  		if(str.length()==0)
					return str; 
		
		return str.charAt(str.length()-1) + reverseStringR(str.substring(0, str.length()-1)); 
		
		}


public static String reverseInPlaceStrings(String str)
{
	String line = str;
	StringTokenizer st = new StringTokenizer(line, " ");
	String s = "";
	while(st.hasMoreTokens())
	{
		s+= reverseStringR(st.nextToken() + " ");
	}
	
	return s; 
}
}