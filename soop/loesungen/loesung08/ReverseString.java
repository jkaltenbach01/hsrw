

public class ReverseString {
	public static void main(String[] args) {

		System.out.println(reverse("abcd"));

	}

	public static String reverse(String s) {

		if (s.length() <= 1) {
			return s;
		}
		char c = s.charAt(0);
		return reverse(s.substring(1)) + c;
	}

}
