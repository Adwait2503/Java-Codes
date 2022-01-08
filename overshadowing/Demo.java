package overshadowing;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test2 = new Test2();
		test2.test();
		System.out.println();
		Test1 test1 = new Test1();
		test1.test();
		System.out.println();
		System.out.println("Upcasting");
		test1 = test2; // upcasting
		test1.test();
	}

}
