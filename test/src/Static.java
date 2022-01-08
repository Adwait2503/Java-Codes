
public class Static {

	static int num;
	public static void print() {
		System.out.println("From print()");
	}
	static {
		Static.num=10;
		System.out.println(num);
		Static.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
