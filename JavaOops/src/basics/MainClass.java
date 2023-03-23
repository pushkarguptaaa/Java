package basics;

import encapsulation.EncapsulationInfo;

public class MainClass {
	public static void main(String[] args) {
		
//		Person p1 = new Person("Pushkar", 20);
//		Developer d1 = new Developer("Anu", 40);
//		d1.eat();
		
//		System.out.println(p1.name + " " + p1.age);
//		System.out.println(p2.name + " " + p2.age);
//		p2.walk();
//		p1.walk();
//		p1.walk(10);
	
//		System.out.println(Person.count);
		
//		EncapsulationInfo obj = new EncapsulationInfo();
//		obj.doWork();
	}
}

class Developer extends Person{

	public Developer(String name, int age) {
		super(name, age);
	}
	
	void eat() {
		System.out.println("Developer " + name + " is eating");
	}
	
}

class Person{
	protected String name;
	int age;
	static int count;
	
//	public Person() {
//		count++;
//		System.out.println("Creating an object");
//	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps");
	}
	
	void doWork() {
		System.out.println(name + " is working");
	}
	
}
