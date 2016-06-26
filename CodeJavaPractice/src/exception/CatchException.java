package exception;

public class CatchException {
	public static void main(String[] args) {
		ThrowException throwException=new ThrowException();
		try {
			throwException.add();
		 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
