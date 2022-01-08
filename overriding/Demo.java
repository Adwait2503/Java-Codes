package overriding;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test2 = new Test2();
		System.out.println(test2);
		test2.test();
		System.out.println();
		System.out.println("Upcasting");
		Test1 test1 = test2;//upcasting
		System.out.println(test1);
		test1.test();
		System.out.println();
		Test1 test12 = new Test1();
		System.out.println(test12);
		test12.test();
		System.out.println();
		System.out.println("Downcasting");
		Test2 test22=(Test2)test1;//downcasting
		System.out.println(test22);
		test22.test();
	}

}
