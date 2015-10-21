class FibonacciRecursive {
	public static void main(String[] args) {
		System.out.println(doFibo(14));
	}
	
	public static int doFibo(int n){
	

		if(n == 0) {
			return 0;
		}
		else if(n == 1)
			return 1;
		
		return doFibo(n-1) + doFibo(n-2);
	}
}