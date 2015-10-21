class StringSearch {
    public static void main(String[] args) {
        String str= "allglalalglgalglal";
        String substr = "al";
        System.out.print("Number of times " + "'"+substr+"'"+ " occurs is: " +getCountOfString(substr, str));
            }

    public static int getCountOfString(String substr, String str){
        int count=0;
        int start =0;         
			for (int i = 0; i < str.length(); i++) {
            int found = str.indexOf(substr, start);
            
            if(found!=-1)
                count++;
            if (found == -1) 
                break;
			  start = found + substr.length();
        }
        return count;
    }
}