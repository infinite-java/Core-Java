package recursion;

public class SumOfDigitUsingRecusrion {

	public static void main(String[] args) {
		System.out.println(getSum(123));
	}

	private static int getSum(int number) {
		int sum=0;
			if(number==0){
				return sum;		
			}else{
				sum =sum + (number%10);
				getSum(number/10);
			}
			return sum;
	}
}
