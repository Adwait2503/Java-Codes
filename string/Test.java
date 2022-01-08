package string;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "My name is Praveen";
		System.out.println(name.length());
		name=name.toUpperCase();
		System.out.println(name);
		String[] arr=name.split(" ",4);
		for(String x:arr) {
			System.out.println(x);
		}
	}

}
