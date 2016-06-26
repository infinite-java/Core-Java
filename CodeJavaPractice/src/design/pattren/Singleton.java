package design.pattren;

public final class Singleton{
	
	static Singleton singleton;
	private Singleton(){ }
	
	public static synchronized Singleton getInstance(){
		if(singleton==null){
			return new Singleton();
		}
		return singleton;
	}
	
	protected Object clone() throws CloneNotSupportedException {
      //Here forcibly throws the exception for preventing to be cloned
        throw new CloneNotSupportedException();
    }

}
