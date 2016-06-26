package recursion;

public class ArrayFindOddNumberInRangeUsingRecursion {
	
	public static void main(String[] args) {
		int[] inputArr={2,3,4,5,6,7,8,9,10};
		findOddNumberInGivenRange(inputArr,0,inputArr.length-1);
		
	}

	private static void findOddNumberInGivenRange(int[] inputArr, int start, int end) {
		if(start<=end){
			if(inputArr[start]%2!=0){
				System.out.println("Odd Number " +inputArr[start]);
			}
			findOddNumberInGivenRange(inputArr,start+1,end);
		}
	}

}
