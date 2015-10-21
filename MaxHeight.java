import java.io.*;
import java.util.Scanner; 

class MaxHeight {
	public static void main(String[] args) {
		
		try {
			
		Scanner pathScan = new Scanner(new FileReader("/Users/Saaduddin/Desktop/paths.txt/"));
			String line = "";
			int count = 0; 
			int tempcounter = 0;
			int minCount = 0; 
			double min = 200.0;
			while(pathScan.hasNextLine())
				{
				String path = pathScan.nextLine();
				tempcounter++;
				if(tempcounter > 500)
					{
					System.out.println("Number of paths: " + tempcounter);
					break;
					}
				Scanner scan = new Scanner(new FileReader(path));
					while(scan.hasNextLine())
					{
						line = scan.nextLine(); 
						String tokens [] = line.split(",");
						double elevation  = Double.parseDouble(tokens[4].trim());
						if(elevation < 140)
							{
							  minCount++;
							}
					}
				scan.close();
				}
				
				System.out.println("minCount less than 140: " + minCount);

				System.out.println("DONE");
		}
		
		catch (IOException ioe) {
		System.out.println("FNF");
		}
		
}
}