package static_non_static;

public class Demo {

	int x; // instance level
	int y;// instance level.. non static means it will be individual copy of that object
	static int z = 100000;// class level.. static means only one copy of that object

	public static void main(String[] args) {

		System.out.println(z); // is valid
		// System.out.println(x); is not valid because static cannot access non static
		Demo d1 = new Demo();
		d1.x = 99;
		d1.y = 88;
		System.out.println("Printing d1");
		d1.print();

		Demo d2 = new Demo();
		d2.x = 8499;
		d2.y = 880000;
		z = 90909090;//
		System.out.println("Printing d1");
		d1.print();
		System.out.println("Printing d2");
		d2.print();// value of z updated.

	}

	public void print() {

		System.out.println("z= " + z);// is valid
		System.out.println("x= " + x);// is also valid because non static can use non static
		System.out.println("y= " + y);
	}
}
