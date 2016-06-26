package string;

public class StringAnargram {

	public static void main(String[] args) {
		System.out.println(checkAnagram("word1","w1rdo"));

	}

	private static boolean checkAnagram(String first, String second) {
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return sbSecond.length() == 0 ? true : false;
	}
}
