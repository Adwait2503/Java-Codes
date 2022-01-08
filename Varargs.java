
public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add('a', 'b', 'c', 4, 5, 6, 7, 8, 9, 0));

	}

	public static int add(int... a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			result += a[i];
		}
		return result;
	}

}
