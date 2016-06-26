package string;

public class StringReverse1 {

	public static void main(String[] args) {
	  String input="lol";
	  checkPalindromeFirstWay(input);
	  String reverseSB=new StringBuffer(input).reverse().toString();
	  System.out.println("Palindrome Using String Buffer   " + reverseSB);
	}

	private static void checkPalindromeFirstWay(String input) {
		String reverse= "";
		  for (int i = input.length()-1; i >= 0; i--) {
			 reverse = reverse + input.charAt(i);
		  }
		  System.out.println("Palindrome Using String  " +reverse);
	}
}
