import java.io.*;
import java.util.Scanner; 

class MaxIntensity {
	public static void main(String[] args) {
		
		try {
			
		Scanner pathScan = new Scanner(new FileReader("/Users/Saaduddin/Desktop/paths.txt/"));
			String line = "";
			int count = 0; 
			int tempcounter = 0;
			int max = 0; 
			while(pathScan.hasNextLine())
				{
				String path = pathScan.nextLine();
				tempcounter++;
				if(tempcounter > 50)
					{
					System.out.println("Number of paths: " + tempcounter);
					break;
					}
				Scanner scan = new Scanner(new FileReader(path));
					while(scan.hasNextLine())
					{
						line = scan.nextLine(); 
						String tokens [] = line.split(",");
						int intensity  = Integer.parseInt(tokens[5].trim());
						if(intensity > max)
							{
							  max = intensity;
							}
					}
				scan.close();
				}
				
				System.out.println("intensity: " + max);

				System.out.println("DONE");
		}
		
		catch (IOException ioe) {
		System.out.println("FNF");
		}
		
}
}