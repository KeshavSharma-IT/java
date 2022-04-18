package oop;

public class MainClass {
	public static void main(String[] args) {
		person p1=new person();
		person p2=new person();
		p1.name="keshav";
		p1.age=23;
		p1.walk();
		p1.walk(25);
		p1.eat();
		p2.name="Aman";
		p2.age=22;
		p2.eat();
		p2.walk(50);
		System.out.println(p2.name+" "+p2.age);
		
		person p3=new person(21,"mohit");
		System.out.println(p3.name+" "+p3.age);
		
		Developer d1=new Developer(25,"aditya");
		System.out.println(d1.name+" "+d1.age);
		d1.walk(75);
		
	}

}


class person{
	String name;
	int age;
	static int count;
	
	
	public person(){
		count++;
		System.out.println("this is constructor");
		System.out.println("total objects are-"+count);

	}
	public person(int age,String name) {
		this();
		this.name=name;
		this.age=age;
	}
	void walk() {
		System.out.println(name+" is walking");
	}
	void walk(int steps) {
//		this is function overloding
//		compile timr polymorphism
		System.out.println(name+ " walk "+steps+" steps");	
	}
	
	void eat() {
		System.out.println(name+" is eating");
	}
	
}

class Developer extends person{
	
	public Developer(int age,String name) {
		super(age,name);
	}
}