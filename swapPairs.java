import java.util.ArrayList; 
class swapPairs {
	public static void main(String[] args) {
		ArrayList<String> aL = new ArrayList<String>();
		aL.add("A");
		aL.add("B");
		aL.add("C");
		aL.add("D");
		aL.add("E");
		aL.add("F");
		aL.add("G");
		aL.add("H");
		
		System.out.println("ArrayList before swap: "+aL);
					
	  System.out.println("ArrayList after swap:  "+swapPairs(aL));
	}
	
	public static ArrayList swapPairs (ArrayList<String> a)
	 { 
	
	    for(int j=0; j<a.size()-1; j+=2)
		{ 
			String temp = a.get(j); 
			a.set(j,a.get(j+1)); //In order to store the swap, you have to "set" it to the next value; 
			a.set(j+1, temp); // and... set that value to temp... 
	 	}
		 
	return a;   
	}
}