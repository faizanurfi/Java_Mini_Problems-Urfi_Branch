class stringYak {
public static void main(String[] args) {
        System.out.println(stringYak("yesyesyakno"));
}
    
    public static String stringYak(String str) {
    String result =""; 
    
    if(str.length() < 3)
        return str; 
     
    for(int i = 0; i<str.length(); i++) {
        if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') 
            i = i+2;
        else
            result = result + str.charAt(i);
    }
        
        return result;
    }
       
}