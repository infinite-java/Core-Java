package recursion;


public class FibonniciSeries {

	public static void main(String[] args) {
	
		for(int i=1;i<10;i++){
			System.out.println(fib(i));

		}
	}

	private static int fib(int i) {
		if(i == 1 ||i ==2  ){
			
			return 1;
		}
		return fib(i-1)+fib(i-2);
	}
}
