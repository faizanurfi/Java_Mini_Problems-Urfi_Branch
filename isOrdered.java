import java.util.ArrayList;
import static java.lang.Math.pow;  
class isOrdered {
	public static void main(String[] args) {
		isOrdered(4);
		
	}
	
	public static void isOrdered(int num) {
		
		int start = (int)pow(10,num-1);
		int end = (int)pow(10,num);
		
		A:	for (int j=start; j<end; j++) {
				String s = String.valueOf(j);
				
			B:	for(int i=0; i<num-1; i++) {
					if(s.charAt(i)<s.charAt(i+1))
					  continue B;
					else
						continue A;
		   }
				System.out.print(s + " ");
		}
	}
}