package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueInString {

	public static void main(String[] args) {
		String inputString = "look";
		boolean result =true;
		Set uniqueSet = new HashSet<Character>();
		for (int i = 0; i < inputString.length(); i++) {
			result = uniqueSet.add(inputString.charAt(i));
			if (result == false) {
				break;
			}
		}
		if (result) {
			System.out.println("Not Unique");
		} else {
			System.out.println("Unique");

		}
	}
}
