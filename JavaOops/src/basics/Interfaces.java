package basics;

public class Interfaces implements Cars, Persons {
	public static void main(String[] args) {
		
	}

	@Override
	public void start() {
		System.out.println("My car is starting");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
}

interface Cars{
	void start();
}

interface Persons{
	void walk();
}
