class PrintLetters {
	public static void main(String[] args) {
		printLetters("Saad");
	}
	
	public static void printLetters(String text) {
		if (text.length()==0) {
			System.out.println("");
	}
	
	for(int i = 0; i<text.length(); i++) {
			System.out.print(text.charAt(i)+ '-');
		}
	}
}