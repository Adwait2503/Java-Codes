package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.m1();
		System.out.println(test.x);
		Demo demo = new Demo();
		demo.m1();
		System.out.println(demo.x);
		Test t = demo;
		t.m1();
		System.out.println(t.x);
	}

}
