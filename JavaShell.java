import java.util.Scanner;
import java.util.Date; 
import java.lang.String.*;
class JavaShell {
	public static void main(String[] args) {
		prompt(); 
	}
	
	public static void helpMenu()
	{
		System.out.println("/////////////////HELP MENU/////////////////");
		System.out.println();
		System.out.println("+---------------------------+");
		System.out.println(" List of Available Commands");
		System.out.println("+---------------------------+");
		System.out.println();
		System.out.println("DCHX: Decimal To Hex Conversion");
		System.out.println();
		System.out.println("SORT: Sort a List of Numbers");
		System.out.println();
		System.out.println("FIND: Find a String Within Text");
		System.out.println();
		prompt();
			
	}
	
	public static int Dec2Hex(){
		System.out.print("Enter a number to convert to hex: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("The hex value of decimal "+ x + " is: "+x);

		return 0; 
	}
	
	public static void prompt()
	{
		String input = "";
		System.out.print("javaShell > ");
		
		try{
			Scanner scan = new Scanner(System.in);
				if(scan.hasNextLine())
					input = scan.nextLine();
				
				if (input.toUpperCase().length()<4 && input.toUpperCase().length() > 0) {
						error();
						prompt();
				}
				
				if(input.length() == 0)
					prompt();
				
				if(input.toUpperCase().equals("QUIT"))
						{
							Date date = new Date();
							System.out.println("Logged off at: " + date.toString());
							System.exit(0);
						}
				
				else {
				switch (input.toUpperCase()) {
					case "HELP": helpMenu();
					break; 
					
					case "D2HX": Dec2Hex();
					break;
					
					case "QUIT": System.exit(0);
					
					default: error();
						break;
				}
				}
		}

		catch (Exception e) {
			
			System.out.println("check input and type again");
			
		}
	}
	
	public static void error()
	{
		System.out.println("ERROR: Invalid Command! Please type 'HELP' to access list of Commands");
		prompt();
	}
	
	
}