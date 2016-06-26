package polymorphism;

public class Dog extends Animal {
	
	public void makenosie(Dog d){
		System.out.println("dog");
		
	}
	
	public static void main(String[] args) {
		Animal a=new Dog();
		a.makenosie(new Dog());
		a.makenosie(new Animal());
	}

}
