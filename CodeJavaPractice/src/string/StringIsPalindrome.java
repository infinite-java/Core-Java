package string;

public class StringIsPalindrome {

	public static void main(String[] args) {
		String inputString= "lol"; // mwadawm
		String output="";
		for (int i = inputString.length()-1; i >= 0; i--) {
			output = output +inputString.charAt(i);
		}
		System.out.println(output.equals(inputString));
	}
}
