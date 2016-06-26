package string;

public class StringToIntegerConvert {

	public static void main(String[] args) {
	String input="12345";
	int number=0;
	for (int i = 0; i < input.length(); i++) {
		number=number*10;
		number = number + (input.charAt(i)-'0');
	}
	System.out.println(number);
	}
}
