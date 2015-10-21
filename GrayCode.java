class GrayCode{
	public static void main(String[] args) {
	  
	}
	
	public static int grayCode(byte one, byte two){
		int result = one ^ two; 
		int x = 0; 
		
		if(result==0)
		   return 0; 
		while(result!=0){
			 x=x<<1;
			 x=x|(result&1);
			 result=result>>1;
		}
		
		if(x>1)
			return 0;
			
		return 1; 
	}
}