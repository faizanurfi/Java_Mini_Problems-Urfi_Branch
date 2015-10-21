class ReturnEvens {

//returns only even digits of an in input integer 

	public static void main(String[] args) {
		System.out.print(returnEvens(124568)); 
		
	}
	public static int returnEvens(int y){ 
			String str = "";
			String x = ""+y; 
			for(int i = 0 ; i< x.length(); i++){
						if((int)(x.charAt(i))%2 ==0)
							str+= x.charAt(i);
			}
					int k = Integer.parseInt(str);
					return k; 
	} 
}
