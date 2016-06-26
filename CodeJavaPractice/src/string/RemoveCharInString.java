package string;

public class RemoveCharInString {

	public static void main(String[] args) {
		String inputString = "hello";
		char removeChar='e';
		String output="";
		char[] stringArr=inputString.toCharArray();
		for (int i = 0; i < stringArr.length; i++) {
			if(!(stringArr[i]==removeChar)){
				output=output+stringArr[i];
			}
		}
		System.out.println(output);
	}
}
