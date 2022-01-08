package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TENET is a Movie";
		String nstr = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println(nstr);
	}

}
