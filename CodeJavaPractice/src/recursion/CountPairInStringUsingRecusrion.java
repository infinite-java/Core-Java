package recursion;

public class CountPairInStringUsingRecusrion {

	public static void main(String[] args) {
		countPair("HiHi");
	}

	private static int countPair(String string) {
		if(string.length()==1){
			return 1;
		}
		return 0;
	}
}
