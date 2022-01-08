package practice1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		String nstr = " ";
		char ch;
		System.out.println("Original String -:");
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("Reverse String -:");
		System.out.println(nstr);
	}

}
