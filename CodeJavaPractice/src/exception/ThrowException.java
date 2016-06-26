package exception;

public class ThrowException {

	public void add() throws Exception{
		try {
			throw new Exception("try");
		} catch (Exception e) {
			throw new Exception("catch"); //scene 1
		}finally{
			throw new Exception("finally"); //scene 2
		}
	}
}
