package strings;

public class ReplaceCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I!am:Adwait";
		str = str.replaceAll("[^0-9a-zA-z]", " ");
		System.out.println(str);
	}

}
