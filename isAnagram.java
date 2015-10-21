class Untitled {
	public static void main(String[] args) {
	 System.out.print(isAnagram("CAT", "ACT"));	
	}
	
	public static boolean isAnagram(String one, String two) {
		char allChars[] = new char[256]; 

		for(int i = 0; i <one.length(); i++) {
			char sum = one.charAt[i];
			
		}

		for(int j = 0; j< two.length(); j++) {
		 	allChars[two[j]]--;
		}

		for(int k = 0; k< allChars.length(); k++) {
			if(allChars[k]!= 0)
			 return false; 
		}

		return true; 
	}
}