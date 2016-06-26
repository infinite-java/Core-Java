package recursion;

public class PowerOfNUsingRecursion {

	public static void main(String[] args) {
		System.out.println(powerN(2,3));
	}

	private static int powerN(int number, int power) {
		
		if(power == 1){
			return number;
		}
		return number * powerN(number,power-1);
	}
}
