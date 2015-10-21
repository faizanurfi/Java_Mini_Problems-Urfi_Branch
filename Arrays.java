class Arrays {
	public static void main(String[] args) {
		int arr [] = {1,2,4,6,7,8,9};
		print(reverse(arr));
	}

// PRINT HELPERS

	public static void PrintObj(Object [] obj){
		System.out.print("{ ");
		for(int i =0; i< obj.length; i++){
			System.out.print("["+obj[i]+"]");
		}
		    System.out.print("} ");
	}

	public static void PrintDub(double [] dub){
		System.out.print("{ ");
		for(int i =0; i< dub.length; i++){
			System.out.print("["+dub[i]+"]");
		}
		    System.out.print("} ");
	}

	public static void Print(int [] arr){
		System.out.print("{ ");
		for(int i =0; i< arr.length; i++){
			System.out.print("["+arr[i]+"]");
		}
		    System.out.print("} ");
	}


    //standard swap function
	public static void swap(int[] obj, int a, int b){
		int temp = obj[a];
		obj[a] = obj[b];
		obj[b] = temp; 
	}

	///////////////////////////////////////////

   //2.1 binary Search
	public static int binarySearch(int [] arr, int x) {
		int start = arr[0];
		int end = arr.length-1;
		
		while(start<end){
			int mid = (start+end)/2;
			
			if(arr[mid]==x)
			  return mid;
			
			else if(arr[mid]<x)
				start = mid+1;
			
			else
			  end = mid-1; 
		}
		
		return -1; 
	}
	
	//2.6 is array sorted
	public static boolean isSorted(int [] a){
		if(a.length== 0)
		 return true;
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]> a[i+1])
			   return false;
		}
		
		return true; 
	}

	//2.8 calculating average
	public static double mean(double [] a){
		int sum = 0; 

		for(int i = 0; i<a.length; i++){
			sum+= arr[i];
		}

		return sum/a.length;
	}

	//2.10 reverse Array
	public static int [] reverse(Object [] obj){
		for(int i = 0; i<obj.length/2; i++){
			swap(obj, i, obj.length-1-i);
		}
		return obj; 
	}
    
	//2.13 keep tally of letter count in a string
	public static int [] tally(String str){
		int [] letterCount = new int[26];
		int x;
		System.out.println("  |A| |B| |C| |D| |E| |F| |G| |H| |I| |J| |K| |L| |M| |N| |O| |P| |Q| |R| |S| |T| |U| |V| |W| |X| |Y| |Z|");
		for(int i=0; i<str.length(); i++){
			char c= Character.toUpperCase(str.charAt(i));
			x = (int)c - 65;
			++letterCount[x];
		}
		return letterCount; 
	}

	//2.27 sets consecutive odd integers that are prime
	public static void twinPrimes(int limit){
		for(int i =1; i<limit; i+=2){
			if(isPrime(i)==1 && isPrime(i+2)==1)
				System.out.println(i+" and "+ i+2);
		}
	}

	public static int isPrime(int n){
		for (int i =2; i*i<=num;i++) {
			if(num%i==0)
				return 0; 
		}
		return 1; 
	}

	//2.28 there lies a prime number between consecutive squares
	public static void primesInSquares(int n){
		for (int i = 1;i<n;i++) {
			for(int j = i*i+1; j<(i+1)*(i+1);j++){
				if(isPrime(j)==1)
					System.out.println(i*i+" < "+j+(i+1)*(i+1);
			}	
		}
	}

	//2.29 Mersienne Primes is n = 2^p - 1 a prime number? 
	public static void mersiennePrimes(int p){
		int num=0; 
		for(int i = 2; i<p; i++){
			if(isPrime(i)==1){
				System.out.print(i+"\t\t");
				num = (int)Math.round(Math.pow(2,i)) - 1; 
				System.out.print("2^"+i+"-1"+ " = "+num);
			}
			else
				continue; 
				
			if(isPrime(num)==1)
				System.out.println(" is prime");
			else
				System.out.println(" is NOT prime");
		}
	}

	//2.30 is the number a palindrome AND prime?
	public static void palindromicPrimes(int n){
		for (int i = 1;i<n+1;i++) {
			if(isPalidrome(i)){
				if(isPrime(i)==1)
					System.out.print("["+i+"] ");
				else
					continue; 
			}			
		}
	}

	public static boolean isPalindrome(int num){
		String x = Integer.toString(num);
		for(int i = 0; i<x.length()/2; i++){
			if(x.charAt(i)!=x.charAt(x.length()-1-i))
				return false;
		}
		return true; 
	}

	//HackerGym: Arrays and Strings Problem 1: Palindrome Substrings
	public static void getPalindromeSubstrings(String str){			 
		for (int i = 0;i<str.length()/2;i++) {
			for(int j = i; j<str.length(); j++) {
				String out = str.substring(i,j+1);
				if(isPalindromeString(out) && out.length()>1){
					System.out.println(out);
				}
			}
		}
	}
	
	public static boolean isPalindromeString(String str){
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
		}
		
		return true;
	}

	//HackerGym: Arrays and Strings Problem 2: delete val from array
	public static int [] deleteElement(int [] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==val){
				for (int j = i; j < arr.length-1; j++) {
					arr[j] = arr[j+1];
					arr[j+1] = 0;
				}
			}
		}
		return arr; 
	}

	//HackerGym: Arrays and Strings Problem 3: rotate array 
	public static int [] rotateArray(int [] arr, int numTimes){
		for(int i = 0; i<numTimes; i++){
			rotate(arr);
		}
		return arr; 
	}
	public static int [] rotate(int[] arr){
		
		int temp = arr[arr.length-1];
		
		for (int i = arr.length-1; i>= 1; i--) {
			arr[i]= arr[i-1];
		}
		
		arr[0] = temp; 
		return arr;
    }
	
	private static void Print(int[] arr){
		for(int k = 0; k<arr.length; k++) {
				System.out.print("["+arr[k] + "] ");
			}	
			
		System.out.println("---");		
	}

	








}