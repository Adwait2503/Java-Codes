package strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tenet";
		String nstr = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		if (str.equalsIgnoreCase(nstr) || str.equals(nstr)) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is Not Palindrome");
		}
		System.out.println(nstr);
	}

}
