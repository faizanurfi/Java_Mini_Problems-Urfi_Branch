import java.util.Scanner;
import java.io.*;

public class CountLetter {

public static void main(String[] args) throws Exception {


 int [] counter = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
       
        File file1 = new File("1000-males-names.txt");  // reading/scanning two files at once
		File file2 = new File("1000-female-names.txt");
        Scanner scan1 = new Scanner(file1);
        Scanner scan2 = new Scanner(file2);
		 
 while (scan1.hasNextLine()&&scan2.hasNextLine()) { //while there are two lines (because both files are same length)
	String line = scan1.nextLine().toLowerCase() + scan2.nextLine().toLowerCase(); //combines both files' lines into one lines         
   for (int i = 0; i < line.length(); i++) {
	 if(line.charAt(i)== ' ') //the files had whitespace after each name
		break;
   	counter[(int)(line.charAt(i)-'a')]++; //ANY character (a-z) in ascii minus 'a' == some number from 0-25; (indices of counter array above); 
       } 		//end of for lopp
  }				//end of while loop

    for(int j = 0; j<counter.length;j++){ //printing after BOTH files are scanned
       if (counter[j] > 0) 
           System.out.println((char)('a'+j) + " = " + counter[j]); //character 'a' + index of counter array type casted to produce a...b...c... etc + (to create the desired output format of { specific_letter = number_of_that_letter }
        }

    }  //end of main

} //end of class

