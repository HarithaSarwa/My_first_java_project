package mypack1;

public class StaticAndNonStatic {

	public static void main(String haritha[]) {

		hey();
		StaticAndNonStatic m = new StaticAndNonStatic();
		m.hello();
		Two.helloStatic();
		Two t = new Two();
		t.nonStatic();

	}

	public void hello() {

		System.out.println("I am non static");

	}

	public static void hey() {

		System.out.println("I am static");
	}

}
