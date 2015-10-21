class LastTwo {
    public static void main(String[] args) {
        System.out.println(lastTwo("co"));
    }



    public static String lastTwo(String str) {
    
    // c o d i n g   (6)
    // 0 1 2 3 4 5
    
    if(str.length()<2)
      return str; 
    
    return str.substring(0,str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2,str.length()-1);
    
    }

}